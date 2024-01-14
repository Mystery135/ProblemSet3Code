public class Q4 {
    public static void main(String[] args) {
        System.out.println(getGCF(5, 100));

    }

    static int getGCF(int x, int y)
    {
        if (y == 0){
            return x;
        }
        return getGCF(y, x%y);
    }
}



