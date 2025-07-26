package String;

import java.sql.SQLOutput;

public class reverseWords {
    public static String reverse(String Word){
        int n=Word.length();
        int left=0;
        int right=n-1;
        String temp="";
        String ans="";

        while(left<=right){
            char ch=Word.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }else if(ch==' '){
                if(!temp.isEmpty()) {
                    if (!ans.isEmpty()) {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;
                    }
                    temp=" ";
                }
            }
            left++;
        }
        if(!temp.isEmpty()){
            if(!ans.isEmpty()){
                ans=temp+" "+ans;
            }else{
                ans=temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(reverse(s));
    }
}
