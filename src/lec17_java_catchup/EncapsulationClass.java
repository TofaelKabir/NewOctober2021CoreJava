package lec17_java_catchup;

public class EncapsulationClass {

	private String mediaType;
	private int duration;
	private String title;
	private float rating;
	
	public EncapsulationClass(String title, String mediaType, int duration, float rating) {
		this.mediaType = mediaType;
		this.duration = duration;
		this.title = title;
		this.rating = rating;
	}
	
	public String getMediaType() {
		return mediaType;
	}
	
	public int getDuration() {
		return duration;
	}

	public String getTitle() {
		return title;
	}

	public float getRating() {
		return rating;
	}

}
