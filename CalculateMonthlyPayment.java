import java.util.Scanner;

public class CalculateMonthlyPayment{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double carPrice;
        double downPayment;
        int loanPeriod;
        int interestRate;
        double interest;
        double totalPayAmount;
        double principal;
        double monthlyPay;

        do{
            System.out.println("Please key in Car Price:");
            carPrice = keyboard.nextDouble();

        }while(carPrice <30000 );

        do{
            System.out.println("Please key in Down Payment:");
            downPayment = keyboard.nextDouble();

        }while(downPayment <1);

        do{
            System.out.println("Please key in Loan Period:");
            loanPeriod = keyboard.nextInt();

        }while(loanPeriod <5|| loanPeriod >9);

        do{
            System.out.println("Please key in Interest Rate:");
            interestRate = keyboard.nextInt();

        }while(interestRate <3|| interestRate >7);

        interest = (carPrice-downPayment) / 100 * interestRate;
        totalPayAmount = interest * 7 + (carPrice-downPayment);
        principal = totalPayAmount / loanPeriod;
        monthlyPay = principal / 12;

        System.out.println("Interest:" + interest);
        System.out.println("TotalPayAmount:" + totalPayAmount);
        System.out.println("Principal:" + principal);
        System.out.println("MonthlyPay:" + monthlyPay);
    }
}
