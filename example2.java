import java.util.Scanner;

public class Main {

    static int[][] rainfall = {
            {14, 13, 11, 9, 5, 3, 1, 1, 4, 8, 7, 12},
            {17, 18, 15, 13, 11, 9, 7, 8, 9, 8, 15, 15},
            {9, 8, 6, 4, 2, 1, 0, 1, 3, 9, 7, 10},
            {12, 11, 9, 6, 4, 2, 1, 3, 5, 8, 10, 13},
            {15, 11, 15, 9, 5, 7, 4, 3, 4, 8, 12, 12}
    };

    public static String greatestAverageRainfallMonth() {
        int greatestMonth = 0;
        double greatestAverage = 0;

        for (int month = 0; month < 12; month++) {
            double average2022 = 0;
            double average2023 = 0;

            for (int region = 0; region < 4; region++) {
                average2022 += rainfall[region][month];
                average2023 += rainfall[4][month];
            }

            average2022 /= 4;
            average2023 /= 1;

            double averageRainfall = (average2022 + average2023) / 2;

            if (averageRainfall > greatestAverage) {
                greatestAverage = averageRainfall;
                greatestMonth = month;
            }
        }

        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return "Month with the greatest average rainfall over two years: " + monthNames[greatestMonth] +
                ", Average Rainfall: " + greatestAverage;
    }

    public static void main(String[] args) {
        System.out.println(greatestAverageRainfallMonth());
    }
}
