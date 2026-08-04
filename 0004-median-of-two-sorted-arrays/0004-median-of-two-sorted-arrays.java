class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
       int n=nums2.length;
       int[] combined=new int[m+n];
       for(int i=0;i<m;i++){
        combined[i]=nums1[i];
       } 
       for(int i=0;i<n;i++){
        combined[m+i]=nums2[i];
       }
       Arrays.sort(combined);
       int totallength=combined.length;
       if(totallength%2!=0){
        return combined[totallength/2];
       }
       else{
        int mid1=combined[(totallength/2)-1];
        int mid2=combined[totallength/2];
        return (mid1+mid2)/2.0;
       }
      
    }
}