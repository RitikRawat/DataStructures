 class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int value){
			data=value;
			next=null;
		}
	}
public void Insertion(int value){
	Node n =new Node(value);
	n.next=head;
	head=n;
}
public void AtLast(int value){
	Node n = new Node(value);
	if(head==null)
	{
		head=new Node(value);
		return ;
	}
	else
	n.next=null;
	Node k=head;
	while(k.next!=null)
	{
		k=k.next;
	}
	k.next=n;
}
