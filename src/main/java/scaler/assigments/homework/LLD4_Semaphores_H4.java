package scaler.assigments.homework;

import java.util.concurrent.Semaphore;

public class LLD4_Semaphores_H4 {
	
	Semaphore hyd = null;
    Semaphore oxy = null;

	public static void main(String args[]) {
		LLD4_Semaphores_H4 obj = new LLD4_Semaphores_H4();
		
	}

	public LLD4_Semaphores_H4() {
		 hyd = new Semaphore(2);
	     oxy = new Semaphore(0);
	}

	public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		hyd.acquire();
		// releaseHydrogen.run() outputs "H". Do not change or remove this line.
		releaseHydrogen.run();
		if(hyd.availablePermits()==0)
		{
			oxy.release();
		}
	}

	public void oxygen(Runnable releaseOxygen) throws InterruptedException {

		oxy.acquire();
		// releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();
		hyd.release(2);
	}
}
