class Ex3{

	public String ex3_0(int n){
        if (n > 0) {
            return "その値は正です";
        } else {
            return "その値は０か負です";
        }
	}

	public int ex3_1(int n){
		return Math.abs(n);
	}

	public String ex3_2(int a, int b){
        if (a % b == 0) {
            return (String.format("%dは%dの約数です", b, a));
        } else {
            return (String.format("%dは%dの約数ではありません", b, a));
        }
	}

	public String ex3_3(int a, int b){
        if (a > b) {
            return (String.format("%dの方が大きいです", a));
        } else if (b > a) {
            return (String.format("%dの方が大きいです", b));
        } else {
            return "同じ値です";
        }
	}

	public String ex3_4(int a){
        if (a > 0) {
            if (a % 5 == 0) {
                return "その値は5で割り切れます";
            } else {
                return "その値は5で割り切れません";
            }
        } else {
            return "正でない整数値です";
        }
	}

	public String ex3_5(int a) {
    if (a > 0) {
            if (a % 10 == 0) {
                return "その値は10の倍数です";
            } else {
                return "その値は10の倍数ではありません";
            }
        } else {
            return "正でない整数値です";
        }
	}

	public String ex3_6(int a) {
        if (a > 0) {
            if (a % 3 == 0) {
                return "その値は3で割り切れます";
            } else if (a % 3 == 1) {
                return "その値を3で割った余りは1です";
            } else {
                return "その値を3で割った余りは2です";
            }
        } else {
            return "正でない整数値です";
        }
	}

	public String ex3_7(int a){
        if (a >= 0 && a <= 59) {
            return "不可";
        } if (a >= 60 && a<= 69) {
            return "可";
        } if (a >= 70 && a <= 79) {
            return "良";
        } if (a >= 80 && a <= 100) {
            return "優";
        } else {
            return "範囲(0～100)外の値です";
            }
	}

	public double ex3_8(double a, double b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
	}

	public int ex3_9(int a, int b){
        return Math.abs(a - b);
	}

	public String ex3_10(int a, int b){
        int diff = Math.abs(a - b);
        if (diff <= 10) {
            return "それらの差は10以下です";
        } else {
        return "それらの差は11以上です";
        }
	}

	public int ex3_11(int a, int b, int c) {
        if (a < Math.min(b, c)) {
            return a;
        } else {
            return Math.min(b, c);
        }
	}

	public int ex3_12(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        }
        else if (a > c) {
            return a;
        }
        else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

	public String ex3_13(int a){
        if (a == 1 || a == 2 || a == 12) {
            return "冬";
        } if (a >= 3 && 5 >= a) {
            return "春";
        } if (a >= 6 && 8 >= a) {
            return "夏";
        } if (a >= 9 && 11 >= a) {
            return "秋";
        } else  {
            return "範囲(1～12)外の値です";
        }
	}
}

