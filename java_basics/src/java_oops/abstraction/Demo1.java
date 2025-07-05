package java_oops.abstraction;

public class Demo1 {

	public static void main(String a[]) {
		Remote re = new RemoteImplementation();
		re.volumeDnc();
	}
}

//100% - abstraction
interface Remote{
    double volumeInc();
	double volumeDnc();
	
	//concrete methods - static, default, private
	default void power() {
		
	}
}

interface smartRemote extends Remote{
	
}

class RemoteImplementation implements Remote{
	
	int a1_$;

	@Override
	public double volumeInc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volumeDnc() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
