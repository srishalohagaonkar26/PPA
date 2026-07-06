class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside Constructor");
    }

    @Override   //annotation
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class finalizeDemoX
{
    public static void main(String[] args) 
    {
        Marvellous mobj =new Marvellous();
        Marvellous mobj2 = mobj;    //ata 2 jana TV baghtayt
        mobj = null;    //without this finalize method wont run as someone is still watching the TV 

        System.gc();

        System.out.println("End of main ");
    }
}