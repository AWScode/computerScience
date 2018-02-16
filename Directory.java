import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Directory{

  public static void main(String[] args) {
    System.out.println("Welcome to Shujin Acadamy rooftop, aka the Phantom Thieves' hideout");
    System.out.println("Here is a list of members");

    Student Joker = new Student("Ren Amamiya","Joker", "Arsene", "The Fool");

    Student Mona = new Student("Morgana","Mona","Zoro","The Magician");

    Student Skull = new Student("Ryuji Sakamoto", "Skull","Captain Kidd","The Chariot");

    Student Panther = new Student("Ann Takamaki","Panther", "Carmen","The Lovers");

    Student Fox = new Student("Yusuke Kitagawa","Fox","Goemon","The Emperor");

    Student Queen = new Student("Makoto Nijima", "Queen", "Johanna","The Priestess");

    Student Orcale = new Student("Futaba Sakura","Orcale","Necronomicon","The Hermit");

    Student Noir = new Student("Haru Okumura", "Noir", "Milady","The Empress");

    Student Crow = new Student("Goro Akechi","Crow","Robinhood","The Justice");

    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    listOfStudents.add(Joker);
    listOfStudents.add(Mona);
    listOfStudents.add(Skull);
    listOfStudents.add(Panther);
    listOfStudents.add(Fox);
    listOfStudents.add(Queen);
    listOfStudents.add(Noir);
    listOfStudents.add(Crow);

    for (int i = 0; i < listOfStudents.size(); i++) {
      System.out.println(listOfStudents.get(i).getName());
}

    String newName = Joker.getName();
    System.out.println("Their leader's name is: " + newName + "\n\n =========== \n");
    Joker.sendCallingCard();

    System.out.println("It appears that they are busy.");


     System.out.println("");
     System.out.println("Which member would you like to know more about?");
     Scanner scan = new Scanner(System.in);
     String choice = scan.nextLine();

      Boolean found = false;
      Student theStudent = new Student("Name", "CodeName", "Persona","Confidant");
      for (int j = 0; j < listOfStudents.size(); j++) {
          if (choice.equals(listOfStudents.get(j).getName())) {
                System.out.println("Do you mean " + choice + "?");
                found = true;
                theStudent = listOfStudents.get(j);
                break;
                }
              }

      if (!found) {
          System.out.println("That is not a member of the Phantom Thieves");
        }
      else {
        System.out.println(theStudent.getName() + ", Code name: " + theStudent.getCodeName() + ", Persona: " + theStudent.getPersona() + ", Confidant: " + theStudent.getConfidant());
        }

        System.out.println("Here are some of the cases from their past activities: ");
        ArrayList<Subject> record = new ArrayList<Subject>();

        Subject Case1 = new Subject("Kamoshida","Lust");
        Subject Case2 = new Subject("Madarame","Vanity");
        Subject Case3 = new Subject("Kaneshiro","Gluttony");
        Subject Case4 = new Subject("Wakaba Isshiki","Wrath");
        Subject Case5 = new Subject("Okumura","Greed");
        Subject Case6 = new Subject("Sae Nijima","Envy");
        Subject Case7 = new Subject("Masayoshi Shido","Pride");
        Subject Case8 = new Subject("The People","Sloth");
        Subject Case9 = new Subject("Yaldabaoth","All of above");

        record.add(Case1);
        record.add(Case2);
        record.add(Case3);
        record.add(Case4);
        record.add(Case5);
        record.add(Case6);
        record.add(Case7);
        record.add(Case8);
        record.add(Case9);

        for (int j = 0; j < record.size(); j++) {
          System.out.println(record.get(j).getNames() + record.get(j).getCrime());
    }
        System.out.println("Would you like some more information? Yes||No");
        Scanner d = new Scanner(System.in);
        String nope = d.nextLine();
        if(nope.equals("Yes")){
          Case1.policeClassified();
        }
        else if(nope.equals("No")){
          System.out.println("Okay then see you later");
        }


        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
           public void run() {
             Joker.takeHearts();
           }
         }, 5000);


}
}
