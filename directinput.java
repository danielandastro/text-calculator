
package directinput;

import java.util.Scanner;


public class directinput {
      public static void main(String[] args) {       
    Scanner sc=new Scanner(System.in);  
        
     
     double first, second, answer = 0;
     String operate;
     
    
     first =  sc.nextDouble();

     second = sc.nextDouble();

     operate = sc.next(); 
     

     if (null != operate)switch (operate) {
            case "add":
                answer = first + second;
                break;
            case "sub":
                answer = first - second;
                break;
            case "mul":
                answer = first * second;
                break;
            case "div":
                answer = first / second;
                break;
            case "square":
                answer = first * first;
            
                break;
                case "cube":
                answer = first * first * first;
                break;
            
            default:
                break;
        }
     System.out.println(answer);
}
}