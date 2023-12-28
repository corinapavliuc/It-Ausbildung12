package summary15;

public class TestSwitch {
    public static void main(String[]args) {
        String str ="Montag";
        byte dayOfWeek =8;

        switch (str) {
            case "Montag" :
                dayOfWeek =1;
                break;
            case "Distang" :
                dayOfWeek =2;
                break;
            default: dayOfWeek = -1;
        }
        System.out.println(str+ " - das ist Tag -" +dayOfWeek);
           }
}
