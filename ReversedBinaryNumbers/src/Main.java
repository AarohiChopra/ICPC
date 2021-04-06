
import java.util.*;
public class Main {
	 public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int input = in.nextInt();
		    
		    int high = 0;
		    for(int t = 0; t < 9; t++) {
		      if(input < Math.pow(10,t)) { 
		        high = t;
		        break;
		      }
		    }
		    int[] binary = new int[high];
		    int count = high - 1;
		    for(int i = high - 1; i >= 0; i--)  {
		      if(input % Math.pow(2,i) != input) {
		        binary[count] = 1;
		        input -= Math.pow(2,i);
		      }
		      count--;
		    }
		    int sum = 0;
		    int rcount = high - 1;
		    for(int j = 0; j < binary.length; j++) {
		      if(binary[rcount] == 1) {
		        sum+= Math.pow(2,j);
		      }
		      rcount--;
		  }
		  System.out.println(sum);
		  }
}
