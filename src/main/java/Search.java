import java.util.ArrayList;

public class Search {
    public boolean linearSearch(ArrayList<Integer> numbers, int searchNumber) {
        for (int number : numbers){
            if(number == searchNumber){
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(ArrayList<Integer> numbers, int searchNumber) {
        if(numbers.size() == 0){
            return false;
        }

        int midIndex = 0;
        if(numbers.size() > 1) {
            midIndex = (int) Math.floor((double) numbers.size() / 2);
        }

        int midNumber = numbers.get(midIndex);
        if(midNumber == searchNumber){
            return true;
        }

        ArrayList<Integer> newSearchArea;

        if(searchNumber < midNumber){
            newSearchArea = new ArrayList<>(numbers.subList(0, midIndex));
        } else {
            newSearchArea = new ArrayList<>(numbers.subList(midIndex + 1, numbers.size()));
        }

        return binarySearch(newSearchArea, searchNumber);

    }
}
