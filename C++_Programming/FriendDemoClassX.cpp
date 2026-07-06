#include<iostream>
using namespace std;



class Hello()
{
    public : 
        void fun()
        {
            Demo dobj ; //object creation
            cout<<dobj.i<<endl;         //printing 
            cout<<dobj.j<<endl;
            cout<<dobj.k<<endl;
        }
        void gun()
        {
            Demo dobj ; //object creation
            cout<<dobj.i<<endl;         //printing 
            cout<<dobj.j<<endl;
            cout<<dobj.k<<endl;
        }
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

int main()
{
    Hello hobj; //hello cha object

    hobj.fun();
    hobj.gun();
    
    fun();

    return 0;
}