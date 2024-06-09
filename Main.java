import org.w3c.dom.Node;

public class Main {
    public static void printStudentInfo(Node root){
        if(root!=null)
        {
            printStudentInfo(root.left);
            System.out.println(root.name+" has the following grade: "+root.grade+" and here is his/her assignment "+root.assignment);
            printStudentInfo(root.right);
        }









    }
}