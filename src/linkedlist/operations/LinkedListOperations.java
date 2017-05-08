package linkedlist.operations;

import linkedlist.node.Node;

public class LinkedListOperations implements LinkedListOperationsInterface {

	@Override
	public Node append(Node header, int data) {
		Node runner = header;
		if (runner == null) {
			return new Node(null, data);
		}
		while ((runner.getNext() != null)) {
			runner = runner.getNext();
		}
		runner.setNext(new Node(null, data));
		return header;
	}

	@Override
	public Node removeTail(Node header) {
		Node runner = header;
		if (runner.getNext() == null) {
			return null;
		}
		while ((runner.getNext().getNext() != null)) {
			runner = runner.getNext();
		}
		runner.setNext(null);
		return header;
	}

	@Override
	public Node removeGreater(Node header, int target) {
		Node runner = header;
		if (runner == null) {
			return null;
		}

		while ((runner.getNext() != null)) {
			if (runner.getData() > target) {
				runner.setData(runner.getNext().getData());
				runner.setNext(runner.getNext().getNext());
				continue;
			}
			runner = runner.getNext();
		}

		if (runner.getData() > target) {
			header = removeTail(header);
		}
		return header;

	}

	@Override
	public String printList(Node header) {
		String result = "";
		Node current = header;
		if (current == null) {
			return "List is empty";
		}
		while (current.getNext() != null) {
			result += current.getData() + ", ";
			current = current.getNext();
		}
		result += current.getData();
		return "List: " + result;

	}

}
