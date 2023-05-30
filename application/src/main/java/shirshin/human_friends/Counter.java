

public class Counter implements AutoCloseable{

    private static int counter = 0;

    public void add() throws Exception {
        counter++;
    }
    
    public int getCounter(){
        return counter;
    }

    @Override
    public void close() throws Exception {

    }
}

