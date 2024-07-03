package Ejercicios;

import java.util.Arrays;

public class Ordenamientos {

	private static int[] listo;
	final static int POS = 3000;
	final static int Limites = 100;

	
	
	
	
	
	
	
	
	
	
	
	
	//------------------------------------------------
	public static void burbuja(int[] Arr) {

		int aux;
		for (int i = Arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (Arr[j] > Arr[j + 1]) {
					aux = Arr[j + 1];
					Arr[j + 1] = Arr[j];
					Arr[j] = aux;
				}
			}
		}
	}
	public static void BurbujaDescendente(int[] param) {  
		int in, out;  
		int temp = 0;  
		for (out = 0; out < param.length; out++) {  
		for (in = param.length - 1; in > out; in--) {  
		if (param[in] > param[in - 1]) {  
		temp = param[in];  
		param[in] = param[in - 1];  
		param[in - 1] = temp;  
		}  
		}  
		}  
		
		}  

//------------------------------------------------------------------------------

	public static void qsort(int item[]) {
		qs(item, 0, item.length - 1);
	}

	private static void qs(int[] items, int left, int right) {
		int i, j;
		int x, y;

		i = left;
		j = right;
		x = items[(left + right) / 2];
		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}

	public static void descendingqsort(int item[]) {
		sorting(item, 0, item.length-1);
	}
	
	
	public static int partition(int arr[], int left, int right){
	    int pivot = arr[left];
	    int i = left;
	    for(int j = left + 1; j <= right; j++){
	        if (arr[j] > pivot){
	            i = i + 1;
	            int temp = arr[i];
	            arr[i]= arr[j];
	            arr[j]= temp;
	        }
	    }

	    int temp = arr[i];
	    arr[i] = arr[left];
	    arr[left] = temp;

	    return i;

	}

	public static  void sorting(int arr[], int left, int right){
	    if(left < right)
	    {
	        int q = partition(arr, left, right);
	        sorting(arr, left, q);
	        sorting(arr, q + 1, right);
	    }
	}
	
	//----------------------------------------------------
	public static void insertionsort(int[] arr) {
		{
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i - 1;

				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}
	}
	public static void inverted_insertion_sort(int arr[]) {
		int size = arr.length;
		for (int step = 1; step < size; step++) {
		int key = arr[step];
		int j = step - 1;
		while (j >= 0 && key > arr[j]) {
		// For ascending order, change key> arr[j] to key< arr[j].
		arr[j + 1] = arr[j];
		--j;
		}
		arr[j + 1] = key;
		}
		}
	
	//-----------------------------------------------------

	public static int[] cocktailSort(int[] numbers) {
		boolean swapped = true;
		int i = 0;
		int j = numbers.length - 1;
		while (i < j && swapped) {
			swapped = false;
			for (int k = i; k < j; k++) {
				if (numbers[k] > numbers[k + 1]) {
					int temp = numbers[k];
					numbers[k] = numbers[k + 1];
					numbers[k + 1] = temp;
					swapped = true;
				}
			}
			j--;
			if (swapped) {
				swapped = false;
				for (int k = j; k > i; k--) {
					if (numbers[k] < numbers[k - 1]) {
						int temp = numbers[k];
						numbers[k] = numbers[k - 1];
						numbers[k - 1] = temp;
						swapped = true;
					}
				}
			}
			i++;
		}
		return numbers;
	}



	 public static void cocktailSortDesc(int[] arr) {
	        boolean swapped = true;
	        int start = 0;
	        int end = arr.length - 1;
	 
	        while (swapped == true) {
	            swapped = false;
	 
	            for (int i = start; i < end; i++) {
	                if (arr[i] < arr[i + 1]) {
	                    int temp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = temp;
	                    swapped = true;
	                }
	            }
	 
	            if (swapped == false)
	                break;
	 
	            swapped = false;
	 
	            end--;
	 
	            for (int i = end - 1; i >= start; i--) {
	                if (arr[i] < arr[i + 1]) {
	                    int temp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = temp;
	                    swapped = true;
	                }
	            }
	 
	            start++;
	        }
	    }
	
	
	
	
	
	
	
	
	//------------------------------------------------------------
	 public static void mergesort(int A[],int izq, int der){
		    if (izq < der){
		            int m=(izq+der)/2;
		            mergesort(A,izq, m);
		            mergesort(A,m+1, der);   
		            //Para que funcione tienes que cambiar el metodo de abajo, merge = asc inversomerge =desc
		            merge(A, izq, m, der);                                                                                 
		    }
		}
	 
	 public static void merge(int A[],int izq, int m, int der){
		   int i, j, k;
		   int [] B = new int[A.length]; //array auxiliar
		   for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar                                       
		        B[i]=A[i];

		   i=izq; j=m+1; k=izq;
		     
		   while (i<=m && j<=der) //copia el siguiente elemento más grande                                      
		          if (B[i]<=B[j])
		              A[k++]=B[i++];
		          else
		              A[k++]=B[j++];
		        
		   while (i<=m)         //copia los elementos que quedan de la
		         A[k++]=B[i++]; //primera mitad (si los hay)
		}
	public static void Inversomerge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];
		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		/* Merge the temp arrays */
		// Initial indexes of first and second subarrays
		int i = 0, j = 0;
		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] >= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */

		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */

		while (j < n2)
		{

			arr[k] = R[j];
			j++;
			k++;
		}
	}

	
	

	
	
	

	
	
	//--------------------------------------------------------------------------------------------------
	
	
	public static void selectionSort(int array[]) {
		int size = array.length;

		for (int step = 0; step < size - 1; step++) {
			int min_idx = step;

			for (int i = step + 1; i < size; i++) {

				// To sort in descending order, change > to < in this line.
				// Select the minimum element in each loop.
				if (array[i] < array[min_idx]) {
					min_idx = i;
				}
			}

			// put min at the correct position
			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;
		}
	}
	public static void sortDescending(final int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        int maxElementIndex = i;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[maxElementIndex] < arr[j]) {
	                maxElementIndex = j;
	            }
	        }

	        if (maxElementIndex != i) {
	            int temp = arr[i];
	            arr[i] = arr[maxElementIndex];
	            arr[maxElementIndex] = temp;
	        }
	    }
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		int [] ar = { 4, 7,2 ,3,121,43,213,1,2,4,6,7,3,1};
		BurbujaDescendente(ar);
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
