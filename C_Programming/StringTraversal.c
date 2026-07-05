#include<stdio.h>

int main()
{
    char str[] = "Ganesh";
    char *ptr = NULL;

    ptr = str;              //100

    while(*ptr != '\0')                                 //iteration
    {
        printf("%c\n",*ptr);    //G
        ptr++;                  //101
    }
    

    return 0;
}