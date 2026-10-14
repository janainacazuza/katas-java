/** Prints the balance after a flat fee and a courtesy refund */
void main() {
    int balance = 1000;
    int fee = 20;
    int courtesy = 5;
    balance = balance - fee;
    balance = balance + courtesy; // courtesy give back part of the fee, so it is added
    IO.println(balance);
}