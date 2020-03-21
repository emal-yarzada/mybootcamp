package bootcampfinal;

public class PrintingEvenNumber {

	public static void main(String[] args) {
		
	     
        int numb = 100;
       
        System.out.println("Printing Even numbers between 1 and " + numb);
       
        for(int i=1; i <= numb; i++){
              
                if( i % 2 == 0){
                        System.out.print(i + " ");
                }
        }
}
}