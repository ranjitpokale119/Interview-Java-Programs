package com.JavaAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//SigleValued Interface
//SingleValued Annotation
//MultiuiValued Annotation
@Inherited // if you want ur annot values to be inherited to class that has
			// inherited parent class
@Documented // to make documentation
@Target(ElementType.TYPE) // it is Meta annot
@Retention(RetentionPolicy.RUNTIME) // it is Meta annot
@interface SmartPhone {
	String os() default "Symbian";

	int verion() default 7;

}

// SmartPhone is customized constructor with two values
@SmartPhone(os = "Android", verion = 6)
class NokiaASeries {
	String Model;
	int size;

	public NokiaASeries(String model, int size) {
		Model = model;
		this.size = size;
		System.out.println(" Model : " + model + " \n Veresion : " + size);
	}

}

class WinSeries extends NokiaASeries {

	public WinSeries(String model, int size) {
		super(model, size);
		// TODO Auto-generated constructor stub
	}

}

public class CustomizeAnnotaion {

	public static void main(String[] args) {
		NokiaASeries ns = new NokiaASeries("Fire", 6);

		Class c = ns.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);

		SmartPhone sp = (SmartPhone) an;
		System.out.println(sp.os());
	}

}
