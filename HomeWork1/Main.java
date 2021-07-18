package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Human human = new Human();
        Cat cat = new Cat();

//        robot.run();
//        human.run();
//        cat.run();
//
//        robot.jump();
//        human.jump();
//        cat.jump();

        System.out.println("___________________");

        JumpAndRun[] entity = {
                new Robot(), new Cat(), new Human()
        };
        Barrier[] barriers = {
                new Wall(3), new Treadmill(300)
        };

        for (Barrier barrier : barriers) {
            for (JumpAndRun jumpAndRun : entity) {
                barrier.start(jumpAndRun);
            }
        }
    }
}
