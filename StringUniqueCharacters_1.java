import java.util.*;

public class StringUniqueCharacters_1 {


    public static void main(String args[]) {
        StringUniqueCharacters_1 s1 = new StringUniqueCharacters_1();
        boolean res = s1.isUnique_BF("tyurrrrdf");
        boolean res2 = s1.isUnique_Set("fghjkjhg");
        System.out.println("String is......." + res);
        System.out.println("String is......." + res2);


    }

    public boolean isUnique_BF(String s) {      //O(N^2)
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isUnique_Set(String s1) {  //O(N)
        Set<Character> findChars = new HashSet<>(); {
            for(char c: s1.toCharArray())
            {
                if(findChars.contains(c))
                {
                    return false;
                }
                findChars.add(c);
            }
          return true;

        }


    }
}
