public class PalindromePermutation_4 {

    public static void main(String arg[])
    {
        boolean res=palindromePermutation("racecar");
        System.out.println(res);
    }
    public static boolean palindromePermutation(String str){
        int[] char_count=new int[128];

        for(int i =0; i < str.length(); i++)
        {
            char_count[str.charAt(i)]++;
        }

        int count=0;
        for(int i =0; i < 128; i++)
        {
            count += char_count[i] % 2;
        }

    return count <= 1;

    }

}
