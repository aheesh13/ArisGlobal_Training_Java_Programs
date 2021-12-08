package com;

class DemoThreadInterface extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10;i++) {
		System.out.println("My Thread..."+i+" "+Thread.currentThread().getName());
	}
	}		

}
class MyThread{
	public static void main(String args[]) {
		DemoThreadInterface demothreadinterface=new DemoThreadInterface();
		Thread t1=new Thread(demothreadinterface);
		Thread t2=new Thread(demothreadinterface);
		t1.setName("Aheesh");
		t2.setName("Bharadwaj");
		t1.setPriority(10);
		t1.start();
		t2.start();
	} 
}