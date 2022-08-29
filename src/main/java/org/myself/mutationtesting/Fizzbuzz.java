package org.myself.mutationtesting;

public class Fizzbuzz {
    public static String fizzbuzz(int nbre) {
        if((nbre % 5 == 0) && (nbre % 3 == 0)){
            return "FizzBuzz";
        }

        if(nbre % 3 == 0){
            return "Fizz";
        }

        if(nbre % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(nbre);
    }
}
