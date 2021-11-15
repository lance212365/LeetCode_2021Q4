import java.util.*;

class LongestPalindrome {
    public static void main(String[] args) {
        for(String arg : args){
            System.out.println(arg);
        }
    }
    public String longestPalindrome(String s) {
        String result = String.valueOf(s.charAt(0));
        for(int i = 0;i<s.length();i++){
            for(int n = s.length()-1;n>i;n--){
                if(s.charAt(i) == s.charAt(n) && n-i+1 > result.length()){
                    String target = s.substring(i,n+1);
                    result = checkPal(target) == true? target: result;

                }
            }
            if(result == s){
                return result;
            }
        }
        return result;
    }
    private Boolean checkPal(String str){
        if(str.length() <2){
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while(str.charAt(left) == str.charAt(right)){
            if(left == right | right == left+1){
                return true;
            } else {
                left++;
                right--;
            }
        }
        return false;
    }
}
