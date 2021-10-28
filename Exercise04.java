package vn.edu.hcmus.student.sv19127640.lab02.Exercise04;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise04
 * Created by ADMIN
 * Date 10/24/2021 - 6:26 PM
 * Description: main function
 */
public class Exercise04 {
    /**
     * main function
     * @param argv console parameters
     */
    public static void main(String[] argv){
        Integer chosse = null;
        do{
            System.out.println("===================================================================");
            System.out.println("0. Exit");
            System.out.println("1. Using constructor methods");
            System.out.println("2. Using get/set methods");
            System.out.println("3. Using input/output methods");
            System.out.println("4. Fraction a + Fraction b");
            System.out.println("5. Fraction a - Fraction b");
            System.out.println("6. Fraction a * Fraction b");
            System.out.println("7. Fraction a / Fraction b");
            System.out.println("8. Reduce a Fraction method");
            System.out.println("9. Using static method parsePhanSo");
            System.out.println("10. Using static methods");
            System.out.println("11. Using overload methods");
            System.out.println("===================================================================");
            System.out.print("Input your choose: ");
            Scanner scan = new Scanner(System.in);
            chosse = scan.nextInt();
            switch (chosse){
                case 0: return;
                case 1: {
                    // use constructor methods
                    PhanSo obj_1 = new PhanSo();
                    System.out.println("Using constructor with parameter: ");
                    PhanSo obj_2 = new PhanSo(12, 3);
                    obj_2.output();
                    System.out.println("Using copy constructor: ");
                    PhanSo obj_3 = new PhanSo(obj_2);
                    obj_3.output();
                    break;
                }
                case 2: {
                    // use getter and setter
                    PhanSo obj_3 = PhanSo.random(-100, 100);
                    System.out.print("Fraction: ");
                    obj_3.output();
                    System.out.println("Using getter numerator: " + obj_3.getNumerator());
                    System.out.println("Using getter denominator: " + obj_3.getDenominator());
                    System.out.println("Using setter methods: ");
                    PhanSo obj_4 = new PhanSo();
                    int numerator, denominator;
                    System.out.print("Input numerator: ");
                    numerator = scan.nextInt();
                    System.out.print("Input denominator: ");
                    denominator = scan.nextInt();
                    obj_4.setNumerator(numerator);
                    obj_4.setDenominator(denominator);
                    System.out.print("Fraction after using setter method: ");
                    obj_4.output();
                    break;
                }
                case 3:{
                    // use input and output method
                    PhanSo obj_1 = new PhanSo();
                    System.out.println("Using input and output method: ");
                    obj_1.input();
                    System.out.print("Fraction = ");
                    obj_1.output();
                    break;
                }
                case 4:{
                    PhanSo obj_1 = PhanSo.random(-100, 100);
                    PhanSo obj_2 = PhanSo.random(-100, 100);
                    String str = String.format("2 Fraction is: %d/%d and %d/%d", obj_1.getNumerator(), obj_1.getDenominator(), obj_2.getNumerator(), obj_2.getDenominator());
                    System.out.println(str);
                    System.out.println("Before reduce: ");
                    PhanSo result = obj_1.plus(obj_2);
                    System.out.print("Plus: ");
                    result.output();
                    System.out.println("After reduce: ");
                    result.reduce();
                    System.out.print("Plus: ");
                    result.output();
                    break;
                }
                case 5:{
                    PhanSo obj_1 = PhanSo.random(-100, 100);
                    PhanSo obj_2 = PhanSo.random(-100, 100);
                    String str = String.format("2 Fraction is: %d/%d and %d/%d", obj_1.getNumerator(), obj_1.getDenominator(), obj_2.getNumerator(), obj_2.getDenominator());
                    System.out.println(str);
                    System.out.println("Before reduce: ");
                    PhanSo result = obj_1.minus(obj_2);
                    System.out.print("Minus: ");
                    result.output();
                    System.out.println("After reduce: ");
                    result.reduce();
                    System.out.print("Minus: ");
                    result.output();
                    break;
                }
                case 6: {
                    PhanSo obj_1 = PhanSo.random(-100, 100);
                    PhanSo obj_2 = PhanSo.random(-100, 100);
                    String str = String.format("2 Fraction is: %d/%d and %d/%d", obj_1.getNumerator(), obj_1.getDenominator(), obj_2.getNumerator(), obj_2.getDenominator());
                    System.out.println(str);
                    System.out.println("Before reduce: ");
                    PhanSo result = obj_1.multiply(obj_2);
                    System.out.print("Multiply: ");
                    result.output();
                    System.out.println("After reduce: ");
                    result.reduce();
                    System.out.print("Multiply: ");
                    result.output();
                    break;
                }
                case 7: {
                    PhanSo obj_1 = PhanSo.random(-100, 100);
                    PhanSo obj_2 = PhanSo.random(-100, 100);
                    String str = String.format("2 Fraction is: %d/%d and %d/%d", obj_1.getNumerator(), obj_1.getDenominator(), obj_2.getNumerator(), obj_2.getDenominator());
                    System.out.println(str);
                    System.out.println("Before reduce: ");
                    PhanSo result = obj_1.devide(obj_2);
                    System.out.print("Devide: ");
                    result.output();
                    System.out.println("After reduce: ");
                    result.reduce();
                    System.out.print("Devide: ");
                    result.output();
                    break;
                }
                case 8: {
                    PhanSo obj_1 = PhanSo.random(-100, 100);
                    System.out.print("Fraction before reduce = ");
                    obj_1.output();
                    System.out.print("Fraction after reduce = ");
                    obj_1.reduce();
                    obj_1.output();
                    break;
                }
                case 9:{
                    // use static methods
                    System.out.println("Using static method parsePhanSo: ");
                    PhanSo f_1 = PhanSo.parsePhanSo("4&-5");
                    System.out.print("Fraction = ");
                    f_1.output();
                    break;
                }
                case 10:{
                    System.out.println("Using static input method: ");
                    PhanSo f_1 = PhanSo.input(24,5);
                    System.out.print("Fraction = ");
                    f_1.output();
                    PhanSo f_2 = PhanSo.copy(f_1);
                    System.out.print("Fraction after copy = ");
                    f_2.output();
                    System.out.println("Using static method to create a Random Fraction:");
                    PhanSo f_3 = PhanSo.random(-100, 100);
                    System.out.print("Fraction = ");
                    f_3.output();
                    break;
                }
                case 11:{
                    // use overload methods
                    PhanSo result = new PhanSo();
                    System.out.println("Using overload methods: ");
                    System.out.print("Input an integer number: ");
                    int number = scan.nextInt();
                    PhanSo obj_1 = PhanSo.random(-100, 100);
                    String str_2 = String.format("Fraction is %d/%d and number is %d", obj_1.getNumerator(), obj_1.getDenominator(), number);
                    System.out.println(str_2);
                    result = obj_1.plus(number);
                    System.out.print("Plus: ");
                    result.output();
                    result = obj_1.minus(number);
                    System.out.print("Minus: ");
                    result.output();
                    result = obj_1.multiply(number);
                    System.out.print("Multiply: ");
                    result.output();
                    result = obj_1.devide(number);
                    System.out.print("Devide: ");
                    result.output();
                    // check if 2 Fraction is equal
                    System.out.println("Using check if 2 Fraction is equal:");
                    PhanSo f_3 = PhanSo.random(-100,100);
                    PhanSo f_4 = PhanSo.random(-100,100);
                    boolean isEqual = f_3.isEqual(f_4);
                    String str = String.format("2 Fraction %d/%d and %d/%d", f_3.getNumerator(), f_3.getDenominator(), f_4.getNumerator(), f_4.getDenominator());
                    System.out.print(str);
                    if(isEqual)
                        System.out.println(" is equal");
                    else
                        System.out.println(" isn't equal");
                    System.out.println("Using check if Fraction a is greater than Fraction b:");
                    boolean isGreater = f_3.isGreater(f_4);
                    str = String.format("Fraction %d/%d", f_3.getNumerator(), f_3.getDenominator());
                    System.out.print(str);
                    if(isGreater)
                        System.out.print(" is greater than ( > )");
                    else
                        System.out.print(" isn't greater than ( <= )");
                    str = String.format(" Fraction %d/%d", f_4.getNumerator(), f_4.getDenominator());
                    System.out.println(str);
                    break;
                }
                default: return;
            }
            System.out.print("Press enter to continue...");
            try{System.in.read();}
            catch(Exception e){}
        }while(0 < chosse && chosse <= 11);
    }
}
