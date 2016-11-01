package week5;


public class FP {
	int input=4;
	int output=14;
	int check=17;
	int logicFile=6;
	int outerInterface=0;

	public static void main(String[] args) {
		new FP().print();

	}
	
	private void print() {
		double FP=(input*4+output*5+check*4+logicFile*10+outerInterface*7)*1.05;
		System.out.println(FP);
	}

}
