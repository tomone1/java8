package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * @Author tom
 * @Date 2018/3/12 17:10
 * 类型推断
 */

public class TypeInference {

  public static void main(String[] args) {
    Map<String,Integer> oldWordCounts=new HashMap<>();
    Map<String,Integer>diamondWordCounts=new HashMap<>();
    Predicate<Integer> atleasts=x->x>5;
    System.out.println(atleasts.test(8));
    BinaryOperator<Integer> binaryOperator=(x,y)->x*y;
    System.out.println(binaryOperator.apply(100,100));
  }
}
