/* ConnectFour.java by Mr. Considine
This class holds all of the data and methods
to create ConnectFour games. This is a class to be
imported and used in other files that want to play
this game. */

import java.util.*;
import java.io.*;

public class ConnectFour {

  //Instance Variables here
  String[][] board;
  //rows
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

  public ConnectFour() {
    //Constructor Method here
    this.column1 = new String[6];
    this.column1[0] = "0";
    this.column1[1] = "0";
    this.column1[2] = "0";
    this.column1[3] = "0";
    this.column1[4] = "0";
    this.column1[5] = "0";

    this.column2 = new String[6];
    this.column2[0] = "0";
    this.column2[1] = "0";
    this.column2[2] = "0";
    this.column2[3] = "0";
    this.column2[4] = "0";
    this.column2[5] = "0";

    this.column3 = new String[6];
    this.column3[0] = "0";
    this.column3[1] = "0";
    this.column3[2] = "0";
    this.column3[3] = "0";
    this.column3[4] = "0";
    this.column3[5] = "0";

    this.column4 = new String[6];
    this.column4[0] = "0";
    this.column4[1] = "0";
    this.column4[2] = "0";
    this.column4[3] = "0";
    this.column4[4] = "0";
    this.column4[5] = "0";

    this.column5 = new String[6];
    this.column5[0] = "0";
    this.column5[1] = "0";
    this.column5[2] = "0";
    this.column5[3] = "0";
    this.column5[4] = "0";
    this.column5[5] = "0";

    this.column6 = new String[6];
    this.column6[0] = "0";
    this.column6[1] = "0";
    this.column6[2] = "0";
    this.column6[3] = "0";
    this.column6[4] = "0";
    this.column6[5] = "0";

    this.column7 = new String[6];
    this.column7[0] = "0";
    this.column7[1] = "0";
    this.column7[2] = "0";
    this.column7[3] = "0";
    this.column7[4] = "0";
    this.column7[5] = "0";

    this.board = new String[7][6];
    this.board[0] = column1;
    this.board[1] = column2;
    this.board[2] = column3;
    this.board[3] = column4;
    this.board[4] = column5;
    this.board[5] = column6;
    this.board[6] = column7;

    this.gameOver = false;
  }

  // Get and Set Methods here

  //??idk if you would still need this because it's not being used anywhere else?
  public void getPiece(){

  }

  // Other methods here
  public void displayBoard(){
    for (int j = 5; j >= 0; j--) {
      String row = "";
      for (int i = 6; i >= 0; i--) {
        row = row + board[i][j] + " ";
      }
      System.out.println(row);
    }
  }

  public void addPiece() {
      //Place a piece in the column that is passed in.
      //Find the lowest possible empty space and fill.
      //The largest row number that is empty.
      System.out.println("Add a piece to a column");
      Scanner scanner = new Scanner(System.in);
      int columnInt = scanner.nextInt();


          if(columnInt > 6){
              System.out.println("That's not a valid column");

          }
          if (board[7 - columnInt][0] == "0") {
              board[7 - columnInt][0] = "1";

          }
          else if(board[7 - columnInt][0] == "1"){

            for(int k = 1; k < 7; k++){
              if(board[7 - columnInt][k] == "0"){
                  board[7 - columnInt][k] = "1";
                  break;
                }
              }
          }

}

public Boolean checkFourHorizontal(){
  //check vertically
  int count = 0;
  boolean win = false;
  for(int w = 0; 7 > w; w++){
      for(int h = 0; 3 > h; h++){
          if(board[w][h] == "1"){
              if(board[w][h + 1] == "1"){
                if(board[w][h + 2] == "1"){
                  if(board[w][h + 3] == "1"){
                    win = true;
                  }
                  else{
                    win = false;
                  }
                }
                else{
                  win = false;
                }
              }
              else{
                win = false;
              }
          }
      }

  }
  return win;
}


    /*public Boolean checkFourVertical(){
      //check vertically
      int count = 0;
      boolean win = false;
      for(int h = 0; 6 > h; h++){
          for(int w = 0; 7 > w; w ++){
              if(board[w][h] == "1"){
                  count = count + 1;
                  win = false;
              }
              else{
                  count = count;
                  win = false; //count = count; try return count does not work as expected
              }
              if(count >= 4){
                  win = true;//not working here
              }
          }

      }
      return win;
    }*/

    public Boolean checkFourDiagonal1(){
      Boolean win = false;
      //check diagonally
      for(int h = 0; h < 6; h++){
        for(int w =0; w < 7; w++){
          if(board[w][h] == "1"){
            if(board[w+1][h+1] == "1"){
              if(board[w+2][h+2] == "1"){
                if(board[w+3][h+3] == "1"){
                  win = true;
                }
                else{
                  win = false;
                  break;
                }
              }
              else{
                win = false;
                break;
              }
            }
            else{
              win = false;
              break;
            }
          }
        }
      }
      return win;
    }

    public Boolean checkFourDiagonal2(){
      //check diagonally other way around
      Boolean win = false;
      for(int h = 6; h >= 0; h--){
        for(int w = 7; w >= 0; w--){
          if(board[w][h] == "1"){
            if(board[w-1][h-1] == "1"){
              if(board[w-2][h-2] == "1"){
                if(board[w-3][h-3] == "1"){
                  win = true;
                }
                else{
                  break;
                }
              }
              else{
                break;
              }
            }
            else{
              break;
            }
          }
        }
      }
      return win;
    }

  public static void main(String[] args)throws IOException {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();
    String player = "1";
    while(true){
      if(player.equals("1")){
        player = "2";
      }
      else{
        player = "1";
      }
      System.out.println("It's " + player + "'s turn");
      newGame.addPiece();
      newGame.displayBoard();
      newGame.checkFourHorizontal();
      newGame.checkFourVertical();
      if(newGame.checkFourVertical()){
        System.out.println("Player 1 wins");
        break;
      }
      if(newGame.checkFourHorizontal()){
        System.out.println("Player 1 wins");
        break;
      }
      /*newGame.checkFourDiagonal1();
      if(newGame.checkFourDiagonal1()){
        System.out.println("Player 1 wins");
        break;
      }*/
      /*newGame.checkFourDiagonal2();
      if(newGame.checkFourDiagonal2()){
        System.out.println("Player 1 wins");
        break;*/
      }

    }
  }



//FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFUUUUUUUUUUUUUUUUUU
