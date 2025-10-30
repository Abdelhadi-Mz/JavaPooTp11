package ma.projet;

public class TestTriplet {
	public static void main(String[] args) {
		Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
		tInt.afficher();
		Triplet<String> tStr = new Triplet<>("A", "B", "C");
		tStr.afficher();
		System.out.println("Second élément de tInt : " + tInt.getSecond());
	}
}
