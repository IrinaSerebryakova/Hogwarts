public abstract class Student {
    private String fullName;
    private int powerOfWitchcraft;     // мощность колдовства
    private int transgression;         // расстояние для трансгрессии

    public Student(String fullName, int powerOfWitchcraft, int transgression) {
        this.fullName = fullName;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
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
            result = student1.getFullName() + " обладает большей мощностью магии, чем " + student2.getFullName() + ".";
        } else {
            result = student2.getFullName() + " обладает большей мощностью магии, чем " + student1.getFullName() + ".";
        }
        System.out.println(result);
    }

        public static void compareOfTransgressionRange(Student student1, Student student2) {
            String result;
        if (student1.transgression > student2.transgression) {
            result = student1.getFullName() + " обладает большей дальностью трансгрессии, чем " + student2.getFullName() + ".";
        } else {
            result = student2.getFullName() + " обладает большей дальностью трансгрессии, чем " + student1.getFullName() + ".";
        }
        System.out.println(result);
    }
}

