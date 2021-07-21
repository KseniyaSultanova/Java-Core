package HomeWork1;

public class Human implements JumpAndRun {
    private static int maxRun = 50;
    private static int maxJump = 2;
    private boolean isReady = true;

    public void run(int length) {
        if (isReady) {
            if (maxRun >= length) {
                System.out.println("Человек бежит "  + length + " метров");
            } else {
                System.out.println("Человек не пробежал! Человек вылетел из состязаний");
                isReady = false;
            }
        }
    }

    public void jump(int height) {
        if (isReady) {
            if (maxJump >= height) {
                System.out.println("Человек перепрыгнул препятствие");
            } else{
                System.out.println("Человек не умеет прыгать через стену. Человек вылетел из состязаний");
                isReady = false;
            }
        }
    }
}
