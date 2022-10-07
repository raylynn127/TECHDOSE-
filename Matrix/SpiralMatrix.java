class Solution {
public List spiralOrder(int[][] matrix) {
List result = new ArrayList<>();

    int row = matrix.length;
    int col = matrix[0].length;
    
    int top = 0; 
    int down = row-1;
    int left = 0; 
    int right = col-1;
    int dir = 0;
    
    while(top <= down && left <= right) {
        if(dir==0){
            for(int i = left; i<= right; i++)
                result.add(matrix[top][i]);
            top++;
        }
        
        else if(dir==1){
            for(int i = top; i<= down; i++)
                result.add(matrix[i][right]);
            right--;
        }
        
        else if(dir==2){
            for(int i = right; i>= left; i--)
                result.add(matrix[down][i]);
            down--;
        }
        
        else if(dir==3){
            for(int i = down; i>= top; i--)
                result.add(matrix[i][left]);
            left++;
        }
        dir = (dir+1)%4;  // here after doing % 4 we again start from 0 
    }
    return result;
}
}