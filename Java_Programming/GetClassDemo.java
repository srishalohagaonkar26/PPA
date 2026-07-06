class Marvellous
{}

class Hello
{}

class GetClassDemo
{
    public static void main(String[] args) 
    {
        Marvellous mobj =new Marvellous();
        Hello hobj = new Hello();

        System.out.println(mobj.getClass());
        System.out.println(hobj.getClass());
    }
}