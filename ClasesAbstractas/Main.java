package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
        Paladin paladin = new Paladin("Arthur", 1, 100);
        Wizard wizard = new Wizard("Merlin", 1, 80);

        System.out.println(paladin);
        System.out.println(wizard);

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
