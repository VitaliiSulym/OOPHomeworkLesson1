package com.gmail.sulym.vitalii;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat();
		catOne.setColor("White");
		catOne.setName("Angel");
		catOne.setWeight(1.5);
		catOne.setAge(2);
		catOne.petted();
		System.out.println(catOne);
		System.out.println();

		Cat catTwo = new Cat("Grey", "Tyson", 1, 1.1);
		catTwo.tooHungry();
		System.out.println(catTwo);

	}

}
