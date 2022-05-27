class Shape {
	private int length;
	private int firstInt;
	private int secondInt;
	private int thirdInt;
	private int result;
	
	public Shape(int firstInt) {
		this.firstInt = firstInt;
		this.length = 1;
	}
	public Shape(int firstInt, int secondInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.length = 2;
	}
	public Shape(int firstInt, int secondInt, int thirdInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.thirdInt = thirdInt;
		this.length = 3;
	}
	public void getArea() {

		if(this.length == 1) {
			this.result = this.firstInt;
		}
		else if(this.length == 2) {
			this.result = this.firstInt * this.secondInt;
		}
		else if(this.length == 3) {
			this.result = this.firstInt* this.secondInt* this.thirdInt;
		}
		return this.result;
	}
}
