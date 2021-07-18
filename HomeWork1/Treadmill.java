package HomeWork1;

public class Treadmill implements Barrier{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void start(JumpAndRun jumpAndRun) {
        jumpAndRun.run(length);
    }
}
