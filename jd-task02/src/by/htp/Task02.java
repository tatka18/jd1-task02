package deadlineDecompose;


public class TaskDecompose {

	public static void main(String[] args) {

		task2();
		task3();
		task4();
		task5();
		task6();
		task8();
		task9();
		task10();
		task14();
		task16();
		task17();
		task18();
		task19();
		task20();
	}
	
	public static void task2() {
		
		// 2. Написать метод(методы) для нахождения наибольшего общего делителя и
		// наименьшего общего кратного двух
		// натуральных чисел:

		int a;
		int b;
		int max;
		int min;

		int nod;
		int nok;

		a = 36;
		b = 58;

		max = max(a, b);
		min = min(a, b);

		nod = nod(a, b, min);
		nok = nok(a, b, max);

		print(nod, nok, a, b);

	}

	public static int nod(int a, int b, int min) {

		int x1;
		int x2;

		while (min > 0) {
			x1 = a % min;
			x2 = b % min;

			if ((x1 == 0) && (x2 == 0)) {
				return min;
			}
			min--;
		}
		return min;

	}

	public static int nok(int a, int b, int max) {
		int x1;
		int x2;
		
		while (max > 0) {
			x1 = max % a;
			x2 = max % b;

			if ((x1 == 0) && (x2 == 0)) {
				return max;
			}
			max++;
		}
		return max;
		
	}

	public static int min(int a, int b) {

		int min;

		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		return min;
	}

	public static int max(int a, int b) {

		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static void print(int nod, int nok, int a, int b) {
		System.out.println("Наименьший общий делитель чисел " + a + " и " + b + " равен " + nod);
		System.out.println("Наименьшее общее кратное чисел " + a + " и " + b + " равно " + nok);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void task3() {

		// // 3. Íàïèñàòü ìåòîä(ìåòîäû) äëÿ íàõîæäåíèÿ íàèáîëüøåãî îáùåãî äåëèòåëÿ
		// ÷åòûðåõ
		// íàòóðàëüíûõ ÷èñåë.

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

		min1 = TaskDecompose.min1(a, b); // ìèíèìàëüíîå èç ïåðâîé ïàðû
		min2 = TaskDecompose.min2(c, d); // ìèíèìàëüíîå èç âòîðîé ïàðû
		min = TaskDecompose.min(min1, min2); // ìèíèìàëüíîå îáùåå

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
							System.out.println("Íàèáîëüøèé îáùèé äåëèòåëü çàäàííûõ ÷èñåë " + a + ", " + b + ", " + c
									+ ", " + "è " + d + " ðàâåí " + min);
							break;
						}

					}

				}
			}

			min--;

		}
		if (min == 1) {
			System.out.println("Çàäàííûå ÷èñëà âçàèìíî ïðîñòûå");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task4() {
		
		// 4. Написать метод(методы) для нахождения наименьшего общего кратного трех
		// натуральных чисел.
		
		int a;
		int b;
		int c;

		int max;
		int nok;
	
		a = 44;
		b = 68;
		c = 34;

		max = Task04.max(a, b, c);
		nok = nok(max, a, b, c);
		
		print(nok, a, b, c);

	}

	public static int nok(int max, int a, int b, int c) {

		int x1;
		int x2;
		int x3;
		
		while (max > 0) {
			x1 = max % a;
			x2 = max % b;
			x3 = max % c;

			if ((x1 == 0) && (x2 == 0)&& (x3 == 0)) {
				return max;
			}
			max++;
		}
		return max;
		
	}

	public static int max(int a, int b, int c) {

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
	
	public static void print(int nok, int a, int b, int c) {
		System.out.println("Наименьшее общее кратное чисел " + a + ", " + b + " и " + c + " равно " + nok);
	}


	////////////////////////////////////////////////////////////////////////// 
	public static void task5() {

		// 5. Íàïèñàòü ìåòîä(ìåòîäû) äëÿ íàõîæäåíèÿ ñóììû áîëüøåãî è ìåíüøåãî èç òðåõ
		// ÷èñåë.

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

		// 6. Âû÷èñëèòü ïëîùàäü ïðàâèëüíîãî øåñòèóãîëüíèêà ñî ñòîðîíîé à, èñïîëüçóÿ
		// ìåòîä âû÷èñëåíèÿ ïëîùàäè òðåóãîëüíèêà.

		double a;

		double shestiugol;
		double s;

		a = 4;
		shestiugol = 6;

		ugolTreug(shestiugol);

		if (ugolTreug(shestiugol) == 60) {
			ploshchTreugoln(a);

			s = ploshchTreugoln(a) * shestiugol;
			System.out.println("Ïëîùàäü ïðàâèëüíîãî øåñòèóãîëüíèêà ðàâíà " + s);
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

		// 8. Ñîñòàâèòü ïðîãðàììó, êîòîðàÿ â ìàññèâå A[N] íàõîäèò âòîðîå ïî âåëè÷èíå
		// ÷èñëî (âûâåñòè íà ïå÷àòü ÷èñëî,
		// êîòîðîå ìåíüøå ìàêñèìàëüíîãî ýëåìåíòà ìàññèâà, íî áîëüøå âñåõ äðóãèõ
		// ýëåìåíòîâ).

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

		// 9. Íàïèñàòü ìåòîä(ìåòîäû), ïðîâåðÿþùèé, ÿâëÿþòñÿ ëè äàííûå òðè ÷èñëà âçàèìíî
		// ïðîñòûìè.

		int a;
		int b;
		int c;

		int min2;

		a = 46;
		b = 88;
		c = 52;

		min2(a, b, c);

		min2 = TaskDecompose.min(a, b, c); // ìèíèìàëüíîå îáùåå

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
						System.out.println("×èñëà íå ÿâëÿþòñÿ âçàèìíî ïðîñòûìè");
						break;
					}

				}

			}

			min--;

		}
		if (min == 1) {
			System.out.println("Çàäàííûå ÷èñëà âçàèìíî ïðîñòûå");
		}

	}
