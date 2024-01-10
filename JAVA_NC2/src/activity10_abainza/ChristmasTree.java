package activity10_abainza;

public class ChristmasTree extends ChristmasEntity{
	private String treeInfo;
	
	public ChristmasTree(String greeting, String treeInfo) {
		super(greeting);
		this.treeInfo = treeInfo;
	}
	
	public void displayTreeInfo() {
		displayGreeting();
		System.out.println("Christmas tree info: " + treeInfo);
	}

}
