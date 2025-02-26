package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {

    @Test
    public void testPlusMethod() {
        Money money1 = new Money(1, 10);
        Money money2 = new Money(1,10);
        Money money3 = money1.plus(money2);

        assertTrue(money3.euros() == 2);
        assertTrue(money3.cents() == 20);

    }


    @Test
    public void testMinusMethod() {
        Money money1 = new Money(1, 10);
        Money money2 = new Money(1,10);
        Money money3 = money1.minus(money2);

        assertTrue(money3.euros() == 2);
        assertTrue(money3.cents() == 20);
    }

    @Test
    public void testLessThanMetod() {
        Money money1 = new Money(1, 10);
        Money money2 = new Money(1,10);
        

        assertEquals(false, money1.lessThan(money2));
    }

}
