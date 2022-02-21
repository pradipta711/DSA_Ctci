package ArrayandString;

import java.util.HashMap;
import java.util.Map;

public class StringCompression_6 {



    public static void main(String[] args)
    {
        char[] chars= {'s','a','n','d','e','e','p'};
        HashMap<Character, Integer> hmap= new HashMap<>();

        for(int i=0 ; i<chars.length ; i++)
        {
            if(hmap.containsKey(chars[i]))
            {
                hmap.put(chars[i], hmap.get(chars[i]) + 1);
            }

            else
            {
                hmap.put(chars[i], 1);
            }
        }

        StringBuffer sb = new StringBuffer();
        for(Map.Entry<Character,Integer> entry: hmap.entrySet())
        {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb.toString());
    }
}

