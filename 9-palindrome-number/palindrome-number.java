class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int temp=x;
        while(temp!=0)
        {
            sum*=10;
            sum+=temp%10;
            temp/=10;
        }

        return x==sum;      
    }
}
