package lesson8.homeWork;

import lesson8.homeWork.barrier.Treadmill;
import lesson8.homeWork.barrier.Wall;
import lesson8.homeWork.interfaces.Barriers;
import lesson8.homeWork.interfaces.Member;
import lesson8.homeWork.member.Cat;
import lesson8.homeWork.member.Human;
import lesson8.homeWork.member.Robot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(300, 3);
        Human human = new Human(1000, 1.5);
        Robot robot = new Robot(5000, 0.5);

        ArrayList<Member> members = new ArrayList<>();
        members.add(cat);
        members.add(human);
        members.add(robot);


        Wall wall = new Wall(1.5);
        Treadmill treadmill = new Treadmill(300);

        ArrayList<Barriers> barriers = new ArrayList<>();
        barriers.add(wall);
        barriers.add(treadmill);

        for (Member member : members) {
            boolean isContinue = true;
            for (Barriers barrier : barriers) {
                if (barrier instanceof Wall){
                    Wall wallBarrier = (Wall) barrier;
                    isContinue = member.jump(wallBarrier.getHeight());
                } else if (barrier instanceof Treadmill){
                    Treadmill treadmillBarrier = (Treadmill) barrier;
                    isContinue = member.run(treadmillBarrier.getLength());
                }
                if (!isContinue){
                    break;
                }
            }
            if (isContinue) {
                System.out.println("Участник завершил полосу препятствий");
            } else {
                System.out.println("Участник сошёл с дистанции");
            }
        }
    }
}
