package programElements;

public class Cosine extends Operator {

	private static final long serialVersionUID = 7L;

	public Cosine() {
		super(1);
	}

	public double performOperation(double... arguments) {
		return Math.cos(arguments[0]);
	}

	public String toString() {
		return "cos";
	}
}
