import javax.swing.*;
import java.util.LinkedList;

public class Huvudprogram {
    public static void main(String[] args) {
        Cactus igge = new Cactus("Igge", 0.2); // incheckade växter
        Palm laura = new Palm("Laura", 5);
        CarnivorousPlant meatLoaf = new CarnivorousPlant("MeatLoaf", 0.7);
        Palm putte = new Palm("Putte", 1);

        LinkedList<Plant> allOurPlants = new LinkedList<>();
        allOurPlants.add(igge);
        allOurPlants.add(laura);
        allOurPlants.add(meatLoaf);
        allOurPlants.add(putte);

        while (true) {
            String nameOfPlant = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (nameOfPlant == null) {
                JOptionPane.showMessageDialog(null, "Du har avbrutit programmet.");
                break;
            }
            else if (nameOfPlant.equals("")) {
                JOptionPane.showMessageDialog(null,"Namnet kan inte vara tomt.");
            }
            else {
                int thereIsSuchPlant = 0;
                for (int i = 0; i < allOurPlants.size(); i++) {
                    if (nameOfPlant.equalsIgnoreCase(allOurPlants.get(i).getName())) {
                        JOptionPane.showMessageDialog(null, "Denna växt med namn " +
                                allOurPlants.get(i).getName() + " behöver " +
                                allOurPlants.get(i).waterMe() + " liter av " +
                                allOurPlants.get(i).getTypeOfNutrientFluid().getSvenskBetydelse() + " per dag.");
                        thereIsSuchPlant++;
                    }
                }
                if (thereIsSuchPlant == 0)
                    JOptionPane.showMessageDialog(null, "Okänt namn! " +
                            "Denna växt är inte incheckad i vårt hotell.");
            }
        }
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
/*JOptionPane.showInputDialog("Namnet kan inte vara tomt. Vänligen ange namnet på växten som ska vattnas.");
            nameOfPlant = JOptionPane.showInputDialog("Vilken växt ska få vätska?");*/