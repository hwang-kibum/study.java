package javaStudy._08_DateTime;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday:{3}";
		
		Object[] arguments = { "���ڹ�", "02-123-1234", "27", "07-09"};
		String result = MessageFormat.format(msg,  arguments);
		System.out.println(result);
	}

}
