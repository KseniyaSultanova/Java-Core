package HomeWork1;

public class Wall implements Barrier{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void start(JumpAndRun jumpAndRun) {
        jumpAndRun.jump(height);
    }
}
