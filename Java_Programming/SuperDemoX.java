class Base
{
    public int i;

    public Base(int no)
    {
        System.out.println("Inside Base Constructor");
        this.i=no;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }

}

class Derived extends Base
{
    public int i;

    public Derived()
    {
        System.out.println("Inside derived constructor");
        this.i=21;
        super(11); 
    }

    public void gun()
    {
        System.out.println("Inside gun of derived");
        System.out.println("Value of i:"+i);
        System.out.println("Value of i from base : "+super.i);
    }
}

class SuperDemoX
{
    public static void main (String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();
    }

}