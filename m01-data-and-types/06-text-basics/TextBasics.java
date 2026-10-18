void main() {
    String ten = "10";
    String twenty = "20";
    IO.println(ten + twenty);

    int numberTen = 10;
    int numberTwenty = 20;
    IO.println(numberTen + numberTwenty);

    String account = "123";
    String other =  account + "-4";
    IO.print(account);

    String postalCode; // CEP is type String because it is an identifier. If a postal code code were a number, a leading zero would be lost.
    int cartItems; // it's a number with increase and decrease operations. 1 to 50, fits in int.
    boolean paidOrder; // only two possibilities: true or false. If there were more than two options, a boolean would no longer suffice.
    String zoneCode; // String because char only accepts one character.

}