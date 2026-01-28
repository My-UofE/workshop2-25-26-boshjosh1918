public class MyBirthday {
    public static void main(String[] args) {
        int weekday = Integer.parseInt(args[0]);
        int currentDate = Integer.parseInt(args[1]);
        int birthdayDate = Integer.parseInt(args[2]);

        // Part 1
        int nDays = birthdayDate - currentDate;

        // Part 2
        int birthdayWeekday = (weekday + nDays) % 7;

        // Part 3
        // System.out.println(currentDate + " is weekday " + weekday);
        System.out.println("Birthday falls on weekday: " + birthdayWeekday);
    }
}
