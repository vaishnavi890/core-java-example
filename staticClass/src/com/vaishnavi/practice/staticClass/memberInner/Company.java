package com.vaishnavi.practice.staticClass.memberInner;

public class Company {
    //  Static nested class
    static class BonusCalculator {
        static double getBonusPercentage(String designation) {
            switch (designation) {
                case "Manager":
                    return 0.20;
                case "Developer":
                    return 0.15;
                case "Intern":
                    return 0.05;
                default:
                    return 0.10;
            }
        }
    }
}
