import java.util.Scanner;
public class DriverCls extends Line {

	public static void main(String[] args) {
System.out.println("welcome to metro station HYD");
System.out.println("Select Line");
System.out.println("1 Green Line");
System.out.println("2 Blue Line");
System.out.println("3 Red Line");
Line L=new Line();


Scanner s=new Scanner(System.in);

int x;
x=s.nextInt();

switch(x) {
case 1:
L.GreenLine();
break;
case 2:
	L.BlueLine();
	break;
case 3:
	L.RedLine();
	break;
	
}
}
}
