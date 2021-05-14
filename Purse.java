//////////////////////////////////////////////////////////// 
// A Purse holds a collection of Coins 
import java.util.ArrayList;
public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList();
    }

    // adds aCoin to the purse 
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse 
    public double getTotal() {
        double total = 0;
        for(Coin coin : this.coins)
        {
          total += coin.getValue();
        }
        return total;
    }

    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int match = 0;
        for(Coin coin : coins)
        {
          if(coin.equals(aCoin)) match++;
        }
        return match;
    }

    // returns the name of the Coin in the Purse that has the smallest value 
    public double findSmallest(){
      double smallest = coins.get(0).getValue();
      for(Coin coin : coins)
      {
          if(coin.getValue() < smallest) smallest = coin.getValue();
      }
      return smallest;
    }
}
