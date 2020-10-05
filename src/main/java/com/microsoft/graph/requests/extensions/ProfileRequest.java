// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.requests.extensions.IUserAccountInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAccountInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAccountInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAccountInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAddressCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAddressRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAddressCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAddressRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAnniversaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAnniversaryRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonAnniversaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAwardCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAwardRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonAwardCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonAwardRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonCertificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonCertificationRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonCertificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonCertificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationalActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationalActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationalActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemEmailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemEmailRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemEmailRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonInterestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonInterestRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonInterestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonInterestRequestBuilder;
import com.microsoft.graph.requests.extensions.ILanguageProficiencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILanguageProficiencyRequestBuilder;
import com.microsoft.graph.requests.extensions.LanguageProficiencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LanguageProficiencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonNameCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonNameRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonNameCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonNameRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAnnotationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAnnotationRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonAnnotationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonAnnotationRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPatentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPatentRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemPatentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemPatentRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPhoneCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPhoneRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemPhoneCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemPhoneRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkPositionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkPositionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkPositionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProjectParticipationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProjectParticipationRequestBuilder;
import com.microsoft.graph.requests.extensions.ProjectParticipationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProjectParticipationRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPublicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPublicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemPublicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemPublicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISkillProficiencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISkillProficiencyRequestBuilder;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SkillProficiencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWebAccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWebAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.WebAccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WebAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonWebsiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonWebsiteRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonWebsiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonWebsiteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Request.
 */
public class ProfileRequest extends BaseRequest implements IProfileRequest {
	
    /**
     * The request for the Profile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Profile.class);
    }

    /**
     * Gets the Profile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Profile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Profile from the service
     *
     * @return the Profile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Profile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Profile> callback) {
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
     * Patches this Profile with a source
     *
     * @param sourceProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Profile sourceProfile, final ICallback<? super Profile> callback) {
        send(HttpMethod.PATCH, callback, sourceProfile);
    }

    /**
     * Patches this Profile with a source
     *
     * @param sourceProfile the source object with updates
     * @return the updated Profile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Profile patch(final Profile sourceProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceProfile);
    }

    /**
     * Creates a Profile with a new object
     *
     * @param newProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Profile newProfile, final ICallback<? super Profile> callback) {
        send(HttpMethod.POST, callback, newProfile);
    }

    /**
     * Creates a Profile with a new object
     *
     * @param newProfile the new object to create
     * @return the created Profile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Profile post(final Profile newProfile) throws ClientException {
        return send(HttpMethod.POST, newProfile);
    }

    /**
     * Creates a Profile with a new object
     *
     * @param newProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Profile newProfile, final ICallback<? super Profile> callback) {
        send(HttpMethod.PUT, callback, newProfile);
    }

    /**
     * Creates a Profile with a new object
     *
     * @param newProfile the object to create/update
     * @return the created Profile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Profile put(final Profile newProfile) throws ClientException {
        return send(HttpMethod.PUT, newProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ProfileRequest)this;
     }

}

