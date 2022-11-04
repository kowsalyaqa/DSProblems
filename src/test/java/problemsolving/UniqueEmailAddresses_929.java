package problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class UniqueEmailAddresses_929 {


	/*Test Data:
	 * 
	 * Example 1:
		Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
		Output: 2
		Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
	 * 
	 * Example 2:
		Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
		Output: 3


		PseudoCode:
		===================		
		1.Read String Array emails
		2.Initialize String strPrefix="",String strSuffix="", int count=0
		3.Iterate for loop using String array length to take each array element 
		4.Split using @ for emails[i] into String[] str=emails[i].split("@");
		5.Initialize boolean prefixFlag=false, suffixFlag=false
		7.Convert str[i] into char array, Convert str[str.length-1] into char array
		6.Iterate first inner for loop using char.length
		7.char[0] should not startss with '+',else break the loop
		8.inside if condition, check it is '.', then add '',Append char with strprefix
		9.Iterate for loop using ends with .com, then proceed . should appear only one time
		10. if yes flag =true
		11.compare both flag is true ,add in set
		12.once loop is completed return set.size() and compare with expected value

		Time Complexity - O(N^4)
		Space Complexity - O(N)
		
		Total time: 3 hour 18mins
		------------
		1. 7:30 mins
		2. 14 mins
		3. 27 mins
		4. 40 mins
		5. 1 hour 50 mins




	 */

	@Test
	public void tdp1() {
		String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int expected=2;
		int actual=numUniqueEmails(emails);
		Assert.assertEquals(expected, actual);
	}


	@Test
	public void tdp2() {
		String[] emails={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		int expected=3;
		int actual=numUniqueEmails(emails);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String[] emails={"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};
		int expected=2;
		int actual=numUniqueEmails(emails);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp4() {
		String[] emails={"fz.k+h.vulyve@ownxv.fvxas.com","fz.k+g+f.ni.op.c@ownxv.fvxas.com","fz.k+hbdezld@ownxv.fvxas.com","h+hkhtc+c.dun@r.oy.com","fz.k+z.nben.hw@ownxv.fvxas.com","fz.k+et.ef+owb@ownxv.fvxas.com"};
		int expected=2;
		int actual=numUniqueEmails(emails);
		Assert.assertEquals(expected, actual);
	}

	public int numUniqueEmails(String[] emails) {
		String strPrefix="",strSuffix="";
		int count=0,x=0;
		boolean flagPrefix=false,flagSuffix=false;
		Set<String> set=new HashSet<>();

		for(int i=0;i<emails.length;i++) {
			String[] str=emails[i].split("@");	
			char[] prefixChar=str[0].toCharArray();
			char[] suffixChar=str[str.length-1].toCharArray();

			for(int j=0;j<prefixChar.length;j++){
				if(prefixChar[0]!='+') {
					if(prefixChar[j]=='.') {
						strPrefix=strPrefix+"";
					}else if(prefixChar[j]=='+'){
						break;
					}else {
						strPrefix=strPrefix+prefixChar[j];
					}
				}else {
					break;
				}
			}
			if(!strPrefix.contains(".") && !strPrefix.contains("+")) {
				flagPrefix=true;
			}


			count=0;
			for(int k=0;k<suffixChar.length;k++) {
				if(str[str.length-1].endsWith(".com")) {
					if(suffixChar[k]=='.'& count==0) {
						count++;
						strSuffix=strSuffix+suffixChar[k];
					}else if(count<=1) {
						strSuffix=strSuffix+suffixChar[k];
					}else {
						break;
					}
				}else {
					break;
				}
			}
			int dotCount=0;
			for(int a=0;a<strSuffix.length();a++) {
				if(strSuffix.charAt(a)=='.') {
					dotCount++;
				}
			}
			if(dotCount>0) flagSuffix=true;

			String s1=strPrefix+"@"+strSuffix;
			System.out.println(s1);
			if (flagPrefix==true && flagSuffix==true) {
				set.add(s1);
			}
			strPrefix="";
			strSuffix="";
			flagPrefix=false;
			flagSuffix=false;
		}
		System.out.println(set);
		
		return set.size();
	}





}
