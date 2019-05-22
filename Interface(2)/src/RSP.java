import  java.util.*;

public class RSP {
    public void rps() {
        String personPlay;
        String randomPlay = null;
        int randomInt;
        String response;

        Scanner izi = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Привет, давай сыграем в игру Камень Ножницы Бумага? \n" +
                "Введи камень ножницы или бумага???");

        randomInt = generator.nextInt(3);
        if (randomInt == 0)
            randomPlay = "КАМЕНЬ";
        else if (randomInt == 1)
            randomPlay = "НОЖНИЦЫ";
        else if (randomInt == 2)
            randomPlay = "БУМАГА";
        else System.out.println("Ошибка");

        System.out.println("Введите свой ход");
        personPlay = izi.nextLine();
        personPlay = personPlay.toUpperCase();
        System.out.println("Компьютер выбрал: " + randomPlay);

        if (personPlay.equals(randomPlay))
            System.out.println("Это ничья!");
        else if (personPlay.equals("КАМЕНЬ"))
            if (randomPlay.equals("НОЖНИЦЫ"))
                System.out.println("Камень побеждает ножницы, Ты победил!!!!");
            else if (randomPlay.equals("БУМАГА"))
                System.out.println("Бумага накрыла камень, ты проиграл(");
        if (personPlay.equals("БУМАГА"))
            if (randomPlay.equals("НОЖНИЦЫ"))
                System.out.println("Ножницы режут бумагу, Ты проиграл((");
            else if (randomPlay.equals("КАМЕНЬ"))
                System.out.println("Бумага накрывает камень, Ты победил!!!!");
        if (personPlay.equals("НОЖНИЦЫ"))
            if (randomPlay.equals("БУМАГА"))
                System.out.println("Ножницы режут бумагу, Ты победил!!!!");
            else if (randomPlay.equals("КАМЕНЬ"))
                System.out.println("Камень ломает ножницы, Ты проиграл(((");
    }
}