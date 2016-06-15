package com.meshine.mcloudframework.rmi;

import java.io.IOException;

import lipermi.exception.LipeRMIException;
import lipermi.handler.CallHandler;
import lipermi.net.Client;
import lipermi.net.Server;

/**
 * RMIServer main method
 * 
 * @author Li
 * 
 */
public class TestMain {

	public static void main(String[] args) throws IOException, LipeRMIException {
		CallHandler callHandler = new CallHandler();
		
		String address = "192.168.0.105";
		int port = 6666;
		Client client = new Client(address,port,callHandler);
		System.out.println("Client success");
		Compute remoteObject = (Compute) client.getGlobal(Compute.class);
		System.out.println("Get global success");
		String result = remoteObject.getPI(10000);
		System.out.println("Result is :"+result);
	}
}
