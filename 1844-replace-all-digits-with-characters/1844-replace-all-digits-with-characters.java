class Solution {
    public String replaceDigits(String s) {
       
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
             if(Character.isDigit(s.charAt(i))){
                char c=(char)(s.charAt(i-1)+s.charAt(i)-'0');
                sb.append(c);
             }
             else{
                sb.append(s.charAt(i));
             }
             
        }
        return sb.toString();
    }
}