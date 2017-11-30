package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Inherited
public @interface Api {
    String value() default "";

    String[] tags() default {""};

    /** @deprecated */
    @Deprecated
    String description() default "";

    /** @deprecated */
    @Deprecated
    String basePath() default "";

    /** @deprecated */
    @Deprecated
    int position() default 0;

    String produces() default "";

    String consumes() default "";

    String protocols() default "";

    Authorization[] authorizations() default {@Authorization("")};

    boolean hidden() default false;
}
