package _13_Input_Output.TextStream;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

class InputThread extends Thread {
	//스레드가나 데이터를 주고받을 입력 스트림 생성
	PipedReader input = new PipedReader();
	//데이터를 주고받을 입력스트림 생성.
	StringWriter sw = new StringWriter();
	
	InputThread(String name) {
		super(name);
	}
	
	public void run() {
		try {
			int data = 0;
			while((data=input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(getName() + "-received : " + sw.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//END run()
	
	public PipedReader getInput() {
		return input;
	}
	
	public void connect(PipedWriter output) {
		try {
			input.connect(output);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//END connect
}//END InputThread class

class OutputThread extends Thread {
	PipedWriter output = new PipedWriter();
	
	OutputThread(String name) {
		super(name);
	}
	
	public void run() {
		try {
			String msg = "Hello";
			System.out.println(getName() + "-sent : " + msg);
			output.write(msg);
			output.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//END run
	
	public PipedWriter getOutput() {
		return output;
	}
	
	public void connect(PipedReader input) {
		try {
			output.connect(input);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//END connect
}//OutputThread class

public class PipedReader_WriterTest00 {
	public static void main(String[] args) {
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");
		
		inThread.connect(outThread.getOutput());
		
		inThread.start();
		outThread.start();
		
	}//END main

}//END class
