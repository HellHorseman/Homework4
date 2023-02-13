public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
    int age = 18;
        System.out.println("Если возраст человека равен " + age + " , то ");
    if (age >= 18) {
        System.out.println(" он совершеннолетний");
    }
    else {
        System.out.println(" он не достиг совершеннолетия, нужно подождать");
    }
    }

    public static void task2 () {
        System.out.println("Задача 2");
    int temperature = 3;
    if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    else {
        System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
    }
    }
    public static void task3 () {
        System.out.println("Задача 3");
    int speed = 60;
    if (speed > 61) {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
    }
    else {
        System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
    }
    }
    public static void task4 () {
        System.out.println("Задача 4");
    int age = 3;
        System.out.println("Если возраст человека равен " + age + " лет,");
    if (age >= 2 && age <= 6) {
        System.out.println("то ему нужно ходить в детский сад");
        }
    else if (age >= 7 && age <= 18) {
        System.out.println("то ему нужно ходить в школу");
        }
    else if (age > 18 && age < 24) {
        System.out.println("то ему нужно ходить в университет");
        }
    else {
        System.out.println("то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
    int age = 10;
        System.out.println("Если возраст ребёнка равен " + age + ",");
    if (age <= 5) {
        System.out.println("то ему нельзя кататься на аттракционе");
        }
    else if (age > 5 && age <= 14) {
        System.out.println("то можно кататься на аттракционе в сопровождении");
        }
    else {
        System.out.println("то можно кататься на аттракционе без сопровождения взрослого");
    }
    }
    public static void task6 () {
        System.out.println("Задача 6");

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
}