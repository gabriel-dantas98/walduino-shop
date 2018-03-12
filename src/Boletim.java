
public class Boletim {
	
	private String nome;
	private Double am;
	private Double nac;
	private Double ps;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAm(Double am) {
		this.am = am;
	}
	
	public Double getAm() {
		return am;
	}
	
	public void setNac(Double nac) {
		this.nac = nac;
	}
	
	public Double getNac() {
		return nac;
	}
	
	public void setPs(Double ps) {
		this.ps = ps;
	}
	
	public Double getPs() {
		return ps;
	}
	
	
	public Double getMedia() {
		return nac*0.2 + am*0.3 + ps*0.5;
	}
	
	public String getSituacao() {
		
		if(getMedia() < 4.0) {
			return "que peninha :(";
		}else {
			if(getMedia() < 6.0) {
				return "jogue outra vez";
			}else {
				return "tristeza completa";
			}
		}
		
	}
	
	
}
