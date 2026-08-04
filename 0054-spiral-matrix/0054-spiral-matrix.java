import java.util.*;
class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>out=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int left=0,right=c-1,bottom=r-1,top=0,j;
        while(left<=right && top<=bottom){
            for(j=left;j<=right;j++){
                 out.add(matrix[top][j]);
                 
            }
            top++;
            for(j=top;j<=bottom;j++){
                out.add(matrix[j][right]);
                
            }
            right--;
            if(top<=bottom){
            for(j=right;j>=left;j--){
                out.add(matrix[bottom][j]);
            
            }
             bottom--;
        }   
            if(left<=right){
            for(j=bottom;j>=top;j--){
                out.add(matrix[j][left]);
                
            }
            left++;
            }

            
        }
        return out;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> result=spiralOrder(matrix);
        System.out.println(result);
    }
}