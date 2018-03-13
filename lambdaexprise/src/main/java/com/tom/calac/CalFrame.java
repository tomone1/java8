package com.tom.calac;

import javax.swing.*;

/**
 * @Author tom
 * @Date 2018/3/12 17:48
 */

public class CalFrame extends JFrame {
  /*
  *  计算器外观设计
  * */
  private static  final long serialVersionUID=1L;
  private  final static int PRE_WIDTH=500;
  private  final  static  int PRE_HIGTH=400;

  private  JTextField text=null;
  private  JButton button=null;

  private  String[] noP={"7","8","9","/","sqrt","4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};
  private String[] mOp={"MC","MR","MS","M+"};
  private String[]rop={"Back","CE","C"};

}
