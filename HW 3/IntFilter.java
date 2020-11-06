public class IntFilter implements Filter<Integer> {
    public boolean accept(Integer n) {
        return n >= 0;
    }
}
