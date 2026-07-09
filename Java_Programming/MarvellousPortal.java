import java.util.*;

class BatchEntry
{
    public long id;
    public String name;
    public int fees;

    public BatchEntry(long A, String B, int C)     //constructor
    {
        id = A;
        name = B;
        fees = C;
    }
    public void Display()
    {
        System.out.println("ID : "+id+" Name "+name+" Fees "+fees);
    }
}

class MarvellousPortal
{
    public static void main(String[] args) 
    {
        BatchEntry bobj1 = new BatchEntry(1, "PPA", 28000);     //first object created
        BatchEntry bobj2 = new BatchEntry(2, "LB", 29000);
        BatchEntry bobj3 = new BatchEntry(3, "Python", 30000);

        ArrayList <BatchEntry> aobj = new ArrayList<BatchEntry> ();

        aobj.add(bobj1);
        aobj.add(bobj2);
        aobj.add(bobj3);

        Iterator iobj = aobj.iterator();

        BatchEntry bobj = null;

        while (iobj.hasNext()) 
        {
            //System.out.println(iobj.next()); 
            
            bobj = (BatchEntry)iobj.next();
            bobj.Display();
        }
    }
}