public class MultiLevelBowl {
    private List<Bowl> bowls;

    public MultiLevelBowl() {
        this(3);
    }

    public MultiLevelBowl(int numOfLevels) {
        bowls= new ArrayList(numOfLevels);
        bowls.add(new Bowl());
    }


    
}