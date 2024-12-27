package ru.netology;

public class SqrtService {

    public int calcSqrtService(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}
