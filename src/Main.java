import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека - " + age + " лет, то придется немного подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int tempCelcius = 4;
        if (tempCelcius >= 5){
            System.out.println("На улице тепло, можно идти без шапки.");
        }
        else {
            System.out.println("На улице похолодало, но шапку все еще можно не надевать.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 68;
        System.out.printf("Если скорость - " + speed + ", то");
        if (speed > 60) {
            System.out.println(" придется заплатить штраф.");
        }
        else {
            System.out.println(" можно ехать спокойно.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 61;
        boolean sleeper = (age < 2);
        boolean kindergarden = (2 <= age && age <= 6);
        boolean school = (7 <= age && age <= 18);
        boolean university = (18 < age && age < 24);
        boolean work = (24 <= age && age < 60);
        System.out.printf("Если возраст человека равен " + age + " годам, то ему ");
        if (sleeper) {
            System.out.println("пора спать.");}
        else if (kindergarden) {
            System.out.println("нужно ходить в детский сад.");}
        else if (school) {
            System.out.println("нужно ходить в школу.");}
        else if (university) {
            System.out.println("место в университете.");}
        else if (work) {
            System.out.println("нужно ходить на работу.");}
        else {System.out.println("можно отдохнуь.");}

        }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 13;
        boolean tooSmall = (age <= 5);
        boolean normWithParents = (5 < age && age < 14);
        boolean readyForDeadlyWonderland = (age >= 14);
        System.out.printf("Если возраст ребенка равен " + age + " лет, то ему ");
        if (tooSmall) {
            System.out.println("нельзя кататься на аттракционе.");}
        else if (normWithParents) {
            System.out.println("можно кататься на аттракционе в сопровождении.");}
        else if (readyForDeadlyWonderland) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого.");}
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int wagonMaxCapacity = 102;
        int sittingPlaces = 60;
        int placesOccupied = 16;
        boolean youCanSeat = (placesOccupied <= 60);
        boolean youCanStay = (sittingPlaces <= placesOccupied && placesOccupied < wagonMaxCapacity);
        if (youCanSeat) {
            System.out.println("В вагоне " + placesOccupied + " человек. Есть сидячие места.");
        } else if (youCanStay) {
            System.out.println("В вагоне " + placesOccupied + " человек. Есть только стоячие места.");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 123;
        int two = 412;
        int three = 12;
        boolean oneFirst = (one > two && one > three);
        boolean twoFirst = (two > one && two > three);
        boolean threeFirst = (three > one && three > two);
        boolean oneTwoEqual = (one == two && one > three);
        boolean twoThreeEqual = (two == three && two > one);
        boolean oneThreeEqual = (one == three && three > two);
        if (oneFirst) {
            System.out.println("Переменная one - самая большая из трех.");
        }
        else if (twoFirst) {
            System.out.println("Переменная two - самая большая из трех.");
        }
        else if (threeFirst) {
            System.out.println("Переменная three - самая большая из трех.");
        }
        else if (oneTwoEqual) {
            System.out.println("Переменные one и two равны между собой и больше переменной three.");
        }
        else if (twoThreeEqual) {
            System.out.println("Переменные two и three равны между собой и больше переменной one.");
        }
        else if (oneThreeEqual) {
            System.out.println("Переменные one и three равны между собой и больше переменной two.");
        }
        else {
            System.out.println("Все три переменные равны.");
        }

    }

}