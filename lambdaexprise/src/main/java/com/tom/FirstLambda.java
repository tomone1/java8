package com.tom;

    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

/**
 * @Author tom
 * @Date 2018/3/12 16:19
 */

public class FirstLambda {
  public static void main(String[] args) {
    Button button=new Button();
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("button click");
      }
    });
    button.addActionListener(event-> System.out.println("button click"));
  }
}
