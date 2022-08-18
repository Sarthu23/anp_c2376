package question1.model;

public class Customer {
	public class product {
		private int Id;
		private String Name;
		private int Age;
	
		public product() {
			Id=23;
			Name="sarthak";	
			Age=22;
		
		}
		public void Product(int id,String name,int age) {
			this.Id=id;
			this.Name=name;
			this.Age=age;
					
		}
		public int getId() {
			return Id;
		}
		public String getName() {
			return Name;	
		}
		public double getage() {
			return Age;
			
		}
		public void setId(int Id) {
			Id=id;
		}
		public void setname(String name) {
			Name=name;
		}
		public void setprice(int age) {
			Age=age;
			
		}

		
	}

}
