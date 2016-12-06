package Exceptions;

/**
 * Created by Extr on 06.12.2016.
 */
class BikeStore {
    private int countBikes;

    public BikeStore(int countBikes) {
        this.countBikes = countBikes;
    }

    public void buyBikes(int amount) throws TooManyBikesException {
        if (amount <= countBikes) {
            countBikes -= amount;
            System.out.println("You buy " + countBikes + " bikes");
        } else {
            throw new TooManyBikesException("Not enough bikes in store. Try decrease amount");
        }
    }

    public int getCountBikes() {
        return countBikes;
    }
}
