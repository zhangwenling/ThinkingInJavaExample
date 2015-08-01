package com.yin.demo.tij.chapter21;

/**
 * 
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:24:47
 * 
 */
public class ThreadVariations {
	public static void main(String[] args) {
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnable1("InnerRunnable1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask();
	}
}

/**
 * 使用内部类
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:51:30
 * 
 */
class InnerThread1 {
	private int countDown = 5;
	private Inner inner;

	private class Inner extends Thread {
		Inner(String name) {
			super(name);
			start();
		}

		@Override
		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
					sleep(10);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		@Override
		public String toString() {
			return getName() + ":" + countDown;
		}
	}

	public InnerThread1(String name) {
		this.inner = new Inner(name);
	}
}

/**
 * 使用匿名内部类
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:48:07
 * 
 */
class InnerThread2 {
	private int countDown = 5;
	private Thread t;

	public InnerThread2(String name) {
		t = new Thread(name) {
			@Override
			public void run() {
				try {
					while (true) {
						System.out.println(this);
						if (--countDown == 0) {
							return;
						}
						sleep(10);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			@Override
			public String toString() {
				return getName() + ":" + countDown;
			}
		};
	}
}

/**
 * 使用内部类 实现Runnable接口
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:51:30
 * 
 */
class InnerRunnable1 {
	private int countDown = 5;
	private Inner inner;

	private class Inner implements Runnable {
		Thread t;

		Inner(String name) {
			t = new Thread(name);
			t.start();
		}

		public void run() {
			try {
				while (true) {
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
					Thread.sleep(10);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		@Override
		public String toString() {
			return Thread.currentThread().getName() + ":" + countDown;
		}
	}

	public InnerRunnable1(String name) {
		this.inner = new Inner(name);
	}
}

/**
 * 使用匿名内部类 实现runnable接口
 * 
 * @author yixunzhi
 * @createdTime 2015年8月1日上午11:48:07
 * 
 */
class InnerRunnable2 {
	private int countDown = 5;
	private Thread t;

	public InnerRunnable2(String name) {
		t = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						System.out.println(this);
						if (--countDown == 0) {
							return;
						}
						Thread.sleep(10);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			@Override
			public String toString() {
				return Thread.currentThread().getName() + ":" + countDown;
			}
		}, name);
		t.start();
	}
}

class ThreadMethod{
	private int countDown = 5;
	private Thread t ;
	private String name;
	public ThreadMethod(String name){
		this.name = name;
	}
	public void runTask(){
		if(t == null){
			t = new Thread(name){
				public void run() {
					try {
						while(true){
							System.out.println(this);
							if(--countDown==0){
								return;
							}
							Thread.sleep(10);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				@Override
				public String toString() {
					return getName()+":"+countDown;
				}
				
			};
			t.start();
		}
	}
}


