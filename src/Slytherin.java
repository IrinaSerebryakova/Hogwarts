public class Slytherin extends Student{
    private int craftiness;   //"хитрость"
    private int determination;   //"решительность"
    private int ambition;   //"амбициозность"
    private int resourcefulness;   //"находчивость"
    private int lustForPower;   //"жажда власти"
    int amountOfPoints = craftiness + determination + ambition + resourcefulness + lustForPower;
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
        String result;
        if(student1.amountOfPoints > student2.amountOfPoints){
            result = student1.fullName + " - лучший Слизеринец, чем " + student2.fullName;
        }else{
            result = student2.fullName + " - лучший Слизеринец, чем " + student1.fullName;
        }
        System.out.println(result);
    }
}
