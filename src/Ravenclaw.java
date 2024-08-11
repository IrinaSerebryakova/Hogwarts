public class Ravenclaw extends Student{ //Когтевран
   private int mind;   //"ум"
   private int wisdom;   //"мудрость"
   private int wit;   //"остроумие"
   private int creativity;   //"творчество"
   int amountOfPoints = mind + wisdom + wit + creativity;
   public Ravenclaw(String fullName, int powerOfWitchcraft, int transgression, int mind, int wisdom, int wit, int creativity) {
      super(fullName, powerOfWitchcraft, transgression);
      this.mind = mind;
      this.wisdom = wisdom;
      this.wit = wit;
      this.creativity = creativity;
   }

   @Override
   public String toString() {
      return super.toString() +
              "mind=" + mind +
              ", wisdom=" + wisdom +
              ", wit=" + wit +
              ", creativity=" + creativity +
              '}';
   }
   public static void compareTo(Ravenclaw student1, Ravenclaw student2) {
      String result;
      if(student1.amountOfPoints > student2.amountOfPoints){
         result = student1.fullName + " - лучший Когтевранец, чем " + student2.fullName;
      }else{
         result = student2.fullName + " - лучший Когтевранец, чем " + student1.fullName;
      }
      System.out.println(result);
   }
}
