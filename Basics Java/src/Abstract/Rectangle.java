package Abstract;

public class Rectangle extends Shape {
		private int length;
		private int width;
		public Rectangle()
		{
}
		public Rectangle(int length, int width) {
			super();
			this.length = length;
			this.width = width;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public double getArea() {
			
			return length*width;
		}
		@Override
		public double getPerimeter() {
			
			return 2*length+width;
		}
		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
		}
		
}