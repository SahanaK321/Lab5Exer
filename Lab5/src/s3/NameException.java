package s3;
public class NameException extends Exception
{
	@Override
	public String toString() {
		return "First or Last Name cannot be blank";
	}
}
