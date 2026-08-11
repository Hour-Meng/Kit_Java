package Assignments.Assignment2;

import java.util.Scanner;

public class StudentPerformance {

    // Personalisation: change N to the last 3 digits of YOUR student ID.
    static final int N = 4;
    static final int MAX = N;

    // Pass threshold derived from N (assignment rule).
    static final int PASS_THRESHOLD = (N < 50) ? (N + 50) : (N / 2);

    // Extra feature: flag scores more than 20% above the simple average.
    static final double ABOVE_AVG_RATIO = 1.20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = new String[MAX];
        int[] scores = new int[MAX];
        int[] credits = new int[MAX]; // modification: second field per record

        int count = readData(sc, subjects, scores, credits);

        if (count == 0) {
            System.out.println("No records stored. Exiting.");
            sc.close();
            return;
        }

        printReport(subjects, scores, credits, count);
        sc.close();
    }

    // Reads and validates N records; returns how many were stored.
    public static int readData(Scanner sc, String[] subjects, int[] scores, int[] credits) {
        System.out.printf("%nStudent Performance Analysis%n");
        System.out.printf("Enter %d subject records (N = %d from your student ID).%n%n", N, N);

        for (int i = 0; i < N; i++) {
            String subject;
            do {
                System.out.printf("Record %d — subject name: ", i + 1);
                subject = sc.nextLine().trim();
                if (subject.isEmpty()) {
                    System.out.println("  Subject cannot be empty. Try again.");
                }
            } while (subject.isEmpty());

            subjects[i] = formatSubject(subject);

            int score;
            do {
                System.out.printf("Record %d — score for %s (0-100): ", i + 1, subjects[i]);
                if (!sc.hasNextInt()) {
                    sc.next();
                    score = -1;
                } else {
                    score = sc.nextInt();
                }
                if (score < 0 || score > 100) {
                    System.out.println("  Invalid score. Enter a value from 0 to 100.");
                }
            } while (score < 0 || score > 100);
            scores[i] = score;
            sc.nextLine(); // consume newline after nextInt

            int credit;
            do {
                System.out.printf("Record %d — credit hours for %s (1-6): ", i + 1, subjects[i]);
                if (!sc.hasNextInt()) {
                    sc.next();
                    credit = -1;
                } else {
                    credit = sc.nextInt();
                }
                if (credit < 1 || credit > 6) {
                    System.out.println("  Invalid credit hours. Enter a value from 1 to 6.");
                }
            } while (credit < 1 || credit > 6);
            credits[i] = credit;
            sc.nextLine();
        }

        System.out.printf("%nStored %d records.%n", N);
        return N;
    }

    public static String formatSubject(String subject) {
        if (subject.length() == 1) {
            return subject.toUpperCase();
        }
        return subject.substring(0, 1).toUpperCase() + subject.substring(1).toLowerCase();
    }

    public static int total(int[] scores, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static double average(int[] scores, int count) {
        if (count == 0) {
            return 0.0;
        }
        return (double) total(scores, count) / count;
    }

    // Modification: weighted average using credit hours.
    public static double weightedAverage(int[] scores, int[] credits, int count) {
        if (count == 0) {
            return 0.0;
        }
        double weightedSum = 0.0;
        int creditTotal = 0;
        for (int i = 0; i < count; i++) {
            weightedSum += scores[i] * credits[i];
            creditTotal += credits[i];
        }
        if (creditTotal == 0) {
            return 0.0;
        }
        return weightedSum / creditTotal;
    }

    public static int findMaxIndex(int[] scores, int count) {
        if (count == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndex(int[] scores, int count) {
        if (count == 0) {
            return -1;
        }
        int minIndex = 0;
        for (int i = 1; i < count; i++) {
            if (scores[i] < scores[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int countPassing(int[] scores, int count, int threshold) {
        int passed = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= threshold) {
                passed++;
            }
        }
        return passed;
    }

    // Extra feature: count subjects more than 20% above the simple average.
    public static int countWellAboveAverage(int[] scores, int count, double avg) {
        int flagged = 0;
        double cutoff = avg * ABOVE_AVG_RATIO;
        for (int i = 0; i < count; i++) {
            if (scores[i] > cutoff) {
                flagged++;
            }
        }
        return flagged;
    }

    public static boolean isWellAboveAverage(int score, double avg) {
        return score > avg * ABOVE_AVG_RATIO;
    }

    // OVERLOADED #1: classify a single score into a letter grade.
    public static String classify(int score) {
        return switch (score / 10) {
            case 10 -> "A+";
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "C";
            case 5 -> "F";
            default -> "F";
        };
    }

    // OVERLOADED #2: classify the group by its average.
    public static String classify(double average, boolean isGroup) {
        if (!isGroup) {
            return classify((int) Math.round(average));
        }
        if (average >= 90) {
            return "Distinction";
        } else if (average >= PASS_THRESHOLD) {
            return "Pass";
        }
        return "At Risk";
    }

    public static void printReport(String[] subjects, int[] scores, int[] credits, int count) {
        int sum = total(scores, count);
        double simpleAvg = average(scores, count);
        double weightedAvg = weightedAverage(scores, credits, count);
        int maxIndex = findMaxIndex(scores, count);
        int minIndex = findMinIndex(scores, count);
        int passCount = countPassing(scores, count, PASS_THRESHOLD);
        int aboveAvgCount = countWellAboveAverage(scores, count, simpleAvg);
        String groupLabel = classify(simpleAvg, true);

        System.out.println();
        System.out.println("===================================================================");
        System.out.println("                    STUDENT PERFORMANCE REPORT");
        System.out.println("===================================================================");
        System.out.printf("N = %d records | Pass threshold = %d (derived from N)%n", N, PASS_THRESHOLD);
        System.out.printf("Extra rule: flag scores > %.0f%% above simple average%n%n", (ABOVE_AVG_RATIO - 1) * 100);

        System.out.printf("%-14s %5s %7s %6s %8s %12s%n",
                "Subject", "Score", "Credit", "Grade", "Pass?", "Above Avg?");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            String passStatus = scores[i] >= PASS_THRESHOLD ? "Yes" : "No";
            String aboveFlag = isWellAboveAverage(scores[i], simpleAvg) ? "YES (*)" : "-";
            System.out.printf("%-14s %5d %7d %6s %8s %12s%n",
                    subjects[i],
                    scores[i],
                    credits[i],
                    classify(scores[i]),
                    passStatus,
                    aboveFlag);
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.printf("Total score (simple sum)     : %d%n", sum);
        System.out.printf("Simple average               : %.2f%n", simpleAvg);
        System.out.printf("Weighted average (credits)   : %.2f%n", weightedAvg);
        System.out.printf("Overall group classification : %s%n", groupLabel);
        System.out.printf("Highest score                : %s (%d)%n",
                subjects[maxIndex], scores[maxIndex]);
        System.out.printf("Lowest score                 : %s (%d)%n",
                subjects[minIndex], scores[minIndex]);
        System.out.printf("Subjects at/above threshold  : %d / %d%n", passCount, count);
        System.out.printf("Subjects > 20%% above average : %d / %d%n", aboveAvgCount, count);
        System.out.println("===================================================================");
    }
}
