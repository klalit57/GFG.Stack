package GFG;
import java.util.*;

public class CheckBalancedParenthesis {
    public static boolean checkBalancedParenthesis(String str){
        Deque<Character>  s= new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(matching(s.peek(),x)){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean matching(char a, char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }
    public static void main(String [] args){
        String str="[({})]";
        System.out.println(checkBalancedParenthesis(str));
    }
}
