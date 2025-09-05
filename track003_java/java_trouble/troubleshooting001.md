### **문제점**
```java
package com.company.Java001_ex;

public class A003_ex {
    public static void main(string[] args) {
        System.out.printf("이름 : %s  나이: %d", "길동", 12);
    }
}
```
```java
Error:(5, 24) java: cannot find symbol
  symbol:   class string
  location: class com.company.java001_ex.A003_ex
```

### **해결방안**
- string은 존재하지 않는 클래스이기 때문에 컴파일러가 이를 찾을 수 없어 오류 발생
- 자바는 대소문자를 엄격히 구분하므로, String을 string으로 잘못 표기하면 cannot find symbol 오류가 발생함
```bash
public static void main(String[] args)
```


### **느낀점**
- 자바는 대소문자를 엄격히 구분하는 언어라는 점을 알았음.
- 자바에서는 자료형과 클래스 이름의 정확한 표기를 항상 확인하는 습관을 들여야겠다고 느꼈음.