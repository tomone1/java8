package com.tom;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @Author tom
 * @Date 2018/3/12 16:29
 */

public class LambadaDifferStyle {
  public static void main(String[] args) {
    Runnable noArgument=()-> System.out.println("Hello word");
    ActionListener oneArgument=event-> System.out.println("Button click");
    Runnable multiStatement=()->{

      System.out.println("hello");
      System.out.println("world");

    };
    BinaryOperator<Long> add=(x,y)->x+y;
    String name="tom";
   //  name="dd";
    Button button=new Button();
    button.addActionListener(e-> System.out.println("hi "+name));

  }
}
