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
   1. 글자색상
      color:red
   2. 글자크기
      font-size:16px
   3. 정렬
      text-align:center / left / right / justify 
      문단의 정렬을 체크해주는 부분인데 left(왼쪽정렬) , right(오른쪽정렬) , center(중앙) , justify(수평정렬)
   4. 밑줄
      text-decoration:none; 깃허브
   5. 글꼴
      font-family:sans-serif;
   6. 굵게
      font-weight:bold;

3. 배경꾸미기
    - background-color: gold;
    - background:black;
    - background:linear-gradient(to right, pink, orange) background:linear-gradient(45deg, pink, orange)
    - background: red url(./img/five.png) repeat center / 20px 20px
    -             색상 경로 반복여부 중앙배치 가로사이즈 세로사이즈  

4. 박스디자인
   1. 가로 : width : 300px
   2. 선 : border : 3px solid red
   3. 둥근모서리 : borer-radius : 20px
   4. 그림자효과 : box-shadow: 0 4px 12px rgba(0,0,0,0.5)


   > 1. CSS 연습문제  `web003_1_user.html`

   ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body style="margin: 0px; padding: 30px; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background:linear-gradient(135deg, #fdfbfb, violet) no-repeat">
        <div>
            <h1 style="text-align: center; color: #e1306c; margin-bottom: 40px;"> 사용자 프로필 카드 </h1>
            <div style="background-color:rgb(255, 255, 255); width:250px; margin: 0 auto; margin-bottom: 20px; border-radius: 20px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); text-align: center; padding: 20px;">
                
                    <img src="./img/one.png"
                    
                    alt = "사용자 카드"
                    style="width: 90px; height: 90px; border-radius: 50px; border: 3px solid #e1306c;"
                    >

                    <h2 style="margin-top: 10px; margin-bottom: 5px; font-size: 18px; color: #333"> Jack </h2>
                    <p style="font-size: 14px; color:#666; margin-bottom: 10px">
                        백앤드 개발자 | Node.js & DB 전문가
                    </p>
                    <p style="font-size: 14px; color:#666; margin-bottom: 10px;">
                        팔로워 : 3,200명
                    </p>
                    <p>
                        <a href="https://github.com/taehun00" style="margin-top: 5px; font-size: 13px; color: #e1306c; text-decoration: none;"
                        target="_blank"
                        title="프로필 가기"
                        >
                        깃허브 보기
                    </a>
                    </p>
            </div>
        </div>
        
    </body>
    </html>
   ```

   2. MARKUP 연습문제  `web003_2_users.html`
   ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body style="margin: 0px; padding: 30px; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background:linear-gradient(135deg, #fdfbfb, violet) no-repeat">
        <div>
            <h1 style="text-align: center; color: #e1306c; margin-bottom: 40px;"> 사용자 프로필 카드 </h1>
            <div style="background-color:rgb(255, 255, 255); width:250px; margin: 0 auto; margin-bottom: 20px; border-radius: 20px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); text-align: center; padding: 20px;">
                
                    <img src="./img/one.png"
                    
                    alt = "사용자 카드"
                    style="width: 90px; height: 90px; border-radius: 50px; border: 3px solid #e1306c;"
                    >

                    <h2 style="margin-top: 10px; margin-bottom: 5px; font-size: 18px; color: #333"> Jack </h2>
                    <p style="font-size: 14px; color:#666; margin-bottom: 10px">
                        백앤드 개발자 | Node.js & DB 전문가
                    </p>
                    <p style="font-size: 14px; color:#666; margin-bottom: 10px;">
                        팔로워: 3,200명
                    </p>
                    <p>
                        <a href="https://github.com/taehun00" style="margin-top: 5px; font-size: 13px; color: #e1306c; text-decoration: none;"
                        target="_blank"
                        title="프로필 가기"
                        >
                        깃허브 보기
                    </a>
                    </p>

                    <h3 style="font-size: 15px; color: #333"> Jack이 좋아하는 기술 </h3>
                    <ul style="text-align: left;">
                        <li>Node.js</li>
                        <li>MongoDB</li>
                        <li>Docker</li>
                    </ul>
            </div><!--end div1-->>

            <div style="background-color:rgb(255, 255, 255); width:250px; margin: 0 auto; margin-bottom: 20px; border-radius: 20px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); text-align: center; padding: 20px;">
                <p>
                    <img src="./img/two.png"
                    
                    alt = "사용자 카드"
                    style="width: 90px; height: 90px; border-radius: 50px; border: 3px solid #e1306c;"
                    >
                </p>
                <h2 style="margin-top: 10px; margin-bottom: 5px; font-size: 18px; color: #333">
                    June
                </h2>
                <p style="font-size: 14px; color:#666; margin-bottom: 10px">
                    프론트엔드 디자이너 | React & UI/UX
                </p>
                <p style="font-size: 14px; color:#666; margin-bottom: 10px;">
                    팔로워:2,100명
                </p>
                <p>
                    <a href="https://github.com/taehun00" style="margin-top: 5px; font-size: 13px; color: #e1306c; text-decoration: none;"
                        target="_blank"
                        title="프로필 가기"
                    >
                        깃허브 보기
                    </a>
                </p>

                <h3 style="font-size: 15px; color: #333"> 프론트엔드 학습 추천 순서 </h3>
                <ol style="text-align: left;">
                    <li>HTML & CSS</li>
                    <li>JavaScript</li>
                    <li>React</li>
                </ol>
            </div><!--end div2-->>
            
            <div style="background-color:rgb(255, 255, 255); width:250px; margin: 0 auto; margin-bottom: 20px; border-radius: 20px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); text-align: center; padding: 20px;">
                <p>
                    <img src="./img/three.png"
                    
                    alt = "사용자 카드"
                    style="width: 90px; height: 90px; border-radius: 50px; border: 3px solid #e1306c;"
                    >
                </p>
                <h2 style="margin-top: 10px; margin-bottom: 5px; font-size: 18px; color: #333"> Mina </h2>
                <p style="font-size: 14px; color:#666; margin-bottom: 10px">
                    AI 연구원 | Python & 머신러닝
                </p>
                <p style="font-size: 14px; color:#666; margin-bottom: 10px;">
                    팔로워: 1,500명
                </p>
                <p>
                    <a href="https://github.com/taehun00" style="margin-top: 5px; font-size: 13px; color: #e1306c; text-decoration: none;"
                        target="_blank"
                        title="프로필 가기"
                    >
                        깃허브 보기
                    </a>
                </p>
                <h3 style="font-size: 15px; color: #333">
                    Mina의 역할 정의
                </h3>
                <dl style="text-align: left; margin-left: 20px;">
                    <dt style="font-size : 15px; font-weight:bold; color:#333;">직무</dt>
                    <dd style="margin-left: 0; margin-bottom: 10px;">AI 연구원</dd>

                    <dt style="font-size : 15px; font-weight:bold; color:#333;">주요 기술</dt>
                    <dd style="margin-left: 0; margin-bottom: 10px;">Python, 머신러닝</dd>

                    <dt style="font-size : 15px; font-weight:bold; color:#333;">관심 분야</dt>
                    <dd style="margin-left: 0; margin-bottom: 10px;">자연어 처리, 딥러닝</dd>
                </dl>
            </div><!--end div3-->>
        </div>
        
    </body>
    </html>
   ```

