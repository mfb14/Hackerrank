
package hackerrank;

/**
 * 1.1.1900 ile 31.12.2000 tarihleri arasında, ayın ilk günü pazar olan tarihleri listeleyen uygulamayı yazınız. 
 * İpucu: 1.1.1900 tarihinin “Pazartesi” olduğu bilgisini kodunuzun performansını arttırmak için kullanınız.
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 2, 2022 1:10:58 PM
 */
public class FindFirstDay {

	public static void main(String[] args) {
		int year = 1900;
		String [] months = new String [] {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
		int [] days = new int []         { 31,	  28,	  31,	 30,	 31,	 30,	   31,		31,		  30,	  31,	 30,	 31};
		int weekDay=1;
		int firstDay = 1;
		while(year<2001) {
			
			//Şubat ayının kaç gün olduğunu hesaplamak için
			days[1] = year%4==0&&year%100!=0||year%400==0?29:28;

			
			System.out.println("\n-------------"+year+"-------------\n");
			//Bir aydaki gün saysını tutmak için
			int dayInMonth;
			
			for(int ay=0;ay<12;ay++) {
				dayInMonth=days[ay];
//				System.out.print("\n\n\t"+month[m]);
//				System.out.print("\n\tPzt\tSl\tÇrş\tPrş\tCm\tCmt\tPzr\n");
//				for(wd=1;wd<firstDay;wd++)
//					System.out.print("\t");	
				for (int day = 1; day <= dayInMonth; day++) {
					if(day==1&&weekDay==7)
						System.out.println(day+"/"+months[ay]+"/"+year);			
//					System.out.print("\t"+d);
					//Eğer gün sayımız 7 ye ulaştığında tekrar bire eşitliyoruz.
					if(++weekDay>7) {
//						System.out.println();
						weekDay=1;				
					}
					//Hafta bittiği zaman yeni haftanın hangi günden başlıcağını tutuyor
					firstDay=weekDay;
				}
			}
			year++;
			System.out.println();
		}
	
	}

}
