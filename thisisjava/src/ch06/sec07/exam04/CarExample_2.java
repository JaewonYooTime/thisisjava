package ch06.sec07.exam04;

public class CarExample_2 {

	public static void main(String[] args) {
		Car_2 car1 = new Car_2();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car_2 car2 = new Car_2("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car_2 car3 = new Car_2("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car_2 car4 = new Car_2("자가용", "빨강", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}
}
