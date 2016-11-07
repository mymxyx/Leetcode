public class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=')' && c!=']' && c!= '}'){
                st.push(c);
            }
            if(c == ')'){
                while(st.isEmpty()==false && st.peek().toString().charAt(0) !='('){
                    if(st.peek().toString().charAt(0) == '[' ||st.peek().toString().charAt(0) == '{'){
                        return false;
                    }
                    else st.pop();
                }
                if(st.isEmpty()==true) return false;
                st.pop();
            }
            if(c == ']'){
                while(st.isEmpty()==false && st.peek().toString().charAt(0) !='['){
                    if(st.peek().toString().charAt(0) == '(' ||st.peek().toString().charAt(0) == '{'){
                        return false;
                    }
                    else st.pop();
                }
                if(st.isEmpty()==true) return false;
                st.pop();
            }
            if(c == '}'){
                while(st.isEmpty()==false && st.peek().toString().charAt(0) !='{'){
                    if(st.peek().toString().charAt(0) == '[' ||st.peek().toString().charAt(0) == '('){
                        return false;
                    }
                    else st.pop();
                }
                if(st.isEmpty()==true) return false;
                st.pop();
            }
            
            
        }
        return st.isEmpty();
        
    }
}
