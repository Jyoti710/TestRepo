
class FirstProg {
	static int i =0;
	//int i = 0;
	public static void main(String[] args) {
		
		FirstProg obj1 = new FirstProg();
		FirstProg obj2 = new FirstProg();		
		obj1.increment();
		obj2.increment();	
	}
	
	public void increment(){
		i++;
		System.out.println(i);
		//System.out.println(j);
		
	}

}
