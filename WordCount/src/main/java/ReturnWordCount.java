
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int counter = 0;
        
        for (int i = 0; i < in.length(); i++) {
            if(in.contains(" "))
            {
                counter++;
            }
        }
        return counter + 1;
    }
}
