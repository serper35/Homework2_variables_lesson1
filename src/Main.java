public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача №1\n" + "dog = " + dog + ";\ncat = " + cat + ";\npaper = " + paper + ".");
    }

    public static void task2() {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println();
        System.out.println("Задача №2\n" + "dog = " + dog + ";\ncat = " + cat + ";\npaper = " + paper + ".");
    }

    public static void task3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println();
        System.out.println("Задача №3\n" + "dog = " + dog + ";\ncat = " + cat + ";\npaper = " + paper + ".");
    }

    public static void task4() {
        var friend = 19;
        System.out.println();
        System.out.println("Задача №4\n" + "friend = " + friend + ";");

        friend *= 2;
        System.out.println("Значение переменной friend после умножения на 2 = " + friend + ";");

        friend /= 7;
        System.out.println("Значение переменной friend после деления на 7 = " + friend + ".");
    }

    public static void task5() {
        var frog = 3.5;
        System.out.println();
        System.out.println("Задача №5\n" + "frog = " + frog + ";");

        frog *= 10;
        System.out.println("Значение переменной frog после умножения на 10 = " + frog + ";");

        frog /= 3.5;
        System.out.println("Значение переменной frog после деления на 3.5 = " + frog + ";");

        frog += 4;
        System.out.println("Значение переменной frog после прибавления 4 = " + frog + ".");
    }

    public static void task6() {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var difWeight = boxer1 - boxer2;

        System.out.println();
        System.out.println("Задача №6\n" + "Общий вес боксеров = " + totalWeight + " кг;\n" + "Разница в весе боксеров = " + (Math.abs(difWeight)) + " кг.");
    }

    public static void task7() {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var difWeight1 = boxer1 - boxer2;
        System.out.println();
        if (boxer1 > boxer2)
            System.out.println("Задача №7\n" + "Разница в весе (способ 1) = " + Math.abs(difWeight1) + " кг;\n" + "Разница в весе (способ 2 ) = " + boxer1 % boxer2 + " кг!");

        else System.out.println("Задача №7\n" + "Разница в весе (способ 1) = " + Math.abs(difWeight1) + " кг;\n" + "Разница в весе (способ 2 ) = " + boxer2 % boxer1 + " кг!");
    }

    public static void task8() {
        var totalHours = 640;
        var workDay = 8;
        var totalWorkers = totalHours / workDay;

        System.out.println();
        System.out.println("Задача №8\n" + "Всего работников в компании - " + totalWorkers + " человек(а).");

        totalWorkers+= 94;
        totalHours = totalWorkers * workDay;
        System.out.println("Если в компании работает " + totalWorkers + " человек(а), то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");

    }
}
