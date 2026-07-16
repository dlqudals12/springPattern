# 1. 여러 쇼핑몰 상품 등록 구조화

### 패키지 정보

- com.example.sprignTest.product

### 사용한 디자인 패턴

- Strategy (전략 패턴)
    - MallType을 기준으로 ProductProcessor 구현체를 선택
    - type을 key로 가지는 Map<MallType, ProductProcessor> 구조로 관리
    - 상품 등록 요청 시 MallType을 전달받아 해당 Processor를 조회 후 register() 실행
    - 쇼핑몰별 등록 방식 변경 및 추가 시 기존 ProductService 수정 없이 확장 가능

+ Template Method (템플릿 메서드 패턴)
    + ProductProcessor 공통 인터페이스를 기반으로 국가별 공통 처리 흐름을 추상화
    + 국가별(KR, JP, GLOBAL) Template에서 공통 등록 흐름을 관리
    + 각 Mall(Coupang, Naver, Rakuten 등)은 Template을 상속하여 변경되는 비즈니스 로직만 구현

### 사용한 이유

- 쇼핑몰별 상품 등록 로직이 증가해도 기존 로직의 변경을 최소화하기 위해 사용
- 공통 처리 영역과 변경되는 비즈니스 로직을 분리하여 유지보수성을 높임
- 새로운 국가 또는 쇼핑몰 추가 시 기존 코드 수정 없이 확장 가능하도록 설계