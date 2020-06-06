package HappyBrithday;

import java.util.Scanner;

public class HappyBrithday {

    public static void main(String[] args) {
        Name();
    }

    private static void Name() {
        System.out.println("Enter Your Name :");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Your Birthday Month :");
        String month = sc.nextLine();
        System.out.println("Enter Your Birthday Date :");
        int date =sc.nextInt();
        System.out.println("Your name is "+name+".");
        System.out.println("Your Birth date is "+date+" "+month);
        System.out.println("Is Today Your Birthday..?(Yes/No)");
        Scanner c =new Scanner(System.in);
        String Ys = c.nextLine();
        Boolean Yes = true;
        Boolean No = false;
        if (Yes) {
            System.out.println("Are You Sure?(Yes/No)");
            Ys =c.nextLine();
            System.out.println("Are You Really Sure?(Yes/No)");
            Ys =c.nextLine();
            System.out.println("Are You REALLY REALLY Sure?(Yess/No)");
            Ys = c.nextLine();
                System.out.println("OKAY! I GOT SOMETHING FOR YOU");
                System.out.println("");
                System.out.println("");
                System.out.println(".______________________________________________________________________________________________________________________________.");
                System.out.println("|                                |-|     |-|  |--------|  |--------|  |--------|  |-|    |_|                                   |");
                System.out.println("|                                | |     | |  | .____. |  | .____. |  | .____. |  | |    | |                                   | ");
                System.out.println("|                                | |     | |  | |    | |  | |    | |  | |    | |  | |    | |                                   | ");
                System.out.println("|                                | |_____| |  | |____| |  | |____| |  | |____| |  | |____| |                                   | ");
                System.out.println("|                                | ._____. |  | .____. |  | .______|  | .______|  |______. |                                   | ");
                System.out.println("|                                | |     | |  | |    | |  | |         | |                | |                                   | ");
                System.out.println("|                                | |     | |  | |    | |  | |         | |         |-|____| |                                   | " );
                System.out.println("|                                |_|     |_|  |_|    |_|  |_|         |_|         |________|                                   | ");
                System.out.println("|                                                                                                                              |                         ");
                System.out.println("|  |---------|  |-------------|  |----------|  |------------|  |-|       |-|  |-|___________.  |----------|  |-|       |-|     |");
                System.out.println("|  | ._____. |  |_____. ._____|  |  .____.  |  |____. ._____|  | |       | |  | ._________. |  | .______. |  | |       | |     |");
                System.out.println("|  | |     | |        | |        |  |    |  |       | |        | |       | |  | |         | |  | |      | |  | |       | |     |");
                System.out.println("|  | |_____| |        | |        |  |____|  |       | |        | |_______| |  | |         | |  | |      | |  | |_______| |     |   ");
                System.out.println("|  |----------.       | |        | .________|       | |        | ._______. |  | |         | |  | |______| |  |_________. |     |  ");
                System.out.println("|  | .______. |       | |        | ._______. |      | |        | |       | |  | |         | |  | .______. |            | |     |");
                System.out.println("|  | |      | |       | |        | |       | |      | |        | |       | |  | |         | |  | |      | |            | |     |");
                System.out.println("|  | |______| | |-----| |----|   | |       | |      | |        | |       | |  | |_________| |  | |      | |  |-|_______| |     |");
                System.out.println("|  |__________| |____________|   |_|       |_|      |_|        |_|       |_|  |_____________|  |_|      |_|  |___________|     |");
                System.out.println("|______________________________________________________________________________________________________________________________|");

        }else if (No){
            System.out.println("Birthday's coming up ");
        }else {
            System.out.println("INVAILD INPUT.....TRY AGAIN.....!!!");
        }


    }
}