## 5. css 내부적용 id  vs  class

1. id? 유일한 값

2. id 특징
    - html 문서에서 한번만 사용가능
    - 중복불가
    - css에서 #id명
    - 우선순위가 id와 class모두 있을때 id가 더 높음

3. class? 여러개 선택시

4. class 의 특징
    - 재사용가능 : 여러요소에 class 지정
    - 하나의 요소에 여러개의 class 사용가능
    - css에서 .class명
    - 반복스타일에 적합

## 6 배치요소
1. block(그릇) vs  inline(콘텐츠:간장)
  1) box model 
     - 콘텐츠가 자리하는 영역
  2) block 
     - width/hegiht O , 앞뒤줄바꿈 O , div,h3,p
  3) inline
     - width/height X , 앞뒤줄바꿈 X , a , span, strong       

2. 배치(1) - float
   - 좌우배치 (왼쪽 또는 오른쪽 배치)
   - clear:both 끊기 : 다음요소의 흐름 정리

3. 배치(2) - position
   - 절대/고정위치 
   - 부모 relative 위치기준 / 자식 absolute 이동
   - fixed 브라우저 기준

3. 배치(3) - display
   - 요소의 속성바꾸기

`web005_1.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>web005_1.html</title>
    <style>
        * {margin: 0; padding: 0; box-sizing: border-box;}
        body {font-family: 'Courier New'; background-color: aqua;}
        h3 {border-left: 3px solid blueviolet; border-bottom: 1px solid #123456;
            background-color: antiquewhite;}
        strong {background-color: blueviolet; color:aliceblue; padding:2px;
                width: 500px; /* 적용 X inline */
            }

        .container { width: 60%; margin: 30px; background-color:#fff;
                    padding:20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);}
        
        .item { padding: 10px; background-color: #333; color: #fff;}

        .i1 { float: left; width: 100px; text-align: center;}
        .i2 { float: right;}
        .i3 { clear: both; margin: 80px 0;}

        .me { background-color: gold; padding: 10px; color:white;
            position:relative;
            top: 5px; left:10px;
        }
        .p1 { position: relative;}
        .p1 .me { position: absolute; left:0;}
        .p2 .me { position: fixed; bottom: 100; right: 0px;
            background-color: #123456;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3>1. block vs inline</h3>
        <p><strong>block</strong> 그릇 width/height O, 줄바꿈 O</p>
        <p><strong>inline</strong> 콘텐츠-간장 wid/height X, 줄바꿈 X</p>
    </div>

    <div class="container f1">
        <h3>2. 배치 (1) - float</h3>
        <p class="item i1">LEFT</p>
        <p class="item i2">RIGHT</p>
        <p class="item i3">float:left, float:right 사용시 왼쪽, 오른쪽 배치 / clear:both</p>
    </div>
    <div class="container p1">
        <h3>3. 배치 (2) - position - relative + absolute</h3>
        <p class="me">WHERE I AM?</p>
        <p>부모 : relative (공간확보) / 자식요소 absolute (공간유지안됨.) </p>
    </div>
    <div class="container p2">
        <h3>3. 배치 (2) - position - fixed</h3>
        <p class="me">WHERE I AM?</p>
    </div>
</body>
</html>
```

