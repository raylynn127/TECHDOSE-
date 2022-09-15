#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
    int a,b,c;
    float s,area;
    printf("Enter the Dimensions of the triangle");
    scanf("%d%d%d",&a,&b,&c);
    s=(a+b+c)/2.0;
    s=s*(s-a)*(s-b)*(s-c);
    area=sqrt(s);
    printf("The Area of the given triangle is: %f",area);
    return 0;
}
