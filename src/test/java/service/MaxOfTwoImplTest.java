package service;

import static org.junit.Assert.*;

public class MaxOfTwoImplTest {

    @org.junit.Test
    public void getMax() {
        MaxOfTwoImpl maxOfTwo = new MaxOfTwoImpl();

        assertEquals(maxOfTwo.getMax(-1, 5), 5);
        assertEquals(maxOfTwo.getMax(4, 5), 5);
        assertEquals(maxOfTwo.getMax(0, 5), 5);
        assertEquals(maxOfTwo.getMax(-1, -5), -1);
    }
}