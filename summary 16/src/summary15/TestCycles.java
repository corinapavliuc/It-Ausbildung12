package summary15;

public class TestCycles {
    public static void main(String[]args) {
        int[] arr= {1,2,3,4,5};

        int i=8;
        while (i<5){

            System.out.println(arr[i]);
            i++;
        }
        for (i=0; i<5; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        i=8;
        do{
          if(i>2) break;
            System.out.println(arr[i]);

            i++;
        }while(i<5);
    }

}
