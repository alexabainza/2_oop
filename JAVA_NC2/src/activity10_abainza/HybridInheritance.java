package activity10_abainza;

public class HybridInheritance extends ChristmasEntity implements Decoration, Illumination{
	private String treeInfo;
	
	public HybridInheritance(String greeting, String treeInfo) {
		super(greeting);
		this.treeInfo = treeInfo;
	}

	public void displayTreeInfo() {
		displayGreeting();
		System.out.println("Christmas tree info: " + treeInfo);
	}
	
	   @Override
	    public void decorate() {
	        System.out.println("Tree has been decorated (from hybrid inheritance)!");
	    }

	    @Override
	    public void illuminate() {
	        System.out.println("Tree has been illuminated (from hybrid inheritance)");
	    }
}
