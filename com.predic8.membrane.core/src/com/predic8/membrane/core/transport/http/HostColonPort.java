/* Copyright 2011 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */
package com.predic8.membrane.core.transport.http;

public class HostColonPort {

	public String host;
	
	public int port;
	
	public HostColonPort(String hostAndPort) {
		String[] strs = hostAndPort.split(":");
		
		if (strs.length < 2)
			throw new IllegalArgumentException("Illegal format");
		
		host = strs[0];
		port = Integer.parseInt(strs[1]);
	}
}
