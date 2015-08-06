package com.heishou;

/**
 * @Deprecated注解说明已经过时
 * 注解继承只能应用于类，不能是继承 继承的类不能与被继承的注解位置冲突 不能同时有 
 * 否则获取的是继承的类注解
 * @author heishou
 *
 */
@MyAnnotation(desc = "青海", author = "西藏", age = 500)
public class Person {
   public String name(){return null;};
   public int age(){return 0;}
   @Deprecated
   public void sing(){}
}
