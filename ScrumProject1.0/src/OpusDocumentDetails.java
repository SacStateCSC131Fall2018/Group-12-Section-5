//This class us used to create an Opus Object
//Stores the author name the book title and the ordinal number

public class OpusDocumentDetails {
	private String authorName;
	private String bookTitle;
	private int oNumber;
	
	OpusDocumentDetails()
	{
		authorName = null;
		bookTitle = null;
		oNumber = 0;
	}
	OpusDocumentDetails(String name)
	{
		authorName = name;
		bookTitle  = null;
		oNumber = 0;
	}
	OpusDocumentDetails(String name,String title)
	{
		authorName = name;
		bookTitle  = title;
		oNumber = 0;
	}
	OpusDocumentDetails(String name,String title, int ordinalNumber)
	{
		authorName = name;
		bookTitle  = title;
		oNumber = ordinalNumber;
	}
	
	//getters
	
	public String getName() {return authorName;}
	public String getTitle() {return bookTitle;}
	public int getOrdinalNumber() {return oNumber;}
	
	
	//setters
	public void setName(String name)
	{
		authorName = name;
	}
	public void setTitle(String title)
	{
		bookTitle = title;
	}
	public void setOrdinalNumber(int ordinalNumber)
	{
		oNumber = ordinalNumber;
	}
}
