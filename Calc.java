/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Calc {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        double first, second, answer = 0;
        String operate;

        System.out.println("Enter First Number");
        first =  sc.nextDouble();
        System.out.println("Enter Second Number");
        second = sc.nextDouble();
        System.out.println("Enter Operate Code");
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
        System.out.println("The answer to your operation is "+answer);

    }

}
