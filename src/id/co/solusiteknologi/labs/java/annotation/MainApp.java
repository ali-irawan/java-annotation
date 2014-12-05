package id.co.solusiteknologi.labs.java.annotation;

import java.lang.annotation.Annotation;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException{
		
		// Load class SomeClass information
		// Using reflection
		
		Class clazz = Class.forName("id.co.solusiteknologi.labs.java.annotation.SomeClass");
		
		Annotation[] annotations = clazz.getAnnotations();
		
		System.out.println("List all annotations from class SomeClass");
		
		for(Annotation an : annotations){
			System.out.println("Annotation: " + an.toString());
			
			// Get the information from the Annotation
			if(an instanceof Author){
				Author author = (Author) an;
				System.out.println("name = " + author.name());
				System.out.println("email = " + author.email());
			}
		}
	}
}
