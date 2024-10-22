package Interfaces;

public class Main {
    public static void main(String[] args) {
        Paladin paladin = new Paladin("Arthur", 1, 100);
        Wizard wizard = new Wizard("Merlin", 1, 80);
        Wizard wizard2 = new Wizard("Gandalf", 1, 90);

        //Array de personjes que pueden atacar a distqancia
        AtacanteADistancia[] atacantes = {wizard, wizard2};


        System.out.println(paladin);
        System.out.println(wizard);
        System.out.println(wizard2);

        //Realizar ataques a distancia
        System.out.println("Atacan a distancia");
        for (AtacanteADistancia atacante : atacantes){
            atacante.atacarDistancia(paladin);
            System.out.println(paladin);
        }


        // Paladín ataca al Wizard
        paladin.atacar(wizard);
        System.out.println(wizard);

        // Wizard ataca al Paladín
        wizard.atacar(paladin);
        System.out.println(paladin);

        // Paladín se defiende
        paladin.defender(5);
        System.out.println(paladin);

        // Wizard se defiende
        wizard.defender(5);
        System.out.println(wizard);
    }
}
