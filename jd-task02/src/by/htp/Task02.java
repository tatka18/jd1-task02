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

		// // 3. Написать метод(методы) для нахождения наибольшего общего делителя
		// четырех
		// натуральных чисел.

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

		min1 = TaskDecompose.min1(a, b); // минимальное из первой пары
		min2 = TaskDecompose.min2(c, d); // минимальное из второй пары
		min = TaskDecompose.min(min1, min2); // минимальное общее

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
							System.out.println("Наибольший общий делитель заданных чисел " + a + ", " + b + ", " + c
									+ ", " + "и " + d + " равен " + min);
							break;
						}

					}

				}
			}

			min--;

		}
		if (min == 1) {
			System.out.println("Заданные числа взаимно простые");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task4() {
		
		// 4. Написать метод(методы) для нахождения наименьшего общего кратного трех
		// натуральных чисел.
		
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

		// 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех
		// чисел.

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

		// 6. Вычислить площадь правильного шестиугольника со стороной а, используя
		// метод вычисления площади треугольника.

		double a;

		double shestiugol;
		double s;

		a = 4;
		shestiugol = 6;

		ugolTreug(shestiugol);

		if (ugolTreug(shestiugol) == 60) {
			ploshchTreugoln(a);

			s = ploshchTreugoln(a) * shestiugol;
			System.out.println("Площадь правильного шестиугольника равна " + s);
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

		// 8. Составить программу, которая в массиве A[N] находит второе по величине
		// число (вывести на печать число,
		// которое меньше максимального элемента массива, но больше всех других
		// элементов).

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

		// 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
		// простыми.

		int a;
		int b;
		int c;

		int min2;

		a = 46;
		b = 88;
		c = 52;

		min2(a, b, c);

		min2 = TaskDecompose.min(a, b, c); // минимальное общее

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
						System.out.println("Числа не являются взаимно простыми");
						break;
					}

				}

			}

			min--;

		}
		if (min == 1) {
			System.out.println("Заданные числа взаимно простые");
		}

	}
//////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void task10() {

		// 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных
		// чисел от 1 до 9.

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

		System.out.println("Сумма факториалов всех нечетных чисел от " + n + " до " + m + " равна " + summa);

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

		// 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше
		// цифр.

		int a;
		int b;
		
		int numA;
		int numB;
		
		int max;

		a = 768;
		b = 4789;
		
		pereborChiselA(a);	// количество цифр в числе а
		numA = TaskDecompose.pereborChiselA(a);
		
		pereborChiselB(b);	//количество цифр в числе b
		numB = TaskDecompose.pereborChiselB(b);
		
		bolshe(numA, numB, a, b);
		max = TaskDecompose.bolshe(numA, numB, a, b);
		
		System.out.println("Число в котором наибольшее количество цифр: " + max);
		
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

		// 19. Написать программу, определяющую сумму n - значных чисел, содержащих
		// только нечетные цифры. Определить
		// также, сколько четных цифр в найденной сумме. Для решения задачи использовать
		// декомпозицию.

		int n;

		int min;
		int max;

		int nechet;
		int summaNechet;
		int chetN;

		n = 4; // количество знаков в числе

		min(n); // min n-значного числа
		min = (int) TaskDecompose.min(n);

		maximum(n); // максимум n-значного числа
		max = (int) TaskDecompose.maximum(n);

		vseNechet(min, n); //// числа,в которых все числа нечетные
		nechet = TaskDecompose.vseNechet(min, n);

		summaNechet(nechet, min, max, n); // сумма всех нечетных n-значных чисел
		summaNechet = TaskDecompose.summaNechet(nechet, min, max, n);

		System.out
				.println("Сумма всех " + n + "-x значных чисел, содержащих только нечетные цифры равна " + summaNechet);

		chetCifriVSumme(summaNechet); // количество четных цифр в числе суммы
		chetN = TaskDecompose.chetCifriVSumme(summaNechet);

		System.out.println("Количество четных цифр в сумме: " + chetN);

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

		// 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
		// его цифр и т.д. Сколько таких
		// действий надо произвести, чтобы получился нуль? Для решения задачи
		// использовать декомпозицию.

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

		System.out.println("Нужно произвести " + numberOfAction + " таких действий");

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
