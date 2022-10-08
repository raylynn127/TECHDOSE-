#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    if(n==1){
        printf("1 is neither prime nor composite");
        return 0;
    }
    int count=0;
    for(int i=2;i<n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==0){
        printf("It is a prime number");
    }
    else{
        printf("It is not a prime number");
    }
    
}
