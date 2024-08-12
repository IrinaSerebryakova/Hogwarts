public class Gryffindor extends Student{
   private int nobility;   //"благородство"
   private int honor;      //"честь"
   private int bravery;    //"храбрость"
   private int amountOfPoints;
   public Gryffindor(String fullName, int powerOfWitchcraft, int transgression,int nobility, int honor,int bravery) {
      super(fullName, powerOfWitchcraft, transgression);
      this.nobility = nobility;
      this.honor = honor;
      this.bravery = bravery;
   }
   public int getNobility() {
      return nobility;
   }

   public void setNobility(int nobility) {
      this.nobility = nobility;
   }

   public int getHonor() {
      return honor;
   }

   public void setHonor(int honor) {
      this.honor = honor;
   }

   public int getBravery() {
      return bravery;
   }

   public void setBravery(int bravery) {
      this.bravery = bravery;
   }

     @Override
   public String toString() {
      return super.toString() +
              "nobility=" + nobility +
              ", honor=" + honor +
              ", bravery=" + bravery +
              '}';
   }

   public static void compareTo(Gryffindor student1, Gryffindor student2) {
      student1.amountOfPoints = student1.nobility + student1.honor + student1.bravery;
      student2.amountOfPoints = student2.nobility + student2.honor + student2.bravery;
      String result;
      if(student1.amountOfPoints > student2.amountOfPoints){
         result = student1.getFullName() + " - лучший Гриффиндорец, чем " + student2.getFullName() + ".";
      }else{
         result = student2.getFullName() + " - лучший Гриффиндорец, чем " + student1.getFullName() + ".";
      }
      System.out.println(result);
   }
}
