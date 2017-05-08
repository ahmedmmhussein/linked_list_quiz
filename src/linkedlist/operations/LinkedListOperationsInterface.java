package linkedlist.operations;

import linkedlist.node.Node;

public interface LinkedListOperationsInterface {
	Node append(Node header, int data);

	Node removeTail(Node header);

	Node removeGreater(Node header, int target);

	String printList(Node header);
}
