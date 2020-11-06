public class StringFilter implements Filter<String> {
    public boolean accept(String s) {
        return s.length() >= 9;
    }
}
