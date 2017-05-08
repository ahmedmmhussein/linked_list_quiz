package quiz.main;

import linkedlist.node.Node;
import linkedlist.operations.LinkedListOperations;
import linkedlist.operations.LinkedListOperationsInterface;

public class MainClass {
	public static void main(String[] args) {
		LinkedListOperationsInterface listOperations = new LinkedListOperations();
		Node list = new Node(null, 11);
		list = listOperations.append(list, 5);
		list = listOperations.append(list, 1);
		list = listOperations.append(list, 4);
		list = listOperations.append(list, 9);
		System.out.println(listOperations.printList(list));
		list = listOperations.removeTail(list);
		System.out.println(listOperations.printList(list));
		list = listOperations.removeGreater(list, 4);
		System.out.println(listOperations.printList(list));
	}
}
