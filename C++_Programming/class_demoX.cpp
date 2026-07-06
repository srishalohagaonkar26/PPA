#include <iostream>
using namespace std;
class demo
{
    public:
        int i;          //characteristics
        float f;        //characteristics


        void fun()      //behaviour
        {
            cout<<"inside fun\n";   //behaviour


        }

};



int main ()
{

    demo dobj;

    cout<<sizeof(dobj)<<"\n";       // 8

    return 0;

}