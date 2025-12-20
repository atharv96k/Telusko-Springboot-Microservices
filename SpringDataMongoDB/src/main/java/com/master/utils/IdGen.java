package com.master.utils;

import java.util.UUID;

public class IdGen {
	public String randomIDGen() {
		return UUID.randomUUID().toString().replace("-", "").substring(0, 10);
	}
}