//////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void task10() {

		// 10. Íàïèñàòü ìåòîä(ìåòîäû) äëÿ âû÷èñëåíèÿ ñóììû ôàêòîðèàëîâ âñåõ íå÷åòíûõ
		// ÷èñåë îò 1 äî 9.

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

		System.out.println("Ñóììà ôàêòîðèàëîâ âñåõ íå÷åòíûõ ÷èñåë îò " + n + " äî " + m + " ðàâíà " + summa);

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

		// 14. Íàïèñàòü ìåòîä(ìåòîäû), îïðåäåëÿþùèé, â êàêîì èç äàííûõ äâóõ ÷èñåë áîëüøå
		// öèôð.

		int a;
		int b;
		
		int numA;
		int numB;
		
		int max;

		a = 768;
		b = 4789;
		
		pereborChiselA(a);	// êîëè÷åñòâî öèôð â ÷èñëå à
		numA = TaskDecompose.pereborChiselA(a);
		
		pereborChiselB(b);	//êîëè÷åñòâî öèôð â ÷èñëå b
		numB = TaskDecompose.pereborChiselB(b);
		
		bolshe(numA, numB, a, b);
		max = TaskDecompose.bolshe(numA, numB, a, b);
		
		System.out.println("×èñëî â êîòîðîì íàèáîëüøåå êîëè÷åñòâî öèôð: " + max);
		
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
	
	public static void task16(){
	
	// 16. Два простых числа называются «близнецами», если они отличаются друг от
		// друга на 2 (например, 41 и 43). Найти
		// и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное
		// натуральное число больше 2. Для решения
		// задачи использовать декомпозицию.

		int n;

		n = 25;

		numbers(n);

	}

	public static int numbers(int n) {

		for (int i = n; i <= (2 * n); i++) {
			if(i <= ((2 * n) - 2)) {
				print(i);
			}
		}

		return n;
	}

	public static void print(int i) {
		System.out.println("Числа близнецы: " + i + " " + (i + 2));
	
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task17() {
		//17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
		// в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для
		// решения задачи использовать
		// декомпозицию.

		int k;
		int min;

		int sum;
		int n;

		k = 678;
		min = 1;

		for (int i = min; i <= k; i++) {
			n(i);
			n = n(i);

			sum(i, n);
			sum = sum(i, n);
			
			if (i == sum) {
				print(i);
			} else {
				continue;
			}

		}

	}

	public static int sum(int x, int n) {
		int y;
		int sum = 0;

		while (x >= 1) {
			y = (int) Math.pow((x % 10), n);
			sum = sum + y;

			x = x / 10;
		}
		return sum;
	}

	public static int n(int x) {

		int n = 0;

		while (x >= 1) {

			x = x / 10;
			n = n + 1;
		}
		return n;
	}

	public static void print(int i) {
		System.out.print(i + " ");
			
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task18() {
		
		// 18. Найти все натуральные n-значные числа, цифры в которых образуют строго
		// возрастающую последовательность
		// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

		int n = 3;

		int min;
		int max;
		boolean increasing;

		min = min(n);
		max = max(n);

		for (int i = min; i < max; i++) {
			increasing(i, n);
			increasing = increasing(i, n);

			if (increasing == true) {
				print(i);
			}
		}
	}

	public static int min(int n) {
		int min;
		min = (int) Math.pow(10, (n - 1));
		return min;
	}

	public static int max(int n) {
		int max;
		max = (int) Math.pow(10, n) - 1;
		return max;
	}

	public static boolean increasing(int x, int n) {

		int number;
		int max = 10;

		for (int i = 0; i < n; i++) {
			number = x % 10;
			x = x / 10;

			if (number < max) {
				max = number;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void print(int i) {
		System.out.println(i);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void task19() {

		// 19. Íàïèñàòü ïðîãðàììó, îïðåäåëÿþùóþ ñóììó n - çíà÷íûõ ÷èñåë, ñîäåðæàùèõ
		// òîëüêî íå÷åòíûå öèôðû. Îïðåäåëèòü
		// òàêæå, ñêîëüêî ÷åòíûõ öèôð â íàéäåííîé ñóììå. Äëÿ ðåøåíèÿ çàäà÷è èñïîëüçîâàòü
		// äåêîìïîçèöèþ.

		int n;

		int min;
		int max;

		int nechet;
		int summaNechet;
		int chetN;

		n = 4; // êîëè÷åñòâî çíàêîâ â ÷èñëå

		min(n); // min n-çíà÷íîãî ÷èñëà
		min = (int) TaskDecompose.min(n);

		maximum(n); // ìàêñèìóì n-çíà÷íîãî ÷èñëà
		max = (int) TaskDecompose.maximum(n);

		vseNechet(min, n); //// ÷èñëà,â êîòîðûõ âñå ÷èñëà íå÷åòíûå
		nechet = TaskDecompose.vseNechet(min, n);

		summaNechet(nechet, min, max, n); // ñóììà âñåõ íå÷åòíûõ n-çíà÷íûõ ÷èñåë
		summaNechet = TaskDecompose.summaNechet(nechet, min, max, n);

		System.out
				.println("Ñóììà âñåõ " + n + "-x çíà÷íûõ ÷èñåë, ñîäåðæàùèõ òîëüêî íå÷åòíûå öèôðû ðàâíà " + summaNechet);

		chetCifriVSumme(summaNechet); // êîëè÷åñòâî ÷åòíûõ öèôð â ÷èñëå ñóììû
		chetN = TaskDecompose.chetCifriVSumme(summaNechet);

		System.out.println("Êîëè÷åñòâî ÷åòíûõ öèôð â ñóììå: " + chetN);

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

		// 20. Èç çàäàííîãî ÷èñëà âû÷ëè ñóììó åãî öèôð. Èç ðåçóëüòàòà âíîâü âû÷ëè ñóììó
		// åãî öèôð è ò.ä. Ñêîëüêî òàêèõ
		// äåéñòâèé íàäî ïðîèçâåñòè, ÷òîáû ïîëó÷èëñÿ íóëü? Äëÿ ðåøåíèÿ çàäà÷è
		// èñïîëüçîâàòü äåêîìïîçèöèþ.

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

		System.out.println("Íóæíî ïðîèçâåñòè " + numberOfAction + " òàêèõ äåéñòâèé");

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
