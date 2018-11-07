class Ex7{

	public int ex7_1(int a, int b){
        return Math.min(a, b);
	}

	public int ex7_1(int a, int b, int c){
	    if (a < Math.min(b, c)) {
            return c;
        } else {
            return Math.min(b, c);
        }
	}

	public int ex7_1(int [] a){
        int min = a[0];
	    for (int i=1; i<a.length; i++) {
            min = Math.min(min, a[i]);
        }	
		return min;
	}

	public int ex7_2(int x){
		return Math.abs(x);
	}

	public long ex7_2(long x){
		return Math.abs(x);
	}

	public float ex7_2(float x){
		return Math.abs(x);
	}

	public double ex7_2(double x){
		return Math.abs(x);
	}

	public String ex7_3(byte x){
		
		String ret = "";
		
		return ret;
	}

	public String ex7_3(short x){
		
		String ret = "";
		
		return ret;
	}

	public String ex7_3(int x){
		
		String ret = "";
		
		return ret;
	}

	public String ex7_3(long x){
		
		String ret = "";
		
		return ret;
	}
}