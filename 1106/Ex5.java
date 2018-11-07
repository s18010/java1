class Ex5{

	public double ex5_1(int [] a){
		double sum = 0;
        for (int i = 0; i < a.length; i ++) {
            sum += a[i];
        }

        double ret = sum / a.length;
		return ret;
	}
}