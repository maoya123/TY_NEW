package com.cardpay.pccredit.intopieces.model;

import com.wicresoft.jrad.base.database.model.BusinessModel;
import com.wicresoft.jrad.base.database.model.ModelParam;

/**
 * 调查模板-固定资产
 */
@ModelParam(table = "TY_DZ_MODEL_GDZC")
public class Dcgdzc extends BusinessModel{
	private static final long serialVersionUID = 1L;
	
	private String	id;             
	private String  customer_id;    
	private int  loan_type;      
	private String  names;          
	private int  no;             
	private String  gzsj;           
	private String  ysdj;           
	private String  zjbl;           
	private String  sl;
	private String  zjz;
	private String  zhjz;
	private String  created_by;     
	private String  created_time;   
	private String  modified_by;    
	private String  modified_time; 
	private String  application_id; 
	private String  product_id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public int getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(int loan_type) {
		this.loan_type = loan_type;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGzsj() {
		return gzsj;
	}
	public void setGzsj(String gzsj) {
		this.gzsj = gzsj;
	}
	public String getYsdj() {
		return ysdj;
	}
	public void setYsdj(String ysdj) {
		this.ysdj = ysdj;
	}
	public String getZjbl() {
		return zjbl;
	}
	public void setZjbl(String zjbl) {
		this.zjbl = zjbl;
	}
	public String getSl() {
		return sl;
	}
	public void setSl(String sl) {
		this.sl = sl;
	}
	public String getZjz() {
		return zjz;
	}
	public void setZjz(String zjz) {
		this.zjz = zjz;
	}
	public String getZhjz() {
		return zhjz;
	}
	public void setZhjz(String zhjz) {
		this.zhjz = zhjz;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_time() {
		return created_time;
	}
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_time() {
		return modified_time;
	}
	public void setModified_time(String modified_time) {
		this.modified_time = modified_time;
	}
	public String getApplication_id() {
		return application_id;
	}
	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
	
	
	
	
	
	

}