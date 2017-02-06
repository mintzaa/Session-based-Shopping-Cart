package Model;

import java.io.Serializable;

public class ProductBean implements Serializable {
	
	private int productId;
	private String productName;
	private String productDescription;
	private double productPrice;
	
	public void setId(int id)
	{
		productId=id;
		
	}
	public int getId()
	{
		return productId;
	}
	public void setName(String name)
	{
		productName=name;
	}
	public String getName()
	{
		return  productName;
	}
	
	public void setProductDescription(String desc)
	{
		productDescription=desc;
	}
	public String getProductDescription()
	{
		return  productName;
	}
	 public void setProductPrice(double price)
	 {
		 productPrice=price;
	 }
	 public double getProductPrice()
	 {
		 return productPrice;
	 }
}
