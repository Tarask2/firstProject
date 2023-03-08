package com.ua.robot.homeWork14;

public enum DayOfWeek {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int priority;

    DayOfWeek(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public DayOfWeek[] returnDayOfWeek(int priority) {


        switch (priority) {
            case 1:
                System.out.println(MONDAY);
                break;
            case 2:
                System.out.println(TUESDAY);
                break;
            case 3:
                System.out.println(WEDNESDAY);
                break;
            case 4:
                System.out.println(THURSDAY);
                break;
            case 5:
                System.out.println(FRIDAY);
                break;
            case 6:
                System.out.println(SATURDAY);
                break;
            case 7:
                System.out.println(SUNDAY);
                break;
            default:
                System.out.println("Day is none");
        }
        return DayOfWeek.values();
    }

}



