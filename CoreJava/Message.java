package CoreJava;

public class Message {

	Message(String msg) {
		System.out.println(msg);
	}

	void getMessage(String msg) {
		System.out.println(msg + " Java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageInterface m = Message::new;
		m.getMessage("Hello");
	}

}
