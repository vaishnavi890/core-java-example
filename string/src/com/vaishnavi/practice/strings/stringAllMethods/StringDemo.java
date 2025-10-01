package com.vaishnavi.practice.strings.stringAllMethods;

import java.util.stream.Stream;

public class StringDemo {
    public static void main(String[] args) {

        String indiaString = "India";//string literal
        String country = "India";//string object
        System.out.println("String literal " + indiaString);
        System.out.println("String object " + country);

        //immutable object trying to change
        country = "India132342";
        System.out.println(country);
        System.out.println("--------------------------------");

        //mutable object - for non-multi-threading application
        StringBuilder wish = new StringBuilder(" hi hello ");
        System.out.println("current object " + wish);
        wish.append(" happy birthday ");
        System.out.println("current object " + wish);
        wish = new StringBuilder("new data");
        System.out.println("current object " + wish);
        System.out.println("--------------------------------------");

        //mutable object for multi-threading application
        StringBuffer stringBuffer = new StringBuffer("hi");
        System.out.println("current string buffer " + stringBuffer);
        stringBuffer.append("all good?");
        System.out.println("string " + stringBuffer);
        stringBuffer = new StringBuffer("ssssssssssss");
        System.out.println("current string buffer " + stringBuffer);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");


        String sentence = "this is my new string"; //sentance contains blank space
        var wordSets = "word1 word2 word3 ";//set of words contains blank spaces
        var blank = "   ";


        //isBlank() - identifier that current string is blank or not
        System.out.println("sentance.isBlank():" + sentence.isBlank());
        System.out.println("wordSets.isBlank():" + wordSets.isBlank());
        System.out.println("blanks.isBlank():" + blank.isBlank());
        System.out.println("-------------------------------------------------");

        //isEmpty() - identifier that current string is empty or not (length == 0)
        System.out.println("sentance.isEmpty():" + sentence.isEmpty());
        System.out.println("wordSets.isEmpty():" + wordSets.isEmpty());
        System.out.println("blanks.isEmpty():" + blank.isEmpty());
        System.out.println("-------------------------------------------------");

        //repeat - repeats current string
        String blah = "blas ";
        System.out.println("blah.repeat(3) " + blah.repeat(3));
        System.out.println("-------------------------------------------------");

        //trim - to remove spaces from both ends
        System.out.println("wordSets.trim() " + wordSets);
        System.out.println("wordSets.trim() " + wordSets.trim());
        System.out.println("-------------------------------------------------");

        //strip - remove blank spaces
        System.out.println("before wordSets.strip(): " + wordSets);
        System.out.println("wordSets.strip(): " + wordSets.strip());
        System.out.println("same string after wordSets.strip(): " + wordSets);
        System.out.println("----------------------------------------");

        // trim() vs strip()
        var whitespaceString = "\n\they buddy\u2005";
        System.out.println("whitespaceString: " + whitespaceString);
        System.out.println("whitespaceString.strip(): " + whitespaceString.strip());

        //stripLeading() and stripTrailing()
        System.out.println("whitespaceString.stripLeading(): " + whitespaceString.stripLeading());
        System.out.println("whitespaceString.stripTrailing(): " + whitespaceString.stripTrailing());
        System.out.println("----------------------------------------");

        // lines
        sentence = "this\nis\nmy\nstring."; // sentence contains blank spaces
        System.out.println("sentence: " + sentence);

        Stream<String> streamLines = sentence.lines();
        streamLines.forEach(line -> System.out.println("Line: " + line));
        System.out.println("----------------------------------------");

        // it will check the similarity in object location
        if (country == indiaString) {
            System.out.println("country == indiaString: both the string objects are exact same");
        } else {
            System.out.println("country == indiaString: both the string objects are NOT exactly same");
        }
        System.out.println("----------------------------------------");

        // this checks the similarity in value
        indiaString = "India";
        if (country.equals(indiaString)) {
            System.out.println("country.equals(indiaString): both the string values are exact same");
        } else {
            System.out.println("country.equals(indiaString): both the string values are NOT exactly same");
        }
        System.out.println("----------------------------------------");

        System.out.println("indiaString.length(): " + indiaString.length());
        System.out.println("----------------------------------------");

        System.out.println("indiaString: " + indiaString);
        String replacedString = indiaString.replace("I", "i");
        System.out.println("indiaString.replace(): " + replacedString);
        String secondTimeReplacedString = indiaString.replace("i", "I");
        System.out.println("indiaString.replace(): " + secondTimeReplacedString);
        System.out.println("----------------------------------------");

        System.out.println("indiaString.substring(3): " + indiaString.substring(3));
        System.out.println("indiaString.substring(3, 5): " + indiaString.substring(3, 5));
        System.out.println("indiaString.substring(1, 4): " + indiaString.substring(1, 4));
        System.out.println("----------------------------------------");

        System.out.println("indiaString.toUpperCase(): " + indiaString.toUpperCase());
        System.out.println("indiaString.toLowerCase(): " + indiaString.toLowerCase());
        System.out.println("----------------------------------------");

        indiaString.concat(" new content ");
        System.out.println("indiaString.concat(): " + indiaString.concat(" new content "));

        byte[] indiaBytes = indiaString.getBytes();
        System.out.println("byte[] of indiastring: " + indiaBytes);

    }
}
