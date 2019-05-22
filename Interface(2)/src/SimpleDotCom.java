import java.util.ArrayList;
public class SimpleDotCom {
    private ArrayList<Integer> locationCells = new ArrayList<Integer>();

    public void setLocationCells (int [] loc) {
        locationCells.add(loc[0]);
        locationCells.add(loc[1]);
        locationCells.add(loc[2]);
    }
    public String checkYourself (String userInput) {
        String result = "Мимо";
        int tu =Integer.parseInt(userInput);
        int index = locationCells.indexOf(tu);
        if (index>=0) {
            locationCells.remove(index);
            result = "Попал";
            System.out.println("Попал");
            if (locationCells.isEmpty()){
                result = "Потопил";
                System.out.println("Готов");
            }
        }else {
            System.out.println("Мимо");
        }
        return result;
    }
}

