package ConceptsLearning;

public class StringClassInbuiltFunctions {
	public static void main(String[] args) {
		String s="";
		String s1="";
		char[]c=new char[10];
		StringBuilder sb=new StringBuilder();
		s.charAt(0);
		s.codePointAt(0);
		s.codePointBefore(0);
		s.codePointCount(0, 0);
		s.compareTo(s1);
		s.compareToIgnoreCase(s1);
		s.concat(s1);
		s.contains(s1);
		s.contentEquals(s1);
		s.contentEquals(null);
		s.endsWith("aaa");
		s.equals(sb);
		s.equalsIgnoreCase("aa");
		s.getBytes();
		s.getBytes(c);
		s.getBytes(s);
		s.getBytes(0, 0, null, 0);
		s.getChars(0, 0, c, 0);
		s.getClass();
		s.hashCode();
		s.indexOf(0);
		s.indexOf(s);
		s.indexOf(0, 0);
		s.indexOf(s, 0);
		s.intern();
		s.isEmpty();
		s.lastIndexOf(0);
		s.lastIndexOf(s);
		s.lastIndexOf(0, 0);
		s.lastIndexOf(s, 0);
		s.length();
		s.matches(s1);
		s.notify();
		s.notifyAll();
		s.offsetByCodePoints(0, 0);
		s.regionMatches(0, s1, 0, 0);
		s.regionMatches(false, 0, s1, 0, 0);
		s.replace(0, 0);
		s.replace(s1, sb);
		s.replaceAll(s, s1);
		s.replaceFirst(s, s1);
		s.split(s1);
		s.split(s1, 0);
		s.startsWith(s1);
		s.startsWith(s1, 0);
		s.subSequence(0, 0);
		s.substring(0);
		s.substring(0, 0);
		s.toCharArray();
		s.toLowerCase();
		s.toLowerCase(null);
		s.toString();
		s.toUpperCase();
		s.toUpperCase(null);
		s.trim();
		s.wait();
		s.wait(0);
		s.wait(0, 0);
		s.copyValueOf(c);
		s.copyValueOf(c, 0, 0);
		s.format(s1, args);
		s.format(null, s1, args);
		s.join(sb, args);
		s.join(sb, null);
		s.valueOf(false);
		s.valueOf(c, 0, 0);
		
		
		
							
	
	}

}
