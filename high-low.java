import java.util.*;

class HighLow{
    public static void main(String[] args) {
        //最初に1枚カードを表示→次のカードが最初のカードよりも数値が大きいか予想→予想の結果を表示
        Scanner scanner= new Scanner(System.in);


        int firstCard= getFirstCard();
        System.out.println("1枚目のカードは"+firstCard+"です!");
        System.out.print("次のカードはHigh? or Low or Even?");
        String assumeText= scanner.nextLine();
        System.out.print("次のカードの数字は何？");
        int assumeNumber= scanner.nextInt();

        int secondCard= getSecondCard();
        System.out.println("次のカードは・・・"+secondCard+"でした！");

        getResultText(firstCard, secondCard, assumeText);
        getResultNumber(secondCard, assumeNumber);







    } //main ends

    public static int getFirstCard() {
        Random rand1= new Random();
        return rand1.nextInt(13);
    }

    public static int getSecondCard() {
        Random rand2= new Random();
        return rand2.nextInt(13);
    }

    public static void getResultText(int first, int second, String textAssume) {
        //HighかLowかの結果表示をしてから、ピッタリ賞の判定をする
        String highLowResult;
        if (first>second) {
            highLowResult= "High";
        }else if(first<second) {
            highLowResult= "Low";
        }else {
            highLowResult= "Even";
        }
        if(textAssume.equals(highLowResult)) {
            System.out.println("おめでとうございます。正解です。数字は"+second+"でした！");
        }else {
            System.out.println("残念！数字は"+second+"でした！");
        }
    } //getResultText ends

    public static void getResultNumber(int second, int numberAssume) {
        if(second==numberAssume) {
            System.out.println("おめでとうございます！予想した数字と完全に一致しました！");
        }else {
            System.out.println("残念！数字は"+second+"でした！");
        }
    }
} //class ends