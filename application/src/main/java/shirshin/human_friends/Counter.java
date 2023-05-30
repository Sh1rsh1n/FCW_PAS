package shirshin.human_friends;

public class Counter implements AutoCloseable{

    int counter = 0;

    public void add() throws Exception {
        counter++;
    }

    public void remove() throws Exception {
        counter--;
    }
    
    public int getCounter(){
        return counter;
    }

    @Override
    public void close() throws Exception {

    }
}

