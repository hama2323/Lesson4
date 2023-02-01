
public class Review02 {

    public static void main(String[] args) {
        // iの値が1から100までの間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            
        if (i % 3 == 0) {
            // Fizzを表示する
            System.out.println("Fizz");
        }
        else if (i % 5 == 0) {
            // Buzzを表示する
            System.out.println("Buzz");
        }
        else if (i % 3 == 0 && i % 5 == 0 ) {
            System.out.println("FizzBuzz");
        }
        
        else {
            System.out.println(i);
        }
        
    }

}
}
