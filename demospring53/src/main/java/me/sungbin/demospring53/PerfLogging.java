package me.sungbin.demospring53;

import java.lang.annotation.*;

/**
 * 이 에노테이션을 사용하면 성능을 로깅해줍니다.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {
}
