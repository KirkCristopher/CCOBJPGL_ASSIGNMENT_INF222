
public class HumanExplorer implements Explorer{
    
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    @Override
    public void visit(NorthBlue northblue) {
        System.out.println("Deploying tools specific to NorthBlue... exploring life");
    }

    @Override
    public void visit(NAVI navi) {
        System.out.println("Deploying tools specific to NAVI... exploring life");
    }
}