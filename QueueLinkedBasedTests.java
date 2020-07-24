package eg.edu.alexu.csd.datastructure.queue.cs34_cs40;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueLinkedBasedTests {

	@Test
	public void test() {
		QueueLinkedBased queue = new QueueLinkedBased();
		assertTrue(queue.isEmpty());
		assertNull(queue.dequeue());
		queue.enqueue(5);
		queue.enqueue(2);
		assertFalse(queue.isEmpty());
		assertEquals(2, queue.size());
		assertEquals(5, queue.dequeue());
		queue.dequeue();
		assertTrue(queue.isEmpty());
		assertNull(queue.dequeue());
		queue.enqueue(5);queue.enqueue(4);queue.enqueue(3);queue.enqueue(2);queue.enqueue(1);
		assertEquals(5, queue.size());
		assertEquals(5, queue.dequeue());
	}

}
