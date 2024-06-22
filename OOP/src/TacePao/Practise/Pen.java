package TacePao.Practise;

public class Pen extends OfficeTool {
	private String inkType;
	
	public Pen(String name, String color, String inkType) {
		super(name, color);
		this.inkType = inkType;
	}
	
	public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" and an ink type of %s", inkType);
    }

}
