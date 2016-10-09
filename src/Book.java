/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /*
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        // clear the terminal
        System.out.println('\f');
    }

    // Add the methods here ...
    //
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public void printAuthor()
    {
         System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public int getPages()
    {
        return pages;
    }
    public void printDetails()
    {
        System.out.print(
            "Titel: " + title +
            ", Author: " + author +
            ", Pages: " + pages +
            ", Reference Number:");

        if (refNumber != "")// refnumber is not an empty string
        {

            System.out.print(refNumber);
        } else {
            System.out.print("ZZZ");
        }
        System.out.println(", Times Borrowed: " + borrowed);

    }
   public void setRefNumber(String ref)
   {
       if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.err.println("error message: reference number too short");
        }
   }
   public String getRefNumber()
   {
       return refNumber;
   }
   public void borrow() //öka borrowed med 1
   {
       borrowed = borrowed + 1; // kan även skriva; borrowed +=1; eller borrowed++;
   }
   public int getBorrowed()
   {
       return borrowed;
   }
}
