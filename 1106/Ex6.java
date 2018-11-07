import java.util.*;


class Ex6{

    public int [] ex6_1(){

        int [] ret = new int[]{5,4,3,2,1};
        return ret;
    }

    public double [] ex6_2(){

        double [] ret = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        return ret;
    }

    public int [] ex6_3(int a, int b){

        int [] ret = new int[a];
        for (int i=0; i<ret.length; i++) {
            ret[i] = b;
        }
        return ret;
    }

    public int [] ex6_4(int [] a){

        int [] vals = new int[4];
        float sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }

        int avg = 0;
        avg = Math.round(sum / a.length);

        Arrays.sort(a);
        int max = a[a.length - 1];
        int min = a[0];

        vals[0] = (int)sum;
        vals[1] = avg;
        vals[2] = max;
        vals[3] = min;
        return vals;
    }

    public int ex6_5(int [] a, int key){

        int ret = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] == key) {
                ret = i;
                break;
            }
            else {
                ret = -1;
            }

        }
        return ret;
    }


    public int ex6_6(int [] a, int key){

        int ret = 0;
        for (int i=a.length-1; i>0; i--) {
            if (a[i] == key) {
                ret = i;
                break;
            }
            else {
                ret = -1;
            }

        }
        return ret;
    }


    public int [] ex6_7(int [] a, int idx){

        //        int [] ret = new int[a.length - 1];
        //        for (int i=0; i<a.length; i++) {
        //            if (ret[i] != idx) {
        //                ret[i] = a[i];


        List<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }
        list.remove(idx);

        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;

        }


    public int [] ex6_8(int [] a, int idx, int n){
        List<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }
        for (int i=0; i<n; i++) {
            if (idx == n) {
                continue;
            } else {
                list.remove(idx);
            }
        }
        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public int [] ex6_9(int [] a, int idx, int x){
        List<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }
        list.add(idx, x);

        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }


    public void ex6_10(int [] a, int [] b){
        if (a.length <= b.length) {
            int [] tmp = new int [b.length];
            for (int i=0; i<a.length; i++) {
                tmp[i] = a[i];
                a[i] = b[i];
                b[i] = tmp[i];
            }
        }
        if (b.length < a.length) {
            int [] tmp = new int[a.length];
            for (int i=0; i<b.length; i++) {
                tmp[i] = b[i];
                b[i] = a[i];
                a[i] = tmp[i];
            }
        }
    }

    public int [] ex6_11(int [] a){

        int [] ret = new int[a.length];
        for (int i=0; i<a.length; i++) {
            ret[i] = a[i];
        }
        return ret;
    }

    public int [] ex6_12(int [] a, int x){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<a.length; i++) {
            if (a[i] == x) {
                list.add(i);
            }
        }
        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }


    public int [] ex6_13(int [] a, int idx){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<a.length; i++) {
            if (i == idx) {
                continue;
            }
            list.add(a[i]);
        }

        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public int [] ex6_14(int [] a, int idx, int n){
        List<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }
        for (int i=0; i<n; i++) {
            if (list.size()-1 < idx) break;
            list.remove(idx);
        }
        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public int [] ex6_15(int [] a, int idx, int x){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<a.length; i++) {
            list.add(a[i]);
        }

        if (idx > 0) {
            list.add(idx, x);
        } else {
            list.add(0, x);
        }

        int [] array = new int[list.size()];
        for (int i=0; i<array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}