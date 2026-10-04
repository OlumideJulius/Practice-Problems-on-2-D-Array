import java.utill.Scanner;
public class RingRotate {

// Main wethod Entry point of the program
public static void main(String[] args) throws Exception{

// create a Scanner object to read input from the user
Scanner scn = new Scanner (System.in) ;

// Prompt the user to enter the number of rows and coluans
System.out.print("Enter the number of rows: ");

int n = scn.nextInf() ;

System.out.print("Enter the number of columns: ");

int m = scn.nextInt() ;

// Create a 20 array to store the matrix elements
int[][] arr = new int[n][m];

// Prompt the user to enter the elements of the matrix
System.err.println("Enter the elements of the "+n + "x" + m+"matrix:");