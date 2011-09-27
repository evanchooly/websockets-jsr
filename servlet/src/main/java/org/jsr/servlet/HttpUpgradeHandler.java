package org.jsr.servlet;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HttpUpgradeHandler {
    /**
     * @return The name of the target protocol
     */
    String protocol();

    /**
     * @return The url patterns handled by this handler
     */
    String[] urlPatterns();

    /**
     *  @return The description of the handler
     */
    String description() default "";

    /**
     * @return The display name of the handler
     */
    String displayName() default "";
}