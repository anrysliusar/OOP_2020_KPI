package com.company;

import java.util.ArrayList;

public class Word extends SentenceMember {
    private ArrayList<Letter> letters;
    static Word longestPalindrome = new Word("");

    public Word(String s) {
        letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            letters.add(new Letter(s.charAt(i)));
        }
    }


    public boolean checker() {

        ArrayList<Letter> tempCopy = new ArrayList<>();
        tempCopy.addAll(letters);
        tempCopy.remove(new Letter(' '));
        int temp = tempCopy.size() / 2;
        for (int i = 0; i < temp;i++ ){
            if (tempCopy.get(i).equals(tempCopy.get(tempCopy.size()-i-1))){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public void isLongestPalindrome(){
        ArrayList<Letter> tempCopy = new ArrayList<>();
        tempCopy.addAll(letters);
        tempCopy.remove(new Letter(' '));
        if (this.checker()){
            if (tempCopy.size() > longestPalindrome.letters.size()){
                longestPalindrome = this;

            }
        }
    }


    @Override
    public String toString() {
//        return letters.toString();
        StringBuilder sb = new StringBuilder();

        for (Letter letter : letters) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }
}
