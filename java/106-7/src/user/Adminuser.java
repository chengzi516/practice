package user;

import operation.operation;
import operation.exitsystem;
import operation.borrowbook;
import operation.returnbook;
import operation.addbook;
import operation.deletebook;
import operation.findbook;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 13378343877
 * Date: 2023-02-03
 * Time: 21:27
 */
public class Adminuser extends User {

    public Adminuser(String name) {
        super(name);
        this.op=new operation[]{
                new exitsystem(),
                new borrowbook(),
                new returnbook(),
                new findbook(),
                new addbook(),
                new deletebook()
        };
    }

    public int menu(){
        System.out.println("??ӭ?㣡"+name);
        System.out.println("0.?˳?ϵͳ");
        System.out.println("1.????ͼ??");
        System.out.println("2.?黹ͼ??");
        System.out.println("3.????ͼ??");
        System.out.println("4.????ͼ??");
        System.out.println("5.ɾ??ͼ??");
        Scanner scanner=new Scanner(System.in);
        int choice =scanner.nextInt();
        return choice;

    }
}
