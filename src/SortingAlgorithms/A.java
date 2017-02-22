

public class A {
	
	private static int steps;
	
	public static void main(String[] args) {
		int[] temp = new int[100];
		temp[0]=99;

		temp[1]=1;

		temp[2]=2;

		temp[3]=3;

		temp[4]=4;

		temp[5]=5;

		temp[6]=6;

		temp[7]=7;

		temp[8]=8;

		temp[9]=9;

		temp[10]=10;

		temp[11]=11;

		temp[12]=12;

		temp[13]=13;

		temp[14]=14;

		temp[15]=15;

		temp[16]=16;

		temp[17]=17;

		temp[18]=18;

		temp[19]=19;

		temp[20]=20;

		temp[21]=21;

		temp[22]=22;

		temp[23]=23;

		temp[24]=24;

		temp[25]=25;

		temp[26]=26;

		temp[27]=27;

		temp[28]=28;

		temp[29]=29;

		temp[30]=30;

		temp[31]=31;

		temp[32]=32;

		temp[33]=33;

		temp[34]=34;

		temp[35]=35;

		temp[36]=36;

		temp[37]=37;

		temp[38]=38;

		temp[39]=39;

		temp[40]=40;

		temp[41]=41;

		temp[42]=42;

		temp[43]=43;

		temp[44]=44;

		temp[45]=45;

		temp[46]=46;

		temp[47]=47;

		temp[48]=48;

		temp[49]=49;

		temp[50]=50;

		temp[51]=51;

		temp[52]=52;

		temp[53]=53;

		temp[54]=54;

		temp[55]=55;

		temp[56]=56;

		temp[57]=57;

		temp[58]=58;

		temp[59]=59;

		temp[60]=60;

		temp[61]=61;

		temp[62]=62;

		temp[63]=63;

		temp[64]=64;

		temp[65]=65;

		temp[66]=66;

		temp[67]=67;

		temp[68]=68;

		temp[69]=69;

		temp[70]=70;

		temp[71]=71;

		temp[72]=72;

		temp[73]=73;

		temp[74]=74;

		temp[75]=75;

		temp[76]=76;

		temp[77]=77;

		temp[78]=78;

		temp[79]=79;

		temp[80]=80;

		temp[81]=81;

		temp[82]=82;

		temp[83]=83;

		temp[84]=84;

		temp[85]=85;

		temp[86]=86;

		temp[87]=87;

		temp[88]=88;

		temp[89]=89;

		temp[90]=90;

		temp[91]=91;

		temp[92]=92;

		temp[93]=93;

		temp[94]=94;

		temp[95]=95;

		temp[96]=96;

		temp[97]=97;

		temp[98]=98;

		temp[99]=99;

		screenOutput(temp);
		mergeSort(temp, 1, temp.length-1);
		System.out.println("Steps: " + steps);
		System.out.println("temp after");
		screenOutput(temp);
	}
	
	public A() {
		steps = 0;
	}

	public static void screenOutput(final int[] temp) {
		for (int loop = 1; loop <= temp[0]; loop++) {
			System.out.print(temp[loop] + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] list, int first, int last) {
		int mid;
		steps ++;
		if (first == last) {
			
		} else if (first + 1 == last) {
			steps++;
			if (list[last] < list[first]) {
				swap(list, last, first);
				steps++;
			}
		} else {
			mid = (first + last) / 2;
			steps++;
			mergeSort(list, first, mid);
			mergeSort(list, mid + 1, last);
			merge(list, first, mid, last);
		}
	}
	
	public static void merge(int[] A, int first, int mid, int last) {
		int[] temp = new int[A[0] + 1];
		int posA = first;
		int end = last - first + 1;
		int posB = mid + 1;
		int posC = first;
		boolean aDone = false;
		boolean bDone = false;
		temp[0] = A[0];
		steps += 7;
		for (int i = 1; i <= end; i++) {
			steps ++;
			if (aDone) {
				temp[posC] = A[posB];
				posB++;
				steps += 2;
			} else if (bDone) {
				temp[posC] = A[posA];
				posA++;
				steps += 2;
			} else if (A[posA] < A[posB]) {
				temp[posC] = A[posA];
				posA++;
				steps += 2;
			} else {
				temp[posC] = A[posB];
				posB++;
				steps += 2;
			}
			if (posA > mid) {
				aDone = true;
				steps++;
			} else if (posB > last) {
				bDone = true;
				steps++;
			}
			posC++;
			steps++;
		}
		steps++;
		for (int loop = first; loop <= last; loop++) {
			A[loop] = temp[loop];
			steps +=2;
		}
	}
	
	public static void swap(int[] list, int a, int b) {
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;

	}
}
