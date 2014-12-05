package id.co.solusiteknologi.labs.java.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME) // only can detected in runtime level
@Target(value=ElementType.TYPE) // annotated for class only
@Documented
public @interface Author {

	public String name();
	public String email();
	
}
