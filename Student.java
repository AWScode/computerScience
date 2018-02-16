import java.util.*;

public class Student{
  //P5

  private String name;
  private String codeName;
  private String persona;
  private String confidant;


  public Student(String n, String c, String p, String con){
    this.name = n;
    this.codeName = c;
    this.persona = p;
    this.confidant = con;
  }

  public String getName(){
    return name;
  }

  public String getCodeName(){
    return codeName;
  }

  public String getPersona(){
    return persona;
  }

  public String getConfidant(){
    return confidant;
  }

  public void setName(String n) {
    name = n;
  }

  public void setCodeName(String c) {
    codeName = c;
  }

  public void setPersona(String p) {
    persona = p;
  }

  public void setConfidant(String con) {
    confidant = con;
  }

  public static void sendCallingCard(){
    System.out.println("Mission Start");
    System.out.println("Calling card sent");
  }
  public static void takeHearts(){
    System.out.println("Treasure Found");
    System.out.println("Mission Accomplished");
  }


}
