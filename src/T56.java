import java.util.Random;

public class T56 implements Wepon{

    private int shoot;

    @Override
    public void shoot() {
        Random r=new Random();
         shoot=r.nextInt(10)+1;
    }

    @Override
    public int getScore() {
        return shoot;
    }
}
