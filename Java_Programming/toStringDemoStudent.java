class Student
{
    public String Name;
    public int Age;
    public int Marks;

    Student(String A, int B, int C)
    {
        this.Name = A;
        this.Age = B;
        this.Marks = C;
    }

    public String toString()
    {
        return "Marvellous Pune";
    }   
}

class toStringDemoStudent
{
    public static void main(String[] args) 
    {
        Student  sobj = new  Student("Amit", 27, 98);

        System.out.println(sobj);
    }
}