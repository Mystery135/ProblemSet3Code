public class Q4 {
    public static void main(String[] args) {
        System.out.println(getGCF(23, 100));

    }

    static int getGCF(int x, int y)
    {        System.out.println(x + " , " + y);

        if (y == 0){//If y is 0, return x. Using this method, y will eventually reach 0.
            return x;
        }
        return getGCF(y, x%y);//calls itself with y and the remainder of x%y. This works because the GCF of x & y is the same as the GCF of y and x%y.
    }
}



