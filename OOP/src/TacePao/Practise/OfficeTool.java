package TacePao.Practise;

public class OfficeTool {
	private String color;
	private String name;
	
	public OfficeTool(String name, String color) {
		this.name = name;
        this.color = color;        
    }
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("This %s has a color of %s", name, color);
    }

}
