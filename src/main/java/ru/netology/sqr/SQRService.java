package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int x, int y) {
        int match = 0;
        for (int i = 10; i <= 99; i = i + 1) {
            if ((i * i >= x) & (i * i <= y)) {
                match = match + 1;
            }
        }
        return match;
    }
}