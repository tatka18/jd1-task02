package deadlineDecompose;


public class TaskDecompose {

	public static void main(String[] args) {

		task3();
		task4();
		task5();
		task6();
		task8();
		task9();
		task10();
		task14();
		task19();
		task20();
	}

	public static void task3() {

		// // 3. �������� �����(������) ��� ���������� ����������� ������ ��������
		// �������
		// ����������� �����.

		int a;
		int b;
		int c;
		int d;

		int min;
		int min1;
		int min2;

		a = 351;
		b = 27;
		c = 819;
		d = 801;

		min1 = TaskDecompose.min1(a, b); // ����������� �� ������ ����
		min2 = TaskDecompose.min2(c, d); // ����������� �� ������ ����
		min = TaskDecompose.min(min1, min2); // ����������� �����

		res(a, b, c, d, min);

	}

	public static int min(int x1, int x2) {
		int min;
		if (x1 > x2) {
			min = x2;
		} else {
			min = x1;

		}
		return min;

	}

	public static int min1(int x1, int x2) {

		int min;
		if (x1 > x2) {
			min = x2;
		} else {
			min = x1;

		}
		return min;
	}

	public static int min2(int x1, int x2) {

		int min;
		if (x1 > x2) {
			min = x2;
		} else {
			min = x1;

		}
		return min;

	}

