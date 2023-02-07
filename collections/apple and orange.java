  public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int c1=0;
        int c2=0;
        for(int i=0;i<apples.size();i++){
            int c=a+apples.get(i);
            if(c>=s && c<=t){
                c1=c1+1;
            }
        }for(int i=0;i<oranges.size();i++){
            int c=b+oranges.get(i);
            if(c>=s && c<=t){
                c2=c2+1;
            }
        }
        System.out.println(c1);
        System.out.println(c2);

    }

}
