package helpers;

public class Meta {
	private final static String USER_AGENT = "RedditBean/1.0 by globmont";
	private static String modhash = "";
	public static String getUserAgent() {
		return USER_AGENT;
	}
	
	public static String getModhash() {
		return modhash;
	}
	
	public static void setModhash(String modhash) {
		Meta.modhash = modhash;
	}
}
