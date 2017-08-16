package programming.problems;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node n = new Node().setNodeName("D");
		;
		Node n2 = new Node().setLink(n).setNodeName("C");
		Node n3 = new Node().setLink(n2).setNodeName("B");
		Node n4 = new Node().setLink(n3).setNodeName("A");

		traverse(n4);

		System.out.println("reverse");
		Node reverse = reverseList(n4);

		traverse(reverse);
	}

	public static void traverse(Node input) {
		while (input != null) {
			System.out.println(input.getNodeName());
			input = input.getLink();

		}

	}

	public static Node reverseList(Node input) {

		Node curNode = input;

		Node nextNode = curNode.getLink();
		Node tempNode = null, previousNode = null;

		while (nextNode != null) {

			tempNode = nextNode.getLink();
			nextNode.link = curNode;
			curNode.link = previousNode;

			previousNode = curNode;
			curNode = nextNode;
			nextNode = tempNode;
		}

		return curNode;
	}

}

class Node {
	String nodeName;
	Node link;

	public Node() {

	}

	public String getNodeName() {
		return nodeName;
	}

	public Node setNodeName(String nodeName) {
		this.nodeName = nodeName;
		return this;
	}

	public Node getLink() {
		return link;
	}

	public Node setLink(Node link) {
		this.link = link;
		return this;
	}

}
