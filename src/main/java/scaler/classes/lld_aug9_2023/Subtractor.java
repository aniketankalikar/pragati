package scaler.classes.lld_aug9_2023;

public class Subtractor implements Runnable{

private Count count;
	
	public Subtractor(Count c)
	{
		this.count = c;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i< 100;i++)
		{
			int value = count.getValue();
			value = value - i;
			count.setValue(value);
		
		}
	}

}
