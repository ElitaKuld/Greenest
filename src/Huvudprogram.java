import javax.swing.*;
import java.util.LinkedList;

public class Huvudprogram {
    public static void main(String[] args) {
        Huvudprogram mainProgram = new Huvudprogram();
        Cactus igge = new Cactus("Igge", 0.2); // checka in växter
        Palm laura = new Palm("Laura", 5);
        CarnivorousPlant meatLoaf = new CarnivorousPlant("MeatLoaf", 0.7);
        Palm putte = new Palm("Putte", 1);


        LinkedList<Plant> allOurPlants = new LinkedList<>(); // skapa en lista över incheckade växter
        allOurPlants.add(igge);
        allOurPlants.add(laura);
        allOurPlants.add(meatLoaf);
        allOurPlants.add(putte);

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
        for (Plant plant : listOfPlants) {
            if (nameOfPlant.equalsIgnoreCase(plant.getName())) {
                JOptionPane.showMessageDialog(null, "Denna växt med namn " +
                        plant.getName() + " behöver " +
                        plant.waterMe() + " liter av " + // polymorfism
                        plant.getTypeOfNutrientFluid().getSvenskBetydelse() + " per dag.");
                thereIsSuchPlant = true;
            }
        }
        if (!thereIsSuchPlant)
            JOptionPane.showMessageDialog(null, "Okänt namn! " +
                    "Denna växt är inte incheckad i vårt hotell.");
    }
}