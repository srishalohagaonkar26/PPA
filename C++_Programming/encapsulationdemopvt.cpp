#include <iostream>
using namespace std;

// Encapsulation
class marvellous
{
    //access specifier(by dfault pvt)
    int no1,no2;    //characteristics

    void fun()      //behaviour
    {
        cout<<"inside fun\n";

    }

    void gun()      //behaviour
    {
        cout<<"inside gun\n";

    }


};
int main()
{
    //object creation (instance)
    marvellous mobj1;
    marvellous mobj2;

    cout<<sizeof(mobj1)<<"\n";  //8

    cout<<mobj1.no1<<"\n";      //error

    mobj1.fun();                //error
    mobj2.fun();                //errorr

    mobj1.gun();


    return 0;
}