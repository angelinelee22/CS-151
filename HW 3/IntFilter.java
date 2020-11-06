public class IntFilter implements Filter<Integer> {
    @Override
    public boolean accept(Integer n) {
        return n >= 0;
    }
}
