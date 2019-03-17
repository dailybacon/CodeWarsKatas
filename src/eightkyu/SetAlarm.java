package eightkyu;

public class SetAlarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        boolean isEmployed = employed;
        boolean isOnVacation = vacation;
        if (isEmployed && !isOnVacation) {
            return true;
        } else {
            return false;
        }
    }
}