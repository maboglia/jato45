package novita;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import interfacce.Libro;

public class ProvaReflection {

	public static void main(String[] args) {
		
		Libro l = new Libro("Io, robot");
		
		Class<? extends Libro> class1 = l.getClass();

		Constructor<?>[] constructors = class1.getConstructors();
		
		System.out.println(constructors.length);
		
		Method[] methods = class1.getMethods();
		
		for (var method : methods) {
			System.out.println(method.getName());
		}
		
		
	}

}
