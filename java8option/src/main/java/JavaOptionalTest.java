

import java.util.Optional;

/**
 * @Author tom
 * @Date 2018/3/12 10:21
 */

public class JavaOptionalTest {

  public Integer sum (Optional<Integer> a, Optional<Integer> b){
    System.out.println("第一个参数值存在"+a.isPresent());
    System.out.println("第二个参数值存在"+b.isPresent());
    Integer value1=a.orElse(new Integer(0));
    Integer value2=b.get();
    return value1+value2;
  }

  public static void main(String[] args) {
    JavaOptionalTest javaOptionalTest=new JavaOptionalTest();
    Integer value1=null;
    Integer value2=new Integer(10);
    Optional<Integer> a=Optional.ofNullable(value1);
    Optional<Integer> b=Optional.of(value2);
    System.out.println(javaOptionalTest.sum(a,b));
   // System.out.println(javaOptionalTest.sum(b,a));
  }
}
