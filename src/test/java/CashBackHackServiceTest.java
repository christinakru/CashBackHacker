import org.example.CashbackHackService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashBackHackServiceTest {
    @Test
    public void cashback1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    public void cashback500() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(expected, actual);
    }

    @Test
    public void cashbackMore1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(expected, actual);
    }

    @Test
    public void cashback0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}
