package sayilarinortalamasi;
import java.util.Scanner;
public class SayilarinOrtalamasi {

	public static void main(String[] args) {
		int k, l =0;
		double a=0, ortalama;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayi girin:");
		k = input.nextInt();
		for(int i=0; i < k; i++ ) {
				
				
				if((i % 3==0) && (i % 4 == 0)){
					System.out.println(i);
					a += i;
					l++;
					
				
				}
		}

        ortalama = a/l;
        System.out.println(ortalama);
		
	}

}
