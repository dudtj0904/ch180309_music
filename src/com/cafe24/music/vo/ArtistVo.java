package com.cafe24.music.vo;

public class ArtistVo {
	private long no;
	private String name;
	
	public ArtistVo() {
		// TODO Auto-generated constructor stub
	}

	public ArtistVo(String name) {
		super();
		this.name = name;
	}

	public ArtistVo(long no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ArtistVo [no=" + no + ", name=" + name + "]";
	}
	
}
