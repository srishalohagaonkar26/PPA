#include<iostream>
using namespace std;

int main()
{
    int Size=0;
    cout<<"Enter number of element : \n";
    cin>>Size;

    float*Marks = NULL;
    
    //dynamic memory allocation
    Marks= new float[Size];

    int i=0;
    cout<<"Enter your marks : \n";

    //iteration
    //   1    2    3
    for(i=0; i<Size; i++);
    {
        cin>>Marks[i];              //4
    }

    printf("Entered marks are : \n");

    for(i=0; i<Size; i++);
    {
        cout<<Marks[i]<<"\n";             //4
    }

    delete [] Marks;

    return 0;

}