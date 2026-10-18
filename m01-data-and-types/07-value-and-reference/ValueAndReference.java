void main() {
    int a = 5;
    int b = a;
    b = 10;
    IO.println(a);
    IO.println(b);

    String x = "Ana";
    String y = x;
    y = y + "!";
    IO.println(x);
    IO.println(y);

    /* Comparing two Strings using the == operator may return false, even if both contain the same content as "Ana", because this operator compares references rather than the actual content.  */
    String first = "Ana";
    String part = "A";
    String second = part + "na";   // built while running: a new text, a new reference.
    IO.println(first == second);
    IO.println(first == "Ana"); // the same literal is stored once, so both variables hold the same reference. The mechanism here is String pool
}