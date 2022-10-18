public class Main {
    private static enum DayOTheWeek{
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        var dayOfTheWeek= DayOTheWeek.MON;

        switch (dayOfTheWeek){
            case MON:
                System.out.println("Понеділок");
                break;
            case TUE:
                System.out.println("Вівторок");
                break;
            default:
                System.out.println("Інший день тижня");
        }
    }


}