	public static void res(int a, int b, int c, int d, int min) {

		int del;

		while (min != 1) {
			del = a % min;

			if (del == 0) {
				del = b % min;

				if (del == 0) {
					del = c % min;

					if (del == 0) {
						del = d % min;
						if (del == 0) {
							System.out.println("���������� ����� �������� �������� ����� " + a + ", " + b + ", " + c
									+ ", " + "� " + d + " ����� " + min);
							break;
						}

					}

				}
			}

			min--;

		}
		if (min == 1) {
			System.out.println("�������� ����� ������� �������");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task4() {
		
		// 4. �������� �����(������) ��� ���������� ����������� ������ �������� ����
		// ����������� �����.
		
		int a;
		int b;
		int c;

		int max1;
	
		a = 44;
		b = 68;
		c = 34;

		max1 = TaskDecompose.max(a, b, c);
		nok(max1, a, b, c);

	}

	public static void nok(int max, int a, int b, int c) {

		int nok;
		nok = 1;
		int del;

		for (int i = max; i != nok; i++) { 

			del = i % a;

			if (del == 0) {

				del = i % b;

				if (del == 0) {
					del = i % c;

					if (del == 0) {
						nok = i;
						System.out.println(nok);
						break;
					}
				} else {
					continue;
				}
			} else {
				continue;
			}

		}

	}

	public static int max1(int a, int b, int c) {

		int max;

		if ((a > b) && (a > c)) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}

		return max;
	}

	////////////////////////////////////////////////////////////////////////// 
	public static void task5() {

		// 5. �������� �����(������) ��� ���������� ����� �������� � �������� �� ����
		// �����.

		int a;
		int b;
		int c;
		
		int max;
		int min;
		int sum;

		a = 76;
		b = 23;
		c = 86;

		max = max(a, b, c);
		min = min(a, b, c);
		

		sum = TaskDecompose.sum(max, min);
		
		System.out.println(sum);

	}

	public static int sum(int max, int min) {

		int sum;

		sum = max + min;

		return sum;

	}

	public static int min(int a, int b, int c) {
		int min;
		
		if (a < b) {
			min = a;
		} else if (b < c) {
			min = b;
		} else {
			min = c;
		}
		return min;
	}

	public static int max(int a, int b, int c) {

		int max;

		if (a > b) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}
		return max;

	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void task6() {

		// 6. ��������� ������� ����������� �������������� �� �������� �, ���������
		// ����� ���������� ������� ������������.

		double a;

		double shestiugol;
		double s;

		a = 4;
		shestiugol = 6;

		ugolTreug(shestiugol);

		if (ugolTreug(shestiugol) == 60) {
			ploshchTreugoln(a);

			s = ploshchTreugoln(a) * shestiugol;
			System.out.println("������� ����������� �������������� ����� " + s);
		}

	}

	public static double ploshchTreugoln(double a) {

		double ploshchTreugoln;

		ploshchTreugoln = (Math.sqrt(3) / 4) * Math.pow(a, 2);

		return ploshchTreugoln;

	}

	public static double ugolTreug(double shestiugol) {

		double ugolTreug;

		ugolTreug = 360 / shestiugol;

		return ugolTreug;

	}

	
	///////////////////////////////////////////////////////////////////////////////////////
	
	public static void task8() {

		// 8. ��������� ���������, ������� � ������� A[N] ������� ������ �� ��������
		// ����� (������� �� ������ �����,
		// ������� ������ ������������� �������� �������, �� ������ ���� ������
		// ���������).

		int[] mas = new int[] { 3, 5, 64, 8, 2, 31, 20, 9, 1 };

		int max;
		int min;
		int maxBefore;

		max(mas);
		max = TaskDecompose.max(mas);

		min(mas);
		min = TaskDecompose.min(mas);

		maxBefore(mas, max, min);
		maxBefore = TaskDecompose.maxBefore(mas, max, min);
		print(maxBefore);

	}

	public static int maxBefore(int[] mas, int max, int min) {

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == max) {
				max = min;
				continue;

			} else {
				if (mas[i] > max) {
					max = mas[i];
				}
			}

		}
		return max;
	}

	public static int min(int[] mas) {

		int min = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < min) {

				min = mas[i];

			}

		}
		return min;

	}

	public static int max(int[] mas) {

		int max = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > max) {

				max = mas[i];

			}

		}
		return max;

	}

	public static void print(int maxBefore) {
		System.out.println(maxBefore);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void task9() {

		// 9. �������� �����(������), �����������, �������� �� ������ ��� ����� �������
		// ��������.

		int a;
		int b;
		int c;

		int min2;

		a = 46;
		b = 88;
		c = 52;

		min2(a, b, c);

		min2 = TaskDecompose.min(a, b, c); // ����������� �����

		res(a, b, c, min2);

	}

	public static int min2(int a, int b, int c) {
		int min;

		if ((a < b) && (a < c)) {
			min = a;
		} else if (b < c) {
			min = b;
		} else {
			min = c;
		}

		return min;

	}

	public static void res(int a, int b, int c, int min) {

		int del;

		while (min != 1) {
			del = a % min;

			if (del == 0) {
				del = b % min;

				if (del == 0) {
					del = c % min;

					if (del == 0) {
						System.out.println("����� �� �������� ������� ��������");
						break;
					}

				}

			}

			min--;

		}
		if (min == 1) {
			System.out.println("�������� ����� ������� �������");
		}

	}
//////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void task10() {

		// 10. �������� �����(������) ��� ���������� ����� ����������� ���� ��������
		// ����� �� 1 �� 9.

		int chetnost;

		int n;
		int m;
		int factorial;

		n = 1;
		m = 9;

		int summa = 0;

		for (int i = n; i <= m; i++) {

			chetnost = i % 2;

			if (chetnost != 0) {

				factorial(i);
				factorial = TaskDecompose.factorial(i);

				summa = summa + factorial;

			}

		}
		print(summa, n, m);

	}

	public static void print(int summa, int n, int m) {

		System.out.println("����� ����������� ���� �������� ����� �� " + n + " �� " + m + " ����� " + summa);

	}

	public static int factorial(int x) {
		int fact = 1;

		for (int i = 1; i <= x; i++) {
			fact = fact * i;

		}
		return fact;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task14() {

		// 14. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������
		// ����.

		int a;
		int b;
		
		int numA;
		int numB;
		
		int max;

		a = 768;
		b = 4789;
		
		pereborChiselA(a);	// ���������� ���� � ����� �
		numA = TaskDecompose.pereborChiselA(a);
		
		pereborChiselB(b);	//���������� ���� � ����� b
		numB = TaskDecompose.pereborChiselB(b);
		
		bolshe(numA, numB, a, b);
		max = TaskDecompose.bolshe(numA, numB, a, b);
		
		System.out.println("����� � ������� ���������� ���������� ����: " + max);
		
	}

	public static int pereborChiselA(int a) {

		int i;

		i = 0;

		while (a >= 1) {
			a = a / 10;
			i++;
		}
		return i;

	}

	public static int pereborChiselB(int b) {

		int i;

		i = 0;

		while (b >= 1) {
			b = b / 10;
			i++;
		}
		return i;

	}
	public static int bolshe(int numA, int numB, int a, int b) {
				
		int max;
		
		if (numA > numB) {
			max = a;
			return max;
		}else {
			max = b;
			return max;
		}
		
		
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task19() {

		// 19. �������� ���������, ������������ ����� n - ������� �����, ����������
		// ������ �������� �����. ����������
		// �����, ������� ������ ���� � ��������� �����. ��� ������� ������ ������������
		// ������������.

		int n;

		int min;
		int max;

		int nechet;
		int summaNechet;
		int chetN;

		n = 4; // ���������� ������ � �����

		min(n); // min n-�������� �����
		min = (int) TaskDecompose.min(n);

		maximum(n); // �������� n-�������� �����
		max = (int) TaskDecompose.maximum(n);

		vseNechet(min, n); //// �����,� ������� ��� ����� ��������
		nechet = TaskDecompose.vseNechet(min, n);

		summaNechet(nechet, min, max, n); // ����� ���� �������� n-������� �����
		summaNechet = TaskDecompose.summaNechet(nechet, min, max, n);

		System.out
				.println("����� ���� " + n + "-x ������� �����, ���������� ������ �������� ����� ����� " + summaNechet);

		chetCifriVSumme(summaNechet); // ���������� ������ ���� � ����� �����
		chetN = TaskDecompose.chetCifriVSumme(summaNechet);

		System.out.println("���������� ������ ���� � �����: " + chetN);

	}

	public static int chetCifriVSumme(int x) {

		int num;
		int i;

		i = 0;

		while (x >= 1) {
			num = x % 10;
			x = x / 10;
			if ((num % 2) == 0) {
				i = i + 1;
			}
		}
		return i;

	}

	public static int vseNechet(int min, int n) {
		int nechet;
		int x;
		x = min;

		while (n > 0) {
			nechet = min % 10;
			if (nechet == 0) {
				x = 0;
				return x;
			} else if ((nechet % 2) == 0) {
				x = 0;
				return x;

			} else {
				min = (int) min / 10;
				n--;

				continue;
			}

		}
		return x;

	}

	public static int summaNechet(int nechet, int min, int max, int n) {

		int sum;
		sum = 0;

		while (min <= max) {

			vseNechet(min, n);
			nechet = TaskDecompose.vseNechet(min, n);

			sum = sum + nechet;
			min++;
		}

		return sum;

	}

	public static double min(int n) {

		double znak;
		znak = Math.pow(10, n) / 10;

		return znak;

	}

	public static double maximum(int n) {

		double max;
		max = Math.pow(10, n) - 1;

		return max;
	}
/////////////////////////////////////////////////////////////////////////////

	public static void task20() {

		// 20. �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� �����
		// ��� ���� � �.�. ������� �����
		// �������� ���� ����������, ����� ��������� ����? ��� ������� ������
		// ������������ ������������.

		int n;
		int sum;
		int numberOfAction;
		int num;

		n = 34;

		summa(n);
		sum = TaskDecompose.summa(n);

		minusSumma(n, sum);
		num = TaskDecompose.minusSumma(n, sum);

		action(n, sum, num);
		numberOfAction = TaskDecompose.action(n, sum, num);

		System.out.println("����� ���������� " + numberOfAction + " ����� ��������");

	}

	public static int action(int n, int sum, int num) {

		int i;
		i = 0;

		while (n > 0) {
			sum = TaskDecompose.summa(n);

			n = TaskDecompose.minusSumma(n, sum);

			i++;
		}
		return i;

	}

	public static int summa(int n) {

		int ch;
		int sum;

		sum = 0;

		while (n >= 1) {

			ch = n % 10;
			n = n / 10;

			sum = sum + ch;

		}

		return sum;
	}

	public static int minusSumma(int n, int sum) {

		n = n - sum;

		return n;

	}

}
