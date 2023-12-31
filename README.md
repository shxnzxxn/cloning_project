# [프로젝트] React - Spring Boot 상품 관리, 주문관리 API 구현
## 프로젝트 소개 😎
React로 만들어진 Front End가 정해져있는 상황에서,
백엔드 개발자가 Spring Boot로 상품관리 API를 구현하여 A-Z 최종 서비스를 완성시켜봅니다.
클로닝 외에도 "본인만의 아이디어"를 추가하여 더 발전시켜 완성해봅니다.

## 이곳은 공개 Repo입니다.
1. 이 repo를 fork한 뒤
2. 여러분의 개인 Repo에서 상품관리 API를 A-Z까지 작업하여
3. 개발이 끝나면 이 Repo에 PR을 보내어 제출을 완료해주세요.
## 배달의 민족 어플 클로닝 프로젝트 😎

>  요구사항 분석
- 주문
    - 음식 주문 (여러 종류의 음식이 여러개 가능하도록)
    - 주문 취소
    - 가게 목록 리스트업
        - 카테고리별 정렬(치킨, 피자, 한식 등등)
        - 가게에는 운영하고있는 메뉴들이 따라옴.
    - 회원가입
        - ID과,비밀번호, 주소만 입력받음.
        - ID는 중복되면 안됨.
        - 주문자, 사업자로 구분..?
    - 찜 목록
        - 가게를 찜할 수  있음.
    - 메뉴 리뷰
        - 자신이 주문을 하고 음식을 먹었다면 리뷰를 남길 수 있게 해줌.
        - 리뷰는 텍스트뿐만 아니라, 수치화할 수 있는 평가지표를 반영
    - 검색하여 가게 찾기
        - 가게별로 정해져있는 카테고리를 찾을 수 있게.
    - 가게 등록 (음식도 등록)
        - 사업자만 등록할 수 있음.
        - 가게 이름과 음식 이름을 추가하여 등록 가능
        - 위치도 입력받기

>  도메인
- 유저(Member)
- 가게(Store)
- 메뉴(Menu)
- 주문(Order)
- 리뷰(Review)


> 기술 스택
- Java, Spring, JPA
- MySQL, Docker

> ERD
**Store**

- PK
    - store_id int
- Attribute
    - store_name char(50)
    - city char(50)
    - street char(50)
    - zip-code char(50)

> 테스트 방법 및 결과