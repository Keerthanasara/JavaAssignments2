package com.collection.Contact;
public class Contact {
	

		String name;
		String email;
		String gender;
		public Contact(String name, String email, String gender) {
			
			
			this.name = name;
			this.email = email;
			this.gender = gender;
		}



		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
			public String toString() {
				return "contact[name="+name+",email="+email+",gender="+gender+"]";
			}

		}


