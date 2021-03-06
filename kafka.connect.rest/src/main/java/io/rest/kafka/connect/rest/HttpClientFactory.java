/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rest.kafka.connect.rest;

import static org.asynchttpclient.Dsl.asyncHttpClient;

import org.asynchttpclient.AsyncHttpClient;

/**
 * Central factory for getting singleton http client instance
 * @author Dhananjay
 *
 */
public class HttpClientFactory {

	private static AsyncHttpClient asyncHttpClient;
	
	public static AsyncHttpClient getInstance() {
		if(asyncHttpClient == null) {
			asyncHttpClient = asyncHttpClient();
		}
		return asyncHttpClient;
	}
	
}
