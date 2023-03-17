import java.util.Scanner;
public class Employee_details {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Details obj[]=new Details[3];
        for(int i=0;i<3;i++)
        {   obj[i]=new Details();
            obj[i].name=scan.next();
            obj[i].year=scan.nextInt();
            obj[i].address=scan.next();
            obj[i].salary=scan.nextInt();
        }

        System.out.println("Name\t\tYear\t\tAddress\t\t\t\tSalary\t\t");
        for(int i=0;i<3;i++)
        {
            System.out.print(obj[i].name+"\t\t"+obj[i].year+"\t\t"+obj[i].address+"\t\t"+obj[i].salary);
            System.out.println();
        }
    }

}
