/*
2.      Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra polindromai.
Jam sunku pačiam tai padaryti todėl jis prašo Jūsų pagalbos.
Parašykite metodą kuris patikrintų ar duotas žodis yra polindromas
(žodis ar sakinys kurį skaitant nuo galo gaunamas tas pats žodis ar sakinys,
pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” , “SĖDĖK UŽU KĖDĖS”).
Užuomina: pašalinti tarpus ir tuomet keliauti per pusę žodžio iš abiejų pusių tikrinant ar sutampa raidės.

 */
package com.kcs.days.second;

public class FirstTask {
    private static final String PALINDROME_1 = "KOL EINU ŠUNIE LOK";
    private static final String PALINDROME_2 = "ARGI TEN NE TIGRA";
    private static final String PALINDROME_3 = "SĖDĖK UŽU KĖDĖS";
    public static void main(String[] args) {
        String[] palindromeMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3};
        for (String p : palindromeMas) {

            if (isWordIsPalindrome(p.replaceAll(" ", ""))) {
                System.out.println("tai yra polindromas");
            } else {
                System.out.println("tai nera polindromas");
            }
        }
    }
    private static boolean isWordIsPalindrome(String word){
        boolean isPalindrome = true;
        for (int i =0; i < word.length(); i++){
            char a = word.charAt(i);
            char b = word.charAt(word.length() -1 -i);
            if(a!=b){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
