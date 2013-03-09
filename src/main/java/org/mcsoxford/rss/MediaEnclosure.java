package org.mcsoxford.rss;

/**
 * class created by @'briangriffey
 */
public class MediaEnclosure {

    private final String url;
    private final long length;
    private final String mimeType;

    public MediaEnclosure(String url, long length, String mimeType) {
        this.url = url;
        this.length = length;
        this.mimeType = mimeType;
    }

    public String getUrl() {
        return url;
    }

    public long getLength() {
        return length;
    }

    public String getMimeType() {
        return mimeType;
    }
}
