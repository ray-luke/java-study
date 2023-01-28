import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    //     // System.out.print("一つ目の数字を入力していください");
    //     // int number1 = scanner.nextInt();
    //     // System.out.print("二つ目の数字を入力していください");
    //     // int number2 = scanner.nextInt();
        
    //     // int answer= number1*number2;
    //     // System.out.println(answer);

    //     // System.out.print("計算式を入力してください");
    //     // int number1 = scanner.nextInt();
        
    //     //りんご問題練習

    //     // System.out.print("りんご1つ当たりの価格を入力してください");
    //     // int applePrice= scanner.nextInt();
        
    //     // System.out.print("購入するりんごの数を入力してください");
    //     // int appleAmount= scanner.nextInt();

    //     // int payment= applePrice*appleAmount;

    //     // System.out.println("お支払いは" +payment +"円です。");

    //     //ジャンケンゲーム作成
    //     // グーは「0」、チョキは「１」、パーは「2」で表現する
    //     // ユーザのじゃんけんの手は、キーボードから入力してもらう
    //     // 「0」「1」「2」以外のデータが入力された時は、再入力させる
    //     // コンピュータ側のじゃんけんの手は、乱数で自動的に求める
    //     // ユーザの判定結果(勝ち、負け、引き分け)を画面に表示する
    //     // メソッドを利用して作成する
    //     int userHand= getUser();
    //     int pcHand= getPc();

    //     String result= getResult(userHand, pcHand);

    //     System.out.println("あなたは"+result+"です");

    // } //main ends

    // public static int getUser () {
    //     Scanner scanner= new Scanner(System.in);
    //     while(true) {
    //     System.out.println("ジャンケンの手を入力してください。 グー:0, チョキ:1, パー:2");
    //     String userInput = scanner.next();
    //     //Stringで取得して、中身が整数かどうかチェックする
    //     if (userInput.hasNextInt()) {
    //         int userChoose= userInput.nextInt();
    //         if(userChoose<=-1 || userChoose>=3) {
    //             System.out.println("【エラー】0か1か2を入力してください");
    //             continue;
    //         }
    //     }else {
    //         return userChoose;
    //     }
    
    //  } //while ends
    // } //getUser ends

    // public static int getPc() {

    // }
    while(true) {
        int userHand= getUserHand();
        int pcHand= getPcHand();
        int result= battleResult(userHand, pcHand);

        if(result==5) {
            //5は勝ち
            System.out.println("おめでとうございます。あなたの勝ちです");
            break;
        }else if(result==6) {
            //6は負け
            System.out.println("残念。あなたの負けです");
            break;
        }else {
            //7はあいこ
            System.out.println("あいこでした");
        }
    }

    } //main method ends
    
    public static int getUserHand() {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("ジャンケンの手を選んでください");
        System.out.print("グー:0, チョキ:1, パー:2 あなたの手は？:");
        
        int userInput= scanner.nextInt();
        return userInput;

        }
        




        

    public static int getPcHand() {
        Random rand= new Random();
        return rand.nextInt(3);
    }
    
    public static int battleResult(int userChoose, int pcChoose) {
            if(userChoose==pcChoose) {
                return 7;
            }else if((userChoose==0 && pcChoose==1)||(userChoose==1 && pcChoose==2)||(userChoose==2 && pcChoose==0)) {
                return 5;
            }else {
                return 6;
            }
    }
} //Main class ends

