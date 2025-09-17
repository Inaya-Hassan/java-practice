public class Constructor{

	private int id;
	private String name;
	
	public Constructor(int id){
		setId(id);
	}

	public Constructor(int id, String name){
		this(id);
		setName(name);
	}


	public void setid(int id){
		if(id > 0)
			this.id = id;
	}


}