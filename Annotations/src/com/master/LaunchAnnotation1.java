package com.master;
class Animal {
	public void AnimalUsuallyHuntsAndEat() {
		System.out.println("Animal is eating..");
	}
}
class Tiger extends Animal{
	@Override
	public void AnimalUsuallyHuntsAndEat() {
		System.out.println("Tiger is eating..");
	}
}
public class LaunchAnnotation1 {

	public static void main(String[] args) {

	}

}
