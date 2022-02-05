import java.util.Arrays;

public class StringPermutation_2 {



    public static void main(String args[])
    {
        String s1 = "cat";
        String s2 = "tac";
        boolean result= isValidPermutation(s1,s2);

        System.out.println(result);

    }


    public static boolean isValidPermutation(String s1, String s2)       //O(n log n)
    {
        if((s1.length() != s2.length()) || s1.isEmpty() || s2.isEmpty())
        {
            return false;
        }
        char[] string1= s1.toCharArray();
        char[] string2= s2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return new String(string1).equals(new String(string2));


    }

}
