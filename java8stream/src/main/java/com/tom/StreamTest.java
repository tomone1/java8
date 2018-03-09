package com.tom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author tom
 * @Date 2018/3/9 11:08
 *
 *
 */

public class StreamTest {


  private static final int MAX_INT=1_000_000;
  public  static void stream(){
    List<String> list=new ArrayList<>();
    IntStream.range(0,MAX_INT).forEach(value -> {
      UUID uuid=UUID.randomUUID();
      list.add(uuid.toString());
    });
    Long starttime=System.nanoTime();
    list.stream().sorted().collect(Collectors.toList());
    long endtime=System.nanoTime();
    Long durationtime= TimeUnit.NANOSECONDS.toMillis(endtime-starttime);
    System.out.println("Stream 执行时间是 ---"+durationtime);
  }
  public static  void parallelStream(){
    List<String> list=new ArrayList<>();
    IntStream.range(0,MAX_INT).forEach(value -> {
      UUID uuid=UUID.randomUUID();
      list.add(uuid.toString());
    });
    Long starttime=System.nanoTime();
    list.parallelStream().sorted().collect(Collectors.toList());
    long endtime=System.nanoTime();
    Long durationtime=TimeUnit.NANOSECONDS.toMillis(endtime-starttime);
    System.out.println("parallelStream 执行时间是:"+durationtime);
  }

  public static void main(String[] args) {
     /*stream();
     parallelStream();*/
    ForkJoinPool pool=ForkJoinPool.commonPool();
    System.out.println(pool.getParallelism());
  }
}
