## 문제점
```
Error: The frameborder attribute on the iframe element is obsolete.
Use CSS instead. From line 150, column 17; to line 150, column 324 
<iframe width="560" height="315" src="https://www.youtube.com/embed/BP88lz3tHtM?si=rBJ8iHLhHb4Nz9PR" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
```
- HTML5에서 더이상 사용되지 않는 속성인 frameborder를 `iframe` 태그에 사용했기 때문에 문제가 발생.

## 해결방안
기존 코드
```
<iframe class="w-100" src="..." frameborder="0" ...></iframe>
```
수정된 코드
```
<iframe class="w-100 border-0" src="..." ...></iframe>
```
- HTML5에서 더이상 사용하지 않는 `frameborder`를 제거하고 Bootstrap클래스에 `border-0`을 사용

## 느낀점
- 이번에 `iframe`태그에서 `frameborder`속성이 더 이상 사용되지 않는다는 것을 배웠다.
- 표준 기술은 계속 변화함으로 지속적으로 학습을 해야하는 대상이라는 것을 깨달았다.