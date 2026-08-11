package Assignments.Assignment3;

public class WeeklyStudyAnalyzer {

    public static int calculateTotal(int[] minutes) {
        int total = 0;

        for (int i = 0; i < minutes.length; i++) {
            total += minutes[i];
        }

        return total;
    }

    public static double calculateAverage(
            int total,
            int numberOfDays) {

        return (double) total / numberOfDays;
    }

    public static int findHighestDay(int[] minutes) {
        int highestIndex = 0;

        for (int i = 1; i < minutes.length; i++) {
            if (minutes[i] >= minutes[highestIndex]) {
                highestIndex = i;
            }
        }

        return highestIndex;
    }

    public static int countTargetDays(
            int[] minutes,
            int target) {

        int count = 0;

        for (int value : minutes) {
            if (value >= target) {
                count++;
            }
        }

        return count;
    }

    public static String classifyWeek(double average) {
        if (average >= 120) {
            return "Excellent";
        } else if (average >= 90) {
            return "Good";
        } else if (average >= 60) {
            return "Developing";
        } else {
            return "Needs Improvement";
        }
    }

    public static String classifyWeek(
            double average,
            int targetDays) {

        if (average >= 90 && targetDays >= 4) {
            return "Consistent Performer";
        } else if (average >= 90 || targetDays >= 4) {
            return "Partially Consistent";
        } else {
            return "Inconsistent";
        }
    }

    public static int findLowestDay(int[] minutes) {
        int lowestIndex = 0;

        for (int i = 1; i < minutes.length; i++) {
            if (minutes[i] < minutes[lowestIndex]) {
                lowestIndex = i; 
            }
        }

        return lowestIndex;
    }

    public static int calculateRange(int highest, int lowest) {
  
    return highest - lowest;
}

    public static void main(String[] args) {

        int id = 03;

        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday"
        };

        
        int[] studyMinutes = {
            90,90,90,90, 2
        };

        int studyRange = 
            calculateRange(studyMinutes[0], studyMinutes[4]);



        int lowday = 
            findLowestDay(studyMinutes);


        int dailyTarget = 70 + (id % 31);

        int total =
                calculateTotal(studyMinutes);

        double average =
                calculateAverage(
                        total,
                        studyMinutes.length);

        int highestIndex =
                findHighestDay(studyMinutes);

        int targetDays =
                countTargetDays(
                        studyMinutes,
                        dailyTarget);

        String averageCategory =
                classifyWeek(average);

        String consistencyCategory =
                classifyWeek(
                        average,
                        targetDays);

        System.out.println(
                "WEEKLY STUDY REPORT");

        System.out.println(
                "--------------------------------");

        for (int i = 0; i < days.length; i++) {
            System.out.printf(
                    "%-12s %4d minutes%n",
                    days[i],
                    studyMinutes[i]);
        }

        System.out.println(
                "--------------------------------");

        System.out.printf(
                "Total:             %d minutes%n",
                total);

        System.out.printf(
                "Average:           %.2f minutes%n",
                average);

        System.out.printf(
                "Highest day:       %s (%d minutes)%n",
                days[highestIndex],
                studyMinutes[highestIndex]);

        System.out.printf(
                "Days meeting %d:   %d%n",
                dailyTarget,
                targetDays);

        System.out.println(
                "Average category:  "
                        + averageCategory);

        System.out.println(
                "Consistency:       "
                        + consistencyCategory);

        System.out.println("The lowest index is " + lowday);       

        System.out.printf("Study range:        %d minutes%n", studyRange);
        
    }
}