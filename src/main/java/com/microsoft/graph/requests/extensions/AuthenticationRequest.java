// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IFido2AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFido2AuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftAuthenticatorAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareOathAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareOathAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareOathAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareOathAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ILongRunningOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILongRunningOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LongRunningOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordlessMicrosoftAuthenticatorAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityQuestionAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityQuestionAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityQuestionAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityQuestionAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ITemporaryAccessPassAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITemporaryAccessPassAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Request.
 */
public class AuthenticationRequest extends BaseRequest implements IAuthenticationRequest {
	
    /**
     * The request for the Authentication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Authentication.class);
    }

    /**
     * Gets the Authentication from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Authentication> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Authentication from the service
     *
     * @return the Authentication from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Authentication get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Authentication> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Authentication with a source
     *
     * @param sourceAuthentication the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Authentication sourceAuthentication, final ICallback<Authentication> callback) {
        send(HttpMethod.PATCH, callback, sourceAuthentication);
    }

    /**
     * Patches this Authentication with a source
     *
     * @param sourceAuthentication the source object with updates
     * @return the updated Authentication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Authentication patch(final Authentication sourceAuthentication) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthentication);
    }

    /**
     * Creates a Authentication with a new object
     *
     * @param newAuthentication the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Authentication newAuthentication, final ICallback<Authentication> callback) {
        send(HttpMethod.POST, callback, newAuthentication);
    }

    /**
     * Creates a Authentication with a new object
     *
     * @param newAuthentication the new object to create
     * @return the created Authentication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Authentication post(final Authentication newAuthentication) throws ClientException {
        return send(HttpMethod.POST, newAuthentication);
    }

    /**
     * Creates a Authentication with a new object
     *
     * @param newAuthentication the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Authentication newAuthentication, final ICallback<Authentication> callback) {
        send(HttpMethod.PUT, callback, newAuthentication);
    }

    /**
     * Creates a Authentication with a new object
     *
     * @param newAuthentication the object to create/update
     * @return the created Authentication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Authentication put(final Authentication newAuthentication) throws ClientException {
        return send(HttpMethod.PUT, newAuthentication);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAuthenticationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AuthenticationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAuthenticationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AuthenticationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IAuthenticationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (AuthenticationRequest)this;
     }

}

