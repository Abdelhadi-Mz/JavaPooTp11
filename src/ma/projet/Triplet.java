package ma.projet;

class Triplet<T>{
	private T premier;
	private T second;
	private T troiseme;
	public Triplet(T premier, T second, T troiseme) {
		this.premier = premier;
		this.second = second;
		this.troiseme = troiseme;
	}
	public T getPremier() {
		return premier;
	}

	public T getSecond() {
		return second;
	}
	public T getTroiseme() {
		return troiseme;
	}

	public void afficher() {
		System.out.println(this.premier+" "+this.second+" "+this.troiseme);
	}
}