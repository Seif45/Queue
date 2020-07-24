package eg.edu.alexu.csd.datastructure.queue.cs34_cs40;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueArrayBasedTests {

	@Test
	public void test1() {
		QueueArrayBased Que = new QueueArrayBased(10);
		assertEquals(true, Que.isEmpty());
	}
	
	@Test
	public void test2() {
		QueueArrayBased Que = new QueueArrayBased(10);
		Que.enqueue(1);
		Que.enqueue(2);
		Que.enqueue(3);
		Que.enqueue(4);
		Que.enqueue(5);
		Que.enqueue(6);
		Que.enqueue(7);
		Que.enqueue(8);
		Que.enqueue(9);
		Que.enqueue(10);
		assertEquals(1, (int)Que.dequeue());
		assertEquals(2, (int)Que.dequeue());
		assertEquals(3, (int)Que.dequeue());
		assertEquals(4, (int)Que.dequeue());
		assertEquals(5, (int)Que.dequeue());
		assertEquals(6, (int)Que.dequeue());
		assertEquals(7, (int)Que.dequeue());
		assertEquals(8, (int)Que.dequeue());
		assertEquals(9, (int)Que.dequeue());
		assertEquals(10, (int)Que.dequeue());
		assertEquals(true, Que.isEmpty());
	}
	
	@Test
	public void test3() {
		QueueArrayBased Que = new QueueArrayBased(3);
		Que.enqueue(1);
		Que.enqueue(2);
		Que.enqueue(3);
		Que.dequeue();
		Que.dequeue();
		Que.dequeue();
		Que.enqueue(4);
		Que.enqueue(5);
		assertEquals(4, (int)Que.dequeue());
}

}
