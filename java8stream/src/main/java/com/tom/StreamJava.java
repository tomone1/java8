package com.tom;

import java.util.Collection;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @Author tom
 * @Date 2018/3/9 10:20
 */

public class StreamJava {

  /*
  * 创建Stream
  * */
  /*
  * 1、java.util.Collection内置了获取流的方法，分别为串行流与并行流
  * */

  /*
  java.util.Arrays内置了获取流的方法
  * */
  /*
  * java.util.stream.Stream内置了创建流的方法，分别为通过对象创建流和通过函数创建流
  * */

  /*
  * 中间操作（java.util.stream.Stream）
  * */

  /*
  * 1、截断与切片
  * */

  /*
  * filter：过滤
  * */
  /*Stream<T> filter(Predicate<? super T> predicate);*/
/*
* distinct：去除重复元素（通过equals和hashCode）
* */

/*
* limit：限制数量
* */

/*
* skip：跳过
* */
/*
* 2、映射
*
* <R> Stream<R> map(Function<? super T, ? extends R> mapper);
* *
*
3、排序

sorted
Stream<T> sorted();Stream<T> sorted(Comparator<? super T> comparator);
4、包装

peek
Stream<T> peek(Consumer<? super T> action);
* */

}
