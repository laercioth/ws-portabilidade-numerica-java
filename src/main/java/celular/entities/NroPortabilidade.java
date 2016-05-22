package celular.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NroPortabilidade {

	private Data data;
	private Integer status_code;
	private Double response_time;
	
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}
	/**
	 * @return the status_code
	 */
	public Integer getStatus_code() {
		return status_code;
	}
	/**
	 * @param status_code the status_code to set
	 */
	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}
	/**
	 * @return the response_time
	 */
	public Double getResponse_time() {
		return response_time;
	}
	/**
	 * @param response_time the response_time to set
	 */
	public void setResponse_time(Double response_time) {
		this.response_time = response_time;
	}
}
