package HomeWork1;

public class Robot implements JumpAndRun {
    private static int maxRun = 20;
    private static int maxJump = 0;
    private boolean isReady = true;

    public void run(int length) {
        if (isReady) {
            if (maxRun >= length) {
                System.out.println("Робот бежит "  + length + " метров");
            } else {
                System.out.println("Робот не пробежал! Робот вылетел из состязаний");
                isReady = false;
            }
        }
    }

    public void jump(int height) {
        if (isReady) {
            if (maxJump >= height) {
                System.out.println("Робот перепрыгнул препятствие");
            } else{
                System.out.println("Робот не умеет прыгать через стену. Робот вылетел из состязаний");
                isReady = false;
            }
        }
    }
}
