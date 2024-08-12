public class Slytherin extends Student{
    private int craftiness;   //"хитрость"
    private int determination;   //"решительность"
    private int ambition;   //"амбициозность"
    private int resourcefulness;   //"находчивость"
    private int lustForPower;   //"жажда власти"
    private int amountOfPoints;
    public Slytherin(String fullName, int powerOfWitchcraft, int transgression, int craftiness, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, powerOfWitchcraft, transgression);
        this.craftiness = craftiness;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "craftiness=" + craftiness +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
    public static void compareTo(Slytherin student1, Slytherin student2) {
        student1.amountOfPoints = student1.craftiness + student1.determination + student1.ambition + student1.resourcefulness + student1.lustForPower;
        student2.amountOfPoints = student2.craftiness + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;
        String result;
        if(student1.amountOfPoints > student2.amountOfPoints){
            result = student1.getFullName() + " - лучший Слизеринец, чем " + student2.getFullName() + ".";
        }else{
            result = student2.getFullName() + " - лучший Слизеринец, чем " + student1.getFullName() + ".";
        }
        System.out.println(result);
    }
}
