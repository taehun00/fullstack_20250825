## 코드
```java
public class ClassArr001 {
	public static void main(String[] args) {
		// 1) Toy [] 나 주소 받을 수 있어.
		Toy [] toys = new Toy[3];   //2) new 번지, Toy 형태의 자료형 3개
		System.out.println("1. " +toys);
		System.out.println("2. " +Arrays.toString(toys));
		toys[0].setName("할로윈키티");
		toys[0].setAge(0);
		System.out.println("3. " +toys[0]);
	}
}
```

### 문제점
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.company.java011.Toy.setName(String)" because "toys[0]" is null
	at java2025/com.company.java011.ClassArr001.main(ClassArr001.java:11)

- Toy[] toys = new Toy[3]; 이 코드는 Toy 객체를 담을 수 있는 배열을 생성했지만, 각 요소는 아직 null 상태


### 해결방안
```java
Toy[] toys = new Toy[3]; // 
toys[0] = new Toy();     // 코드 추가
toys[0].setName("할로윈키티");
toys[0].setAge(0);
System.out.println("3. " + toys[0]);
```

### 느낀점
- 배열을 생성했다고 해서 그 안의 객체까지 자동으로 생성되는 것은 아니다.
- 객체 배열은 "주소를 담을 공간"만 만들기 때문에, 각 요소를 new로 직접 초기화해야 한다는 점을 명확히 이해하게 되었다.