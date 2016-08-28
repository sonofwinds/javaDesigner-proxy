package com.test;

import com.proxy.BusinessImplProxy;
import com.service.BusinessFoo;
import com.service.impl.BusinessFooImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusinessFoo bfoo = new BusinessFooImpl();
		BusinessFoo bf = (BusinessFoo) BusinessImplProxy.factory(bfoo);
		bf.foo();
	}

}
