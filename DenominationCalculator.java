package com.gliitfsd.dsalab1_denominationcalculator;


public class DenominationCalculator {
	
	private int[] denominations;
	private int  paymentAmount;
	
	private boolean outcome;
	
	public  DenominationCalculator( int[] denominations, int paymentAmount) {
		this.denominations=denominations;
		this.paymentAmount=paymentAmount;
	}
	 public void calculate() {
		performsort() ;
      StringBuilder result=new StringBuilder();
       result.append(String.format("Amount to pay : %d",paymentAmount));
       result.append(System.getProperty("line.separator"));
       
       int tempAmount =paymentAmount;
       
       try {
    	   for(int i=0;i<denominations.length;i++) {
    		   int denominationValue= denominations[i];
    		   int quotient = tempAmount/denominationValue;
    		   int remainder = tempAmount%denominationValue;
    		   
    		   if(quotient ==0) {
    			   
    		   }else {
    			   result.append(String.format("Denomination : %d,count: %d",denominationValue,quotient));
    			   result.append(System.getProperty("line.separator"));
    			   tempAmount=remainder;
    		   }
    		   if(remainder ==0) {
    			   this.outcome=true;
    			   
    			   break;
    		   }
    	   }
       }
       catch(ArithmeticException arithmeticException) {
    	   arithmeticException.printStackTrace();
       }
       if (outcome) {
    	   System.out.println("success");
    	   System.out.println(result);
       }
       else {
    	   System.out.println("failure");
    	   result.append(String.format("unable to provide the denomination for the balance amount of %d",tempAmount));
    	   System.out.println(result);}
       }
       public  void performsort()
       {
    	   MergeSortDesc descSorter= new MergeSortDesc();
    	    descSorter.sortDesc(denominations,0,denominations.length-1);
       
       
		 
	 }
	
}
