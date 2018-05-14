package com.kcs.days.firstDay;

import java.util.Scanner;

public class FirstTask {
    /*
    Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų,
    tada vėl paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus
    įvestas žodis „pabaiga“.
Patikrinkite ar įvestas žodžio ilgis yra lyginis ar ne tam panaudokite % operatoriu.
Jei žodis yra lyginis atspausdinkite “Įvestas žodis  {įvestas_žodis} yra lyginis” ir
šalia kokio ilgio yra žodis. Jei nelyginis “Įvestas žodis {įvestas_žodis} nelyginis”
 šalia jo ilgį. Taip suskaičiuokite kiek tame žodyje yra “a” raidžių.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("iveskite zodi");

            word = scanner.nextLine();
            if(word.length() % 2 == 0){
                System.out.println("ivestas zodis " + word + " yra lyginis, rasta raidziu "+countLetters(word, 'a'));
            }else{
                System.out.println("ivestas zodis " + word +" yra nelyginis, rasta raidziu "+countLetters(word, 'a'));
            }
        }while (!word.equals("pabaiga"));
    }
    private static int countLetters(String word, char letter){
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
