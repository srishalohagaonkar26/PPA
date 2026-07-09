class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        for(i = 1; i<= 100; i++);
        {
            System.out.println("Iside run method");
        }
    }

}

class MultithreadingLoop
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running.......");

       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();

       dobj1.start();
       dobj2.start();
    }
}