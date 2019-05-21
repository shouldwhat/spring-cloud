# config-server

* **프로젝트 소개**
```
    *. 본 프로젝트는 spring cloud 의 config server 라이브러리를 사용하여 config service application을 구성합니다.

    *. 해당 깃 리파지토리의 설정 파일을 참조합니다. (cs-dev.yml, cs-prod.yml)

```

-----------------------------------
* **빌드**
```
    *. 빌드 : clean package dockerfile:build

    *. 실행 : docker run -it -p 8080:8080 shouldwhat/config-server
```


-----------------------------------

* **요청 인터페이스**
```
    *. http://localhost:8080/cs/dev

    *. http://localhost:8080/cs/prod
```