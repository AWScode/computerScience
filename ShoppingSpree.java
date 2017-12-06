import java.util.*;

public class ShoppingSpree{
  int budget;
  ArrayList<String> bags;

  /*public ShoppingSpree(){

    bags = new ArrayList<String>();

  }*/

  public int getMoney(){
    return budget;
  }

  public String inventory(){
    System.out.print("You are carrying: ");
    for(int i = 0; i < bags.size(); i++){
      System.out.print(bags.get(i) + ",");
    }
    System.out.println("And that's it");
  }

  public int getShirt(){
    bags.add("Shirt");
    budget = budget - 20;
    return budget;
  }

  public int getFood(){
    bags.add("poptarts");
    budget = budget - 5;
    return budget;
  }

  public int getVideogame(){
    bags.add("Legend of Zelda: Breath of the wild");
    budget =  budget - 57;
    return budget;
  }

  public int getConsole(){
    bags.add("Nintendo Switch");
    budget =  budget - 300;
    return budget;
  }


  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("This is a shop.");
    System.out.println("How much budget do you have?");
    int budget = sc.nextInt();
    System.out.println("What do you want to get this time?");
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose between: Shirt, Food, Video game, Console");
    if(scan.nextLine().equals("Shirt")){
      ShoppingSpree.getShirt();
    }
    else if(scan.nextLine().equals("Food")){
      ShoppingSpree.getFood();
    }
    else if(scan.nextLine().equals("Videogame")){
      ShoppingSpree.getVideogame();
    }
    else if(scan.nextLine().equals("Console")){
      ShoppingSpree.getConsole();
    }
    else{
      System.out.println("It's out of stock, try get something else.");
    }

  }

}
