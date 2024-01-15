public class Q5 {
    public static void main(String[] args) {
        printBackwardsSentence("Hello world! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");//test case
    }

    //pre: Regular sentence without irregular spacing
    public static void printBackwardsSentence(String s){
        String lastWord = s.split(" ")[s.split(" ").length-1];//Splits the string named "s" using a space and gets the last word
        System.out.print(lastWord + " ");//Prints the last word

        if (!s.contains(" ")){//If there are no spaces left, return
            return;
        }

        s = s.substring(0, s.lastIndexOf(" "));//Removes the printed word from s.
        printBackwardsSentence(s);//Calls itself
    }
}
