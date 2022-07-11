
package  WithoutUI;
import java.util.*;
public class Receipts {
    private String receipt1 = "Taxi";
    private String receipt2 = "Hotel";
    private String receipt3 = "Air Ticket";
    private String receipt4 = "Train";
    public String receipt5 = "Personal Car";

    private int day;
    private static double rate1 = 0.3;//0.3 default
    private static  int rate = 15;//15 default

    private static int limit = 2; // add limit for receipts (ONLY USERS)

    private static double totalReim = 1000; // 1000$ TOTAL Reimbursement
    public Receipts(){
    //constructor
    }
    String [] receiptsArray = {receipt1,receipt2,receipt3,receipt4, receipt5};


    public void totalReceipts(){
        System.out.println("How many reimbursement do you want to add?");
        Scanner in = new Scanner(System.in);
        int limitInput = in.nextInt();

    }
    public void showIt(){

        System.out.println("1-"+receipt1);
        System.out.println("2-"+receipt2);
        System.out.println("3-"+receipt3);
        System.out.println("4-"+receipt4);

    }
    public void showReceiptTypes(){

        System.out.println("Please Choose Your receipt type and ENTER THE NAME OF RECEIPT");

        for(int i = 0; i <receiptsArray.length;i++){

            System.out.println(i+"-"+receiptsArray[i]);
        }
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        switch (userInput){
            case "Taxi":
                System.out.println("RECEIPT TYPE IS : TAXI");
                break;

            case "Hotel":
                System.out.println("RECEIPT TYPE IS : HOTEL");
                break;

            case "Air Ticket":
                System.out.println("RECEIPT TYPE IS : AIR TICKET");
                break;
            case "Train":
                System.out.println("RECEIPT TYPE IS : TRAIN");
                break;
            case "Personal Car":
                System.out.println("RECEIPT TYPE IS : PERSONAL CAR");
                break;
        }
    }

    // getter and setter

    public String getReceipt1() {
        System.out.println("You are looking receipt1");
        return receipt1;
    }

    public void setReceipt1(String receipt1) {

        System.out.println("Receipt type  is changed by admin");


        this.receipt1 = receipt1;
    }

    public String getReceipt2() {
        return receipt2;
    }

    public void setReceipt2(String receipt2) {

        System.out.println("Receipt type  is changed by admin");

        this.receipt2 = receipt2;
    }

    public double getRate1() {
        return rate1;
    }

    public void setRate1(double rate1) {

        System.out.println("Rate is changed by admin");
        this.rate1 = rate1;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        System.out.println("Rate is changed by admin");
        this.rate = rate;
    }

    public String getReceipt3() {
        return receipt3;
    }

    public void setReceipt3(String receipt3) {
        System.out.println("Receipt type  is changed by admin");
        this.receipt3 = receipt3;
    }

    public String getReceipt4() {
        return receipt4;
    }

    public void setReceipt4(String receipt4) {
        System.out.println("Receipt type  is changed by admin");
        this.receipt4 = receipt4;
    }

    public static int enterDaysCar(int c){

        double summary1 = rate1*c;
        System.out.println(rate1+"$/ per day");
        System.out.println("total amount is :"+summary1);
        return (int) summary1;

    }
    public static int enterDays(int d){

        int summary = rate*d;
        System.out.println(rate+"$/ per day");
        System.out.println("Total amount is :"+summary);
        return summary;
    }
    public static int getLimit() {
        return limit;
    }

    public static void setLimit(int limit) {
        Receipts.limit = limit;
    }
    public static double getTotalReim(){

        return totalReim;
    }

    public static void setTotalReim(double totalReim){
            Receipts.totalReim=totalReim;

    }

    public void adminStart(){

        System.out.println("You are admin now!");
    }

}
