class Demo
{
    public int i;
    private int j;
    protected int k;

    public Demo()
    {
        i=0;
        j=0;
        k=0;
    }

    public void display()
    {
        System.out.println("Value of i: "+1);       //allowed
        System.out.println("Value of j: "+1);       //allowed
        System.out.println("Value of k: "+1);       //allowed

    }

}
class Access
{
    public static void main(String A[])
    {
        Demo dobj=new Demo();

        dobj.display();
        System.out.println("Value of i: "+dobj.i);     //allowed
        System.out.println("Value of j: "+dobj.j);     //not allowed 
        System.out.println("Value of k: "+dobj.k);      //???


    }


}