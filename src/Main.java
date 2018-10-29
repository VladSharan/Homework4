import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner k = new Scanner(System.in);
        while (true){
            System.out.println("Выберите действие которое хотите выполнить:\n" +
                    "1. Определение значений функций на отрезке.\n"+
                    "2. Вычисление значения функции с плавающим аргументом\n"+
                    "3. Определение частоты присутствия числа\n"+
                    "4. Вычисление значения функции с многозначным вводом\n"+
                    "5. Вычислить значение функции где X-элемент вводимый с клавиатуры\n"+
                    "6. Нахождение сех натуральных решений уравнения\n"+
                    "7. Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100\n"+
                    "8. Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 ибольших 500\n"+
                    "9. Разбор арифметической прогрессии\n"+
                    "10. Разбор арифметическо прогресси 2\n"+
                    "11. Вывод на экран: прямоугольника, прямоугольного треугольника, равностороннего треугольника и ромба");
            int n = k.nextInt();
            if (n==1){
                System.out.println("Введите начало и конец отрезка a и b соответственно");
                double a = k.nextInt();
                double b = k.nextInt();
                System.out.println("Введите интервал h с которым будет вычислятся значение фнкции F(x)");
                double h = k.nextInt();
                System.out.println("Далее х - точка исследования функции, и значения функций\n"+
                        "F1(x)=x-sin(x) , F2(x)=sin²x  и  F3(x)=2cos(x)-1  соответственно равны:");
                for (double i=a;i<=b;i+=h){
                    double form1 = i-Math.sin(i);
                    double form2 = Math.sin(i)*Math.sin(i);
                    double form3 = (2*Math.cos(i))-1;
                    System.out.println("F1("+ i +")="+form1+" , F2("+ i +")="+form2+" , F3("+ i +")="+form3);
                }
                break;
            }
            if (n==2){
                System.out.println("Вычисление функции y=ax²+b при а=3 ; b=-5, x=1..5 с шагом 0,5");
                int a = 3;
                int b = -5;
                for (int x=1;x<=5;x+=0.5){
                    int y=(a*x*x)+b;
                    System.out.println("y("+x+")="+y);
                }
                break;
            }

            if (n==3){  System.out.print("Введите цифры a и b для проверки: какое из них встречается чаще.");
                int a = k.nextInt();
                int b = k.nextInt();
                System.out.println("Введите число");
                String h = k.next();
                int d = h.length();
                int a1=0;
                int b1=0;
                for ( int i=0 ; i<=d ; i++){
                    char m = h.charAt(i);
                    int c=Integer.parseInt(String.valueOf(m));
                    if (c==a) {a1++;}
                    if (c==b) {b1++;}
                    if (i==(d-1)){
                        if (a1>b1){ System.out.println("Цифра "+a+" Встречается чаще чем цифра "+b);}
                        else  if (b1>a1){System.out.println("Цифра "+b+" Встречается чаще чем цифрв "+a);}
                        else {System.out.println("Цифры цифры встречаютс одинаковое количество раз");}
                    }
                }
                break;}

            if (n==4){
                System.out.println("Введите значение n");
                int N = k.nextInt();
                double z = 0;
                System.out.println("Введите 20 значений X");
                for (int i=1;i<=20;i++){
                    double x = k.nextDouble();
                    int j;
                    for (j=1;j<=N;j++){
                        z=(Math.pow(x,j)/fac(j))+z;
                    }
                    if (i==20){System.out.println("Значение функцыи рвно: Y="+z);}
                }
                break;
            }
            if (n==5){
                double z = 0;
                System.out.println("Введите 15 значений X");
                int i;
                for (i=1;i<=15;i++){
                    double x = k.nextDouble();
                    z=((i+x)/fac(i))+z;
                    System.out.println("Значение Y"+i+"="+z);
                }
                break;
            }
            if (n==6){
                System.out.println("Все натуральные решения уравнения:");
                for (int x=1;x<=30;x++){
                    for (int y=1;y<=30;y++){
                        for (int k1=1;k1<=30;k1++){
                            if (((x*x)+(y*y))==(k1*k1)){
                            System.out.println((x*x)+"+"+(y*y)+"="+(k1*k1));
                            }
                        }
                    }
                }
                break;
            }
            if (n==7){
                int h = 100;
                System.out.println("15 чисел нацело делящихся на 19 и больших 100:");
                int t = 0;
                while (t<=15){
                    if ((h%19)==0){
                        System.out.println(h);
                        t++;
                    }
                    h++;
                }
                break;
            }
            if (n==8){
                int h = 500;
                System.out.println("20 чисел нацело делящихся на 12 или на 17 и больших 500:");
                int t = 0;
                while (t<=20){
                    if (((h%12)==0 || (h/17)==0)){
                        System.out.println(h);
                        t++;
                    }
                    h++;
                }
                break;
            }

            if (n==9){
                System.out.println("Введите значение переменной Z");
                int z = k.nextInt();
                int a=2;
                int d=4;
                int i=1;
                int u=d;
                while (true){
                    a=a+d;
                    if (a>z){
                        System.out.println("для того что-бы сумма прогреси был больше "+z+" необходимо взять "+i+" членов прогрессии");
                        System.out.println("и при этом последний член прогрессии буде равен ="+a+" а последнее слогаемое ="+u);
                        break;
                    }
                    i=i+1;
                    u=a;
                }
                break;}
            if (n==10){
                int h = 1;
                System.out.print(1);
                int z = 0;
                for (int i=1;i<=10;i++){
                    z = z+h;
                    h=h+4;
                    System.out.print("+"+h);
                }
                System.out.print("="+z);
                break;
            }
            if (n==11){
                for (int i = 1;i<=5;i++){
                    System.out.println(" ");
                    for (int j=1;j<=10;j++){
                        System.out.print(" *");
                    }
                }
                System.out.println("  ");
                for (int i=1;i<=10;i++) {
                    System.out.println(" ");
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
                for (int i=1;i<=10;i++) {
                    System.out.println(" ");
                    for (int j=1;j<=i;j++){
                        System.out.print(" *");
                    }
                }
                System.out.println(" ");

                for (int i=1;i<=20;i++){
                    System.out.println(" ");
                    if (i>10){
                        for (int m=11;m<=i;m++){
                            System.out.print(" ");
                        }
                        for (int j=i;j<=19;j++){
                            System.out.print("*");
                        }
                    }
                     else if (i<=10){
                        for (int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                    }

                }
                break;
            }
        }
    }
    static int fac(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}
