package day16;

public class Product<T,M> {
	private T kind;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getMode() {
		return mode;
	}
	public void setMode(M mode) {
		this.mode = mode;
	}
	private M mode;
	
}
