package com.tom;

/**
 * Created by itdgyt01 on 2018/3/5.
 */
public interface MyClassFactory {
  /*
  *  inter 静态工厂方法
  * */
  public static MyClass getInstance() {
    return new MyClass();
  }
}
