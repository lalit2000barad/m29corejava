package org.tnsif.methodoverriding;
//parent class

public class RBI {
		public float getIntrestRate() {
			return 8.3f;
		}
	
	public class hdfc extends RBI{
		public float getIntrestRate() {
			System.out.println(super.getIntrestRate());
			return 12.5f;
		}
		}
		
	}