package com.company;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;

    public Text(String sen) {
        String[] split = sen.split("\n");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);

        }
    }

    public Word findLongestPalindrome() {
        for (Sentence sentence : sentences) {
            sentence.findLongestPalindrome();
        }
        return Word.longestPalindrome;
    }




    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString());

        }
        return sb.toString();
    }




}