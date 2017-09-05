package com.ajex.SinThread;

public class CommonResThread extends Thread{
     private  int count=6;


    public /*synchronized*/ void run()
    {
            count--;
            System.out.println(this.currentThread().getName()+"count is" + count);

    }

    public static void main(String[] args) {
        CommonResThread commonRes=new CommonResThread();
        Thread t1=new Thread(commonRes,"t1");
        Thread t2=new Thread(commonRes,"t2");
        Thread t3=new Thread(commonRes,"t3");
        Thread t4=new Thread(commonRes,"t4");
        Thread t5=new Thread(commonRes,"t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

