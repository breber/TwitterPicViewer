package org.reber.twitpicviewer;

/**
 * @author breber
 *
 */
public class TwitPic implements ImageHost {

	private String url;
	
	/**
	 * Creates a new TwitPic image
	 */
	public TwitPic(String url) {
		if (url != null) {
			this.url = url.trim();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.reber.twitpicviewer.ImageHost#getURL()
	 */
	@Override
	public String getURL() {
		return "http://twitpic.com/show/large/" + url.replace("http://twitpic.com/", "");
	}

}
