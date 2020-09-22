//Kevin Elfert
public class CeaserCypher
{
	public static String encrypt(String message, int key)
	{
		char[] encryption = message.toCharArray();
		for (int i=0;i<encryption.length;i++) 
		{
			encryption[i] = (char) (encryption[i] + key);
		}
		String returnString = "";
		for (int j = 0;j<encryption.length;j++) {
			returnString += encryption[j]; 
		}
		return returnString;

	}

	public static String decrypt(String message, int key)
	{
		char[] decryption = message.toCharArray();
		for (int i=0;i<decryption.length;i++) 
		{
			decryption[i] = (char) (decryption[i] - key);
		}
		String returnString = "";
		for (int j = 0;j<decryption.length;j++) {
			returnString += decryption[j]; 
		}
		return returnString;
	}
}