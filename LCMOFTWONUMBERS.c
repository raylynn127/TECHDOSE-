#include<stdio.h>

int main()
{
    int a,b,ans;
    printf("Enter two Numbers ");
    scanf("%d%d",&a,&b);
    ans = (a>b)?a:b;
    
    while(1){
        if(ans%a==0 && ans%b==0){
            printf("The LCM of %d and %d is %d",a,b,ans);
            break;
        }
        ++ans;
    }
    return 0;
    
}
