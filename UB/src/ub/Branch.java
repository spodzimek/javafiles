
package ub;

public class Branch {
  int branchCode;
    String branchAddress;
    String branchCountry;
    
    

public void getBranch(){
        branchCode = 1234;
        branchAddress = "1234 S. Denver";
        branchCountry = "USA";
    }

public int getBranchCode() {
        return branchCode;
    }

    
    public void displayBranch(){
        System.out.print("Branch Code" + branchCode);
        System.out.print("Branch Address" + branchAddress);
        System.out.print("Branch Country" + branchCountry);
    }
    }