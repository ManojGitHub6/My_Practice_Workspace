package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		
		//object array is of dyanmic we can store mulitiple datatype values but we need to  mention size
		//syntax:- Object name[]=new Object[size];
		
		Object x[]=new Object[3];
		x[0]="Manoj";
		x[1]=21.21;
		x[2]=true;
		
		for(int i=0;i<3;i++) {
			System.out.println(x[i]);
		}
		
		
	}
}
