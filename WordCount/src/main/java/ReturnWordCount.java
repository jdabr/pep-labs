
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int counter = 0;
        char[] ch = in.toCharArray();
        
        for (int i = 0; i < in.length(); i++) {
            if(ch[i] == ' ')
            {
                counter++;
            }
        }
        return counter + 1;
    }
}
