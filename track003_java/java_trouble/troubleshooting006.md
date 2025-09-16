## 코드
```java
public static String stdAvg(int a) {   // 오류
    if(a>=90) return "A";
    else if(a>=80) return "B";
    else if(a>=70) return "C";
}
```

### 문제점
- 이 오류 메시지는 자바에서 String 타입을 반환해야 하는 메서드가 return 문을 제대로 작성하지 않았을 때 발생하는 전형적인 컴파일 오류이다.
- 자바는 String을 반환하겠다고 선언을 하면, 모든 실행 경로에서 반드시 return String이 있어야 한다.
- else 에서의 반환이 없기 때문에, java는 else 일때 반환 값이 없기 때문에 오류를 발생시킨다.

### 해결방안
- 모든 경로에 return을 추가한다.
```java
else return null;
```
### 느낀점
- String 타입을 반환할 때 모든 실행 경로에 반환 값을 넣어야 한다는 것을 명확히 이해하고 깨달았다.