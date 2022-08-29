package Prachimam;

public class BubbleShortptac {
	static void bubbleSort(int[]abc){
		int a=abc.length;
		int temp=0;
		for(int i=0;i<a;i++){
			for(int j=1;j<(a-1);j++){
				if(abc[j-1]>abc[j])
					temp=abc[j-1];
				abc[j-1]=abc[j];
				abc[j]=temp;
			}
		}
	}
public static void main(String[]args){
	int abc[]={3,60,34,35,67};
	System.out.println("Array before bubble sort");
	for(int i=0;i<abc.length;i++){
		System.out.print(abc[i]+"");
		}
	System.out.println();
}

	bubbleSort(abc){
	System.out.println("array after applying bubble");
	for(int i=0;i<abc.length;i++){
		System.out.println(abc[ i]+"");
	}
}