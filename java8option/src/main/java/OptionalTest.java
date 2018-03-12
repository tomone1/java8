import java.util.Optional;

/**
 * @Author tom
 * @Date 2018/3/12 10:37
 */

public class OptionalTest {

  //
  public static void main(String[] args) {
    // 创建Optional
    String maynull=null;
    Optional<String> opt1=Optional.of(" Hello, rensanning!");
    Optional<String> opt2=Optional.ofNullable(maynull);
    Optional<String> opt3=Optional.empty();
    /*
    *  ifPresent
    * */
   // boolean b1=opt1.isPresent();
    opt2.ifPresent(System.out::println);
    opt1.ifPresent(System.out::println);
    opt3.ifPresent(System.out::println);
    /*
    *
    *  ispresent
    * */
    boolean b1=opt1.isPresent();
    boolean b2=opt2.isPresent();
    boolean b3=opt3.isPresent();
    System.out.println(b1+"\t"+b2+"\t"+b3);

    /*
    * filter 方法
    * */
    opt1.filter(x->x.contains("ren")).ifPresent(System.out::println);
    /*
    * map 方法
    * */
    opt1.map(String::trim).ifPresent(System.out::println);
    /*
    * flatMap 方法
    * */
    Optional<String> lastname=Optional.of("last");
    Optional<String> firstname=Optional.of("first");
    Optional<String> fullname=lastname.flatMap(ln->firstname.map(fn->String.join("",ln,fn)));

    System.out.println(fullname.get());
    /*
    *  get 方法
    * */
    Optional<Integer> len=opt1.map(String::length);
    System.out.println(len.get());
    try{
      System.out.println(opt2.get());
  }catch(Exception e){
    e.printStackTrace();
    }

     /*
  *  orElse orElseGet /orElseThrow
  * */
    int len1=opt1.map(String::length).orElse(-1);
    int len2=opt2.map(String::length).orElse(-1);
    int len3=opt3.map(String::length).orElseGet(()->5*40);
    System.out.println(len1+"\t"+len2+"\t"+len3);
    try{
        opt3.filter(s -> !s.isEmpty()).map(s -> s.charAt(0)).orElseThrow(IllegalArgumentException::new);
    }catch(Exception e){
      e.printStackTrace();
    }
  }

}
