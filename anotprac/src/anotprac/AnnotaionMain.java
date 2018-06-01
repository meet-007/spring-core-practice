package anotprac;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DemoAnnotation{
	String message();
}

@DemoAnnotation(message="this class is annoted for the first time in history")
class UseAnnotation{

}

public class AnnotaionMain {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final UseAnnotation ua = new UseAnnotation();
		final Class c = ua.getClass();
		final Annotation  anot =c.getAnnotation(DemoAnnotation.class);
		final DemoAnnotation danot = (DemoAnnotation)anot;
		System.out.println(danot.message());
	}

}
