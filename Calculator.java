
import java.util.Scanner;


class Calculator {
    public static void main(String args[]){
        addition addobj = new addition();
        subtraction subobj = new subtraction();
        String operator;
        int num1, num2;

    
    Scanner input = new Scanner(System.in);

    
    System.out.println("Choose your operations");
    System.out.println("Add for Addition");
    System.out.println("Subtract for Subtraction");
    operator = input.next();

    
    System.out.println("Enter first number");
    num1 = input.nextInt();

    System.out.println("Enter second number");
    num2 = input.nextInt();

    switch (operator) {
      case "Add":
        int result = addobj.addNumbers(num1, num2);
        System.out.println("Addition of two number is:"+result);
        break;

      case "Subtract":
        int result1 = subobj.subtractNumbers(num1, num2);
        System.out.println("Subtraction of two number is:"+result1);
        break;
      default:
        System.out.println("Please choose suggested operations only!!");
        break;
    }

    input.close();
  }
    
    
}
