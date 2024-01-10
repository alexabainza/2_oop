package activity10_abainza;

public class Main {

	public static void main(String[] args) {
		
        ChristmasTree tree = new ChristmasTree("Merry Christmas!", "Green and tall");
        tree.displayTreeInfo();		
		
		DecoratedChristmasTree decoTree = new DecoratedChristmasTree("Merry Christmas!", "Has a lot of lights", "Yellow star");
		decoTree.describeDecorations();
		
		HybridInheritance hybridTree = new HybridInheritance("Merry Christmas!", "Filled with colorful lights");
		hybridTree.displayTreeInfo();
		hybridTree.decorate();
		hybridTree.illuminate();
	}

}
