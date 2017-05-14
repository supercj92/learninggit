package com.cfysu.tankgame.util;

public enum DirectionEnum {
	UP(1, "��"), DOWN(2, "��"), LEFT(3, "��"), RIGHT(4, "��");
	private int key;
	private String direction;
	private DirectionEnum(int key, String direction) {
		this.key = key;
		this.direction = direction;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

}
