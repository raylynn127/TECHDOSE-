#include<stdio.h>
#include<string.h>

int main()
{
    int,in,sp,pr,out;
    printf("Enter the value of N");
    scanf("%d",&n);
    for(out=0;out<n;out++){
        for(sp=1;sp<=n-out;sp++){
            printf(" ");
        }
        for(in=0;in<=out;in++){
            if(in==0||out==0){
                pr=1;
            }else{
                pr=pr*(out-in+1)/in;
                printf("%4d",pr);
            }
        }
        printf("\n");
    }
}
