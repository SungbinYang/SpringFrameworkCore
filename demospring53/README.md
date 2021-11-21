## @Autowired
- 필요한 의존 객체의 “타입"에 해당하는 빈을 찾아 주입한다.
- @Autowired
    * required: 기본값은 true (따라서 못 찾으면 애플리케이션 구동 실패)
- 사용할 수 있는 위치
    * 생성자 (스프링 4.3 부터는 생략 가능)
    * 세터
    * 필드
- 경우의 수
    * 해당 타입의 빈이 없는 경우
    * 해당 타입의 빈이 한 개인 경우
    * 해당 타입의 빈이 여러 개인 경우
        * 빈 이름으로 시도,
            * 같은 이름의 빈 찾으면 해당 빈 사용
            * 같은 이름 못 찾으면 실패
- 같은 타입의 빈이 여러개 일 때
    * @Primary
    * 해당 타입의 빈 모두 주입 받기
    * @Qualifier (빈 이름으로 주입)
- 동작원리
    * [BeanPostProcessor](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html)
        * 새로 만든 빈 인스턴스를 수정할 수 있는 라이프 사이클 인터페이스
    * [AutowiredAnnotationBeanPostProcessor](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/AutowiredAnnotationBeanPostProcessor.html) extends BeanPostProcessor
        * 스프링이 제공하는 @Autowired와 @Value 애노테이션 그리고 JSR-330의 @Inject 애노테이션을 지원하는 애노테이션 처리기.