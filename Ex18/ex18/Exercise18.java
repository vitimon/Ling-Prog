class Exercise18 {
    public static void main(String[] args) {

        System.out.println("Testing");

        public void f(int x, int y){
            x=1;
            y=3;
        }

        int[] A = new int[2];
        A[0]=0;
        A[1]=2;

        f(A[0] ,A[A[0]]);
    }
}