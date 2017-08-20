package com.gmail.sulym.vitalii;

public class Cat {
	
		private String color;
		private String name;
		private int age;
		private double weight;
	
		public Cat(String color, String name, int age, double weight) {
			super();
			this.color = color;
			this.name = name;
			this.age = age;
			this.weight = weight;
		}
		public Cat () {
			super();
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public void petted() {
			System.out.println("Mrrrrrrrrrr");
		}
		
		public void tooHungry() {
			System.out.println("MEOW");
		}


		@Override
		public String toString() {
			return "Cat [name= " + name + ", color= " + color + ", weight= " + weight + " kg, age= " + age + " years]";
	
	}

}
