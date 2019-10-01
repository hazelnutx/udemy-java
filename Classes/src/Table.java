package Classes.src;

public class Table {
	private int height;
	private int width;
	private int depth;
	private Things things;
	
	public Table(int height, int width, int depth, Things things) {
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.things = things;
	}

	
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}
	
}
