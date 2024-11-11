package threads.multithreading;
/*
Bir öğrencinin banka hesabı için para yatırma(deposit) ve çekme işlemleri(withdraw) için uygulama
Hesapta para yoksa para yatırılması(bakiyenin artması) beklensin.
Bakiye artınca(yeterli olunca) para çekme gerçekleşsin.
*/

// üretici(producer)-tüketici(consumer)
// wait-notify:threadler arasında iletişimi sağlar
public class WaitNotify {
    public static int balance = 0;

    // para yatırma
    public void deposit(int amount){
        System.out.println(Thread.currentThread().getName() + " para yatırmak istiyor. ");
        balance += amount;
        
    }

    // para çekme
    public void withdraw(int amount){

    }
}
