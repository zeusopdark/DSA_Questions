class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        
        if(n<=0||n%2!=0)return false;
        return isPowerOfTwo(n/2);
             
                            //   Bit manipulation  if(n==0)return false;
                                        //         if(n==Integer.MIN_VALUE)return false;

                                        //         return (n&n-1)==0;
    }
}
