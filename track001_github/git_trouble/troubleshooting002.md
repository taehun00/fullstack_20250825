### **문제점**
```bash
! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/taehun00/fullstack_20250825.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
```

### **해결방안**
###### 원인 분석
```bash
■ 수업 중 작성한 파일은 `.md` 확장자였으나, 집에서 정리한 파일은 `.txt` 확장자였음
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
```

###### 해결 과정
```bash
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
  GitHub에서 최신 파일을 pull하여 로컬에 가져옴
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
  가져온 `.md` 파일에 내용을 추가한 뒤 push하여 정상적으로 반영됨
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
  (참고: `.txt` 파일을 `.md`로 확장자만 변경해도 해결 가능했을 것으로 판단됨)
```

### **느낀점**
- Git은 파일의 이름과 확장자까지 엄격하게 관리하므로, 작은 차이도 큰 충돌로 이어질 수 있음
- 실수에서 배우는 것이 많았고, 꼼꼼하게 보는 습관이 생겼음.