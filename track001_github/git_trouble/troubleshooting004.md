### 문제점
```bash
PS D:\HYUNJU\workspace\fullstack_20250825> git push origin dev-tkasid00
remote: Permission to tkasid00/fullstack_20250825.git denied to HSH703.
fatal: unable to access 'https://github.com/tkasid00/fullstack_20250825.git/': The requested URL returned error: 403
```

### 해결방안
```bash
현재 Github에 로그인된 계정이 HSH703인데 이 계정은 tkasid00 저장소에 푸쉬 권한이 없었다.
해결하기 위해서는 tkasid00 계정이 tkasid00 계정이 HSH703 계정에게 Collaborator 권한을 부여해야한다.

권한 부여 방법
GitHub에서 Settings -> Collaborators 메뉴로 이동 -> HSH703 계정을 초대
```

### 느낀점
- 단순한 Github에서 누가 어떤 권한을 갖고 있는지를 명확하게 파악하는 습관이 생긴 것 같다. Github은 단순한 코드 저장소가 아니라 협업을 하기위한 시스템으로 팀원과의 소통을 통해 완벽한 팀워크 준비가 완성되는 것 같다.