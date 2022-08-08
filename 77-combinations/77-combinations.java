class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // so in this what we have to do is that we have to make the list of list that contains the ans and then we have to return the ans
        List<List<Integer>> ans=new ArrayList();
        gen(1,n,new ArrayList(),ans,k);
        return ans;
    }
    void gen(int start,int end,List<Integer> curr,List<List<Integer>> ans,int k){
        if(curr.size()==k){
            ans.add(new ArrayList(curr));
            return;
        }
        
        for(int i=start;i<=end;i++){
            curr.add(i);
            gen(i+1,end,curr,ans,k);
            curr.remove(curr.size()-1);
        }
    }
}