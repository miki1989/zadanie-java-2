public class Room {
    public static void main(String[] args) {

        Wardrobe ikea = new Wardrobe();
        Wardrobe castorama = new Wardrobe();

        ikea.color = "brown";
        ikea.shape = "rectangular";
        ikea.sliding = true;

        castorama.color = "black";
        castorama.shape = "square";
        castorama.sliding = false;

        System.out.println("Wardrobe from ikea has " + ikea.color + " and " + ikea.shape +" shape.");
        System.out.println("Can you slide it? " + ikea.sliding);
        System.out.println();
        System.out.println("Wardrobe from castorama has " + castorama.color + " and " + castorama.shape + " shape.");
        System.out.println("Can you slide it? " + castorama.sliding);
    }
}
