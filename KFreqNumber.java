import java.util.*;
class KFreqNumber{
	static int array[]=new int[100];
	static int a=0;
	static int validate(){
		int counter=1;
		for(int i=1;i<a;i++){
			int j=0;
			for(j=0;j<i;j++){
				if(array[i]==array[j]){
					break;
				}
			}
			if(i==j){
				counter++;
			}
		}
		return counter;
	}
	static void analysis(int k){
		int output[]=new int[k];
		int input=0;
		for(int i=0;i<k;i++){
			int flag=0;
			for(int j=0;j<a;j++){
				int count=0;
				for(int l=0;l<a;l++){
					if(array[j]==array[l]){
						count++;
					}
				}
				if(count>flag){
					input=array[j];
					flag=count;
				}
				else if(count==flag){
					if(input<array[j]){
						input=array[j];
					}
				}
			}
			output[i]=input;
			int f=0;
			for(int o=0;o<a;o++){
				if(array[o]!=input){
					array[f++]=array[o];
				}
			}
			a=f;
		}
		for(int y=0;y<k;y++){
			System.out.print(output[y]+" ");
		}
	}
	public static void main(String[] args) {
		int x=0;
		int b=0;
		int check=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter the number of elements");
			do{
				while(!sc.hasNextInt()){
					String input=sc.next();
					System.out.printf("\"%s\" is not a positive number.\n", input);
				}
				KFreqNumber.a=sc.nextInt();
			}while(KFreqNumber.a<=0);
			System.out.println("Enter values");
			for(int i=0;i<a;i++){
				do{
					while(!sc.hasNextInt()){
						String input=sc.next();
						System.out.printf("\"%s\" is not a positive number.\n", input);
					}
					KFreqNumber.array[i]=sc.nextInt();
				}while(KFreqNumber.array[i]==0.1);
			}
			System.out.println("Enter value for k");
			do{
				while(!sc.hasNextInt()){
					String input=sc.next();
					System.out.printf("\"%s\" is not a positive number.\n", input);
				}
				b=sc.nextInt();
			}while(b<0);
			check=validate();
			if(b>check){
				System.out.println("Only "+check+" distinct values are available");
			}
			else{
				analysis(b);
			}
			System.out.println("\nDo you want to play again:\n1.Yes\n2.No");
			x=sc.nextInt();
		}while(x!=2);
		System.out.println("Thank You");
	}
}