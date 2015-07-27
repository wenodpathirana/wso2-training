package com.virtusa.training.sample;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class TransactionMediator extends AbstractMediator {

	public boolean mediate(MessageContext context) {
		System.out.println("MyMediator:" + context.getEnvelope().toString());

		return true;
	}
}
