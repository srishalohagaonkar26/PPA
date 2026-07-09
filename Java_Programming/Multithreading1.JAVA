class Demo extends Thread
{
    public void run()
    {
        System.out.println("Iside run method of : "+Thread.currentThread().getName()+" : "+i);
    }

}

class MultithreadingName
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running.......");

       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();

       dobj1.setName("First");
       dobj2.setName("second");

       dobj1.start();
       dobj2.start();
    }
}