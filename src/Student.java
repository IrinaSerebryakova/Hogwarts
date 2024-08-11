public abstract class Student {
    String fullName;
    private int powerOfWitchcraft;     // мощность колдовства
    private int transgression;         // расстояние для трансгрессии

    public Student(String fullName, int powerOfWitchcraft, int transgression) {
        this.fullName = fullName;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgression = transgression;
    }


    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", powerOfWitchcraft=" + powerOfWitchcraft +
                ", transgression=" + transgression +
                '}';
    }

    public static void comparePowerOfWitchcraft(Student student1, Student student2) {
        String result;

        if (student1.powerOfWitchcraft > student2.powerOfWitchcraft) {
            result = student1.fullName + " обладает большей мощностью магии, чем " + student2.fullName;
        } else {
            result = student2.fullName + " обладает большей мощностью магии, чем " + student1.fullName;
        }
        System.out.println(result);
    }

        public static void compareOfTransgressionRange(Student student1, Student student2) {
            String result;
        if (student1.transgression > student2.transgression) {
            result = student1.fullName + " обладает большей дальностью трансгрессии, чем " + student2.fullName;
        } else {
            result = student2.fullName + " обладает большей дальностью трансгрессии, чем " + student1.fullName;
        }
        System.out.println(result);
    }
}

