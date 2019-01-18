package specialTopics.Generics;

class TwoD { // 2D coordinates
	int x, y;

	TwoD(int a, int b) {
		x = a;
		y = b;
	}
}

class ThreeD extends TwoD { // 3D coordinates
	int z;

	ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}
}

class FourD extends ThreeD { // 4D coordinates
	int t;

	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t = d;
	}
}

class Coords<T extends TwoD>{       // holds array of coordinates
	T[] coords;
	
	Coords(T[] o) { coords = o; }
}

class BoundWildCard {
	static void showXY(Coords<?> c) {
		System.out.println("X Y coordinates: ");
		for (int i=0; i<c.coords.length; i++)
			System.out.println((c.coords[i].x + " " + c.coords[i].y));
		System.out.println();
	}
	
	static void showXYZ(Coords<? extends ThreeD> c) {  // bounded wild card
		System.out.println("X Y Z coordinates: ");
		for (int i=0; i<c.coords.length; i++)
			System.out.println((c.coords[i].x + " " + c.coords[i].y) + " " + c.coords[i].z);
		System.out.println();
	}
	
	static void showALL(Coords<? extends FourD> c) {  // bounded wild card
		System.out.println("X Y Z T coordinates: ");
		for (int i=0; i<c.coords.length; i++)
			System.out.println((c.coords[i].x + " " + c.coords[i].y) + " " + c.coords[i].z + " " + c.coords[i].t);
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoD td[] = {
				new TwoD(0,0),
				new TwoD(7,9),
				new TwoD(18,4),
				new TwoD(-1, -23)
		};
		Coords<TwoD> tdlocs = new Coords<>(td);
		System.out.println("Contents of tdlocs.");
		showXY(tdlocs);
//		showXYZ(tdlocs);     // not allowed by bounded wild card
//		showALL(tdlocs);     // not allowed by bounded wild card
		
		FourD fd[] = {
				new FourD(1,2,3,4),
				new FourD(5,6,7,8),
				new FourD(9,10,11,12),
				new FourD(2,1,0,-1),

		};
		Coords<FourD> fdlocs = new Coords<>(fd);
		System.out.println("Contents of fdlocs.");
		showXY(fdlocs);
		showXYZ(fdlocs);     
		showALL(fdlocs);     
	}
}

