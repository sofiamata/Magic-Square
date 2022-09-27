/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magicsquare;

/**
 *
 * @author sofimata
 */

import java.util.Scanner;

public class Square {

    private int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    /**
     * this constructor lets us set the parameters we want for the square created
     * @param size is the size of the square
     */
    public Square(int size) {
        square = new int[size][size];

    }
    
    //--------------------------------------
    //create new square using given 2D array
    //--------------------------------------
    
    /**
     * this constructor lets us set the parameters we want for the square created
     * @param matrix is the 2D array for the square
     */
    public Square(int[][] matrix) {
        square = matrix;

    }

    //--------------------------------------
    //return the square 2D array
    //--------------------------------------
    // A public method for retrieving the square
   /**
    * when the square is created using the constructor we can retrieve the square from its parameter using this getter method
    * @return the square 
    */
    public int[][] getSquare() {
        return square;
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    // A public method for retrieving the sum of the row
    /**
    *this method returns the sum of the square by adding all the numbers within the row
    * @param row is the row the square
    * @return the sum 
    */
    public int sumRow(int row) {
        int total = 0;
        int point = row;
        int [][] arr = getSquare();
        //Add code here!
        for (int c = 0 ; c < arr[0].length ; c++) {
                total += arr[point][c];
        }
        return total;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    // A public method for retrieving the sum of the column
    /**
    *this method returns the sum of the square by adding all the numbers within the column
    *  @param col is the column the square
    * @return the sum 
    */
    public int sumColumn(int col) {
        int total = 0;
        int point = col;
        int [][] arr = getSquare();
        //Add code here!
        for (int c = 0 ; c < arr[0].length ; c++) {
                total += arr[c][point];
        }
        return total;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    // A public method for retrieving the sum of the numbers going dialognal in the square
    /**
    * this method returns the sum of the square by adding all the numbers numbers going diagonal from left to right
    * @return the total  
    */
    public int sumMainDiag() {
        int total = 0;
        //Add code here!
        int [][] arr = getSquare();
        for (int a = 0 ; a < arr[0].length ; a++ ) {
            total += arr[a][a];
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    // A public method for retrieving the sum of the numbers going dialognal in the square
    /**
    * this method returns the sum of the square by adding all the numbers numbers going diagonal from right to left
    * @return the total  
    */
    public int sumOtherDiag() {
        int total = 0;
        int [][] arr = getSquare();
        int b = arr.length-1;
        for (int a = 0 ; a < arr[0].length ; a++ ) {
            total += arr[a][b];
            b--;
        }
        return total;

    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    // A public method for retrieving if the square is a magic square
    /**
    * this method returns if the square is a magic square
    * @return true if the the square is magic and false if it is not
    */
    public boolean isMagic() {
        //Add code here!
        int totalRow = 0;
        int totalCol = 0;
        int point = 0;
        int [][] arr = getSquare();
            for (int c = 0 ; c < arr[0].length ; c++) {
                totalCol += arr[c][point];
                }
            for (int c = 0 ; c < arr[0].length ; c++) {
                totalRow += arr[point][c];
                }
            
        if (sumMainDiag() == sumOtherDiag() && totalRow == totalCol){
            return true;
        }
        else {
             return false;
        }
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    // A public method for initlializing the square 2D array
    /**
    * this method asks the user to enter an integer for the square 2D array
    * @param scan is used to read the users input
    */
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.println("Enter an integer number");
                square[row][col] = scan.nextInt();
            }
        }
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    // A public method for retrieving the numbers initlized to the square 2D array
    /**
    * this method retrieving the numbers initialized to the square 2D array
    */
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + "  ");
            }
            System.out.println("");
        }

    }
    //**********BONUS 1 **************
    // A public method for initlializing the square 2D array
    /**
    * this method enters random integer for the square 2D array
    */
        public void matrixChange () {
            int [][] arr = getSquare();
            
            for (int row = 0 ; row < arr[0].length ; row++) {
                for (int col = 0 ; col < arr[0].length ; col++) {                   
                    arr[row][col] = (int)(Math.random()*9)+1;
                }
            }
        }
    
}
