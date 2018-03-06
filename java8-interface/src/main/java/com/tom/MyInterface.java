package com.tom;

/**
 *  java 8
 */
public interface MyInterface {
  int MAX_SERVICE_TIME = 100;
  void  test();
  default void doSomething(){
    System.out.println("do something");

  }
}
