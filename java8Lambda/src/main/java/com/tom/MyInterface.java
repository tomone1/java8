package com.tom;

/**
 * @Author tom
 * @Date 2018/3/6 14:12
 */

public interface  MyInterface {

  void test(int x);
  MyInterface i=(x)-> System.out.println("参数返回值");


  MyInterface m=x -> System.out.println("有一个参数X括号可以不写");
}

