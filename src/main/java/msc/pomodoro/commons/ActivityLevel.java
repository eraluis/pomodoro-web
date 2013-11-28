package msc.pomodoro.commons;

public enum ActivityLevel {
	
	EASY(1, "Easy"),
	MEDIUM(2,"Medium"),
	HARD(3,"Hard"){
		@Override
		public String  toString(){
			return "Hard overriden";
		}
	};
	
	private int level;
	private String name;
	
	ActivityLevel(int level, String name){
		this.setLevel(level);
		this.setName(name);
	}

	@Override
	public String  toString(){
		return this.name;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
