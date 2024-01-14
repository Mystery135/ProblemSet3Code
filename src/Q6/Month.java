package Q6;

public class Month {
    private int monthNumber;


    public Month(){
        monthNumber = 1;
    }
    public Month(int monthNumber){
        setMonthNumber(monthNumber);
    }
    public Month(String month){
         month = month.toLowerCase();
         switch (month){
             case "february" -> monthNumber = 2;
             case "march" -> monthNumber = 3;
             case "april" -> monthNumber = 4;
             case "may" -> monthNumber = 5;
             case "june" -> monthNumber = 6;
             case "july" -> monthNumber = 7;
             case "august" -> monthNumber = 8;
             case "september" -> monthNumber = 9;
             case "october" -> monthNumber = 10;
             case "november" -> monthNumber = 11;
             case "december" -> monthNumber = 12;
             default -> monthNumber = 1;
         }
    }
    public void setMonthNumber(int monthNumber){
        this.monthNumber = monthNumber > 12 || monthNumber < 1 ? 1 : monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
    public String getMonthName(){
        String monthName;
        switch (monthNumber){
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return null;
            }

        }
    }
    @Override
    public String toString(){
        return getMonthName();
    }

    public boolean equals(Month month){
        return month.monthNumber == monthNumber;
    }
    public boolean greaterThan(Month month){
        return monthNumber > month.monthNumber;
    }
    public boolean lessThan(Month month){
        return monthNumber < month.monthNumber;
    }
}
