package no.hvl.data102.filmarkiv.impl;

public class LinearNode<T> {
	public T data;
	public LinearNode<T> neste;

	public LinearNode(T data) {
		this.data = data;
		this.neste = null;
	}

	public T getData() {
		return data;
	}

	public LinearNode<T> getNext() {
		return neste;
	}

	public void setNext(LinearNode<T> next) {
		this.neste = next;
	}
}
