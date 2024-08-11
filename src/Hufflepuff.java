public class Hufflepuff extends Student{  //Пуффендуй
    private int diligence;   //"трудолюбие"
    private int loyalty;   //"верность"
    private int honesty;   //"честность"
    int amountOfPoints = diligence + loyalty + honesty;
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
        String result;
        if(student1.amountOfPoints > student2.amountOfPoints){
            result = student1.fullName + " - лучший Пуффендуец, чем " + student2.fullName;
        }else{
            result = student2.fullName + " - лучший Пуффендуец, чем " + student1.fullName;
        }
        System.out.println(result);
    }
}
