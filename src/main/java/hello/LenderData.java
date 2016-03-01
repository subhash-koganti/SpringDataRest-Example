package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INPLN")
public class LenderData {
	
	private String lenderName;
	private Long lenderId;
	
	@Column(name="LNNAM")
	public String getLenderName() {
		return lenderName;
	}
	
	@Id
	@Column(name="LNNBR")
	public Long getLenderId() {
		return lenderId;
	}
	public void setLenderName(String lenderName) {
		this.lenderName = lenderName;
	}
	public void setLenderId(Long lenderId) {
		this.lenderId = lenderId;
	}

	
}
