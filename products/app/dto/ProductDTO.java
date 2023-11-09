package com.xworkz.products.app.dto;

import java.time.LocalDate;

public class ProductDTO {
	private int id,quantity,modelNo,serialNo;
	private String name,description,company,packer,included,genericName,asign,countryOfOrigin,primeDelivery;
	private float rating,peopleRated,peopleRatedFive,peopleRatedFour,peopleRatedThree,peopleRatedTwo,peopleRatedOne;
	private double price,discount,itemWeight,warranty;
	private boolean damaged,returnable;
	private LocalDate manfDate,expiryDate,dateFirstAvailable,deliveryExpectedDate,returnBy;
	public ProductDTO() {
	}
	public ProductDTO(int id, int quantity, int modelNo, int serialNo, String name, String description, String company,
			String packer, String included, String genericName, String asign, String countryOfOrigin,
			String primeDelivery, float rating, float peopleRated, float peopleRatedFive, float peopleRatedFour,
			float peopleRatedThree, float peopleRatedTwo, float peopleRatedOne, double price, double discount,
			double itemWeight, double warranty, boolean damaged, boolean returnable, LocalDate manfDate,
			LocalDate expiryDate, LocalDate dateFirstAvailable, LocalDate deliveryExpectedDate, LocalDate returnBy) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.name = name;
		this.description = description;
		this.company = company;
		this.packer = packer;
		this.included = included;
		this.genericName = genericName;
		this.asign = asign;
		this.countryOfOrigin = countryOfOrigin;
		this.primeDelivery = primeDelivery;
		this.rating = rating;
		this.peopleRated = peopleRated;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.price = price;
		this.discount = discount;
		this.itemWeight = itemWeight;
		this.warranty = warranty;
		this.damaged = damaged;
		this.returnable = returnable;
		this.manfDate = manfDate;
		this.expiryDate = expiryDate;
		this.dateFirstAvailable = dateFirstAvailable;
		this.deliveryExpectedDate = deliveryExpectedDate;
		this.returnBy = returnBy;
	}
	public int getId() {
		return id;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getModelNo() {
		return modelNo;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getCompany() {
		return company;
	}
	public String getPacker() {
		return packer;
	}
	public String getIncluded() {
		return included;
	}
	public String getGenericName() {
		return genericName;
	}
	public String getAsign() {
		return asign;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public String getPrimeDelivery() {
		return primeDelivery;
	}
	public float getRating() {
		return rating;
	}
	public float getPeopleRated() {
		return peopleRated;
	}
	public float getPeopleRatedFive() {
		return peopleRatedFive;
	}
	public float getPeopleRatedFour() {
		return peopleRatedFour;
	}
	public float getPeopleRatedThree() {
		return peopleRatedThree;
	}
	public float getPeopleRatedTwo() {
		return peopleRatedTwo;
	}
	public float getPeopleRatedOne() {
		return peopleRatedOne;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public double getItemWeight() {
		return itemWeight;
	}
	public double getWarranty() {
		return warranty;
	}
	public boolean isDamaged() {
		return damaged;
	}
	public boolean isReturnable() {
		return returnable;
	}
	public LocalDate getManfDate() {
		return manfDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public LocalDate getDateFirstAvailable() {
		return dateFirstAvailable;
	}
	public LocalDate getDeliveryExpectedDate() {
		return deliveryExpectedDate;
	}
	public LocalDate getReturnBy() {
		return returnBy;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPacker(String packer) {
		this.packer = packer;
	}
	public void setIncluded(String included) {
		this.included = included;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public void setAsign(String asign) {
		this.asign = asign;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setPrimeDelivery(String primeDelivery) {
		this.primeDelivery = primeDelivery;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void setPeopleRated(float peopleRated) {
		this.peopleRated = peopleRated;
	}
	public void setPeopleRatedFive(float peopleRatedFive) {
		this.peopleRatedFive = peopleRatedFive;
	}
	public void setPeopleRatedFour(float peopleRatedFour) {
		this.peopleRatedFour = peopleRatedFour;
	}
	public void setPeopleRatedThree(float peopleRatedThree) {
		this.peopleRatedThree = peopleRatedThree;
	}
	public void setPeopleRatedTwo(float peopleRatedTwo) {
		this.peopleRatedTwo = peopleRatedTwo;
	}
	public void setPeopleRatedOne(float peopleRatedOne) {
		this.peopleRatedOne = peopleRatedOne;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}
	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}
	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}
	public void setReturnable(boolean returnable) {
		this.returnable = returnable;
	}
	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
		this.dateFirstAvailable = dateFirstAvailable;
	}
	public void setDeliveryExpectedDate(LocalDate deliveryExpectedDate) {
		this.deliveryExpectedDate = deliveryExpectedDate;
	}
	public void setReturnBy(LocalDate returnBy) {
		this.returnBy = returnBy;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", quantity=" + quantity + ", modelNo=" + modelNo + ", serialNo=" + serialNo
				+ ", name=" + name + ", description=" + description + ", company=" + company + ", packer=" + packer
				+ ", included=" + included + ", genericName=" + genericName + ", asign=" + asign + ", countryOfOrigin="
				+ countryOfOrigin + ", primeDelivery=" + primeDelivery + ", rating=" + rating + ", peopleRated="
				+ peopleRated + ", peopleRatedFive=" + peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour
				+ ", peopleRatedThree=" + peopleRatedThree + ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne="
				+ peopleRatedOne + ", price=" + price + ", discount=" + discount + ", itemWeight=" + itemWeight
				+ ", warranty=" + warranty + ", damaged=" + damaged + ", returnable=" + returnable + ", manfDate="
				+ manfDate + ", expiryDate=" + expiryDate + ", dateFirstAvailable=" + dateFirstAvailable
				+ ", deliveryExpectedDate=" + deliveryExpectedDate + ", returnBy=" + returnBy + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asign == null) ? 0 : asign.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
		result = prime * result + (damaged ? 1231 : 1237);
		result = prime * result + ((dateFirstAvailable == null) ? 0 : dateFirstAvailable.hashCode());
		result = prime * result + ((deliveryExpectedDate == null) ? 0 : deliveryExpectedDate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((genericName == null) ? 0 : genericName.hashCode());
		result = prime * result + id;
		result = prime * result + ((included == null) ? 0 : included.hashCode());
		temp = Double.doubleToLongBits(itemWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((manfDate == null) ? 0 : manfDate.hashCode());
		result = prime * result + modelNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((packer == null) ? 0 : packer.hashCode());
		result = prime * result + Float.floatToIntBits(peopleRated);
		result = prime * result + Float.floatToIntBits(peopleRatedFive);
		result = prime * result + Float.floatToIntBits(peopleRatedFour);
		result = prime * result + Float.floatToIntBits(peopleRatedOne);
		result = prime * result + Float.floatToIntBits(peopleRatedThree);
		result = prime * result + Float.floatToIntBits(peopleRatedTwo);
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((primeDelivery == null) ? 0 : primeDelivery.hashCode());
		result = prime * result + quantity;
		result = prime * result + Float.floatToIntBits(rating);
		result = prime * result + ((returnBy == null) ? 0 : returnBy.hashCode());
		result = prime * result + (returnable ? 1231 : 1237);
		result = prime * result + serialNo;
		temp = Double.doubleToLongBits(warranty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (asign == null) {
			if (other.asign != null)
				return false;
		} else if (!asign.equals(other.asign))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (countryOfOrigin == null) {
			if (other.countryOfOrigin != null)
				return false;
		} else if (!countryOfOrigin.equals(other.countryOfOrigin))
			return false;
		if (damaged != other.damaged)
			return false;
		if (dateFirstAvailable == null) {
			if (other.dateFirstAvailable != null)
				return false;
		} else if (!dateFirstAvailable.equals(other.dateFirstAvailable))
			return false;
		if (deliveryExpectedDate == null) {
			if (other.deliveryExpectedDate != null)
				return false;
		} else if (!deliveryExpectedDate.equals(other.deliveryExpectedDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (genericName == null) {
			if (other.genericName != null)
				return false;
		} else if (!genericName.equals(other.genericName))
			return false;
		if (id != other.id)
			return false;
		if (included == null) {
			if (other.included != null)
				return false;
		} else if (!included.equals(other.included))
			return false;
		if (Double.doubleToLongBits(itemWeight) != Double.doubleToLongBits(other.itemWeight))
			return false;
		if (manfDate == null) {
			if (other.manfDate != null)
				return false;
		} else if (!manfDate.equals(other.manfDate))
			return false;
		if (modelNo != other.modelNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (packer == null) {
			if (other.packer != null)
				return false;
		} else if (!packer.equals(other.packer))
			return false;
		if (Float.floatToIntBits(peopleRated) != Float.floatToIntBits(other.peopleRated))
			return false;
		if (Float.floatToIntBits(peopleRatedFive) != Float.floatToIntBits(other.peopleRatedFive))
			return false;
		if (Float.floatToIntBits(peopleRatedFour) != Float.floatToIntBits(other.peopleRatedFour))
			return false;
		if (Float.floatToIntBits(peopleRatedOne) != Float.floatToIntBits(other.peopleRatedOne))
			return false;
		if (Float.floatToIntBits(peopleRatedThree) != Float.floatToIntBits(other.peopleRatedThree))
			return false;
		if (Float.floatToIntBits(peopleRatedTwo) != Float.floatToIntBits(other.peopleRatedTwo))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (primeDelivery == null) {
			if (other.primeDelivery != null)
				return false;
		} else if (!primeDelivery.equals(other.primeDelivery))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		if (returnBy == null) {
			if (other.returnBy != null)
				return false;
		} else if (!returnBy.equals(other.returnBy))
			return false;
		if (returnable != other.returnable)
			return false;
		if (serialNo != other.serialNo)
			return false;
		if (Double.doubleToLongBits(warranty) != Double.doubleToLongBits(other.warranty))
			return false;
		return true;
	}
	

}
