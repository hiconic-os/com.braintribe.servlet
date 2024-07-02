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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

public class FakeServletOutputStream extends ServletOutputStream {

	protected ByteArrayOutputStream baos = new ByteArrayOutputStream();
	protected boolean isClosed = false;
	
	public byte[] getData() {
		return baos.toByteArray();
	}
	
	public boolean isClosed() {
		return this.isClosed;
	}
	
	@Override
	public void write(int b) throws IOException {
		baos.write(b);
	}
	
	@Override
	public void write(byte b[], int off, int len) throws IOException {
		baos.write(b, off, len);
	}

	@Override
	public void write(byte b[]) throws IOException {
		baos.write(b);
	}

	@Override
	public void flush() throws IOException {
		baos.flush();
	}

	@Override
	public void close() throws IOException {
		this.isClosed = true;
		baos.close();
	}

	@Override
	public boolean isReady() {
		return true;
	}

	@Override
	public void setWriteListener(WriteListener writeListener) {
		// ignore
	}

}
