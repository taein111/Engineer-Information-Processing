package day03;

class ovr1 {

	public static void main(String[] args) {
		ovr1 a1 = new ovr1();
		ovr2 a2 = new ovr2();
		System.out.print(a1.san(3, 2) + a2.san(3, 2)); // 5 + 6 = 11
	}

	int san(int x, int y) { 
		return x+y;        
	}
}

class ovr2 extends ovr1{
	int san(int x, int y) { //( 3, 2 )
		return x - y + super.san(x,y); // 3-2 + 부모의(ovr1).san 즉, 3+2    => 3-2 + 3+2
	}
}
