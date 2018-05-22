//Authored by Morema Mafantiri and Amani Naburi

import java.util.ArrayList;
import java.util.List;

public class LegoBag {

    private List bag = new ArrayList();
    private boolean open = false;
    private boolean full = false;
    private final int CAPACITY =100;


    public void add(Brick b){
        if (open & !full){
        this.bag.add(b);
            if (bag.size()>=CAPACITY){
                this.full=true;
            }
        }
        else{
            System.out.println("The bag is full!");
        }

    }


    public void remove(Brick b) {
        if (bag.size()>0) {
            if (open) {
                this.bag.remove(b);
                if (full) {
                    this.full = false;
                }
            }
        }
        else{
            System.out.println("The bag is empty!");
        }
    }


    public void empty(){
        if (open){
            this.bag.clear();
            if (full){
                this.full=false;
            }
        }
        System.out.println("The bag is empty!");
    }

    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }
}
