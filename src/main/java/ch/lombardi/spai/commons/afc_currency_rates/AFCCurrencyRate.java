package ch.lombardi.spai.commons.afc_currency_rates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Default implementation.
 */
@XmlRootElement(name = "devise")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class AFCCurrencyRate {
	
	
	@XmlAttribute(name = "code")
	private String code;
	@XmlElement(name = "land_de")
	private String land_de;
	@XmlElement(name = "land_fr")
	private String land_fr;
	@XmlElement(name = "land_it")
	private String land_it;
	@XmlElement(name = "land_en")
	private String land_en;
	@XmlElement(name = "waehrung")
	private String waehrung;
	@XmlElement(name = "kurs")
	private Double kurs;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLand_de() {
		return land_de;
	}
	public void setLand_de(String land_de) {
		this.land_de = land_de;
	}
	public String getLand_fr() {
		return land_fr;
	}
	public void setLand_fr(String land_fr) {
		this.land_fr = land_fr;
	}
	public String getLand_it() {
		return land_it;
	}
	public void setLand_it(String land_it) {
		this.land_it = land_it;
	}
	public String getLand_en() {
		return land_en;
	}
	public void setLand_en(String land_en) {
		this.land_en = land_en;
	}
	public String getWaehrung() {
		return waehrung;
	}
	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}
	public Double getKurs() {
		return kurs;
	}
	public void setKurs(Double kurs) {
		this.kurs = kurs;
	}
	
	
}
