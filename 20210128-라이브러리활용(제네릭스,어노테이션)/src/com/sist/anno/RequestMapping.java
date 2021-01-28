package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*
 *    class A
 *    {
 *       @RequestMapping("")
 *       public void aaa(){}
 *       @RequestMapping
 *       public void bbb(){}
 *       @RequestMapping
 *       public void ccc(){}
 *    }
 */
// @RequestMapping("구분문자")
@Retention(RUNTIME)
@Target(METHOD)
public @interface RequestMapping {
   public String value();
}
