package Arrays;

public class MonthDays {

    public static int getNumberOfDays(String month) {
        if (month.equals("february"))
            return 28;
        if (month.equals("april") || month.equals("june")
                || month.equals("september") || month.equals("november"))
            return 30;
        return 31;
    }

    public static void main(String[] args) {
        String month1 = "january";
        String month2 = "february";

        System.out.println(getNumberOfDays(month1));
        System.out.println(getNumberOfDays(month2));
    }
}
