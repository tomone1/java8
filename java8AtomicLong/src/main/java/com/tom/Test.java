package com.tom;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author tom
 * @Date 2018/3/12 15:37
 */

public class Test implements  Runnable {
  private  int count=100;
  private int num=1;
  /**
   * When an object implementing interface <code>Runnable</code> is used
   * to create a thread, starting the thread causes the object's
   * <code>run</code> method to be called in that separately executing
   * thread.
   * <p>
   * The general contract of the method <code>run</code> is that it may
   * take any action whatsoever.
   *
   * @see Thread#run()
   */
  public synchronized void run() {
    for (int i=0;i<count;i++){
      num++;
    }
  }

  public static void main(String[] args)throws  InterruptedException {
    ExecutorService service = Executors.newCachedThreadPool();
    Test test=new Test();
    for (int i = 0; i <100 ; i++) {
        service.execute(test);
    }
    service.shutdown();
    Thread.sleep(6000);
    System.out.println(test.num);

  }
}
