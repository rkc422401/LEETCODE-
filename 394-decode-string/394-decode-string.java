class Solution {
    public String decodeString(String s) {
        Stack<Integer> n=new Stack<>();
        Stack<StringBuilder> st=new Stack<>();
        
        StringBuilder str=new StringBuilder();
        int k=0;
        
        for(char c:s.toCharArray()){
            //if value
            if(Character.isDigit(c)){
                k=k*10 + (c-'0');
            }
            else if(Character.isLetter(c)){
                str.append(c);
            }
            else if(c=='['){
                n.push(k);
                st.push(str);
                k=0;
                str=new StringBuilder();
            }
            else if(c==']'){
                StringBuilder temp=str;
                int popi=n.pop();
                str=st.pop();
                while(popi !=0){
                    str.append(temp);
                    popi--;
                }
                k=0;
            }
            
        }
        return str.toString();
    }
}