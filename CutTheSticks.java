public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
        List<Integer> list=new ArrayList<Integer>();
        while(arr.size()!=0){
            list.add(arr.size());
            int val=Collections.min(arr);
            //arr.remove(0);
            for(int i=0;i<arr.size();){
                arr.set(i, arr.get(i)-val);
                if(arr.get(i)==0){
                    arr.remove(i);
                }else{
                    //arr.add(i, arr.get(i)-val);
                    i++;
                }
            }
           
        }
        return list;
    }
