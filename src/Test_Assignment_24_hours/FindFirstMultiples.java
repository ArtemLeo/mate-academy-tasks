package Test_Assignment_24_hours;

public  class FindFirstMultiples {
    public static int[] findMultiples(int x, int n) {
        int[] arr = new int[x];
        if(x != 0 && n != 0){
            int p = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % n == 0){
                    p++;
                    arr[i] = n * p;
                }
            }
        }
        return arr;
    }
}
