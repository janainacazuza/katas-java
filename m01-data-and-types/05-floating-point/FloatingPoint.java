void main() {

    /* 0.5 and 0.25 have power-of-two denominators, so the sum is exact */
    double half = 0.5;
    double quarter = 0.25;
    double exactSum = half + quarter;
    IO.println(exactSum);

    /* 0.1 is 1/10 and 0.7 is 7/10: the denominator 10 has a factor 5, so neither is exact in binary and the sum is not exactly 0.8 */
    double oneTenth = 0.1;
    double sevenTenths = 0.7;
    double inexactSum = oneTenth + sevenTenths;
    IO.println(inexactSum);

    /* 4.35 is 87/20, not exact in binary; the cast drops the lost cent */
    double reais = 4.35;
    double centsAsDouble = reais * 100.0;
    IO.println(centsAsDouble);
    int centsTruncated = (int) centsAsDouble;
    IO.println(centsTruncated);
}