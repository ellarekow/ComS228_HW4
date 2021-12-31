package hw4;
/**
 * 
 * @author Ella Rekow
 *
 */
public class MsgTree {
	public char payloadChar;
	public MsgTree left; 
	public MsgTree right; 
	
	private MsgTree root;
	private static int charIdx = 0;
	private String tree; 
	
	/**
	 * 
	 * @param encodedTree Tree
	 */
	public MsgTree(String encodedTree) {
		if(charIdx >= encodedTree.length()) { 
			payloadChar = 0;
			return;
		}
		
		payloadChar = encodedTree.charAt(charIdx);
		
		charIdx++;
		
		if(payloadChar == '^') {
			left = new MsgTree(encodedTree);
			right = new MsgTree(encodedTree);
		}
			
		printCodes(root, encodedTree);
	}
	
	/**
	 * 
	 * @param node furtherest node
	 */
	public MsgTree(char node) {
		this.payloadChar = node;
		this.left = null; 
		this.right = null;
	}
	
	public static void printCodes(MsgTree root, String code) {
		
	}
	
	
}
