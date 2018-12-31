package com.tarena.shoot;

import java.util.Random;

/** 小蜜蜂: 是飞行物，也是奖励 */
public class Bee extends FlyingObject implements Award{
	private int xSpeed = 1; //x坐标移动速度
	private int ySpeed = 2; //y坐标移动速度
	private int awardType; //奖励类型
	/** 构造方法 */
	public Bee(){
		image = ShootGame.bee; //图片
		width = image.getWidth();   //宽
		height = image.getHeight(); //高
		Random rand = new Random(); //随机数对象
		x = rand.nextInt(ShootGame.WIDTH-this.width); //x:0到(窗口宽-蜜蜂宽)之间的随机数 
		y = -this.height; //y:负的蜜蜂的高
		awardType = rand.nextInt(2); //奖励类型为0到1之间的随机数
	}
	
	/** 重写getType() */
	public int getType(){
		return awardType; //返回奖励类型(0或1)
	}

	/** 重写step() */
	public void step(){
		x += xSpeed; //x+(向右/向左)
		y += ySpeed; //y+(向下)
		if(this.x >= ShootGame.WIDTH-this.width){ //蜜蜂的x>=(屏幕宽-蜜蜂宽)时，意味着到最右边了，应向左(即为减)
			xSpeed = -1;
		}
		if(this.x <= 0){ //蜜蜂的x<=0，意味着到最左边了，应向右(即为加)
			xSpeed = 1;
		}
	}

	/** 重写outOfBounds */
	public boolean outOfBounds(){
		return this.y>=ShootGame.HEIGHT; //蜜蜂的y>=窗口的高，即为越界
	}
}