### 1. block vs inline

1) box model  
- 콘텐츠가 자리하는 영역을 의미하며, 박스의 구성 요소는 __content, padding, border, margin__ 로 이루어진다.

2) block 요소  
- width/height 설정이 (O/X): __O__  
- 앞뒤 줄바꿈이 (O/X): __O__  
- 대표 태그: __div, h3, p__

3) inline 요소  
- width/height 설정이 (O/X): __X__  
- 앞뒤 줄바꿈이 (O/X): __X__  
- 대표 태그: __a, span, strong__
 

### 2. 배치(1) - float

- 요소를 좌우로 배치할 때 사용하는 속성은 __float__ 이다.  
- 다음 요소의 흐름을 정리하려면 __clear__ 속성을 사용한다.  
- float를 끊는 대표적인 방법은 클래스명으로 __clear__ 를 사용한다.

 

### 3. 배치(2) - position

- 자식 요소를 부모 기준으로 위치시키려면 부모에 __relative__, 자식에 __absolute__ 를 설정한다.  
- 브라우저 전체 기준으로 고정하려면 __fixed__ 속성을 사용한다.  
- position의 주요 값 4가지는 __static, relative, absolute, fixed__ 이다.

 

### 4. 배치(3) - display

- 요소의 기본 속성을 바꾸려면 __display__ 속성을 사용한다.  
- block 요소를 inline처럼 보이게 하려면 __inline__,  
  inline 요소를 block처럼 보이게 하려면 __block__ 값을 사용한다.
