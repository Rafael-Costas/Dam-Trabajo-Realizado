
public class Quicksort {
static void qsort(char item[]) {
	qs(item, 0, item.length-1);
		
	
}
private static void qs(char item[], int left, int right) {
	int i,j;
	char x,y;
	i=left; j=right;
	x= item[(left+right)/2];
	do {
		while((item[i]<x)&&(i<right))i++;
	
	while((x<item[j]) && (j>left))j--;
	if(i<=j) {
		y=item[i];
		item[i]= item[j];
		item[j]=y;
		i++; j--;
	}
	}while(i<=j);
	if(left<j)qs(item, left, j);
	if(i<right)qs(item,i,right);
	}
public static void main(String[] args) {
	char a[]= {'d','x','a','r','p','j','i'};
	int i;
	System.out.println("Original array");
	for(i=0; i<a.length; i++)
		System.out.print(a[i]);
	System.out.println();
	qsort(a);
	System.out.println("Sorted array ");
	for(i=0; i<a.length;i ++)
		System.out.print(a[i]);
			}
}
