package SortingTechinques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Arrays.Emp;

public class Student implements Comparator {

	int sid;
	String sname;

	public Student(int sid, String sname) {
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.sname = sname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(111, "SriHari"));
		al.add(new Student(222, "Naidu"));

		for (Student str : al) {
			System.out.println(str.sid + "===" + str.sname);
		}

	}

	 public int compareTo(Student o1) {
	 // TODO Auto-generated method stub
	 Student s = (Student) o1;
	
	 if (sid == s.sid) {
	 return 0;
	 } else if (sid > s.sid) {
	 return 1;
	 } else {
	 return -1;
	 }
	 }
//
//	public int compareTo1(Student o2) {
//		// TODO Auto-generated method stub
//		return sname.compareTo(o2.sname);
//	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
