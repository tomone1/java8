package com.tom;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author tom
 * @Date 2018/3/6 14:09
 */

public class Lambda {
  /*
  *  无参数 无返回值的
  * */
  Runnable runnable=()->{
    System.out.println();
  };
  /*
  * 有一个参数无返回值
  * */

  Comparator<Integer> comparator=(x, y)->{
    System.out.println("");
    return Integer.compare(x,y);
  };
  /*
  *  lambda 体中只有一条语句 ,return {} 都可以省略
  *
  * */
   Comparator<Integer> comparator1=(x,y)->Integer.compare(x,y);
   /*
   *  lambda 表达式 中参数列表的数据类型可以不写,因为JVM 编译器 可以通过上下文 推断出,数据类型, 即类型推断
   *
   * */
   /*
   * Java8内置四大核心函数式接口(java.util.function.*包)
   * */
   public static void main(String[] args) {
     /*
     * Consumer
消费型接口
     * */
     String str="str";
     //consumer(str,s-> System.out.println(s));
    // consumer("00",s-> System.out.println(s+"ww"));
     //System.out.println(supplier(()->"str"));
     //System.out.println(function(str,s->s));
     System.out.println( predicate(str,s -> s.isEmpty()));
   }
   /*   /*
     * Consumer
消费型接口
     * */

   public static void consumer(String str, Consumer<String> function){
     function.accept(str);
   }


   /*Supplier
供给型接口
   * */
   public static String supplier(Supplier<String> function){
     return function.get();

   }


/*
* Function
函数型接口
* */
public static  String function(String str, Function<String,String>function){
 return function.apply(str);

}
/*
* Predicate
断定型接口
* */

 public static Boolean predicate(String str, Predicate<String> function){
     return function.test(str);
 }
}
