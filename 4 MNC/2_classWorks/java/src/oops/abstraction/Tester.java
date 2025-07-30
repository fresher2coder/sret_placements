package oops.abstraction;

public class Tester {
 public static void main(String[] args) {

     // You cannot create an object of abstract class
     // RBI bank = new RBI(); ❌ NOT ALLOWED

     // 🔹 Using SBI - subclass of RBI
     RBI sbi = new SBI();  // Reference of RBI, object of SBI
     System.out.println("🏦 SBI BANK SERVICES");
     sbi.openGovtAccount();         // Inherited from RBI
     sbi.savingInterestRate();      // Implemented in SBI
     // sbi.openCurrentAccount();   // ❌ Not accessible via RBI reference

     System.out.println("\n🏦 IOB BANK SERVICES");
     RBI iob = new IOB();
     iob.openGovtAccount();         // Inherited from RBI
     iob.savingInterestRate();      // Implemented in IOB

     // 🔸 If you want to call IOB/SBI specific methods:
     System.out.println("\n📌 Calling IOB specific method:");
     ((IOB)iob).openCurrentAccount();  // Typecasting to access subclass methods

     System.out.println("\n📌 Calling SBI specific method:");
     ((SBI)sbi).openCurrentAccount();  // Typecasting to access subclass methods
 }
}

