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
package dev.hiconic.servlet.api.remote;


import dev.hiconic.servlet.api.exception.InvalidForwardedHeader;
import dev.hiconic.servlet.api.exception.RemoteHostNotTrustedException;
import jakarta.servlet.http.HttpServletRequest;

public interface RemoteClientAddressResolver {

	public String getRemoteIpLenient(HttpServletRequest request);
	
	public String getRemoteIp(HttpServletRequest request) throws RemoteHostNotTrustedException, InvalidForwardedHeader, IllegalArgumentException;
	
	public RemoteAddressInformation getRemoteAddressInformation(HttpServletRequest request) throws RemoteHostNotTrustedException, InvalidForwardedHeader, IllegalArgumentException;
	
}
