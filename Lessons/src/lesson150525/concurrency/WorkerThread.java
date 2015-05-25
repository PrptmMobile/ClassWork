package lesson150525.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public class WorkerThread implements Executor {

	private Queue<Runnable> _taskQueue = new LinkedList<>();

	public WorkerThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Runnable task;
					synchronized (_taskQueue) {
						while (_taskQueue.isEmpty()) {
							try {
								_taskQueue.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						task = _taskQueue.remove();
					}
					task.run();
				}
			}
		}, "Worker").start();
	}

	@Override
	public void execute(final Runnable task) {
		synchronized (_taskQueue) {
			_taskQueue.add(task);
			_taskQueue.notifyAll();
		}
	}

}
