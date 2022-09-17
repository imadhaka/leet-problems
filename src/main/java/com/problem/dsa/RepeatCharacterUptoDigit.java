package com.problem.dsa;

/*
* Repeat the character of string upto the digit next
*
* input: adca3rtyy2uid3
* Expected output:
* aaadddcccaaa
* rrttyyyy
* uuuiiiddd
*
* */
public class RepeatCharacterUptoDigit {
    public static int startIndex;
    public static int endIndex;
    public static void main(String arg[]) throws Exception {
        String input = "2adca3rtyy2uid7";
        int len = input.length();
        if(!(input.toCharArray()[len-1] >= 49 && input.toCharArray()[len-1] < 58 )){
            throw new Exception("Please provide a String ending with 1-9");
        }
        while (startIndex < len){
            int value = getNumeric(input);
            String result = getSubstring(input, value);
            System.out.println(result);
            startIndex = endIndex + 1;
        }
    }

    static Integer getNumeric(String str){
        int value = 0;
        for(int i = startIndex; i< str.length(); i++){
            if(str.toCharArray()[i] >= 49 && str.toCharArray()[i] < 58 ){
                endIndex = i;
                value = Integer.parseInt(String.valueOf(str.charAt(i)));
                break;
            }
        }
        return value;
    }

    static String getSubstring(String str, int value){
        String result = new String();
        for(int j = startIndex; j< endIndex; j++){
            int val = value;
            while(val > 0){
                result += str.charAt(j);
                val--;
            }
        }
        return result;
    }
}
