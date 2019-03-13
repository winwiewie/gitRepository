package Player;

abstract  class Player {
	
	private int pos = 0;
	private int lastpos = 0;
	private String name = "";
	
	
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getLastpos() {
		return lastpos;
	}
	public void setLastpos(int lastpos) {
		this.lastpos = lastpos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Player [pos=" + pos + ", lastpos=" + lastpos + ", name=" + name + "]";
	}
	
	abstract void play(int pos);
	abstract void stop();

}
