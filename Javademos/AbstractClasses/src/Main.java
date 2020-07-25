public class Main {

    public static void main(String[] args) {

        GameCalculator[] gameCalculators=new GameCalculator[]{

          new WomanGameCalculator(),
          new ManGameCalculator(),
          new KidsGameCalculator()

        };

        for(GameCalculator calculator:gameCalculators){

            calculator.hesapla();
            calculator.gameOver();

        }



    }
}


