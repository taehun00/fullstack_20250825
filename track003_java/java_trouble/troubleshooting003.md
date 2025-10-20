### 문제점
```java
a = sc.nextInt();
			
    switch(a) { // 1번째 switch
				
        case 1 :
            System.out.print("아이디 입력 : ");
            id = sc.nextLine(); // ❌ 문제 발생 가능
            System.out.print("비밀번호 입력 : ");
            pw = sc.nextLine();
```

- 이 코드에서 nextLine()을 사용했지만, 이전 입력이 nextInt() 또는 next()였다면 버퍼에 남아 있는 줄바꿈 문자(\n) 때문에 nextLine()이 빈 문자열을 읽고 넘어가는 문제가 발생한다.

### **해결방안**
```java
System.out.print("아이디 입력 : ");
id = sc.next(); // 공백 없는 단어 입력에 적합
System.out.print("비밀번호 입력 : ");
pw = sc.next();
```

###### 해결방안 2가지
- `nextInt()` 또는 `next()` 다음에 `sc.nextLine()`을 한 번 더 호출해 버퍼를 비워준다.
- `next()`와 `nextInt()`만 사용하여 버퍼 문제 없이 안정적으로 작동