package q4;

/** to implement a thread safe Singleton Pattern in Java using Enum */
enum JavaPosition {

	BackEnd(1), FrontEnd(2), FullStack(3);

	private int code;

	private JavaPosition(int _nCode) {
		

		this.code = _nCode;

	}

	@Override

	public String toString() {

		return String.valueOf(this.code);

	}

}

public class PositionTest {
	public static void main(String[] args) {
		 JavaPosition jp1 =  JavaPosition.BackEnd;
		 JavaPosition jp2 =  JavaPosition.BackEnd;

		System.out.println(jp1 == jp2); // return true

	}
}