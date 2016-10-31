package al223jw_assign2.Exersise5;

public interface IWordSet extends Iterable {
    public void add(Word word); // Add word if not already added
    public boolean contains(Word word); // Return true if word contained
    public int size(); // Return current set size
    public String toString(); // Print contained words
}
