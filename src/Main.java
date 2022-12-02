public class Main {
    private enum DayOTheWeek{
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        var dayOfTheWeek= DayOTheWeek.TUE;

        String result = switch (dayOfTheWeek){
            case MON -> "Понеділок";
            case TUE, WED, THU, FRI -> {
                yield "Будній день, окрім понеділка";
            }
            default -> "Вихідний день";
        };
        System.out.println(result);
    }
}