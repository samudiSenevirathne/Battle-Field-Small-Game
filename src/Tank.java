import java.util.Random;

public class Tank implements Wepon{
    Random r=new Random();
    private int shoot;

    @Override
    public void shoot() {
        shoot=r.nextInt(10)+1;
    }

    @Override
    public int getScore() {
        return shoot;
    }
}
