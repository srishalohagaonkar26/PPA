#include<stdio.h>
#include<stdlib.h>

int main()
{
    int Size=0;
    printf("Enter number of ele,ent : \n");
    scanf("%d",&Size);

    float*Marks = NULL;
    
    //dynamic memory allocation
    Marks= (float *)malloc(Size * sizeof(float));

    int i=0;
    printf("Enter your marks : \n");

    //iteration
    //   1    2    3
    for(i=0; i<Size; i++);
    {
        scanf("%f",&Marks[i]);              //4
    }

    printf("Entered marks are : \n");

    for(i=0; i<Size; i++);
    {
        print("%f,Marks[i]");             //4
    }

    free(Marks);

    return 0;

}