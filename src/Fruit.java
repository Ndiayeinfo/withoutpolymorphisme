public class Fruit {
    protected int poids;

    public Fruit(int poids) {
        this.poids = poids;
        System.out.println("Création d'un fruit de " + poids + " grammes");
    }

    public void afficher() {
        System.out.println("C'est un fruit");
    }
}
