package objects;

public class ViewportObject {
	
	private String name;
	private ObjectType type;
	
	public ViewportObject(String name, ObjectType type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public ObjectType getType() {
		return type;
	}
}
