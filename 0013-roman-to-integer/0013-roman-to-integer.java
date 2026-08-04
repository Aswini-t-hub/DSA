class Solution {
    public int romanToInt(String s) {
        String keys="IVXLCDM";
        int[] values={1,5,10,50,100,500,1000};
        int total=0;
        for(int i=0;i<s.length();i++){
            int currval=values[keys.indexOf(s.charAt(i))];
            if(i+1<s.length() && currval<values[keys.indexOf(s.charAt(i+1))]){
                total-=currval;
            }
            else{
                total+=currval;
            }
        }
        return total;


    }
}