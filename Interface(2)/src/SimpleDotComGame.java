import java.util.Scanner;

 class SimpleDotComGame {
     public void Warship() {
         int numOfGuesses=0;

         SimpleDotCom theDotCom = new SimpleDotCom();
         System.out.println("Добро пожаловать в морской бой!");
         int randomNum = (int) (Math.random()*5);
         int [] locations = {randomNum, randomNum+1, randomNum+2};
         theDotCom.setLocationCells(locations);

         boolean isAlive = true;

         while(isAlive = true) {
             Scanner izi =new Scanner(System.in);
             System.out.println("Введите число");
             String guess = izi.next();
             String result = theDotCom.checkYourself(guess);
             numOfGuesses++;
             if (result.equals("Потопил")) {
                 isAlive = false;
                 System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
             }
         }
     }
}
