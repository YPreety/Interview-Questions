package Exception;

/*ClassNotFoundException :-
ClassNotFoundException occurs when you try to load a class at runtime using Class.
forName() or loadClass() methods and requested classes are not found in classpath. 
Most of the time this exception will occur when you try to run application without updating classpath with JAR files. 
This exception is a checked Exception derived from java.lang.Exception class and you need to provide explicit handling for it. 
This exception also occurs when you have two class loaders and if a ClassLoader tries to access a class which is loaded by 
another classloader in Java. 
Java ClassLoader is a part of Java Runtime Environment that dynamically loads Java classes in JVM(Java Virtual Machine). 
The Java Runtime System does not need to know about files and files system because of classloaders.*/

public class ClassNotFound_Exception {

	public static void main(String[] args) {
		try {
			Class.forName("GeeksForGeeks");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}

/*ClassNotFoundException Vs NoClassDefFoundError

As the name suggests, ClassNotFoundException is an exception while NoClassDefFoundError is an error.
ClassNotFoundException occurs when classpath is does not get updated with required JAR files while error occurs when 
required class definition is not present at runtime.*/