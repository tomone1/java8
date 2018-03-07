package com.tom;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author tom
 * @Date 2018/3/7 11:03
 */
/*
*  方法的引用
* */
public class People {

public static final long serialVersionUID=-2052988928272007869L;
 private  String id;

  public String getId() {
    System.out.println("getID");
    return id;
  }

  public void setId(String id) {
    System.out.println("setId");
    this.id = id;
  }

  public static void main(String[] args) {
    People people=new People();
   // people.setId("55");
    Supplier<String> supplier=people::getId;
   // System.out.println(supplier.get());
    Consumer<String> consumer=people::setId;
    consumer.accept("99");
    /*
    *  类名 ::静态方法名
    * */
    Comparator<Integer> comparator1=(x,y)->Integer.compare(x,y);
    Comparator<Integer> comparator=Integer::compare;
    System.out.println(comparator.compare(1,12));

   /* 3. 类名 :: 实例方法名*/
    Predicate<String> predicate=String::isEmpty;
    System.out.println(predicate.test("1"));
    /*
    *  构造器的引用
    * */
    Supplier<People> supplier1=People::new;
    System.out.println("ssss");
    People p=supplier1.get();
    p.setId("11");
     System.out.println(p.getId());;
     /*
     *  数组的引用
     *
     * */
    Function<Integer,People[]> function=People[]::new;
    People[] people1=function.apply(10);


  }
}
