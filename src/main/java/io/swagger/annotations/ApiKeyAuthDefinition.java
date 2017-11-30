package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ApiKeyAuthDefinition {
    String key();

    String description() default "";

    ApiKeyLocation in();

    String name();

    enum ApiKeyLocation{
        HEADER, QUERY;

        private static Map<String, ApiKeyLocation> names = new HashMap<String, ApiKeyLocation>();

        public static ApiKeyLocation forValue(String value) {
            return names.get(value.toLowerCase());
        }

        public String toValue() {
            for (Map.Entry<String, ApiKeyLocation> entry : names.entrySet()) {
                if (entry.getValue() == this) {
                    return entry.getKey();
                }
            }

            return null; // or fail
        }

        static {
            names.put("header", HEADER);
            names.put("query", QUERY);
        }
    }
}
