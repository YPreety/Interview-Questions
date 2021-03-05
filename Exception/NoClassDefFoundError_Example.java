package Exception;

/*NoClassDefFoundError :-
NoClassDefFoundError occurs when class was present during compile time and program was compiled and linked successfully 
but class was not present during runtime.It is error which is derived from LinkageError. 
Linkage error occurs when a class has some dependencies on another class and latter class changes after compilation of 
former class. NoClassFoundError is the result of implicit loading of class because of calling a method or accessing a 
variable from that class. This error is more difficult to debug and find the reason why this error occurred. 
So in this case you should always check the classes which are dependent on this class.*/

public class NoClassDefFoundError_Example {

	public static void main(String[] args) {
		GeeksForGeeks geeks = new geeksForGeeks();
		geeks.greeting();
	}
}

class GeeksForGeeks {
	void greeting() {
		System.out.println("hello!");
	}
}
