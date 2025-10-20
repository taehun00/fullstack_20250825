### 문제점
```java
public class ForEx006 {
	public static void main(String[] args) {
		String str = "12345";
		int result = 0;
		
		for (int i=0; i<=10; i++) {
			if(str.charAt(i) != null) {  // 오류발생
				int a = str.charAt(i)-'0';
				result += a;
			}
			
		}
		System.out.println(result);	
	}
}

```
```java
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5
```
- str.charAt(i)를 이용해서 해당 문자열이 null이 아니면 해당 숫자를 더하게 하려고 했으나 오류가 발생.
- 하지만 char은 기본형이라서 null과 비교를 할 수 없어, str.charAt(i) != null 자체가 잘못된 조건이다.

### **해결방안**
```java
for (int i = 0; i < str.length(); i++) {
    int a = str.charAt(i) - '0';
    result += a;
}
```
- if 문을 사용하지 않고 for 문 안에 str.length()를 사용하여 안전하게 인덱스 범위 내에서 반복.
