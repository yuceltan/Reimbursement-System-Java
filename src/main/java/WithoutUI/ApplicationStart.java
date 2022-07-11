package WithoutUI;
import java.util.*;

public class ApplicationStart {

    public static void main(String[] args) {


        System.out.println("PlEASE ENTER YOUR USER TYPE (Enter The Number)");
        System.out.println("1-User");
        System.out.println("2-Admin");

        Scanner types = new Scanner(System.in);
        int type = types.nextInt();

        if(type == 1) {

            System.out.println("Welcome End User Interface");


            Receipts example1 = new Receipts();

            System.out.println("IF YOU HAVE PERSONAL CAR PLEASE ENTER 0, IF YOU DO NOT HAVE ENTER 1");
            Scanner userIn = new Scanner(System.in);
            int u = userIn.nextInt();

            if(u == 1){
                example1.showReceiptTypes();
                System.out.println("You do not have Personal Car... Processing...");
                System.out.println("Please Enter Number Of Days ");
                Scanner in2 = new Scanner(System.in);
                int result1 = in2.nextInt();
                example1.enterDays(result1);
            }

            else if (u==0) {

                System.out.println("You have Personal Car... Processing...");
                System.out.println("Please Enter Number Of Days ");
                Scanner in3 = new Scanner(System.in);
                int result2 = in3.nextInt();
                example1.enterDaysCar(result2);

            }

            else{

                System.out.println("System is closing");
            }


        }

        else if(type == 2){

            System.out.println("Welcome Admin Interface ");
            System.out.println("For change the rates please enter 1");
            System.out.println("For change the receipts please enter 2");
            System.out.println("For define a limit please enter 3");
            Scanner adminInput = new Scanner(System.in);
            int adminUser = adminInput.nextInt();
            if(adminUser==1){
                System.out.println("Which Rate Do You Want To Change ? ('1-Personal Car' or'2-Receipts')");
                System.out.println("Enter the number of rate");

                Scanner choose = new Scanner(System.in);
                 int rateType1 = choose.nextInt();
                 if(rateType1==1){

                     System.out.println("Please Enter The New Rate For Personal Cars");
                     Scanner rateScan1 = new Scanner(System.in);
                     int newrate1= rateScan1.nextInt();

                     Receipts in1 = new Receipts();
                     in1.setRate1(newrate1);
                     System.out.println("New Car Rate is"+newrate1);


                 } else if (rateType1 == 2) {

                     System.out.println("Please Enter The New Rate For Receipts");
                     Scanner rateScan2 = new Scanner(System.in);
                     int newrate2= rateScan2.nextInt();

                     Receipts in2 = new Receipts();
                     in2.setRate(newrate2);
                     System.out.println("New Receipt Rate is"+newrate2);

                 }
                 else {

                     System.out.println("YOU DID NOT ENTER RATE!");
                 }


            }
            else if (adminUser==2) {
                System.out.println("Which Receipt Type Do You Want To Change (Enter the number of receipt)?");
                Receipts in4 = new Receipts();
                in4.showIt();
                Scanner receiptInput1 = new Scanner(System.in);
                int adminInput2 = receiptInput1.nextInt();

                if(adminInput2==1){
                    System.out.println("Please Enter The New Receipt");
                    Scanner receiptInput11 = new Scanner(System.in);
                    String newReceipt1Input= receiptInput11.nextLine();
                    Receipts in6 = new Receipts();
                    in6.setReceipt1(newReceipt1Input);
                    System.out.println("New Receipt is"+newReceipt1Input);
                }
                else if (adminInput2==2) {
                    System.out.println("Please Enter The New Receipt");
                    Scanner receiptInput12 = new Scanner(System.in);
                    String newReceipt2Input= receiptInput12.nextLine();
                    Receipts in7 = new Receipts();
                    in7.setReceipt1(newReceipt2Input);
                    System.out.println("New Receipt is"+newReceipt2Input);

                }
                else if (adminInput2==3) {
                    System.out.println("Please Enter The New Receipt");
                    Scanner receiptInput13 = new Scanner(System.in);
                    String newReceipt3Input= receiptInput13.nextLine();
                    Receipts in8 = new Receipts();
                    in8.setReceipt1(newReceipt3Input);
                    System.out.println("New Receipt is"+newReceipt3Input);

                }
                else if (adminInput2==4) {
                    System.out.println("Please Enter The New Receipt");
                    Scanner receiptInput14 = new Scanner(System.in);
                    String newReceipt4Input= receiptInput14.nextLine();
                    Receipts in9 = new Receipts();
                    in9.setReceipt1(newReceipt4Input);
                    System.out.println("New Receipt is"+newReceipt4Input);

                }
                else {System.out.println("You did not enter the receipt type");}
            }
            else if (adminUser==3) // define limit{
                System.out.println("Define a limit");
                Receipts in5 = new Receipts();
            }
            else {System.out.println("System is closing.....");
            }

        }



    }

