package practice;

public class main implements grandmother,mother {
	public static void main(String[] args)
	{
		main m=new main();
		m.cooking();
		m.care();
	}


@Override
public void cooking() {
	// TODO Auto-generated method stub
	System.out.println("cookknbg");
}

@Override
public void working() {
	System.out.println("my mom is working");
	
}

@Override
public void love() {
	// TODO Auto-generated method stub
	System.out.println("loving and caring");
}

@Override
public void care() {
	// TODO Auto-generated method stub
	System.out.println("sweet");
}
}
