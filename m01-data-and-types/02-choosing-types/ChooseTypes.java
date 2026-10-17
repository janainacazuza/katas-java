void main() {
    int cartItems = 10; // 1 to 50 - It's a small, integer number. Choosing int covers the range and, at the same time can be scalable in the future.
    int clientAge = 35; // 0 to about 120, fits in int. byte (up to 127) would also fit, and would be the right choice only if I stored millions of ages in memory and each byte counted.
    long ordersYear = 5_000_000_000L; //It's a very large range of integer values. Therefore, long is the only safe and a plausible choice. int could be an option if I were certain that this number wouldn't be a greater than 2_147_483_647
    double storageTemperature = 21.5; // Although it's a small decimal number. I know that best choice is double.
    char deliveryZone = 'A'; // A single and unique character;

    IO.println(cartItems);
    IO.println(clientAge);
    IO.println(ordersYear);
    IO.println(storageTemperature);
    IO.println(deliveryZone);
}