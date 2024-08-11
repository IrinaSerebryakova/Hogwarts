public class Hogwarts {
    static Gryffindor garry = new Gryffindor("Гарри Поттер", 70, 30, 50,60,50);
    static Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 80, 40,70, 30, 50);
    static Gryffindor ron = new Gryffindor("Рон Уизли",60, 35,40, 50,60);

    static Slytherin draco = new Slytherin("Драко Малфой", 65, 40, 35, 68, 52, 64,52);
    static Slytherin montegu = new Slytherin("Грэхэм Монтегю",55, 75,45,26,48,68,25);
    static Slytherin goyl = new Slytherin("Грегори Гойл",50, 20,25,48 ,68,75,25);

    static Ravenclaw chjou = new Ravenclaw("Чжоу Чанг",56, 35,78,62,35,15);
    static Ravenclaw padme = new Ravenclaw("Падма Патил",63, 42,15,62,35,48);
    static Ravenclaw marcus = new Ravenclaw("Маркус Белби", 46, 15,45,63,92,15);

    static Hufflepuff zaharia = new Hufflepuff("Захария Смит",54, 45,46,48,75);
    static Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 68, 55,46,95,35);
    static Hufflepuff finch = new Hufflepuff("Джастин Финч-Флетчли", 61, 32,36,45,75);

    public static void main(String[] args) {
        Student.comparePowerOfWitchcraft(garry, draco);
        Student.compareOfTransgressionRange(montegu,sedrik);
        Gryffindor.compareTo(ron, germiona);
        Slytherin.compareTo(draco,goyl);
        Hufflepuff.compareTo(finch, zaharia);
        Ravenclaw.compareTo(padme,chjou);
    }
}


