class Solution {
    public String multiply(String num1, String num2) {
        //if either number is zero then return zero
        if(num1.equals("0")||num2.equals("0")){
            return "0";

        }
        int m=num1.length();
        int n=num2.length();
        int[] result=new int[m+n];
        //multiply each digit with first number
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=mul+result[i+j+1];
                result[i+j+1]=sum%10;//store digits
                result[i+j]+=sum/10;//carry

            }
        }
        //converting result array into string by using string builders
        //where stringbuilders are mutable sequence of characters,designed for efficent string manipulation and concatenation in single-thread environments
        StringBuilder sb=new StringBuilder();

        //go througth each digit stored in result array from left to right
        for(int num:result){
            if(!(sb.length()==0&&num==0))
            {
                sb.append(num);

            }
        }
        return sb.toString();
    }
}