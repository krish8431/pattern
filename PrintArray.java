public class PrintArray {
    public static void main(String[] args) {
        String[] monthsOfTheYear = {"January", "February", "March", 
                                   "April", "May", "June", 
                                   "July", "August", "September", 
                                   "October", "November", "December" };

        System.out.println("Months of the year are as follows:");

        for (String month : monthsOfTheYear) {
            System.out.println(month);
        }
    }
}