package learningjava;

public class fortest {
	public int Jc(int m){
		int n = 1;
		for(int i=1;i<=m;i++){
			n *= i;
		}
		return n;
	}
	
	public int countZero(String m){
		int s = Integer.parseInt(m);
		int ss = Jc(s);
		//System.out.println(ss);
		String sss = String.valueOf(ss);
		char[] ans = sss.toCharArray();
		int count = 0;
		for(int i=0;i<ans.length;i++){
			//System.out.println(ans[i]);
			if(ans[i]=='0'){
				count +=1;
			}
			
		}
		System.out.print(count);
		return count;
	}
	
	public static void main(String[] args){
		fortest c = new fortest();
		int cc = c.countZero("10");
		System.out.println("The answer is "+cc);
		
	}
	

}
