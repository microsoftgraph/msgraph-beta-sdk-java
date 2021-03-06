// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MacOSVpnConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.MacOSCertificateProfileBaseWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSVpn Configuration Request.
 */
public class MacOSVpnConfigurationRequest extends BaseRequest<MacOSVpnConfiguration> {
	
    /**
     * The request for the MacOSVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSVpnConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSVpnConfiguration.class);
    }

    /**
     * Gets the MacOSVpnConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSVpnConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MacOSVpnConfiguration from the service
     *
     * @return the MacOSVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSVpnConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MacOSVpnConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MacOSVpnConfiguration with a source
     *
     * @param sourceMacOSVpnConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSVpnConfiguration> patchAsync(@Nonnull final MacOSVpnConfiguration sourceMacOSVpnConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceMacOSVpnConfiguration);
    }

    /**
     * Patches this MacOSVpnConfiguration with a source
     *
     * @param sourceMacOSVpnConfiguration the source object with updates
     * @return the updated MacOSVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSVpnConfiguration patch(@Nonnull final MacOSVpnConfiguration sourceMacOSVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSVpnConfiguration);
    }

    /**
     * Creates a MacOSVpnConfiguration with a new object
     *
     * @param newMacOSVpnConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSVpnConfiguration> postAsync(@Nonnull final MacOSVpnConfiguration newMacOSVpnConfiguration) {
        return sendAsync(HttpMethod.POST, newMacOSVpnConfiguration);
    }

    /**
     * Creates a MacOSVpnConfiguration with a new object
     *
     * @param newMacOSVpnConfiguration the new object to create
     * @return the created MacOSVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSVpnConfiguration post(@Nonnull final MacOSVpnConfiguration newMacOSVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSVpnConfiguration);
    }

    /**
     * Creates a MacOSVpnConfiguration with a new object
     *
     * @param newMacOSVpnConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSVpnConfiguration> putAsync(@Nonnull final MacOSVpnConfiguration newMacOSVpnConfiguration) {
        return sendAsync(HttpMethod.PUT, newMacOSVpnConfiguration);
    }

    /**
     * Creates a MacOSVpnConfiguration with a new object
     *
     * @param newMacOSVpnConfiguration the object to create/update
     * @return the created MacOSVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSVpnConfiguration put(@Nonnull final MacOSVpnConfiguration newMacOSVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newMacOSVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSVpnConfigurationRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public MacOSVpnConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

