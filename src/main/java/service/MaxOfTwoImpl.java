package service;

import java.util.stream.Stream;

public class MaxOfTwoImpl implements MaxOfTwo{
    /**
     * getMax
     * @param num1
     * @param num2
     * @return Returns max of two numbers
     */
    @Override
    public int getMax(int num1, int num2) {
        MaxOfTwo maxOfTwo = (int n1, int n2) -> Stream.of(n1, n2).max(Integer::compare).get();

        return maxOfTwo.getMax(num1, num2);
    }
}
