package org.tnsif.abstractkeyworddemo;

public class RemoteExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //    Remote r = new Remote();
		
		//Remote r = new RemoteChild();
		RemoteChild r1 = new RemoteChild();
		r1.cellName= "tata";
		r1.display();
		r1.functionRemote();
		
		RemoteChild r = new RemoteChild();
		r.cellName= "Duracell";
		r.display();
		r.functionRemote();
	}

}
