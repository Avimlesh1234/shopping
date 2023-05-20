package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_management")
public class ProductManagement {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column(name="product_category")
	private String productCategory;
	
	@Column(name="product_sub_category")
    private String productSubCategory;
	
	@Column(name="Brand")
	private String brandnName;
	
	@Column(name="serial_No")
	private String serialNo;
	
	@Column(name="tagging_no")
	private String taggingNo;
	
	@Column(name="warranty")
	private String warranty;
	
	@Column(name="remarks")
	private String remarks;
	
	
	@Column(name="remaining")
	private Integer  remaining;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="purchase_Date")
	private String purchaseDate;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="private_Employee")
	private String privateEmployee;
	
	@Column(name="one_time_uses")
	private String oneTimeUse;
	
	@Column(name="vendor_name")
	private String vendor;
	
	@Column(name="status")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public String getBrandnName() {
		return brandnName;
	}

	public void setBrandnName(String brandnName) {
		this.brandnName = brandnName;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTaggingNo() {
		return taggingNo;
	}

	public void setTaggingNo(String taggingNo) {
		this.taggingNo = taggingNo;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getRemaining() {
		return remaining;
	}

	public void setRemaining(Integer remaining) {
		this.remaining = remaining;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPrivateEmployee() {
		return privateEmployee;
	}

	public void setPrivateEmployee(String privateEmployee) {
		this.privateEmployee = privateEmployee;
	}

	public String getOneTimeUse() {
		return oneTimeUse;
	}

	public void setOneTimeUse(String oneTimeUse) {
		this.oneTimeUse = oneTimeUse;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductManagement [id=" + id + ", productCategory=" + productCategory + ", productSubCategory="
				+ productSubCategory + ", brandnName=" + brandnName + ", serialNo=" + serialNo + ", taggingNo="
				+ taggingNo + ", warranty=" + warranty + ", remarks=" + remarks + ", remaining=" + remaining
				+ ", quantity=" + quantity + ", purchaseDate=" + purchaseDate + ", productType=" + productType
				+ ", privateEmployee=" + privateEmployee + ", oneTimeUse=" + oneTimeUse + ", vendor=" + vendor
				+ ", status=" + status + "]";
	}
	
	
}
