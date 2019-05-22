import java.util.Scanner;

public class Main {
    static Scanner izi = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Во что будем играть:?");
        System.out.println("1 - камень ножницы бумага");
        System.out.println("2 - морской бой");
        int num1 = izi.nextInt();
        switch (num1) {
            case 1:
                RSP a = new RSP();
                a.rps();
                break;
            case 2:
                SimpleDotComGame az = new SimpleDotComGame();
                az.Warship();
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}

