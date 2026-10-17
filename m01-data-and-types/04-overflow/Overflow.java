void main() {
    int valueInt = 2_000_000_000;
    int overflowedSum= valueInt + valueInt;
    IO.println(overflowedSum);

    long valueLong = 2_000_000_000L;
    long safeSum = valueLong + valueLong;
    IO.println(safeSum);

    int fileCount = 3_000;
    long fileSize = 1_500_000L; // If fileSize = 500_000 , the int type is enough but one increase about 43% results in overflow
    long totalSize = fileCount * fileSize;
    IO.println(totalSize);

    long totalSizeOverflowed = 4_000 * 1_200_000; // the product is only converted from int to long after the result, so overflow occurs
    IO.println(totalSizeOverflowed);
    long totalSizeSafe = 4_000L * 1_200_000; // the conversion occurs before the product because one of the operands is long and "pulls" the other to long , so the overflow does not happen
    IO.println(totalSizeSafe);
}