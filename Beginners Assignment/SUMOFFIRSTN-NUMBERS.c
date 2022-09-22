#include<stdio.h>
int main()
{
    int num,i,sum=0;
    printf("Enter a Natural Number");
    scanf("%d",&num);
    for(i=0;i<=num;i++){
        sum=sum+i;
    }
    printf("The Sum of First %d Numbers is: %d",num,sum);
    return 0;
}
