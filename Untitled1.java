
/**
*找出两个字符串顺序连续的字符
*param @author memi
*/

public class bothChar
{
	public static String bothChar(String strl,String str2)
	{
	StringBuffer sb = new StringBuffer();
	int n1,n2,m=0;
	n1 = str1.length();
	n2 = str2.length();
	//获取字符串1中的每个字符
	if(str1!=null)        
	{    

          for(int i=0;i<n1,i++){
			  char c = str1.charAt(i); 
		  }
	}
	//获取字符串2中的每个字符
	if(str2！=null)
	{
		for(int j=0;j<n2;j++){
		    char d = str2.charAt(j);
		}
	}
    for(int i=0;i<n1;i++){
		m=0;
		for(int j=0;j<n2;j++){
		if(str1.charAt(i)==str2.charAt(j)&&m==0){
		sb.append(str1.charAt(i));
		m=1;
		}
		}
	}
	return sb.toString();
    //将两个字符串中的字符一一进行比较
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	}
}
