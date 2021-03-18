package main.java.game.enemy_test;

import main.java.game.enemy_test.MyPanel;

public class Eneposition {
    public Eneposition(){}

    public Eneposition(int x,int y){
		this.x = x;
		this.y = y;
    }
    
    public Eneposition(int x,int y, Eneposition fk){
		this.x = x;
		this.y = y;
		this.previousFK = fk;
    }
    
    public Eneposition(MyPanel myPpanel){
		this.x = myPpanel.getX() / MyPanel.size;
		this.y = myPpanel.getY() / MyPanel.size;
    }
    
    static public final int size = 25;
	private int x;//x position of the enemy
	private int y;//y position of the enemy
	private int F;
	private int G;
	private int H;
	private Eneposition previousFK;
	public int getF() {
		return F;
	}
	public void setF(int f) {
		F = f;
	}
	public int getG() {
		return G;
	}
	public void setG(int g) {
		G = g;
	}
	public int getH() {
		return H;
	}
	public void setH(int h) {
		H = h;
	}
	public Eneposition getPreviousFK() {
		return previousFK;
	}
	public void setPreviousFK(Eneposition previousFK) {
		this.previousFK = previousFK;
    }
    
    @Override
	public boolean equals(Object obj) {
		if(((Eneposition)obj).getX() == this.x && ((Eneposition)obj).getY() == this.y){
			return true;
		}else{
			return false;
		}
    }
    

	public int getX() {
		return x;
	}
 
	public void setX(int x) {
		this.x = x;
	}
 
	public int getY() {
		return y;
	}
 
	public void setY(int y) {
		this.y = y;
	}

}