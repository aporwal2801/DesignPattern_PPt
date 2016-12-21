package com.sapient.practice.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentIncrement implements Runnable {

	public static AtomicInteger increment = null;
	public final int moduloVal;

	public ConcurrentIncrement(int noOfThreads) {
		moduloVal = noOfThreads;
		increment = new AtomicInteger(0);
	}

	@Override
	public void run() {

		while (increment.intValue() < 12) {

			if (Thread
					.currentThread()
					.getName()
					.equalsIgnoreCase(
							String.valueOf(increment.intValue() % moduloVal))) {
				System.out.println("Increment Value by Thread = "
						+ Thread.currentThread().getName() + " : "
						+ increment.getAndIncrement());

			}
		}
	}

	public static void main(String[] args) {

		int cap = 3;
		Thread IncrementWithThreadsFirst = new Thread(new ConcurrentIncrement(
				cap), "0");
		Thread IncrementWithThreadsSecond = new Thread(new ConcurrentIncrement(
				cap), "1");
		Thread IncrementWithThreadsThird = new Thread(new ConcurrentIncrement(
				cap), "2");

		IncrementWithThreadsFirst.start();
		IncrementWithThreadsSecond.start();
		IncrementWithThreadsThird.start();

	}

}
