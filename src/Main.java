public class Main {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println(day.toString());
        System.out.println(day.getRusName());
        System.out.println(day.isWeekend(Day.SATURDAY.name()));
    }
}