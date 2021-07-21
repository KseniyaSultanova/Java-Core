package HomeWork1;

public class Cat implements JumpAndRun {
    private static int maxRun = 300;
    private static int maxJump = 4;
    private boolean isReady = true;

    public void run(int length) {
        if (isReady) {
            if (maxRun >= length) {
                System.out.println("Кот бежит " + length + " метров");
            } else {
                System.out.println("Кот не пробежал! Кот вылетел из состязаний");
                isReady = false;
            }
        }
    }

    public void jump(int height) {
        if (isReady) {
            if (maxJump >= height) {
                System.out.println("Кот перепрыгнул препятствие " + height + " метров");
            } else{
                System.out.println("Кот не умеет прыгать через стену. Кот вылетел из состязаний");
                isReady = false;
            }
        }
    }
}
