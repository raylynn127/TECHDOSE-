#include <stdio.h>

int main() {
    int i,j,size,temp,k;
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++){
     scanf("%d",&arr[i]);
    }
    printf("The k value is ");
    scanf("%d",&k);
    for (i = 0; i < size-1; i++)
    {
        for (j = 0; j < size-1-i; j++)
        {
            if (arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printf("The sorted array is ");
    for(i=0;i<size;i++){
        printf("%d\t",arr[i]);
    }
    printf("\n\n%d'th largest element is %d",k,arr[k-1]);

    return 0;
}
