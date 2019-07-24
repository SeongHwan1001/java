package chatClient;

import java.awt.*;
import java.awt.geom.*;
import java.util.LinkedList;
import java.awt.font.*;

class StringMetrics {
	private AffineTransform affineTransform;
	private FontRenderContext fontRenderContext;
	private Font font;
	private int hangleWidth;
	private int hangleHeight;
	private int dotWidth;
	
	public StringMetrics(Font font) {
		affineTransform = new AffineTransform();
		fontRenderContext = new FontRenderContext(affineTransform, true, true);
		setFont(font);
	}
	
	public void setFont(Font font) {
		this.font = font;
		this.hangleWidth = getSize("가.").x;
		this.hangleHeight = getSize("가").y;
		this.dotWidth = hangleWidth;
	}
	
	public Font getFont() {
		return font;
	}
	
	public int getHeight() {
		return hangleHeight;
	}
	
	public Point getSize(String text) {
		int width = (int)(font.getStringBounds(text, fontRenderContext).getWidth());
		int height = (int)(font.getStringBounds(text, fontRenderContext).getHeight());
		return new Point(width, height);
	}
	
	// 일단 개노가다로 하는소스. 나중에 필요하면 수정하자. 정한 길이보다 더 크게 나오는 버그 있는데 수정귀찮..
	public String[] toLineBreakString(String text, int maxWidth) {
		LinkedList<String> texts = new LinkedList<String>();
		int startIndex = 0;
		int endIndex = 0;
		// 일단 문자열 전체에 대해 순회한다.
		while (endIndex < text.length()) {
			startIndex = endIndex;
			// 예상 최소길이를 잡는다.
			int expectWidth = 0;
			while (expectWidth < maxWidth && endIndex < text.length()) {
				if (text.charAt(endIndex++) <= 0x7F)
					expectWidth += dotWidth;
				else 
					expectWidth += hangleWidth;
			}
			// 노가다로 최소길이를 보정한다.
			int realWidth = 0;
			while (realWidth <= maxWidth-hangleWidth && endIndex < text.length()) 
				realWidth = getSize(text.substring(startIndex, endIndex++)).x;
			texts.add(text.substring(startIndex, endIndex));
		}
		return (String[]) texts.toArray(new String[texts.size()]);
	}
}