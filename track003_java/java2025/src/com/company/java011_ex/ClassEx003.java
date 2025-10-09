package com.company.java011_ex;

class Grand extends Object {
    public void one() { System.out.println("grand : one"); }
    public void two() { System.out.println("grand : two"); }
}

class Father extends Grand{
    public void three() { System.out.println("Father : three"); }
}

class Uncle extends Grand{
	public void four(){ System.out.println("Uncle : four"); }
	public void one(){ System.out.println("Uncle : onw"); }
	public void two(){ System.out.println("Uncle : two"); }
}
class Aunt{// Object
	String name="mimi";

	@Override
	public String toString() {
		return "Aunt [name=" + name + "]";
	}
	
}

public class ClassEx003 {
	public static void main(String[] args) {
		Father f = new Father();
		
		f.one(); f.two(); f.three();
		
		Uncle u = new Uncle();
		u.four(); u.one(); u.two();
		//1. uncle이 쓸 수 있는 메서드는 ?   Grand의 one(), two() / Uncle의 four(), one(), two()
		//2. 28번째 줄에서 출력되는 내용은? 	Uncle의 four(), one(), two()
		//3. 14, 15번째의 개념은? 			상속시 부모와 같은 메서드를 자식클래스에 맞게 수정한 것 
	}
}
