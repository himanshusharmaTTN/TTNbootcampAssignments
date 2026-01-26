// Q6 - 6
// Implement a banking system using java. Create 3 sub class of Bank : SBI, BOI, ICICI
// Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate. All 3 should have following methods:
//  1. add getters and setters for the fields
//  2. print details of every bank (override toString)

class Bank {

    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank(String name, String headOfficeAddress, String chairmanName,
                int branchCount, double fdInterestRate,
                double personalLoanInterestRate, double homeLoanInterestRate) {

        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHeadOfficeAddress() { return headOfficeAddress; }
    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }

    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }

    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }

    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    
    @Override
    public String toString() {
        return "Bank Name: " + name +
                "\nHead Office: " + headOfficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%";
    }
}

class SBI extends Bank {
    public SBI(String name, String headOfficeAddress, String chairmanName,
               int branchCount, double fdInterestRate,
               double personalLoanInterestRate, double homeLoanInterestRate) {

        super(name, headOfficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

class BOI extends Bank {
    public BOI(String name, String headOfficeAddress, String chairmanName,
               int branchCount, double fdInterestRate,
               double personalLoanInterestRate, double homeLoanInterestRate) {

        super(name, headOfficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

class ICICI extends Bank {
    public ICICI(String name, String headOfficeAddress, String chairmanName,
                 int branchCount, double fdInterestRate,
                 double personalLoanInterestRate, double homeLoanInterestRate) {

        super(name, headOfficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

public class Q6 {
    public static void main(String[] args) {

        Bank sbi = new SBI("SBI", "Mumbai", "Himanshu Sharma", 22000, 6.5, 10.5, 8.4);
        Bank boi = new BOI("BOI", "Mumbai", "Badal Jaakhar", 5000, 6.3, 11.0, 8.6);
        Bank icici = new ICICI("ICICI", "Mumbai", "Kartik Yadav", 6000, 6.8, 12.0, 9.0);

        System.out.println("----- SBI DETAILS -----");
        System.out.println(sbi);

        System.out.println("\n----- BOI DETAILS -----");
        System.out.println(boi);

        System.out.println("\n----- ICICI DETAILS -----");
        System.out.println(icici);
    }
}
