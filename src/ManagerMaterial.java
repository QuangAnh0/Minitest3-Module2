import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerMaterial {
    public static void main(String[] args) {
        LocalDate time;
        time =LocalDate.from(LocalDate.now());
        Meat meat1=new Meat("1","thit1",time,100,10);
        Meat meat2=new Meat("2","thit2",time,110,14);
        Meat meat3=new Meat("3","thit3",time,120,13);
        Meat meat4=new Meat("4","thit4",time,100,11);
        Meat meat5=new Meat("5","thit5",time,105,10);
        CrispyFlour flour1=new CrispyFlour("6","bot1",time,37,11);
        CrispyFlour flour2=new CrispyFlour("7","bot2",time,32,12);
        CrispyFlour flour3=new CrispyFlour("8","bot3",time,20,15);
        CrispyFlour flour4=new CrispyFlour("9","bot4",time,35,10);
        CrispyFlour flour5=new CrispyFlour("10","bot5",time,30,20);
        ArrayList<Integer> flour=new ArrayList<>();

        System.out.println( addFlour());
    }
    public static CrispyFlour addFlour(){
        CrispyFlour newFlour=new CrispyFlour();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String id= scanner.nextLine();
        newFlour.setId(id);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        String name=scanner1.nextLine();
        newFlour.setName(name);
//        System.out.println("Nhâp hạn sử dụng sản phẩm");
//        LocalDate date= LocalDate.parse(scanner.nextLine());
//        newFlour.setManafaaturingDate(date);
        System.out.println("Nhập giá sản phẩm");
        int cost=scanner1.nextInt();
        newFlour.setCost(cost);
        return  newFlour;
    }

}
