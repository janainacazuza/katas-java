void main() {
    int unitPrice = 150;
    int quantity = 3; //when I switch 3 for "three" the java compiler shows : java: incompatible types: java.lang.String cannot be converted to int
    int discount = 30 ; //when I remove the initial value of this value: the java compiler shows : java: variable discount might not have been initialized: 7
    int installments = 4;

    int total = unitPrice * quantity - discount; //when this ; was deleted : the java compiler shows ';' expected:7
    IO.println(total);
    IO.println(total/installments);
}