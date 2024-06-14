public class Btree {
    Node root;

    public Btree()
    {
        root = null;
    }
    Node newNode(int data)
    {
        root = new Node(data);
        return root;
    }
}
