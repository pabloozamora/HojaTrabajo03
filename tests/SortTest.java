package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.*;

class SortTest {

	/*@Test
	void testBubbleSort() {
		Sort comparador = new Sort(new CompareInt());
		Integer[] arreglo = new Integer[] {4,12,7,8,26,55,21}; //4,7,8,12,21,26,55
		comparador.bubbleSort(arreglo);
		assertEquals(arreglo[0], 4);
		assertEquals(arreglo[1], 7);
		assertEquals(arreglo[2], 8);
		assertEquals(arreglo[3], 12);
		assertEquals(arreglo[4], 21);
		assertEquals(arreglo[5], 26);
		assertEquals(arreglo[6], 55);
	}

	@Test
	void testQuickSort() {
		Sort comparador = new Sort(new CompareInt());
		Integer[] arreglo = new Integer[] {4,12,7,8,26,55,21}; //4,7,8,12,21,26,55
		comparador.quickSort(arreglo, 0, arreglo.length-1);
		assertEquals(arreglo[0], 4);
		assertEquals(arreglo[1], 7);
		assertEquals(arreglo[2], 8);
		assertEquals(arreglo[3], 12);
		assertEquals(arreglo[4], 21);
		assertEquals(arreglo[5], 26);
		assertEquals(arreglo[6], 55);
	}

	@Test
	void testGnomeSort() {
		Sort comparador = new Sort(new CompareInt());
		Integer[] arreglo = new Integer[] {4,12,7,8,26,55,21}; //4,7,8,12,21,26,55
		comparador.gnomeSort(arreglo, arreglo.length);
		assertEquals(arreglo[0], 4);
		assertEquals(arreglo[1], 7);
		assertEquals(arreglo[2], 8);
		assertEquals(arreglo[3], 12);
		assertEquals(arreglo[4], 21);
		assertEquals(arreglo[5], 26);
		assertEquals(arreglo[6], 55);
	}*/
	
	@Test
	void testMergeSort() {
		Sort comparator = new Sort(new CompareInt());
		Integer[] arreglo = {12,5,68531,3,84132,68,76,4532,121,684,312,318,6764,1,7,46,321,6,8,4};
		comparator.mergeSort(arreglo, 0, arreglo.length-1);
		assertEquals(arreglo[0],1);
		assertEquals(arreglo[1],3);
		assertEquals(arreglo[2],4);
		assertEquals(arreglo[3],5);
		assertEquals(arreglo[4],6);
		assertEquals(arreglo[5],7);
		assertEquals(arreglo[6],8);
		assertEquals(arreglo[7],12);
		assertEquals(arreglo[8],46);
		assertEquals(arreglo[9],68);
		assertEquals(arreglo[10],76);
		assertEquals(arreglo[11],121);
		assertEquals(arreglo[12],312);
		assertEquals(arreglo[13],318);
		assertEquals(arreglo[14],321);
		assertEquals(arreglo[15],684);
		assertEquals(arreglo[16],4532);
		assertEquals(arreglo[17],6764);
		assertEquals(arreglo[18],68531);
		assertEquals(arreglo[19],84132);
	}

}
