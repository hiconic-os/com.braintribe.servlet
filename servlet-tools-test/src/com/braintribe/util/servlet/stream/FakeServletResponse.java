// ============================================================================
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ============================================================================
// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License along with this library; See http://www.gnu.org/licenses/.
// ============================================================================
package com.braintribe.util.servlet.stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

public class FakeServletResponse implements ServletResponse {

	protected boolean outputStreamOpened = false;
	protected FakeServletOutputStream outputStream;
	
	public FakeServletOutputStream internalGetOutputStream() {
		return outputStream;
	}
	public boolean getOuputStreamOpened() {
		return outputStreamOpened;
	}
	
	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		outputStreamOpened = true;
		outputStream = new FakeServletOutputStream();
		return outputStream;
	}

	
	// The remaining methods are of no importance for testing
	
	@Override
	public void flushBuffer() throws IOException {
		//Intentionally left empty
	}

	@Override
	public int getBufferSize() {
		return 0;
	}

	@Override
	public String getCharacterEncoding() {
		return null;
	}

	@Override
	public String getContentType() {
		return null;
	}

	@Override
	public Locale getLocale() {
		return null;
	}
	
	@Override
	public PrintWriter getWriter() throws IOException {
		return null;
	}

	@Override
	public boolean isCommitted() {
		return false;
	}

	@Override
	public void reset() {
		//Intentionally left empty
	}

	@Override
	public void resetBuffer() {
		//Intentionally left empty
	}

	@Override
	public void setBufferSize(int arg0) {
		//Intentionally left empty
	}

	@Override
	public void setCharacterEncoding(String arg0) {
		//Intentionally left empty
	}

	@Override
	public void setContentLength(int arg0) {
		//Intentionally left empty
	}

	@Override
	public void setContentType(String arg0) {
		//Intentionally left empty
	}

	@Override
	public void setLocale(Locale arg0) {
		//Intentionally left empty
	}
	@Override
	public void setContentLengthLong(long len) {
		//Intentionally left empty
	}

}
