public class Gryffindor extends Student{
   private int nobility;   //"благородство"
   private int honor;      //"честь"
   private int bravery;    //"храбрость"
   int amountOfPoints = nobility + honor + bravery;
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
      String result;
      if(student1.amountOfPoints > student2.amountOfPoints){
         result = student1.fullName + " - лучший Гриффиндорец, чем " + student2.fullName;
      }else{
         result = student2.fullName + " - лучший Гриффиндорец, чем " + student1.fullName;
      }
      System.out.println(result);
   }
}
