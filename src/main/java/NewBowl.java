import java.util.ArrayList;

public class NewBowl {
    private OldBowl oldBowl;
    private ArrayList<Fruits> basket1 = new ArrayList<>();
    private ArrayList<Fruits> basket2 = new ArrayList<>();
    private ArrayList<Fruits> basket3 = new ArrayList<>();

    public void segerationBasedOnWeight(){
        ArrayList<Fruits> oldBowlFruits = new ArrayList<>(oldBowl.getFruits());
        for(Fruits fruit: oldBowlFruits){
            if(fruit.getWeight() >= 1 && fruit.getWeight()<=3){
                basket1.add(fruit);
            }
            if(fruit.getWeight() > 3 && fruit.getWeight()<=5){
                basket2.add(fruit);
            }
            if(fruit.getWeight() >5){
                basket3.add(fruit);
            }
        }
    }
    public OldBowl getOldBowl() {
        return oldBowl;
    }

    public void setOldBowl(OldBowl oldBowl) {
        this.oldBowl = oldBowl;
    }

    public ArrayList<Fruits> getBasket1() {
        return basket1;
    }

    public void setBasket1(ArrayList<Fruits> basket1) {
        this.basket1 = basket1;
    }

    public ArrayList<Fruits> getBasket2() {
        return basket2;
    }

    public void setBasket2(ArrayList<Fruits> basket2) {
        this.basket2 = basket2;
    }

    public ArrayList<Fruits> getBasket3() {
        return basket3;
    }

    public void setBasket3(ArrayList<Fruits> basket3) {
        this.basket3 = basket3;
    }
}

