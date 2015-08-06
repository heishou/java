package com.heishou;

/**
 * @Deprecated注解说明已经过时
 * @author heishou
 *
 */
public interface Person {
   public String name();
   public int age();
   @Deprecated
   public void sing();
}
