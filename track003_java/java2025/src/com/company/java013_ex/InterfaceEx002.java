package com.company.java013_ex;



class Driver{
	public void drive(Vehicle v) {
		v.run();
	}
}
interface Vehicle {
   public void run();
}
class MotorCycle implements Vehicle {
   @Override
   public void run() {
      System.out.println("오토바이가 달립니다.");
   }
}
class Car implements Vehicle {
   @Override
   public void run() {
      System.out.println("자동차가 달립니다.");
   }
}


public class InterfaceEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
	      
      Car car = new Car();
      MotorCycle mo = new MotorCycle();
      
      driver.drive(car);
      driver.drive(mo);
	}

}
