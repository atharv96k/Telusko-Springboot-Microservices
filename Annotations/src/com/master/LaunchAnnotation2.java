package com.master;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.METHOD})
@interface CricketPlayer{
	String country() default "India";
}

@CricketPlayer//(country = "India")
class ViratKolhi{
	@CricketPlayer
	private int innings;
	@CricketPlayer
	public ViratKolhi() {
		
	}
	@CricketPlayer
	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}
	
}
public class LaunchAnnotation2 {

	public static void main(String[] args) {
		ViratKolhi viratKolhi = new ViratKolhi();
		viratKolhi.setInnings(344);
		System.out.println(viratKolhi.getInnings());
	}

}
