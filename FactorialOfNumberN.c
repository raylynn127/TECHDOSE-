#include<stdio.h>
int main()
{
    int i,factorial=1,number;
    printf("ENTER A NUMBER");
    scanf("%d",&number);
    for(i=1;i<=number;i++){
        factorial=factorial*i;
    }
    printf("The Factorial of %d number is: %d",number,factorial);
    return 0;
}