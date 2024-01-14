public class Q5 {
    public static void main(String[] args) {
        printBackwardsSentence("Hello world! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
    }

    public static void printBackwardsSentence(String s){
        String toPrint = s.split(" ")[s.split(" ").length-1];
        System.out.print(toPrint + " ");

        if (s.lastIndexOf(" ") == -1){
            return;
        }

        s = s.substring(0, s.lastIndexOf(" "));
        printBackwardsSentence(s);
    }
}
