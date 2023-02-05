package Java_Basics.String;

public class PizzaIngredients {
    public static boolean doughIsEnough(String[] ingredients) {
        String dough = "dough";
        int sum = 0;
        for (String i : ingredients) {
            if (dough.equals(i)) {
                sum++;
            }
        }
        if (sum >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
