package scaler.classes.lld_aug9_2023;

public class Adder implements Runnable{

	private Count count;
	
	public Adder(Count c)
	{
		this.count = c;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i< 100;i++)
		{
			int value = count.getValue();
			value = value + i;
			count.setValue(value);
		
		}
	}

}
