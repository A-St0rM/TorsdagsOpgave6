package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData(){
        File file = new File("coffees.txt");

        try{
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                coffeeMenu.add(fileReader.nextLine());
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }


}
