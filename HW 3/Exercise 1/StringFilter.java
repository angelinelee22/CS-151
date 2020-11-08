public class StringFilter implements Filter<String> {
    @Override
    public boolean accept(String s) {
        return s.length() >= 9;
    }
}
