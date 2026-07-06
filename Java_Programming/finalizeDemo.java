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

class finalizeDemo
{
    public static void main(String[] args) 
    {
        Marvellous mobj =new Marvellous();
        
        mobj = null;    //without this finalize method wont run as someone is still watching the TV 

        System.gc();

        System.out.println("End of main ");
    }
}