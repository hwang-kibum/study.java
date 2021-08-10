import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\jdk1.8\\work\\ch15\\FileTest.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일이름 -" + f.getName());  //경로를 제외한 파일이름 -FileTest.java
		System.out.println("확장자를 제외한 파일이름-" + fileName.substring(0,pos));  //확장자를 제외한 파일이름-FileTest
		System.out.println("확장자-" + fileName.substring(pos+1)); //확장자-java
		System.out.println("경로를 포함한 파일을-" + f.getPath());  //경로를 포함한 파일을-c:\jdk1.8\work\ch15\FileTest.java
		System.out.println("파일 절대경로-" + f.getAbsolutePath());
		System.out.println("파일 정규경로-" + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 - " + f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator-" + File.pathSeparator);
		System.out.println("File.pathSeparatorChar-" + File.pathSeparatorChar);
		System.out.println("File.Separator-" + File.separator);
		System.out.println("File.SeparatorChar-" + File.separatorChar);
		System.out.println();
		System.out.println("usr.dir="+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));

	}

}
