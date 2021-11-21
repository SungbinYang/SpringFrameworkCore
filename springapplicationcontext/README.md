## ApplicationContext와 다양한 빈 설정 방법
![](./img1.png)

- 스프링 IoC 컨테이너의 역할
    * 빈 인스턴스 생성
    * 의존 관계 설정
    * 빈 제공
- AppcliationContext
    * ClassPathXmlApplicationContext (XML)
    * AnnotationConfigApplicationContext (Java)
- 빈 설정
    * 빈 명세서
    * 빈에 대한 정의를 담고 있다.
        * 이름
        * 클래스
        * 스코프
        * 생성자 아규먼트 (constructor)
        * 프로퍼트 (setter)
- 컴포넌트 스캔
    * 설정 방법
        * XML 설정에서는 context:component-scan
        * 자바 설정에서 @ComponentScan
    * 특정 패키지 이하의 모든 클래스 중에 @Component 애노테이션을 사용한 클래스를 빈으로 자동으로 등록 해 줌.