import java.util.*;


class Ex4{

	public int [] ex4_1(int [] a) {
        Arrays.sort(a);
        return a;
    }


	public int [] ex4_2(int [] a){
        List<Integer> list = new ArrayList<Integer>();

        for (int tmp : a) {
            list.add((Integer)tmp);
        }
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
	}


	public String [] ex4_3(int [] a){
        String [] hantei = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                hantei[i] = "負";
            } else if (a[i] > 0) {
                hantei[i] = "正";
            } else {
                hantei[i] = "零";
            }
        }
        return hantei;
	}


	public int ex4_4(int a){
        int len = String.valueOf(a).length();
        return len;
	}

	public int ex4_5(int a){
        int i = 1;
        int sum = 0;
        while (i < a) {
            i += 1;
            sum += i;
        }
		return sum + 1;
	}

	public int [] ex4_6(int a){
        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                array.add(i);
            }
        }
        int [] ret = new int[array.size()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = array.get(i);
        }
        return ret;
	}

	public boolean ex4_7(int a){
        int ret = 0;
        for (int i = 1; i <=a; i++) {
            if (a % i == 0) {
                ret++;
            }
        } if (ret == 2) {
            return true;
        } else {
        return false;
        }
	}

	public int ex4_8(int [] a){
        int ret = 0;
        for (int i = 0; i < a.length; i++) {
            ret += a[i];
            }
		return ret;
	}

	public int ex4_9(int [] a){
        float sum = 0;

        for (int i : a) {
            sum += i;
        }
        int ret = Math.round(sum/a.length);
        return ret;
    }
}
