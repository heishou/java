package com.heishou;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 我的注解
 * @Target 注解的作用域
 * @Retention 生命周期 源代码/编译时/运行时
 * @Inherited 是否子类继承
 * @Documented 生成doc文档时包含注解
 * 成员变量必须使用无参无异常的方式定义
 * 如果成员变量只有一个值 必须写成value(),在使用该注解的时候就只需要传入一个值而不用写成员变量名了
 *  ps:不这样写也不会报错
 * 可以没有成员就是标识注解
 * @author heishou
 *
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
   String desc();
   String author();
   int age() default 24;
}
