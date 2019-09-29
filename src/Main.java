import java.util.Scanner;

public class Main {

	//iki sayiyi toplayan methot
	public static int topla(int a,int b){
	return a+b;
	}

	//iki sayıyı birbirinden çıkartan method
	public static int cıkar(int a,int b){
		return a-b;
	}

	//iki sayıyı çarpan fonksiyon
	public static int carp(int a,int b){
		return a*b;
	}

	//iki sayiyi bölen fonksiyon

	public static double bol(int a,int b) {
		return a / b;
	}

	public static void main(String[] args) {


		Scanner tarayici=new Scanner(System.in);

		System.out.println("Birinci sayiyi giriniz: ");
	    int sayi1=tarayici.nextInt();

		System.out.println("İkinci sayiyi giriniz: ");
	    int sayi2=tarayici.nextInt();

		System.out.println("Girmiş olduğunuz sayıların toplamı: "+topla(sayi1,sayi2));
		System.out.println("Girmiş olduğunuz sayıların farkı: "+cıkar(sayi1,sayi2));
		System.out.println("Girmiş olduğunuz sayıların çarpımı: "+carp(sayi1,sayi2));
		System.out.println("Girmiş olduğunuz sayıların bölümü: "+bol(sayi1,sayi2));

		System.out.println("Üçüncü sayiyi giriniz: ");
	    int sayi3=tarayici.nextInt();



	    int enBuyuk=sayi1;

	    if (enBuyuk<sayi2){
	    enBuyuk=sayi2;
        }

	    if (enBuyuk<sayi3){
         enBuyuk=sayi3;
        }

	    if (sayi1==sayi2 && sayi1==sayi3){
			System.out.println("Tüm sayilari eşit girdiniz");
		}else {
			System.out.println("En büyük = " + enBuyuk);
		}
		}
    }

