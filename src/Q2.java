public class Q2 {
    public static void main(String[] args) {
        for (int i = 0; i<6; i++){
            System.out.print("#");//Prints #
            for (int k = 6-i; k<6; k++){
                System.out.print(" ");//Prints x amount of spaces depending on i.
            }
            System.out.print("#");//Prints #
            System.out.println();//Prints a new line
        }
    }
}
