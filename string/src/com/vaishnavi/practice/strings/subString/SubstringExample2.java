package com.vaishnavi.practice.strings.subString;

public class SubstringExample2 {

    public static void main(String[] args) {
        String url = "https://www.google.com";

        // Remove "https://www."
        String domain = url.substring(12);

        // Or extract only "google"
        String siteName = url.substring(12, url.indexOf(".com"));

        System.out.println("Domain: " + domain);
        System.out.println("Site Name: " + siteName);
    }
}
