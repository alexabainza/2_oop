package activity10_abainza;

public class DecoratedChristmasTree extends ChristmasTree{
	private String decorations;
	
	public DecoratedChristmasTree(String greeting, String treeInfo, String decorations) {
		super(greeting, treeInfo);
		this.decorations = decorations;
	}
	
	public void describeDecorations() {
		displayTreeInfo();
		System.out.println("Decorations on tree: " + decorations);
	}
}
