package hibrnate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	
	@Id
	private int eId;
	
	
	
	private String  eName;
	
	//  first name , last name ,mid name;
	
	private String eColor;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteColor() {
		return eColor;
	}
	public void seteColor(String eColor) {
		this.eColor = eColor;
	}
	
	
	

}
