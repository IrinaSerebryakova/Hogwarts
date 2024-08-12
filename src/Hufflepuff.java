public class Hufflepuff extends Student{  //Пуффендуй
    private int diligence;   //"трудолюбие"
    private int loyalty;   //"верность"
    private int honesty;   //"честность"
    private int amountOfPoints;
    public Hufflepuff(String fullName, int powerOfWitchcraft, int transgression, int diligence, int loyalty, int honesty) {
        super(fullName, powerOfWitchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return super.toString() +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    public static void compareTo(Hufflepuff student1, Hufflepuff student2) {
        student1.amountOfPoints = student1.diligence + student1.loyalty + student1.honesty;
        student2.amountOfPoints = student2.diligence + student2.loyalty + student2.honesty;
        String result;
        if(student1.amountOfPoints > student2.amountOfPoints){
            result = student1.getFullName() + " - лучший Пуффендуец, чем " + student2.getFullName() + ".";
        }else{
            result = student2.getFullName() + " - лучший Пуффендуец, чем " + student1.getFullName() + ".";
        }
        System.out.println(result);
    }
}
