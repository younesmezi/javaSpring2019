package day16;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Date is 03_25_2019" ;
        
        str = str.replace('_','-') ; 
        
        System.out.println(  str   ); 
        
        //Date is 03-25-2019  --> Date will be 03-25-2019
        
        str = str.replace("is","will be" ) ; 
        System.out.println(  str );
        
        // Date will be 03-25-2019  --->>>03-25-2019
        System.out.println(  str.replace("Date will be ", "")    );
        
        
        
        String str2 = "AAAAABBBBBBCCCCCCC" ; 
        System.out.println(     str2.replace('A', 'Z')      );
        
        
        
        
        
        
	}

}
