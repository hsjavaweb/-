
/**
*�ҳ������ַ���˳���������ַ�
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
	//��ȡ�ַ���1�е�ÿ���ַ�
	if(str1!=null)        
	{    

          for(int i=0;i<n1,i++){
			  char c = str1.charAt(i); 
		  }
	}
	//��ȡ�ַ���2�е�ÿ���ַ�
	if(str2��=null)
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
    //�������ַ����е��ַ�һһ���бȽ�
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	}
}
