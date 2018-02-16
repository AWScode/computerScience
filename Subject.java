import java.util.*;

public class Subject{

  private String names;
  private String crime;

  public Subject(String na, String cr){
    this.names = na;
    this.crime = cr;
  }
  public String getNames(){
    return names;
  }

  public String getCrime(){
    return crime;
  }

  public void setNames(String na) {
    names = na;
  }

  public void setCrime(String cr) {
    crime = cr;
  }

  public static void policeClassified(){
    System.out.println("The following information can only be accessed by authorized personnel");
  }



}
