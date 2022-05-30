class Shape {
	
	private int firstInt;
	private int secondInt;
	private int thirdInt;
	
	
	public Shape(int firstInt) {
		this.firstInt = firstInt;
		System.out.println("직선의 길이는 : " + this.firstInt);
	}
	public Shape(int firstInt, int secondInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		System.out.println("사각형의 넓이는 : " + this.firstInt * this.secondInt);
	}
	public Shape(int firstInt, int secondInt, int thirdInt) {
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.thirdInt = thirdInt;
		System.out.println("직육면체의 부피는 : " + this.firstInt * this.secondInt * this.thirdInt);
	}
}
