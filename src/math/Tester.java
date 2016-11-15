package math;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import math.model.Test;

public class Tester {
	private static Test test;
	static void init() {
		test = Action.create(Test.class);
		Action.start(test);
	}
	public static void main(String[] args) {
		ModelExecutor.create().setTraceLogging(true).start(Tester::init);
	}
}
