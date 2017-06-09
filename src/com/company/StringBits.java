package com.company;

/**
 * Created by ridita on 6/9/17.
 */
public class StringBits {
    public String stringBits(String str) {

        String answerString = "";

        for (int i = 0; i < str.length(); i += 2) {
            answerString += str.charAt(i);
        }

        return answerString;

    }
}
