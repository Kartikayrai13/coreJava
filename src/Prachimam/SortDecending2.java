package Prachimam;

public class SortDecending2 {
	public static void main(String[] args) {
		int[]abc={34,545,6,5,42,44,878};
		System.out.println("Decending order=");
		for(int i=0;i<abc.length;i++){
			for(int j=i+1;j<abc.length;j++){
				int a=0;
				if(abc[i]<abc[j]){
					a=abc[i];
					
					abc[i]=abc[j];
					abc[j]=a;
					}
				}
		System.out.print(abc[i]+" ");
		}
		//for(int i=0;i<=abc.length-1;i++){
			//System.out.print(abc[i]+" ");
		}
	}
//}
