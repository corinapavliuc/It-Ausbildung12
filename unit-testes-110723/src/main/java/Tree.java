import static java.lang.Math.abs;

public class Tree {

    public  int garlandLength(int[] bublles){
        int lenght =0;

for (int i=1; i < bublles.length; i++){
    //magic calculation..
//    lenght= (bublles[1] - bublles[0])+ (bublles[2] - bublles[1])
//            +
//            (bublles[3] - bublles[2]) +(bublles[4]-bublles[3]);

    lenght= lenght + abs(bublles[i] - bublles[i-1]);
}

        return lenght;
    }
}
