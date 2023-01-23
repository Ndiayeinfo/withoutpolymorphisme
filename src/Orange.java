public class Orange extends  Fruit{

    public Orange(int poids) {
        super(poids);
        System.out.println("Création d'une orange de " + poids + " grammes");
    }

    public void afficher() {
        System.out.println("C'est une orange");
    }

    public void affichePoids() {
        System.out.println("C'est une orange de " + poids + " grammes");
    }
}
