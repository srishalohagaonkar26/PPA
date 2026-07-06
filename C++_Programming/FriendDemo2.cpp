#include<iostream>
using namespace std;

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
        //friend function declaration just like obj declraation
        friend void fun();  //ghari sangitla ata ki ha mazha frnd ahe so ata fun hya class madhla sagle access karu shakto
};

void fun()
{
    Demo dobj ; //object creation
    cout<<dobj.i<<endl;         //printing 
    cout<<dobj.j<<endl;
    cout<<dobj.k<<endl;
}

int main()
{
    fun();

    return 0;
}