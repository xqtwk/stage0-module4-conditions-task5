package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch(month) {
            case 1,3,5,7,8,10,12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            default:
                if (month > 12 || month < 1) {
                    System.out.println("wrong number!");
                } else {
                    System.out.println("30");
                    break;
                }
        }
    }
}
