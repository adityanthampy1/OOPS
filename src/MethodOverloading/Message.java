package MethodOverloading;

public class Message {
	void sendMessage(String text) {
		System.out.println(text);
	}
	void sendMessage(String text,String Sname) {
		System.out.println(text+" "+"(SENDER NAME): "+Sname);
	}
	void sendMessage(String text,String Sname,String Rname) {
		System.out.println(text+" "+"(SENDER NAME): "+Sname+" "+"(RECIVER NAME): "+Rname);
	} 

	public static void main(String[] args) {
		Message m=new Message();
		m.sendMessage("HELLO ADI");
		m.sendMessage("HAPPY BDAY", "ADI");
		m.sendMessage("YO YO", "ADI", "ANVI");
		

	}

}
