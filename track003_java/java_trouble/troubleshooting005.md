## 코드
```java
public class ArrayExUpgrade1 { 
    public static void main(String[] args) { 
        char [] answer = {'A', 'C', 'B', 'D', 'A'}; 
        char [] correct = null; 
        Scanner sc = new Scanner(System.in); 
        for(int i=0; i<answer.length; i++) { 
            System.out.print("입력 > "); 
            correct[i] = sc.next().charAt(0); 
        } 
        ...
```

### 문제점
```java
char[] correct = null;
```
이 줄에서 correct 배열을 생성하지 않고 null로 선언했기 때문에, 아래에서 값을 넣으려고 하면 오류가 난다.
```java
correct[i] = sc.next().charAt(0); // 여기서 오류 발생!
```
null 사태의 배열에 값을 넣으려고 하면 자바는 "그 배열이 존재하지 않는데 어떻게 값을 넣어?"라고 하며 NullPointerException을 던진다.

### 해결방안
```java
char[] correct = new char[answer.length];
```
배열을 선언할 때 크기를 지정해서 실제 배열을 생성해줘야 합니다. answer.length만큼 입력을 받을 거니까, 그 길이만큼 correct 배열을 생성하면 된다.

### 느낀점
- 배열을 만들고 입력받을 때, 배열을 null로 설정하면 입력값이 하나씩 저장되지 않을까? 하는 생각을 하였다. 하지만 내가 생각하는 null과 자바가 정의하는 null은 다르다는 것을 깨달았다. 자바에서 null은 단순히 "비어 있다"는 의미가 아니라, 아예 존재하지 않는 객체를 의미한다.
- 이 경험을 통해 배열을 사용할 때는 반드시 크기를 지정하여 실제 배열을 생성해야 한다는 점을 명확히 이해하게 되었다.
