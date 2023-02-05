package Java_Basics.Loops;

public class GetDrinks {
    public static int getDrinks(int numberOfGuests) {
        int sum = 0;
        for (int i = 1; i <= numberOfGuests; i++) {
            sum += i;
        }
        return sum;
    }
}
