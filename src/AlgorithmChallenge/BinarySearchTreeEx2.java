package AlgorithmChallenge;

public class BinarySearchTreeEx2 {

    Node head = null; // root Node

    public class Node {

        Node left;
        Node right;
        int value;

        public Node( int data ) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    // Ex1: 이진 탐색 트리에 데이터 삽입하기
    public boolean insertNode( int data ) {
        // CASE1: Node 가 하나도 없을 때
        if ( this.head == null )
            this.head = new Node( data );
            // CASE2: Node 가 하나 이상 있을 때
        else {
            Node findNode = this.head;
            while ( true ) {
                // CASE2-1: 현재 Node 의 왼쪽에 새로운 Node 가 들어가야 할 때
                if ( findNode.value > data ) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node( data );
                        break;
                    }
                    // CASE2-2: 현재 Node 의 오른쪽에 새로운 Node 가 들어가야 할 때
                } else {
                    if ( findNode.right != null ) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node( data );
                        break;
                    }
                }

            }
        }
        return true;
    }

    public Node searchNode( int data ) {
        // CASE1: Node 가 하나도 없을 때
        if( this.head == null )
            return null;
        // CASE2: Node 가 하나 이상 있을 때
        else{
            Node findNode = this.head;
            while( findNode != null ) {
                if (findNode.value == data)
                    return findNode;
                else if(findNode.value > data)
                    findNode = findNode.left;
                else
                    findNode = findNode.right;
            }
            return null;
        }
    }

    public static void main (String[] args) {
        BinarySearchTreeEx2 myTree = new BinarySearchTreeEx2();
        myTree.insertNode( 10 );
        myTree.insertNode( 15 );
        myTree.insertNode( 13 );
        System.out.println(myTree.searchNode( 14 )); // null
        System.out.println(myTree.searchNode( 13 )); // AlgorithmChallenge.BinarySearchTreeEx2$Node@27f674d
        System.out.println(myTree.searchNode( 13 ).value); // 13
    }
}



