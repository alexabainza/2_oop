package activity10_abainza;

public class TreeWithInterface extends ChristmasEntity implements Decoration, Illumination{	
	public TreeWithInterface(String greeting) {
        super(greeting);
    }
    
    @Override
    public void decorate() {
    	System.out.println("Tree has been decorated (from tree with interface)!");
    }
    
    @Override
    public void illuminate() {
    	System.out.println("Tree has been illuminated (from tree with interface)!");
    }
    


}
