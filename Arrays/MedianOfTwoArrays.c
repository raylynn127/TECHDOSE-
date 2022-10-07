#include <stdio.h>
int getMedian(int ar1[],int ar2[],int n)
{
    int i=0;
    int j=0;
    int count;
    int m1=-1,m2=-1;
    for(count=0;count<=n;count++){
        if(i==n)
        {
            m1=m2;
            m2=ar2[0];
            break;
        }
        else if(j==n)
        {
            m1=m2;
            m2=ar1[0];
            break;
        }
        if(ar1[i]<=ar2[j])
        {
            m1=m2;
            m2=ar1[i];
            i++;
        }
        else
        {
            m1=m2;
            m2=ar2[j];
            j++;
        }
    }
    return (m1+m2)/2;
}
int main() {
    int n1,n2;
    printf("Enter the size of array1 ");
    scanf("%d",&n1);
    int ar1[n1];
    for(int i=0;i<n1;i++){
        scanf("%d",&ar1[i]);
    }
    printf("Enter the size of array2 ");
    scanf("%d",&n2);
    int ar2[n2];
    for(int i=0;i<n2;i++){
        scanf("%d",&ar2[i]);
    }
    if(n1==n2)
    printf("Median is %d",getMedian(ar1,ar2,n1));
    else
    printf("Doesn't work for arrays of unequal size");
    getchar();

    return 0;
}