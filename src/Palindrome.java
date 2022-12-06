
public class Palindrome {

	public static void main(String[] args) {
		int rem,rev=0,temp;    
		  int num=98589;//It is the number variable to be checked for Palindrome  
		  
		  temp=num;    
		  while(num>0){    
		   rem=num%10; 
		   rev=(rev*10)+rem;    
		   num=num/10;    
		  }    
		  if(temp==rev)    
		   System.out.println("Number is Palindrome ");    
		  else    
		   System.out.println(" Number is not Palindrome");    
		}  
		}  