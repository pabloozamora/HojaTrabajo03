package src;

public class Sort <T> {
	public IComparator comparador;
	
	public Sort(IComparator comparador) {
		this.comparador = comparador;
	}
	
	public void bubbleSort(T[] myArray){
        for (int i = 0; i<myArray.length-1; i++){
            for (int j = i + 1; j < myArray.length; j++){
                if(comparador.Compare(myArray[i], myArray[j]) > 0){
                    T temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

    public void quickSort(T[] myArray, int inf, int sup){
        int i = inf - 1;
        int j = sup;
        boolean flag = true;
        T temp;
        if (inf >= sup){
            return;
        }

        T element_div = myArray[sup];

        while (flag){
            while(comparador.Compare(myArray[++i], element_div) < 0);
            while(comparador.Compare(myArray[--j], element_div) > 0 && (j>inf));
            if (i < j){
                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }
            else{
            flag = false;  
            }
        }
        temp = myArray[i];
	    myArray[i] = myArray[sup];
	    myArray[sup] = temp;
	    quickSort(myArray, inf, i - 1);
	    quickSort(myArray, i + 1, sup);
    }

    public void gnomeSort(T[] myArray, int size){
        int index = 0;
        while (index < size){
            if (index == 0) index++;
            if (comparador.Compare(myArray[index], myArray[index - 1]) > 0){
                index++;
            }
            else{
                T temp = myArray[index];
                myArray[index] = myArray[index-1];
                myArray[index-1] = temp;
                index--;
            }
        }
    }
	
	public void mergeSort(Integer[] arreglo, int inicio, int fin) {
		if(inicio<fin) {
			// Encontrar el punto medio del arreglo
			int medio = inicio + (fin-inicio)/2;
		
			// Ordenar cada mitad
			mergeSort(arreglo, inicio, medio);
			mergeSort(arreglo, medio+1, fin);
			
			// Unir las dos mitades
			merge(arreglo, inicio, medio, fin);
		}
	}
	
	public void merge(Integer[] arreglo, int inicio, int medio, int fin)
    {
		// Encontrar el tamaÃ±o de los subarreglos a ser unidos
		int n1 = medio - inicio + 1;
		int n2 = fin - medio;

		// Crear arreglos temporales
		Integer[] arr1 = new Integer[n1];
		Integer[] arr2 = new Integer[n2];

		// Copiar la informaciÃ³n a los arreglos temporales
		for (int i = 0; i < n1; ++i)
			arr1[i] = arreglo[inicio + i];
		for (int j = 0; j < n2; ++j)
			arr2[j] = arreglo[medio + 1 + j];

		// Unir los arreglos temporales

		// Ã�ndices iniciales de cada subarreglo
		int i = 0, j = 0;

		// Ã�ndice inicial del arreglo unido
		int k = inicio;
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				arreglo[k] = arr1[i];
				i++;
			}
			else {
				arreglo[k] = arr2[j];
				j++;
			}
			k++;
		}

		// Copiar elementos restantes de arr1[] si los hay
		while (i < n1) {
			arreglo[k] = arr1[i];
			i++;
			k++;
		}

		// Copiar elementos restantes de arr2[] si los hay
		while (j < n2) {
			arreglo[k] = arr2[j];
			j++;
			k++;
		}
	}
}