
public class Solution {
public int convertDectoBin(int dec)
{
	int binary[] = new int[40];    
	StringBuilder sb=new StringBuilder();
     int index = 0;    
     while(dec > 0){    
       binary[index++] = dec%2;    
       dec = dec/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       sb.append(String.valueOf(binary[i]));    
     }   
     return Integer.valueOf(sb.toString());
}
public int convertBintoDec(int binary)
{
	 int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(binary == 0){  
	        break;  
	      } else {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          n++;  
	       }  
	    }  
	    return decimal;  	
}
public int reverseTheBin(int bin)
{
    int rev_num = 0;
    while (bin > 0)
    {
        rev_num = rev_num*10 + bin%10;
        bin = bin/10;
    }
    return rev_num;
}
public int reverse(int deci)
{
	int binFromDeci=convertDectoBin(deci);
    int reverBin=reverseTheBin(binFromDeci);
    int DeciFromRevBin=convertBintoDec(reverBin);
	return DeciFromRevBin;	
}
public static void main(String[] args)
{
	Solution s=new Solution();
	int a=47;
	System.out.println(s.reverse(a));
}
}
