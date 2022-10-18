public class Main {
    private static enum DayOTheWeek{
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        var dayOfTheWeek= DayOTheWeek.TUE;

        String result = switch (dayOfTheWeek){
            case MON -> "Понеділок";
            case TUE, WED, THU, FRI -> {
                System.out.println("Будній день, окрім понеділка");
                yield "\t-- yield замінив у Java 13 break і повертає значення із блоку.";
            }
            default -> "Вихідний день";
        };
        System.out.println(result);
    }
}