package scaler.classes.lld_aug7_2023;

import java.util.concurrent.Callable;

public class SquareCallable implements Callable<Integer>{

	private Integer number;
	
	public SquareCallable(Integer  no)
	{
		this.number  = no;
	}
	
	@Override
	public Integer call() throws Exception {
	
		return number*number;
	}
	
	

}
