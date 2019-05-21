# config-client

* **프로젝트 소개**
```
    *. 본 프로젝트는 spring cloud 의 config client 라이브러리를 사용하여 config service로 부터 설정 정보를 조회하는 sample application을 구성합니다.
```

-----------------------------------
* **프로젝트 실행**
```
    *. 메이븐 빌드 : clean package dockerfile:build

    *. 실행 : docker run -it -p 8090:8090 shouldwhat/config-client
```


-----------------------------------

* **요청 인터페이스**
```
    *. http://localhost:8090?keyword=first

    *. http://localhost:8090?keyword=second

    *. http://localhost:8090/actuator/refresh
```


-----------------------------------

* **참고 사항**
```
    *. application.properties : management.endpoints.web.exposure.include=* (/actuator/refresh 요청을 가능하게 할 경우 선언 필요)

    *. bootstrap.yml : spring.application.name=prod (config server 가 참조하는 파일의 prefix 와 일치해야함.)
```

