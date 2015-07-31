package com.yin.demo.tij.chapter21;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * Runnable是执行工作的独立任务，但是它不返回任何值。如果你希望任务在完成时能够返回一个值，
 * 那么可以实现Callable接口</br>
 * Callable是一种具有类型参数的泛型，它的类型参数表示的是从方法call()中返回的值，
 * 并且必须使用ExecutorService.submit()方法调用它</br>
 * submit()方法会产生Future对象,它用Callable返回结果的特定类型进行参数化.你可以用isDone()方法来查询Future
 * 是否已经完成。当任务完成时,它具有一个结果,你可以调用get()方法来获取结果。也可以不用isDone()进行检查直接调用get()，在这种情况
 * 下，get()将阻塞,直到结果准备就绪。
 * @author yixunzhi
 * @createdTime 2015年7月31日下午4:00:52
 *
 */
public class TaskWithResult implements Callable<String>{
	private int id;
	
	public TaskWithResult(int id) {
		this.id = id;
	}

	public String call() throws Exception {
		return "result of taskWithResult " + id;
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++){
			results.add(exec.submit(new TaskWithResult(i)));
		}
		for (Future<String> future : results) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				exec.shutdown();
			}
		}
	}

}
