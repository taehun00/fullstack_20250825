### 1. 웹의 작업순서
    1) html 구조
    2) css 꾸미기
    3) js / jquery / react 동작
    4) jsp + oracle 서버 전송 + 데이터 저장

### 2. html 파일템플릿
- ! + enter ( 기본 구조 )
- html : 문서의 시작과 끝
- head : 문서 정보
- body : 사용자에게 보이는 정보
- 다 소문자 / 시작 태그와 끝나는 태그

```bash
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>web basic001</title>
</head>
<body>
    html
</body>
</html>
```

### 3. Tag
1. 웹페이지의 구성요소를 알려주는 표시언어

2. h1 ~ h6 제목
    - h1 : 로고, 상호명
    - h2 : 주메뉴
    - h3 : 중요도 상세메뉴(소제목)

3. p, pre : 문단
    - p : 일반 문단
    - pre : 줄바꿈과 공백을 유지하는 서식테스트

4. img : 이미지
    - src : 경로 , alt : 대체용

5. a : 링크
    - href : 다른페이지나 파일로 연결, target = "_blank"
    새창열기

6. 리스트태그 : ul, ol, dl
    - u1 : 순서없는 리스트
    - ol : 순서있는 리스트
    - dl : 설명 리스트

7. 그룹핑 : div    

### 4. CSS
1. 여백 - margin / padding
   1. margin : 바깥쪽여백
   2. padding : 안쪽여백

2. 글자스타일
   1.글자색상
      color:red
   2.글자크기
      font-size:16px
   3.정렬
      text-align:center /left /right/justify 문단의 정렬을 체크해주는 부분인데 left(왼쪽정렬) , right(오른쪽정렬) , center(중앙) , justify(수평정렬)
   4.밑줄
      text-decoration:none; 깃허브
   5. 글꼴
      font-family:sans-serif;
   6. 굵게
      font-weight:bold;

3. 배경꾸미기
      background-color: gold;
      background:black;
      background:linear-gradient(to right, pink, orange) background:linear-gradient(45deg, pink, orange)
      background: red url(./img/five.png) repeat center / 20px 20px
                  색상 경로 반복여부 중앙배치 가로사이즈 세로사이즈  

4. 박스디자인
   1. 가로 : width:300px
   2. 선 : border:3px solid red
   3. 둥근모서리 : borer-radius : 20px
   4. 그림자효과 : box-shadow: 0 4px 12px rgba(0,0,0,0.5)