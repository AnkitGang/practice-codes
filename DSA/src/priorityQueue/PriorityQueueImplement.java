package priorityQueue;

import java.util.*;

public class PriorityQueueImplement {
	private static class Student implements Comparable<Student> {
		String name;
		int rank;
		
		public Student(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}
		
		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>();		// Ascending Order
		PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder());		// Descending Order
		
		pq.add(new Student("A", 4));			pq1.add(new Student("A", 4));
		pq.add(new Student("B", 5));			pq1.add(new Student("B", 5));
		pq.add(new Student("C", 2));			pq1.add(new Student("C", 2));
		pq.add(new Student("D", 12));			pq1.add(new Student("D", 12));
		
		System.out.println("----------Ascending Order-----------");
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name + " -> " + pq.peek().rank);
			pq.remove();
		}
		
		System.out.println("----------Descending Order-----------");
		while(!pq1.isEmpty()) {
			System.out.println(pq1.peek().name + " -> " + pq1.peek().rank);
			pq1.remove();
		}
	}
}
