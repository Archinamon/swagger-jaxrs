package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Tag {
    String name();

    String description() default "";

    ExternalDocs externalDocs() default @ExternalDocs(url = "");

    Extension[] extensions() default {@Extension(properties = {@ExtensionProperty(name = "", value = "")})};
}
