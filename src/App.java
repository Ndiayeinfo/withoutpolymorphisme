public class App {
    public static void main(String[] args) {

        /*
        Cet exemple montre un développeur qui n'exploite pas le polymorphisme.
        Il est obligé à chaque fois de faire des tests. Si le nombre de fruits augmente
        de manière considérable le code va commencer à devenir complexe à cause de beaucoup de if/else
         */

       // Uilisation des tableaux
        Fruit[] lesFruits = new Fruit[3];
        lesFruits[0] = new Pomme(40);
        lesFruits[1] = new Orange(50);
        lesFruits[2] = new Pomme(60);

        //Parcours des éléments du tableau
        for (int i=0; i<lesFruits.length;i++) {
            if (lesFruits[i] instanceof Pomme) {
                Pomme p = (Pomme) lesFruits[i];
                p.affichePoids();
                System.out.println("*************************");
            }else if (lesFruits[i] instanceof Orange) {
                Orange o = (Orange) lesFruits[i];
                o.affichePoids();
                System.out.println("--------------------------");
            }
        }
    }
}