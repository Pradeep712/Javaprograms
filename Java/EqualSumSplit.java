public class EqualSumSplit {

    public static int solution( int[] A ) {

        int[] B = new int[A.length];
        int[] C = new int[A.length];

        int sum = 0;
        for (int i=0; i< A.length; i++) {
            sum += A[i];
            B[i] = sum;
            System.out.print(B[i]+" ");
        }   
        System.out.println();

        sum = 0;
        for (int i=A.length-1; i>=0; i--) {
            sum += A[i];
            C[i] = sum;
            System.out.print(C[i]+" ");
        }
        System.out.println();

        for (int i=0; i< A.length-1; i++) {
            if (B[i] == C[i+1]) {
                System.out.println(i+" "+B[i]);
                return i;
            }
        }

        return -1;

    }

     public static void main(String args[] ) {
         int[] A = {-7, 1, 2, 3, -4, 3, 0};
         int[] B = {10, 20 , 30 , 5 , 40 , 50 , 40 , 15};        
         solution(A);
         solution(B);
     }

}

