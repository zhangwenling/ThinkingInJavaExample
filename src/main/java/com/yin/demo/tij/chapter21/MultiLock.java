package com.yin.demo.tij.chapter21;

/**
 * 在main()中创建一个调用f1()的Thread,然后f1()和f2()互相调用直至count变为0.
 * 由于这个任务已经在第一个对f1()调用中获得mmultiLock对象锁,因此同一个任务将在对f2()的调用中再次获取这个锁,
 * 依次类推.这么做是有意义的,因为一个任务应该能够调用在同一个对象中的其他的synchronized方法,而这个任务已经持有锁.
 * 
 * 
 * @author yixunzhi
 * @createdTime 2015年8月10日下午5:54:19
 * 
 */
public class MultiLock {
	public synchronized void f1(int count) {
		if (count-- > 0) {
			System.out.println("f1() calling f2() with count " + count);
			f2(count);
		}
	}

	public synchronized void f2(int count) {
		if (count-- > 0) {
			System.out.println("f2() calling f1() with count " + count);
			f1(count);
		}
	}

	public static void main(String[] args) {
		final MultiLock multiLock = new MultiLock();
		new Thread() {
			public void run() {
				multiLock.f1(10);
			};
		}.start();
	}
}
