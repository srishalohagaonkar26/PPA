class first
{
    public static void main(String[] A)
    {
        System.out.println("inside main");

        Arithmatic aobj=new Arithmatic(11,10);

        int result=0;

        result=aobj.Addition();
        System.out.println("addition is:" +result);
    {
        int Result=0;

    }
        result=aobj.subtraction();
        System.out.println("subtraction is:" +result);

    }
}
class Arithmatic
{
    public int No1,No2;

    public Arithmatic()
    {
        this.No1=0;
        this.No2=0;

    }

    public Arithmatic(int Value1, int Value2)
    {
        this.No1=Value1;
        this.No2=Value2;

    }

    public int Addition()
    {
        int Ans=0;
        Ans= this.No1+this.No2;
        return Ans;

    }

    public int subtraction()
    {
        int Ans=0;
        Ans= this.No1-this.No2;
        return Ans;

    }
}




