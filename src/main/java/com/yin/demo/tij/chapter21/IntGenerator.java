package com.yin.demo.tij.chapter21;

/**
 * 为了将EvenChecker与我们要试验的各种类型的生成器解耦,我们将创建一个名为IntGenerator的抽象类,
 * 它包含EvenCheker必须了解的必不可少的方法：即一个next()方法,和一个可以执行撤销的方法
 * 
 * InGenerator有一个cancel()方法,可以修改boolean类型的canceled标志的状态;还有一个isCanceled()方法,
 * 可以查看该对象是否已经被取消。因为canceled标志是Boolean类型的,所以他是原子性的
 * 
 * @author yixunzhi
 * @createdTime 2015年8月5日下午2:53:51
 * 
 */
public abstract class IntGenerator {
	private volatile boolean canceled = false;

	public abstract int next();

	public void cancel() {
		canceled = true;
	}

	public boolean isCanceled() {
		return canceled;
	}
}
