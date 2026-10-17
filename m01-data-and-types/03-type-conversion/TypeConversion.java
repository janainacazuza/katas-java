void main() {
    int items = 12;
    long total = items;
    double ratio = items;
    IO.println(total);
    IO.println(ratio);
    double price = 99.99;
    int whole = (int) price; // If I remove (int) the compiler give back to me a error: incompatible types: possible lossy conversion from double to int
    IO.println(whole);
    long population = 5_000_000_000L;
    int small = (int) population; // the value of population when cast to an integer returns a silent overflow.
    IO.println(small);
}