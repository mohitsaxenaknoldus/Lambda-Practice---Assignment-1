package controller;

import service.MaxOfTwoImpl;

import java.util.logging.Logger;

public final class MaxController {

    private static final Logger LOGGER = Logger.getLogger(MaxController.class.getName());

    private MaxController(){}

    public static void main(String[] args)
    {
        final int num1 = 4;
        final int num2 = -2;

        MaxOfTwoImpl maxOfTwo = new MaxOfTwoImpl();
        int result = maxOfTwo.getMax(num1, num2);
        LOGGER.info(String.valueOf(result));
    }
}
