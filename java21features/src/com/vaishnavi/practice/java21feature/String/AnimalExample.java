package com.vaishnavi.practice.java21feature.String;

public class AnimalExample {
    public static void main(String[] args) {
        String animal = "Elephant";
        int age = 12;
        String sound = "Trumpet";

        // 1️⃣ Using formatted()
        String description = "The animal is a %s. It is %d years old.".formatted(animal, age);
        System.out.println("Animal Description:");
        System.out.println(description);

        // 2️⃣ Using repeat()
        System.out.println("\nAnimal Sound:");
        System.out.println((sound + " ").repeat(3)); // Trumpet Trumpet Trumpet

        // 3️⃣ Using stripIndent() for multiline formatted info
        String info = """
                Animal Report:
                    Name : %s
                    Age  : %d
                    Sound: %s
                """.stripIndent().formatted(animal, age, sound);

        System.out.println("\nFormatted Animal Report:");
        System.out.println(info);

        // 4️⃣ Using translateEscapes() for decoding animal behavior log
        String rawLog = "Status:\\nEating\\nWalking\\nBathing";
        String decodedLog = rawLog.translateEscapes();

        System.out.println("Decoded Animal Behavior Log:");
        System.out.println(decodedLog);
    }
}

