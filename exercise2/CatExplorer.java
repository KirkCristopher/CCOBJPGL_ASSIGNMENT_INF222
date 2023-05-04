
public class CatExplorer implements Explorer{
    
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Meow Meow (Gone to Mercury)");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Meow Meow (Gone to Mars)");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Meow Meow (Gone to Saturn)");
    }

    @Override
    public void visit(NorthBlue northBlue) {
        System.out.println("Meow Meow (Gone to NorthBlue)");
    }

    @Override
    public void visit(NAVI navi) {
        System.out.println("Meow Meow (Gone to NAVI)");
    }
}