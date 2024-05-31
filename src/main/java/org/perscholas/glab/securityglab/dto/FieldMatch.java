package org.perscholas.glab.securityglab.dto;

import jakarta.persistence.*;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

// Used to support the validation process of comparing fields with each other if they match.
// We can input two fields first and second and an optional message.
@Constraint(validatedBy = FieldMatchValidator.class)
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldMatch {
    String message() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String first();
    String second();
    @Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List
    {
        FieldMatch[] value();
    }
}
