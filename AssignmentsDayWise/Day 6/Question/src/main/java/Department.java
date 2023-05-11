
public class Department {
	
	private int did;
	private String name;
	private String head;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public Department(int did, String name, String head) {
		super();
		this.did = did;
		this.name = name;
		this.head = head;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
