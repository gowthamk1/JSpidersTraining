package FreequencyOfNumber;

public class FON {
	public static void main(String[]args) {
		int no=1971547999;
		String str=String.valueOf(no);
		int[] arr=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]++;
		}
		for(int i=48;i<58;i++) {
			if(arr[i]>0)
				System.out.println((char)i+"----->"+arr[i]);
		}
	}

}
