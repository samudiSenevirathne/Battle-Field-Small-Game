import javafx.scene.control.CheckBox;

import java.util.ArrayList;

public class PlayerAWeponStore {

   // ArrayList<String>arrayList=new ArrayList<>();
    static ArrayList<Integer>arrayList=new ArrayList<>();

    PlayerAWeponStore(){

    }

    PlayerAWeponStore(ArrayList<Integer>arrayList) {

        this.arrayList=arrayList;
    }


    public int scoreCalculate () {
        int sum = 0;
      /*  for(int i=0;i<arrayList.size();i++) {
            if (arrayList.get(i).equals("Tank")) {
                Tank tank = new Tank();
                tank.shoot();
                sum += tank.getScore();
            }else if (arrayList.get(i).equals("Bomb")) {
                Bomb bomb = new Bomb();
                bomb.shoot();
                sum += bomb.getScore();
            }else if (arrayList.get(i).equals("MultiBarrel")) {
                MultiBarrel multiBarrel = new MultiBarrel();
                multiBarrel.shoot();
                sum += multiBarrel.getScore();
            }else if (arrayList.get(i).equals("T-56")) {
                T56 t56 = new T56();
                t56.shoot();
                sum += t56.getScore();
            }else if (arrayList.get(i).equals("Pistol")) {
                Pistol pistol = new Pistol();
                pistol.shoot();
                sum += pistol.getScore();
            }
        }
        return sum;
    }*/
        for (int i = 0; i < arrayList.size(); i++) {
            sum+= arrayList.get(i);
        }
        return sum;
    }

}

