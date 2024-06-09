import org.w3c.dom.Node;

public class binaryTree {
    Node root;

    binaryTree()
    {
        root=null;
    }
    public void insertMet(String name, int grade, String assignment)
    {
        root=insertHelp(root,name,grade,assignment);

    }
    Node insertHelp(Node root, String name, int grade, String assignment)
    {
        if(root==null)
        {
            root=new Node(name,grade,assignment);
            return root;
        }
        if(name.equals(root.name))
        {
            root.assignment=assignment;
            root.grade=grade;
        }
        else if(name.compareTo(root.name)<0)
        {
            root.left=insertHelp(root.left,name,grade,assignment);
        }
        else{
            root.right=insertHelp(root.right,name,grade,assignment);
        }
        return root;
    }
}
