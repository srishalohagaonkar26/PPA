#include<stdio.h>

int main()
{
    char ch='A';
    int i=11;
    float f=90.99f;
    double d=78.67890;

    printf("L values of all variables");
    printf("%u\n",sizeof(ch)); //1
    printf("%u\n",sizeof(i)); //4
    printf("%u\n",sizeof(f)); //4
    printf("%u\n",sizeof(d)); //8

    return 0;

}
