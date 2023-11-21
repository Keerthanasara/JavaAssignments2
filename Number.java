package com.collection.Contact;


	public class Number implements Comparable<Number>{

		Long contactno;

		public Number(Long contactno) {
			
			this.contactno = contactno;
		}

		public Long getContactno() {
			return contactno;
		}

		public void setContactno(Long contactno) {
			this.contactno = contactno;
		}
	@Override
		public String toString() {
	return "Number[contact="+contactno+"]";
		
	}

	@Override
	public int compareTo(Number i) {
		// TODO Auto-generated method stub
		return this.getContactno().compareTo(i.getContactno());
	}
	}




