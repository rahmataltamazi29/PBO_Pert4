import java.util.Scanner;
class apknilaii{
	public static void main(String[] args){
		String nama;
		int n1,n2,n3,nilaimid,nilaifinal;
		char nhuruf ;
	
	
	
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Masukkan Nama Mahasiswa  : ");
		nama= input.nextLine();
		System.out.print("Masukkan Nilai tugas 1 : ");
		n1= input.nextInt();
	    System.out.print("Masukkan Nilai tugas 2 : ");
		n2= input.nextInt();
	    System.out.print("Masukkan Nilai tugas 3 : ");
		n3= input.nextInt();
		System.out.print("Masukkan Nilai MID : ");
		nilaimid= input.nextInt();
		System.out.print("Masukkan Nilai FINAL : ");
		nilaifinal= input.nextInt();
		
		
		double nrata = (n1 + n2 + n3)/3;
		double nakhir = (nrata * 0.3)+(nilaimid*0.3)+(nilaifinal * 0.3);
		System.out.println("nilai akhir : "+ nakhir);
		
    	
		if(nakhir>=80){
			 nhuruf = 'A';	
				
		}else if(nakhir>=60){
			 nhuruf = 'B';
			
		}else if(nakhir>=50){
			 nhuruf = 'C';
			 
		}else if(nakhir >=40){
		     nhuruf = 'D';
		     
		}else{
			 nhuruf = 'E';
			 
		}
		
		System.out.println("nilai Huruf mahasiswa : "+nhuruf);
		
		
		
		
		
	}
}
