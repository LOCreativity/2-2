class Shape {
	
	private int firstInt;
	private int secondInt;
	private int thirdInt;
	private int result;
	
	public Shape(int firstInt) {
		this.firstInt = firstInt;
	}
	public Shape(int firstInt, int secondInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
	}
	public Shape(int firstInt, int secondInt, int thirdInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.thirdInt = thirdInt;
	}
	public int getArea(int count) {

		if(count == 0) {
			result = firstInt;
		}
		else if(count == 1) {
			result = firstInt * secondInt;
		}
		else if(count == 2) {
			result = firstInt*secondInt*thirdInt;
		}
		return result;
	}
}
