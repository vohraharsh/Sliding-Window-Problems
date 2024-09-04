public class GoodSubstring {
    
    public static void main(String[] args) {
        
        String s = "aababcabc";
        System.out.println(countGoodSubstring(s));
    }

    public static int countGoodSubstring(String s){
        
        int count = 0;

        for(int i=0; i<=s.length() - 3; i++){

            String sub = s.substring(i, i+3);

            if(sub.charAt(0) != sub.charAt(1) &&
            sub.charAt(1) != sub.charAt(2) &&
            sub.charAt(2) != sub.charAt(0)){
                count++;
            }
        }
        return count;
    }
}
