package problemsolving;

public class Palindrome {

	public static void main(String[] args) {
		String s="RADAR";
		int left=0,right=s.length()-1;
		while(left<=right){
			char l=s.charAt(left++);
			char r=s.charAt(right--);
			if(l==r) {
				System.out.print(l+"=="+r +" ");
			}else {
				System.out.println("Not a palindrome");
			}
		}
		

}
}