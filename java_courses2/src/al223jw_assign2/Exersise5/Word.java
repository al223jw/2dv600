package al223jw_assign2.Exersise5;

public class Word implements Comparable<Word>{

    private String word;

    public Word(String str)
    {
        this.word = str;
    }

    public String toString()
    {
        return word;
    }

    @Override
    public int hashCode()
    {
        int hc = 0;

        for(int i = 0; i < word.length() ; i++)
        {
            hc += Character.getNumericValue(word.charAt(i));
        }
        return hc;
    }

    @Override
    public boolean equals(Object obj)
    {
       if(obj instanceof Word)
       {
           Word otherWord = (Word) obj;
           return  word.equals(otherWord.word);
       }
       return false;
    }


    @Override
    public int compareTo(Word w)
    {
        return word.compareToIgnoreCase(w.word);
    }
}
