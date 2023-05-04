
public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet northblue = new NorthBlue();
        Planet navi = new NAVI();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer cat = new CatExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        northblue.accept(astronaut);
        navi.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        northblue.accept(rover);
        navi.accept(rover);

        mars.accept(cat);
        saturn.accept(cat);
        mercury.accept(cat);
        northblue.accept(cat);
        navi.accept(cat);


    }
}