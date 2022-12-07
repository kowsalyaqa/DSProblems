package stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class NumberofStudentsUnabletoEatLunch1700 {
	@Test
	public void tdp2() {
		int[] students = { 1,1,1,0,0,1 };
		int[] sandwiches = {1,0,0,0,1,1 };
		int expected = 3;
		int actual = countStudents(students,sandwiches);
		Assert.assertEquals(expected, actual);
	}

	public int countStudents(int[] students, int[] sandwiches) {
		ArrayDeque<Integer> studentsList = new ArrayDeque<>();
		Stack<Integer> sandwichesList=new Stack<>();
		
		for(int i=sandwiches.length-1;i>=0;i--) {
			sandwichesList.push(sandwiches[i]);
		}

		for (int stu : students) {
			studentsList.add(stu);
		}
		
		for(int i=0;i<studentsList.size();i++) {
			if(studentsList.getFirst().equals(sandwichesList.peek())){
				sandwichesList.pop();
				studentsList.removeFirst();
			}else {
				studentsList.add(studentsList.getFirst());
			}	
			
		}

		return students.length;
	}
}
