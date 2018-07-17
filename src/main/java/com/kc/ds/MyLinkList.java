package com.kc.ds;

public class MyLinkList<T> {
	Node head;
	int size;

	public MyLinkList() {
		head = null;
		size = 0;
	}

	 class Node<T> {
		T data;
		Node next;

		Node(T value) {
			this.data = value;
		}

		public T getValue() {
			return data;
		}

		public void setValue(T value) {
			this.data = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [value=" + data + ", next=" + next + "]";
		}

	}
	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		return "MyLinkList [head=" + head + "]";
	}

	public void insertNode(T value) {
		Node temp = new Node(value);
		size++;
		if (head == null) {
			head = temp;
		} else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = temp;
		}

	}

	public void display() {
		Node current = head;
		String output = "[" + head.getValue() + ",";
		while (current.next != null) {
			output += current.next.getValue() + ",";
			current = current.next;
		}
		System.out.print(output.substring(0, output.length() - 1) + "]");
	}

}
