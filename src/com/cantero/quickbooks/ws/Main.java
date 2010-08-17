package com.cantero.quickbooks.ws;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		Endpoint.publish("http://192.168.0.137:54321/ItemQueryRqSoapImpl",
				new ItemQueryRqSoapImpl());
	}
}
