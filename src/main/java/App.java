public class App {
    public static void main(String[] args) {
        Bowl mixedFruitBowl = new Bowl();
        Fruits apple = new Fruits("apple", "1","medium");
        Fruits orange = new Fruits("orange", "1","medium");

        mixedFruitBowl.add(apple);
        mixedFruitBowl.add(orange);

        MultiLevelBowl multiLevelBowl = new MultiLevelBowl();

        Segregator segregator = new Segregator(mixedFruitBowl, multiLevelBowl);
        MultiLevelBowl multiLevelBowl = segregator.segregateByName();
        
    }
}