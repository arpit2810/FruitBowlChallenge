public class Bowl {
    private List<Fruits> fruits;

    public int getFruitCount() {
        return fruits.size();
    }

    public void addFruit(Fruits fruit) {
        fruits.add(fruit);
    }

    public void removeFruit(Fruits fruit) {
        fruits.remove(fruit);
    }

    public void removeFruitByName(String fruitName) {
        // find the matching fruit in the list
        // remove the fruit
    }
}