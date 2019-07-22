package day6;

interface FirstIn{
	public void firstMeth();
}

interface SecondIn{
	public void secondMeth();
}

interface ThirdIn extends FirstIn,SecondIn{
	
}

public class InterfaceMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
