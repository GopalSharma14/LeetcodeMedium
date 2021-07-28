/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        
        HashMap<Node,Node> nodeMap = new HashMap<>();
        Node currentNode = head;
        while(currentNode!=null){
            nodeMap.put(currentNode, new Node (currentNode.val));
            currentNode= currentNode.next;
        }
        currentNode = head;
        while(currentNode!=null){
            nodeMap.get(currentNode).next = nodeMap.get(currentNode.next);
            nodeMap.get(currentNode).random = nodeMap.get(currentNode.random);
            currentNode = currentNode.next;
        }
        return nodeMap.get(head);
        
    }
}