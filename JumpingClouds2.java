static int jumpingOnClouds(int[] c, int k) {

        int e=100;
        for(int i=0;i<c.length;){
            int index=(i+k)%c.length;
            i=index;
            e--;
            if(c[index]==1){
                e=e-2;
            }
            if(index==0){
                break;
            }
        }
        return e;
    }
