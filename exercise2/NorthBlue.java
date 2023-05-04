
public class NorthBlue implements Planet{
    
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}