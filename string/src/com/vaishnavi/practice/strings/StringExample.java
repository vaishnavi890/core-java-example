package com.vaishnavi.practice.strings;

import java.util.stream.Stream;

public class StringExample {
    public static void main(String[] args) {

        String city = "pune"; // string literal
        String puneString = new String("Pune"); // string object

        System.out.println("String literal: " + city);
        System.out.println("String object: " + puneString);

        // immutable string objects trying to change
        puneString = new String("pune123");
        System.out.println("String object: " + puneString);
        System.out.println("----------------------------------------");

        // mutable objects - for non-multi-threading application
        StringBuilder greetings = new StringBuilder("hello");
        System.out.println("Current object: "+ greetings);
        greetings.append(", good evening!");
        System.out.println("Current object: "+ greetings);
        greetings = new StringBuilder("its a sunny day!");
        System.out.println("Current object: "+ greetings);

        // mutable objects - for multi-threading application
        StringBuffer stringBuffer = new StringBuffer("hiii");
        System.out.println("Current string buffer: " + stringBuffer);
        stringBuffer.append(", where are you?");
        System.out.println("Current string buffer: " + stringBuffer);
        stringBuffer = new StringBuffer("feeling sleep?");
        System.out.println("Current string buffer: " + stringBuffer);

        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");

        String sentence = "this is new string.";  // sentence contains blank space
        var wordSets = " word1 word2 word3 "; // set of words contains blank spaces
        var blanks = "      ";

        // isBlank() - identifies that current string is blank or not
        System.out.println("sentence.isBlank(): " + sentence.isBlank());
        System.out.println("wordSets.isBlank(): " + wordSets.isBlank());
        System.out.println("blanks.isBlank(): " + blanks.isBlank());
        System.out.println("----------------------------------------");

        // isEmpty() - identifies that current string is empty or not (length == 0)
        System.out.println("sentence.isEmpty(): " + sentence.isEmpty());
        System.out.println("wordSets.isEmpty(): " + wordSets.isEmpty());
        System.out.println("blanks.isEmpty(): " + blanks.isEmpty());
        System.out.println("----------------------------------------");

        //repeat - repeats current string
        String komal = new String("Komal ");
        String repeatedString = komal.repeat(3);
        System.out.println("blah.repeat(3): " + repeatedString);
        System.out.println("----------------------------------------");

        //trim - remove spaces from both ends
        System.out.println("before wordSets.trim(): " + wordSets);
        System.out.println("wordSets.trim(): " + wordSets.trim());
        System.out.println("same string after wordSets.trim(): " + wordSets);
        System.out.println("----------------------------------------");

        //strip - remove blank spaces
        System.out.println("before wordSets.strip(): " + wordSets);
        System.out.println("wordSets.strip(): " + wordSets.strip());
        System.out.println("same string after wordSets.strip(): " + wordSets);
        System.out.println("----------------------------------------");

        // trim() vs strip()
        var whitespaceString = "\n\they buddy\u2008";
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
        if (city == puneString) {
            System.out.println("city == puneString: both the string objects are exact same");
        } else {
            System.out.println("city == puneString: both the string objects are NOT exactly same");
        }
        System.out.println("----------------------------------------");

        // this checks the similarity in value
        puneString = new String("Pune");
        if (city.equals(puneString)) {
            System.out.println("city.equals(puneString): both the string values are exact same");
        } else {
            System.out.println("city.equals(puneString): both the string values are NOT exactly same");
        }
        System.out.println("----------------------------------------");

        System.out.println("puneString.length(): " + puneString.length());
        System.out.println("----------------------------------------");

        System.out.println("puneString: " + puneString);
        String replacedString = puneString.replace("P", "p");
        System.out.println("puneString.replace(): " + replacedString);
        String secondTimeReplacedString = puneString.replace("p", "P");
        System.out.println("puneString.replace(): " + secondTimeReplacedString);
        System.out.println("----------------------------------------");

        System.out.println("puneString.substring(3): " + puneString.substring(3));
        System.out.println("puneString.substring(3, 2): " + puneString.substring(3, 2));
        System.out.println("puneString.substring(1, 4): " + puneString.substring(1, 4));
        System.out.println("----------------------------------------");

        System.out.println("puneString.toUpperCase(): " + puneString.toUpperCase());
        System.out.println("puneString.toLowerCase(): " + puneString.toLowerCase());
        System.out.println("----------------------------------------");

        puneString.concat(" new content ");
        System.out.println("puneString.concat(): " + puneString.concat(" new content "));

        byte[] puneBytes = puneString.getBytes();
        System.out.println("byte[] of punestring: " + puneBytes);

    }
}

