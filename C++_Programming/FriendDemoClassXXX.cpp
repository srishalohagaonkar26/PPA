#include<iostream>
using namespace std;

class Hello()
{
    public : 
        
};

class Demo
{
    public : int i;
    private : int j;
    protected : int k;

    public :
        Demo()
        { i = 11;
          j = 21;
          k = 51;
        }

        friend void Hello :: fun();
};

void Hello :: fun()
{
            Demo dobj ; //object creation
            cout<<dobj.i<<endl;         //printing 
            cout<<dobj.j<<endl;
            cout<<dobj.k<<endl;
}
void Hello :: gun()
{
            Demo dobj ; //object creation
            cout<<dobj.i<<endl;         //printing 
            cout<<dobj.j<<endl;
            cout<<dobj.k<<endl;
}

int main()
{
    Hello hobj; //hello cha object

    hobj.fun();
    hobj.gun();
    
    fun();

    return 0;
}