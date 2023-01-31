
public class SevenNumber {

    public static void main(String[] args) {
        // iの値が1から100までの間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // iの値が7の倍数のとき
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                // iの値を表示する
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }
        }

    }

}
