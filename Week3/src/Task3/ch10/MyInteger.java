package Task3;
//(The MyInteger class) Design a class named MyInteger. The class contains:
//        ■■ An int data field named value that stores the int value represented by
//        this object.
//        ■■ A constructor that creates a MyInteger object for the specified int value.
//        ■■ A getter method that returns the int value.
//        ■■ The methods isEven(), isOdd(), and isPrime() that return true if the
//        value in this object is even, odd, or prime, respectively.
//        ■■ The static methods isEven(int), isOdd(int), and isPrime(int) that
//        return true if the specified value is even, odd, or prime, respectively.
//        ■■ The static methods isEven(MyInteger), isOdd(MyInteger), and
//        isPrime(MyInteger) that return true if the specified value is even, odd,
//        or prime, respectively.
//        ■■ The methods equals(int) and equals(MyInteger) that return true if
//        the value in this object is equal to the specified value.
//        ■■ A static method parseInt(char[]) that converts an array of numeric
//        characters
//        to an int value.
//        ■■ A static method parseInt(String) that converts a string into an int value.
//        Draw the UML diagram for the class then implement the class. Write a client
//        program that tests all methods in the class.
public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        if (value%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isOdd(){
        if (value%2!=0){
            return true;
        }
        else {
            return false;
        }
    }

//    use a simple algorithm that loops through all the possible
//    divisors of the number from 2 to the number divided by 2 and checks
//    if any of them divides the number evenly. If none of them does,
//    then the number is prime.
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= (value / 2); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int v){
        if (v%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isOdd(int v){
        if (v%2!=0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isPrime(int v){
        if (v <= 1) {
            return false;
        }
        for (int i = 2; i <= (v / 2); i++) {
            if (v % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger v){
        return v.isEven();
    }

    public static boolean isOdd(MyInteger v){
        return v.isOdd();
    }

    public static boolean isPrime(MyInteger v){

        return v.isPrime();
    }

    public boolean equals(int v){
       Integer x= (Integer) v;
        return this.equals(x);
    }

    public boolean equals(MyInteger v){
        return this.equals(v);
    }

    public static int parseInt(char[] c){
        int v=0;
        int digit = 10;
        // multiply by multiples of ten to get the right value
        //from left to right
        for(int i=0;i<c.length;i++){
            v+= c[i]*Math.pow(digit,c.length-i);
        }
        return v;
    }

    public static int parseInt(String str){
        int v=0;
        int digit = 10;
        // multiply by multiples of ten to get the right value
        for(int i=0;i<str.length();i++){
            v+= str.charAt(i)*Math.pow(digit,str.length()-i);
        }
        return v;
    }

}
