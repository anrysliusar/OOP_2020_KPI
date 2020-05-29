package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введіть текст");
        Scanner my_text = new Scanner(System.in);
        String fin_text = my_text.nextLine();
        my_text.close();
        
        int max_len = 1;
        int start_pos = 0;
        int end_pos = 0;
        
        for (int n = 1; n <= fin_text.length() ; n++) {
            for (int i = 0; i <= fin_text.length() - n; i++) {
                String sub_text = fin_text.substring(i,i + n);
                if(sub_text.equals(new StringBuilder(sub_text).reverse().toString())) {
                    max_len = n;
                    start_pos = i;
                    end_pos = i + n;
                    break;
                }
            }
        }
        System.out.println("Length of polindrome = " + max_len);
        System.out.println(fin_text.substring(start_pos, end_pos));
    }
}

