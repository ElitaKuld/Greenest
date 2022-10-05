import javax.swing.*;
import java.util.LinkedList;

public class Huvudprogram {
    public static void main(String[] args) {
        Huvudprogram mainProgram = new Huvudprogram();
        Plant plant1 = new Cactus("Igge", 0.2); // checka in växter
        Plant plant2 = new Palm("Laura", 5);
        Plant plant3 = new CarnivorousPlant("MeatLoaf", 0.7);
        Plant plant4 = new Palm("Putte", 1);

        LinkedList<Plant> allOurPlants = new LinkedList<>(); // skapa en lista över incheckade växter
        allOurPlants.add(plant1);
        allOurPlants.add(plant2);
        allOurPlants.add(plant3);
        allOurPlants.add(plant4);

        while (true) {
            String nameOfPlant = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (nameOfPlant == null) {
                JOptionPane.showMessageDialog(null, "Du har avbrutit programmet.");
                break;
            } else if (nameOfPlant.equals("")) {
                JOptionPane.showMessageDialog(null, "Namnet kan inte vara tomt.");
            } else {
                nameOfPlant = nameOfPlant.trim(); // ta bort alla eventuella tomma tecken på sidorna
                mainProgram.lookForPlant(nameOfPlant, allOurPlants);
            }
        }
    }

    public void lookForPlant(String nameOfPlant, LinkedList<Plant> listOfPlants) {
        boolean thereIsSuchPlant = false;
        for (int i = 0; i < listOfPlants.size(); i++) {
            if (nameOfPlant.equalsIgnoreCase(listOfPlants.get(i).getName())) {
                JOptionPane.showMessageDialog(null, "Denna växt med namn " +
                        listOfPlants.get(i).getName() + " behöver " +
                        listOfPlants.get(i).waterMe() + " liter av " + // polymorfism
                        listOfPlants.get(i).getTypeOfNutrientFluid().getSvenskBetydelse() + " per dag.");
                thereIsSuchPlant = true;
            }
        }
        if (!thereIsSuchPlant)
            JOptionPane.showMessageDialog(null, "Okänt namn! " +
                    "Denna växt är inte incheckad i vårt hotell.");
    }
}
/*Dessa växter bor på hotellet:
• Kaktusen Igge, 20 cm hög
• Palmen Laura, 5 meter hög
• Köttätande växten Meatloaf, 0,7 meter hög
• Palmen Putte, 1 meter hög*/

/*En meddelande-ruta dyker upp på skärmen med texten ”Vilken växt ska få vätska?” och en tom rad
bredvid. Ägaren fyller i växtens namn på tomma raden och programmet visar en ny ruta där det står
hur många liter växten ska få samt vilken sorts vätska (kranvatten, mineralvatten eller proteindryck)
som ska serveras.*/