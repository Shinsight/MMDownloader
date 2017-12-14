package downloader;

import java.util.List;

/**
 * 만화 아카이브 주소 파싱 시 "아카이브 주소"와, "주소" 등의 정보를 모아놓은 클래스.
 * 현재 최소 경량화 상태
 * @author occidere
 */
public class Comic {
	private String title; //해당 주소와 매칭되는 제목. ex) 원피스
	private String titleNo; //제목과 회차까지 포함. ex) 원피스 3화
	private String address; //아카이브 주소. ex) http://wasabisyrup.com/archives/_PfyM_Hc3I8
	private List<String> imgURL; //아카이브 주소에 포함된 이미지 파일들의 URL이 담김.
	
	public Comic(){}
	
	public Comic(String title, String titleNo, String address, List<String> imgUrl){
		this.title = title.trim();
		this.titleNo = titleNo;
		this.address = address.trim();
		this.imgURL = imgUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleNo() {
		return titleNo;
	}

	public void setTitleNo(String titleNo) {
		this.titleNo = titleNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getImgURL() {
		return imgURL;
	}

	public void setImgURL(List<String> imgURL) {
		this.imgURL = imgURL;
	}
	
	@Override
	public String toString() {
		return String.format("%s_%s\t%s\t%s", title, titleNo, address, imgURL);
	}
}

/*
변경사항:
생성자에 trim 적용
toString 추가
*/