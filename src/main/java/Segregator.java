public class Segregator {

private Bowl mixedFruitBowl ;
private MultiLevelBowl multiLevelBowl;
    public Segregator(Bowl mixedFruitBowl, MultiLevelBowl multiLevelBowl) {
            this.mixedFruitBowl = mixedFruitBowl;
            this.multiLevelBowl = multiLevelBowl;
    }

    public MultiLevelBowl segregateByName() {
        return multiLevelBowl;
    }

    public MultiLevelBowl segregateByColor() {
        return multiLevelBowl;
    }
}