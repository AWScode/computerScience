public class Student{
  //P5

  private static String name;
  private static String codeName;
  private static String persona;
  private static String confidant;


  public students(String n, String c, String p, String con){
    this.name = n;
    this.codeName = c;
    this.persona = p;
    this.confidant = con;
  }

  public static void getname(){
    return name;
  }

  public static void getCodeName(){
    return codeName;
  }

  public String getPersona(){
    return persona;
  }

  public String getConfidant(){
    return confidant;
  }


}
