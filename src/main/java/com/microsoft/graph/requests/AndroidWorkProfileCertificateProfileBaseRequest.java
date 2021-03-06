// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.AndroidWorkProfileTrustedRootCertificateWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Certificate Profile Base Request.
 */
public class AndroidWorkProfileCertificateProfileBaseRequest extends BaseRequest<AndroidWorkProfileCertificateProfileBase> {
	
    /**
     * The request for the AndroidWorkProfileCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidWorkProfileCertificateProfileBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AndroidWorkProfileCertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidWorkProfileCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileCertificateProfileBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileCertificateProfileBase.class);
    }

    /**
     * Gets the AndroidWorkProfileCertificateProfileBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCertificateProfileBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidWorkProfileCertificateProfileBase from the service
     *
     * @return the AndroidWorkProfileCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCertificateProfileBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidWorkProfileCertificateProfileBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileCertificateProfileBase with a source
     *
     * @param sourceAndroidWorkProfileCertificateProfileBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCertificateProfileBase> patchAsync(@Nonnull final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidWorkProfileCertificateProfileBase);
    }

    /**
     * Patches this AndroidWorkProfileCertificateProfileBase with a source
     *
     * @param sourceAndroidWorkProfileCertificateProfileBase the source object with updates
     * @return the updated AndroidWorkProfileCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCertificateProfileBase patch(@Nonnull final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileCertificateProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCertificateProfileBase> postAsync(@Nonnull final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase) {
        return sendAsync(HttpMethod.POST, newAndroidWorkProfileCertificateProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the new object to create
     * @return the created AndroidWorkProfileCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCertificateProfileBase post(@Nonnull final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileCertificateProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCertificateProfileBase> putAsync(@Nonnull final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase) {
        return sendAsync(HttpMethod.PUT, newAndroidWorkProfileCertificateProfileBase);
    }

    /**
     * Creates a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the object to create/update
     * @return the created AndroidWorkProfileCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCertificateProfileBase put(@Nonnull final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileCertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileCertificateProfileBaseRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileCertificateProfileBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

