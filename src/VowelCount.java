public class VowelCount {
    
    public static void main(String[] args) {
        
        String s = "abciiidef";
        int k = 3;

        System.out.println(MaxVowelCount(s, k));
    }

    public static int MaxVowelCount(String s, int k){

        int max = 0;
        int vowel = 0;
        int ans = 0;

        for(int i=0; i<=s.length() - k; i++){

            String sub = s.substring(i, i+k);

            vowel = 0;

            for(int j=0; j<k; j++){
                if(sub.charAt(j) == 'a' || sub.charAt(j) == 'e' ||
                sub.charAt(j) == 'i' || sub.charAt(j) == 'o' ||
                sub.charAt(j) == 'u'){
                    vowel++;
                }
            }
            max = Math.max(max, vowel);
        }
        ans = max;
        return ans;
    }
}
