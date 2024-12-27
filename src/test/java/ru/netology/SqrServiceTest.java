package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqrServiceTest {

    @Test

    public void shouldCalcExact() {
        SqrtService service = new SqrtService();
        int expected = 5;
        int actual = service.calcSqrtService(25);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcApproximation() {
        SqrtService service = new SqrtService();
        int expected = 5; // 5 * 5 = 25 (ближайшее большее или равное значение)
        int actual = service.calcSqrtService(17); // Здесь метод вернет 5, так как 4 * 4 = 16, а 5 * 5 = 25
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleNegativeNumber() {
        SqrtService service = new SqrtService();
        int expected = -1; // Метод возвращает -1 для отрицательных чисел
        int actual = service.calcSqrtService(-25);
        Assertions.assertEquals(expected, actual);
    }
}