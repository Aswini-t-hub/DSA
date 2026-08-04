class Solution {
    public int reverse(int x) {
        boolean n=false;
        if(x<0){
            n=true;
            x=-x;
        }
        long result=0;
        while(x!=0){
            int d=x%10;
            result=result*10+d;
            x=x/10;
        }
        if(n){
            result=-result;
        }
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
        
    }
}