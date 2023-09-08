package com.me.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

public class CouchbaseConfig {
	@Configuration
	public class Config extends AbstractCouchbaseConfiguration{

		@Override
		public String getConnectionString() {
			return "couchbase://127.0.0.1";
		}

		@Override
		public String getUserName() {
			return "scott";
		}

		@Override
		public String getPassword() {
			return "tiger17";
		}

		@Override
		public String getBucketName() {
			return "Cook";
		}
	}
}
