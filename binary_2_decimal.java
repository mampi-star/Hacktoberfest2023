//java program to convert the binary no in decimal
public class Cnvrt {
   String Cnvrt(int dec) { 
      // Constructor
      String b1 = Integer.toBinaryString(dec);
      return b1; 
      // returing the string stored in b1
   }

   public static void main(String args[]) {
      Cnvrt obj = new Cnvrt();  
      // creating object ‘obj’
      // calling the constructor using object with arguments
      System.out.println("Binary value of given decimal number: " + obj.Cnvrt(50)); 
      System.out.println("Binary value of given decimal number: " + obj.Cnvrt(25));
      System.out.println("Binary value of given decimal number: " + obj.Cnvrt(10));
   }
}
