public class Node {
    String name;
    int grade;
    String assignment;
    Node left;
    Node right;


    public Node(String name, int grade, String assignment)
    {
        this.name=name;
        this.grade=grade;
        this.assignment=assignment;
        right=  null;
        left=null;
    }

}
