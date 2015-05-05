package com.coreserlvets.nonspring;

public class BookSupplierFactory {

	private AmazonBookSupplier amazonBookSupplier;
	private SafariBookSupplier safariBookSupplier;

	public BookSupplier getAmazonBookSupplier() {
		// Create only 1 instance of the supplier EVER
		if (amazonBookSupplier != null) {
			return amazonBookSupplier;
		}

		amazonBookSupplier = new AmazonBookSupplier();
		return amazonBookSupplier;
	}

	public BookSupplier getSafariBookSupplier() {

		// See if test sys prop equal to true; return test supplier
		String testProp = System.getProperty("testProp");
		if (testProp != null && testProp.equalsIgnoreCase("true")) {
			return new TestBookSupplier();
		}

		// Create ony 1 instance of the supplier EVER
		if (safariBookSupplier != null) {
			return safariBookSupplier;
		}

		safariBookSupplier = new SafariBookSupplier();
		return safariBookSupplier;
	}
}
