package com.tarena.shoot;

/** 子弹: 是飞行物 */
public class Bullet extends FlyingObject{
	private int speed = 3; //移动的速度
	/** 构造方法 x、y随机英雄机的位置确定 */
	public Bullet(int x,int y){
		image = ShootGame.bullet; //图片
		width = image.getWidth();   //宽
		height = image.getHeight(); //高
		this.x = x; //x坐标:随着英雄机
		this.y = y; //y坐标:随着英雄机
	}
	
	/** 重写step() */
	public void step(){
		y-=speed; //y-(向上)
	}
	
	/** 重写outOfBounds */
	public boolean outOfBounds(){
		return this.y<=-this.height; //子弹的y<=负的子弹的高，即为越界
	}
}

















