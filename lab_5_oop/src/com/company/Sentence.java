package com.company;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ",.!?()";
    private SentenceMember[] sentenceMembers;

    public Sentence(String sen) {
        sen = sen.replaceAll(" +", " ");
        String[] split = sen.split("(?=[,.!?() ])|\\s");
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(split[i])) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
            }
        }
    }

    public void findLongestPalindrome() {
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word) ((Word) sentenceMember).isLongestPalindrome();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (SentenceMember sentenceMember : sentenceMembers) {
            sb.append(sentenceMember.toString());
        }
        return sb.toString();
    }
}