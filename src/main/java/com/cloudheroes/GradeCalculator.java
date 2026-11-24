package com.cloudheroes;

public class GradeCalculator {

    public double average(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores must not be empty");
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public String letterGrade(double average) {
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        if (average >= 50) return "D";
        return "F";
    }
}
