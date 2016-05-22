
package celular.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {

    private String carrier;
    private Integer rn1;

    /**
     * 
     * @return
     *     The carrier
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * 
     * @param carrier
     *     The carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * 
     * @return
     *     The rn1
     */
    public Integer getRn1() {
        return rn1;
    }

    /**
     * 
     * @param rn1
     *     The rn1
     */
    public void setRn1(Integer rn1) {
        this.rn1 = rn1;
    }
}
