package arrays;


import java.util.*;


public class EncodeAndDecode {
    public static void main(String[] args) {

    }

    public String encode(List<String> strs) {
        String encoded = "";
        for (String str : strs) {
            encoded = str.length() + "@" + str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        char ch[]  = str.toCharArray();
        
        for(int i = 0; i < ch.length; i++) {
            StringBuilder word = new StringBuilder();
            int len = 0;
            if(isNumber(ch[i]) && ch[i+1] == '@') {
                // ch[i+2] is the start of new word of length ch[i]
                len = ch[i];
                word = new StringBuilder();
                
            } else {
                // this character belongs to the same word
            }
        }
        return list;
    }

    private boolean isNumber(char c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNumber'");
    }
}
