public class PhanTu<T extends Comparable<T>> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public boolean isGreaterThan(T a) {
        if (a.compareTo(t) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
