#include<stdio.h>
#include<string.h>

int main()
{
    int len,count=0;
    char a[50];
    scanf("%s",a);
    len=strlen(a);
    for(int i=0;i<len;i++){
        if(a[i]==a[len-i-1]){
            count++;
        }
    }
    if(len==count){
        printf("It is a Palindrome");
    }else{
        printf("It is not a Palindrome");
    }
    return 0;
}
