
import java.util.*;
import java.util.Map.Entry;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char[] charArr = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char c : charArr)
        {
            if(hm.containsKey(c))
            {
                hm.put(c, hm.get(c) + 1);
            }
            else
            {
                hm.put(c,1);
            }
        }

        int largest = hm.get(charArr[0]);

        for (int i = 0; i < hm.size(); i++) {
            if(largest < hm.get(charArr[i]))
            {
                largest = hm.get(charArr[i]);
            }
        }

        for(Entry<Character,Integer> entry: hm.entrySet())
        {
            if(entry.getValue() == largest)
            {
                return entry.getKey();
            }
        }

        return ' ';
    }
}
