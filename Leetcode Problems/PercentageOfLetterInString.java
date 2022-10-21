class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0; 
        for(char ch:s.toCharArray())
        {
            if(ch==letter)
                count++;
        }
        if(count==0) 
            return 0;
        int total=s.length();
        int per=(count*100)/total;
        return per;
    }
}