package Ch16_List;

public interface IntList {
    public int size();
    public int get(int index);
    public String toString();
    public int indexOf(int value);
    public void add(int value);
    public void add(int index, int value);
    public void remove(int index);
}