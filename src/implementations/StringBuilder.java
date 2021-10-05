package implementations;

public class StringBuilder {

    /*
        String builder solves the problem of O(N^2) time for concatenation of an array of words
        by using
     */

    private char[] characters;
    private int len = 0;
    private int cap;

    public StringBuilder () {
        cap = 10;
        characters = new char[cap];
    }

    public void append (String word) {
        for (int i = 0; i < word.length(); i++) {
            addChar(word.charAt(i));
        }
    }

    public void addChar(char c) {
        characters[len] = c;
        len++;
        if (len == cap) {
            reachedCap();
        }
    }

    public int getCap(){
        return cap;
    }

    public void reachedCap() {
        cap *= 2;
        char[] newChars = new char[cap];
        for (int i = 0; i < len; i++) {
            newChars[i] = characters[i];
        }
        characters = newChars;
    }

    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(characters[i]);
        }
        String s = sb.toString();
        return s;
    }

    public String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String w : words) {
            sentence.append(w);
        }
        return sentence.toString();
    }
}
