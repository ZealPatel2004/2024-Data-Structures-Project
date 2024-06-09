import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many students are in the class: ");
        int ans=scanner.nextInt();

        binaryTree tree=new binaryTree();
        for(int i=0;i<ans;i++)
        {
            System.out.println("Student Name: ");
            String name=scanner.next();

            System.out.println("Student Grade: ");
            int grade=scanner.nextInt();

            System.out.println("Student Assignment: ");
            String assignment=scanner.next();

            tree.insertMet(name,grade,assignment);

            System.out.println("Here are student names, grades, assingments: ");
            Main.printStudentInfo(tree.root);
        }
    }
}
