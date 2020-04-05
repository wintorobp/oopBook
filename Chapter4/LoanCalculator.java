
public class LoanCalculator {
    // data member
    private Loan loan;

    // main method
    public static void main(String[] args) {
        LoanCalculator calculator = new LoanCalculator();
        calculator.start();
    }


    public LoanCalculator(){
        loan = new Loan();
    }

    // top level method that call the private method
    public void start(){
        describeProgram();
        getInput();
        computePayment();
        displayOutput();
    }
    
    // computes monthly and total payment
    private void computePayment(){
        System.out.println("inside compute payment");
    }

    // provide a brief explanation of the program to user
    private void describeProgram(){
        System.out.println("inside describeProgram");
    }
    //display input values and monthly and total payments
    private void displayOutput(){
        System.out.println("inside displayOutput");
    }

    // get three input values, loanAmpunt, interestRate, loanPeriod
    // using an input box objek
    private void getInput(){
        System.out.println("inside getInput"); 
    }
}

