class Solution {
    public int longestPalindrome(String s) {
        //so in this we have to make the char array of the length of 128 so that we can store the count of the each char in the char array. now we will make the secound loop in the array and we will count he number of the time each char is occurs if the count of the char is even then in that case we have to add the count of that char in the ans and is the length of the count is odd then in that case we have to add char count -1 to the ans.
        char[] c=new char[128];
        int ans=0;
        
        for(char ch:s.toCharArray()){
            c[ch]++;
        }
        
        for(int i:c){
            if(i%2 == 0) ans+=i;
            else ans+=i-1;
        }
        if(s.length()>ans) ans+=1;
        
        return ans;
    }
}