package ztrial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
    @Target({ElementType.TYPE_USE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnno{
        int myValue() default 0;
        String name() default "Nikhil";
        String city() default "Muzaffarpur";

    }

