package com.mk.abgabe;

public class test {

	public static void main (String [] args) {
		EmailSender ms = new EmailSender ();
		ms.sendMail("kuepers.m@gmail.com", "Test", "test");
	}
}
