### 문제점
```java
    if(id == id && pw == pw){ }
```

- 이 코드는 항상 true가 되는 조건문이다.
- 실제 입력값과 비교 대상이 다르지 않기 때문에 의미 없는 비교가 된다.
- id, pass는 사용자 입력값인데, 비교 대상이 없거나 이름이 겹쳐서 항상 자기 자신과 비교됨



### 해결방안
```java
    if(id.equals(findid) && pw.equals(findpw)) {
        // 로그인 성공
    }
```

- 비교 대상 변수를 findid, findpw로 분리
- 문자열 비교에는 equals() 사용