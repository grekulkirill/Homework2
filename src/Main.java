public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");

        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");

        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг !");

        var differentWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + differentWeight + " кг");

        System.out.println("Задача 7");

        System.out.println("Разница в весе " + differentWeight + " кг");

        System.out.println("Общий вес двух бойцов " + totalWeight + " кг !");

        var oddsWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Второй боксер тяжелее первого на " + oddsWeight + " кг!");

        System.out.println("Задача 8");

        var totalWork = 640;
        var timeWorker = 8;
        var numberEmployee = totalWork / timeWorker;
        System.out.println("Всего работников в компании – " + numberEmployee + " человек.");

        numberEmployee = numberEmployee + 94;
        System.out.println(numberEmployee);

        var ifTotalNumber = timeWorker * numberEmployee;
        System.out.println("Если в компании работает " + numberEmployee + " человек, то всего " + ifTotalNumber + " часов работы может быть поделено между сотрудниками.");


    }
}


