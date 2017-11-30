package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface OAuth2Definition {
    String key();

    String description() default "";

    Flow flow();

    String authorizationUrl() default "";

    String tokenUrl() default "";

    Scope[] scopes() default {};

    enum Flow {
        IMPLICIT,
        ACCESS_CODE,
        PASSWORD,
        APPLICATION
    }
}
