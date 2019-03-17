import static org.junit.Assert.*;


import eightkyu.SetAlarm;
import org.junit.Test;

public class SetAlarmTests {

    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", SetAlarm.setAlarm(true, false));
        assertFalse("Should be false.", SetAlarm.setAlarm(true, true));
        assertFalse("Should be false.", SetAlarm.setAlarm(false, false));
        assertFalse("Should be false.", SetAlarm.setAlarm(false, true));
    }

}