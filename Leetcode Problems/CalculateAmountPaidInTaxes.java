class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int pre=0,sum=0;
        double ans =0;
        for(int a[]:brackets){
            int tmp =a[0]-pre;
            sum+=tmp;
            if(sum>income) {
                ans+= 0.01*(tmp-sum+income)*a[1];
                break;
            }
            ans+= 0.01*tmp*a[1];
            pre=a[0];
        }
        return ans;
        
    }
}