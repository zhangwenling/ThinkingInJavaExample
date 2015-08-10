package com.yin.demo.tij.chapter21;

import java.util.concurrent.TimeUnit;

public class InterruptingIdiom {
	public static void main(String[] args) throws NumberFormatException,
			InterruptedException {
		if (args.length != 1) {
			System.out.println("usage: java InterruptingIdiom delay-in-ms");
			System.exit(1);
		}

		Thread t = new Thread(new Blocked3());
		t.start();
		TimeUnit.MILLISECONDS.sleep(new Integer(args[0]));
		t.interrupt();
	}
}

class NeedsCleanup {
	private final int id;

	public NeedsCleanup(int ident) {
		id = ident;
		System.out.println("NeedsCleanup " + id);
	}

	public void cleanup() {
		System.out.println("Cleaning up " + id);
	}

}

class Blocked3 implements Runnable {
	private volatile double d = 0.0;
	public void run() {
		try {
			while (!Thread.interrupted()) {
				NeedsCleanup n1 = new NeedsCleanup(1);
				try {
					System.out.println("Sleeping");
					TimeUnit.SECONDS.sleep(1);
					NeedsCleanup n2 = new NeedsCleanup(2);
					try {
						System.out.println("Calculateing");
						for (int i = 1; i < 2500000; i++) {
							d = d + (Math.PI + Math.E) / d;
						}
						System.out
								.println("Finished time-consuming operationg");
					} finally {
						n2.cleanup();
					}
				} finally {
					n1.cleanup();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
