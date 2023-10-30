package org.example.case7PerfectNumbers;

public class PerfectNumbers {

    public static void main(String[] args) {
        int count = 0;   // Mükemmel sayıları saymak için bir sayaç oluşturulur.
        int number = 1;  // Sayıları kontrol etmek için kullanılan bir değişken başlatılır.

        while (count < 10) {  // 10 mükemmel sayı bulana kadar döngü devam eder.
            if (isPerfectNumber(number)) {  // isPerfectNumber yöntemi ile sayı mükemmel mi diye kontrol edilir.
                System.out.println("Perfect Number " + (count + 1) + ": " + number);  // Mükemmel sayı bulunursa ekrana yazdırılır.
                count++;  // Mükemmel sayı bulunduğunda sayaç artırılır.
            }
            number++;  // Bir sonraki sayıya geçilir.
        }

    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1;  // Sayının kendisi hariç bölenlerinin toplamı 1 ile başlar.

        for (int i = 2; i <= Math.sqrt(num); i++) {  // 2'den başlayarak sayının kareköküne kadar bölenleri kontrol eder.
            if (num % i == 0) {  // Eğer i, num'un bir böleniyse
                if (i == (num / i)) {  // i, num'un tam böleniyse
                    sum += i;  // Bölenden toplama eklenir.
                } else {
                    sum = sum + i + (num / i);  // Eğer i, num'un tam böleni değilse, hem i hem de num / i toplama eklenir.
                }
            }
        }

        return sum == num && num != 1;  // Toplam sayıya eşitse ve sayı 1 değilse, sayı mükemmel bir sayıdır.
    }
}
