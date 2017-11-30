package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Inherited
public @interface SwaggerDefinition {
    String host() default "";

    String basePath() default "";

    String[] consumes() default {""};

    String[] produces() default {""};

    Scheme[] schemes() default {Scheme.DEFAULT};

    Tag[] tags() default {@Tag(name = "")};

    SecurityDefinition securityDefinition() default @SecurityDefinition;

    Info info() default @Info(title = "", version = "");

    ExternalDocs externalDocs() default @ExternalDocs(url = "");

    /**
     * Enumeration with valid schemes
     */
    enum Scheme {
        DEFAULT,
        HTTP,
        HTTPS,
        WS,
        WSS
    }
}
