public class Ravenclaw extends Student{ //Когтевран
   private int mind;   //"ум"
   private int wisdom;   //"мудрость"
   private int wit;   //"остроумие"
   private int creativity;   //"творчество"
   private int amountOfPoints;
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
      student1.amountOfPoints = student1.mind + student1.wisdom + student1.wit + student1.creativity;
      student2.amountOfPoints = student2.mind + student2.wisdom + student2.wit + student2.creativity;
      String result;
      if(student1.amountOfPoints > student2.amountOfPoints){
         result = student1.getFullName() + " - лучший Когтевранец, чем " + student2.getFullName() + ".";
      }else{
         result = student2.getFullName() + " - лучший Когтевранец, чем " + student1.getFullName() + ".";
      }
      System.out.println(result);
   }
}
