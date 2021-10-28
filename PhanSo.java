package vn.edu.hcmus.student.sv19127640.lab02.Exercise04;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise04
 * Created by ADMIN
 * Date 10/24/2021 - 6:26 PM
 * Description: PhanSo
 */
public class PhanSo {
    // attribute
    private int numerator;
    private int denominator;
    // constructor

    /**
     * default constructor
     */
    public PhanSo(){
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * constructor with parameters
     * @param numerator integer
     * @param denominator integer
     */
    public PhanSo(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * copy constructor
     * @param object PhanSo
     */
    public PhanSo(PhanSo object){
        this.numerator = object.numerator;
        this.denominator = object.denominator;
    }

    /**
     * getter numerator
     * @return numerator integer
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * setter numerator
     * @param numerator integer
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * getter denominator
     * @return denominator integer
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * setter denominator
     * @param denominator integer
     */
    public void setDenominator(int denominator) {
        if(denominator != 0)
            this.denominator = denominator;
    }

    /**
     * input fraction
     */
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input numerator: ");
        this.numerator = scan.nextInt();
        do{
            System.out.print("Input denominator: ");
            this.denominator = scan.nextInt();
            if (this.denominator == 0)
                System.out.println("Denominator is invalid. Please, enter again!");
        }while (this.denominator == 0);
    }

    /**
     * output fraction
     */
    public void output(){
        String str = String.format("%d/%d", this.numerator, this.denominator);
        System.out.println(str);
    }

    /**
     * sum of 2 Fraction
     * @param f PhanSo
     * @return result PhanSo
     */
    public PhanSo plus(PhanSo f){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    /**
     * Fraction a - Fraction b
     * @param f PhanSo
     * @return result PhanSo
     */
    public PhanSo minus(PhanSo f){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    /**
     * Fraction a * Fraction b
     * @param f PhanSo
     * @return result PhanSo
     */
    public PhanSo multiply(PhanSo f){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    /**
     * Fraction a / Fraction b
     * @param f PhanSo
     * @return result PhanSo
     */
    public PhanSo devide(PhanSo f){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator * f.denominator;
        result.denominator = this.denominator * f.numerator;
        return result;
    }

    /**
     * static method find the greatest common divisor
     * @param a integer
     * @param b integer
     * @return value integer
     */
    public static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    /**
     * static method find the least common multiple
     * @param a integer
     * @param b integer
     * @return value integer
     */
    public static int lcd(int a, int b){
        return (a * b) / gcd(a, b);
    }
    /**
     * reduce Fraction
     */
    public void reduce(){
        int value = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / value;
        this.denominator = this.denominator / value;
    }

    /**
     * parse Fraction from string with any delimeters
     * @param s String
     * @return f PhanSo
     */
    public static PhanSo parsePhanSo(String s){
        String[] arrStr = s.split("[^0-9-]");
        PhanSo f = new PhanSo();
        f.numerator = Integer.parseInt(arrStr[0]);
        f.denominator = Integer.parseInt(arrStr[1]);
        return f;
    }
    /**
     * overload method sum of Fraction and an integer value
     * @param value integer
     * @return result PhanSo
     */
    public PhanSo plus(int value){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator + this.denominator * value;
        result.denominator = this.denominator;
        result.reduce(); // reduce Fraction
        return result;
    }
    /**
     * overload method PhanSo a - integer value
     * @param value integer
     * @return result PhanSo
     */
    public PhanSo minus(int value){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator - this.denominator * value;
        result.denominator = this.denominator;
        result.reduce(); // reduce Fraction
        return result;
    }
    /**
     * overload method Fraction a * Fraction b
     * @param value integer
     * @return result PhanSo
     */
    public PhanSo multiply(int value){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator * value;
        result.denominator = this.denominator;
        result.reduce(); // reduce Fraction
        return result;
    }
    /**
     * overload method Fraction a / Fraction b
     * @param value integer
     * @return result PhanSo
     */
    public PhanSo devide(int value){
        PhanSo result = new PhanSo();
        result.numerator = this.numerator;
        result.denominator = this.denominator * value;
        result.reduce(); // reduce Fraction
        return result;
    }

    /**
     * static input method
     * @param a integer
     * @param b integer
     * @return result PhanSo
     */
    public static PhanSo input(int a, int b){
        PhanSo result = new PhanSo();
        result.numerator = a;
        result.denominator = b;
        return result;
    }

    /**
     * static method to copy old Fraction to new Fracion
     * @param object PhanSo
     * @return result PhanSo
     */
    public static PhanSo copy(PhanSo object){
        PhanSo result = new PhanSo();
        result.numerator = object.numerator;
        result.denominator = object.denominator;
        return result;
    }

    /**
     * static method to create a random Fraction
     * @param minValue integer
     * @param maxValue integer
     * @return result PhanSo
     */
    public static PhanSo random(int minValue, int maxValue){
        PhanSo result = new PhanSo();
        result.numerator = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        result.denominator = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        return result;
    }
    /**
     * check if 2 Fraction is equal
     * @param object PhanSo
     * @return true or false
     */
    public boolean isEqual(PhanSo object){
        PhanSo temp_1 = new PhanSo(this);
        PhanSo temp_2 = new PhanSo(object);
        temp_1.reduce();
        temp_2.reduce();
        if (temp_1.numerator == temp_2.numerator && temp_1.denominator == temp_2.denominator)
            return true;
        return false;
    }

    /**
     * check if Fraction a is greater than Fraction b or not
     * @param object PhanSo
     * @return true or false
     */
    public boolean isGreater(PhanSo object){
        double value_1 = (double)this.getNumerator()/this.getDenominator();
        double value_2 = (double)object.getNumerator()/object.getDenominator();
        if (value_1 > value_2)
            return true;
        return false;
    }



}
