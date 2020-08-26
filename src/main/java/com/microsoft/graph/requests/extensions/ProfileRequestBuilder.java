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
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Request Builder.
 */
public class ProfileRequestBuilder extends BaseRequestBuilder implements IProfileRequestBuilder {

    /**
     * The request builder for the Profile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IProfileRequest instance
     */
    public IProfileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IProfileRequest instance
     */
    public IProfileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IUserAccountInformationCollectionRequestBuilder account() {
        return new UserAccountInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("account"), getClient(), null);
    }

    public IUserAccountInformationRequestBuilder account(final String id) {
        return new UserAccountInformationRequestBuilder(getRequestUrlWithAdditionalSegment("account") + "/" + id, getClient(), null);
    }
    public IItemAddressCollectionRequestBuilder addresses() {
        return new ItemAddressCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("addresses"), getClient(), null);
    }

    public IItemAddressRequestBuilder addresses(final String id) {
        return new ItemAddressRequestBuilder(getRequestUrlWithAdditionalSegment("addresses") + "/" + id, getClient(), null);
    }
    public IPersonAnniversaryCollectionRequestBuilder anniversaries() {
        return new PersonAnniversaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("anniversaries"), getClient(), null);
    }

    public IPersonAnniversaryRequestBuilder anniversaries(final String id) {
        return new PersonAnniversaryRequestBuilder(getRequestUrlWithAdditionalSegment("anniversaries") + "/" + id, getClient(), null);
    }
    public IPersonAwardCollectionRequestBuilder awards() {
        return new PersonAwardCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("awards"), getClient(), null);
    }

    public IPersonAwardRequestBuilder awards(final String id) {
        return new PersonAwardRequestBuilder(getRequestUrlWithAdditionalSegment("awards") + "/" + id, getClient(), null);
    }
    public IPersonCertificationCollectionRequestBuilder certifications() {
        return new PersonCertificationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("certifications"), getClient(), null);
    }

    public IPersonCertificationRequestBuilder certifications(final String id) {
        return new PersonCertificationRequestBuilder(getRequestUrlWithAdditionalSegment("certifications") + "/" + id, getClient(), null);
    }
    public IEducationalActivityCollectionRequestBuilder educationalActivities() {
        return new EducationalActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("educationalActivities"), getClient(), null);
    }

    public IEducationalActivityRequestBuilder educationalActivities(final String id) {
        return new EducationalActivityRequestBuilder(getRequestUrlWithAdditionalSegment("educationalActivities") + "/" + id, getClient(), null);
    }
    public IItemEmailCollectionRequestBuilder emails() {
        return new ItemEmailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("emails"), getClient(), null);
    }

    public IItemEmailRequestBuilder emails(final String id) {
        return new ItemEmailRequestBuilder(getRequestUrlWithAdditionalSegment("emails") + "/" + id, getClient(), null);
    }
    public IPersonInterestCollectionRequestBuilder interests() {
        return new PersonInterestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("interests"), getClient(), null);
    }

    public IPersonInterestRequestBuilder interests(final String id) {
        return new PersonInterestRequestBuilder(getRequestUrlWithAdditionalSegment("interests") + "/" + id, getClient(), null);
    }
    public ILanguageProficiencyCollectionRequestBuilder languages() {
        return new LanguageProficiencyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("languages"), getClient(), null);
    }

    public ILanguageProficiencyRequestBuilder languages(final String id) {
        return new LanguageProficiencyRequestBuilder(getRequestUrlWithAdditionalSegment("languages") + "/" + id, getClient(), null);
    }
    public IPersonNameCollectionRequestBuilder names() {
        return new PersonNameCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    public IPersonNameRequestBuilder names(final String id) {
        return new PersonNameRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    public IPersonAnnotationCollectionRequestBuilder notes() {
        return new PersonAnnotationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notes"), getClient(), null);
    }

    public IPersonAnnotationRequestBuilder notes(final String id) {
        return new PersonAnnotationRequestBuilder(getRequestUrlWithAdditionalSegment("notes") + "/" + id, getClient(), null);
    }
    public IItemPatentCollectionRequestBuilder patents() {
        return new ItemPatentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("patents"), getClient(), null);
    }

    public IItemPatentRequestBuilder patents(final String id) {
        return new ItemPatentRequestBuilder(getRequestUrlWithAdditionalSegment("patents") + "/" + id, getClient(), null);
    }
    public IItemPhoneCollectionRequestBuilder phones() {
        return new ItemPhoneCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("phones"), getClient(), null);
    }

    public IItemPhoneRequestBuilder phones(final String id) {
        return new ItemPhoneRequestBuilder(getRequestUrlWithAdditionalSegment("phones") + "/" + id, getClient(), null);
    }
    public IWorkPositionCollectionRequestBuilder positions() {
        return new WorkPositionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("positions"), getClient(), null);
    }

    public IWorkPositionRequestBuilder positions(final String id) {
        return new WorkPositionRequestBuilder(getRequestUrlWithAdditionalSegment("positions") + "/" + id, getClient(), null);
    }
    public IProjectParticipationCollectionRequestBuilder projects() {
        return new ProjectParticipationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("projects"), getClient(), null);
    }

    public IProjectParticipationRequestBuilder projects(final String id) {
        return new ProjectParticipationRequestBuilder(getRequestUrlWithAdditionalSegment("projects") + "/" + id, getClient(), null);
    }
    public IItemPublicationCollectionRequestBuilder publications() {
        return new ItemPublicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("publications"), getClient(), null);
    }

    public IItemPublicationRequestBuilder publications(final String id) {
        return new ItemPublicationRequestBuilder(getRequestUrlWithAdditionalSegment("publications") + "/" + id, getClient(), null);
    }
    public ISkillProficiencyCollectionRequestBuilder skills() {
        return new SkillProficiencyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("skills"), getClient(), null);
    }

    public ISkillProficiencyRequestBuilder skills(final String id) {
        return new SkillProficiencyRequestBuilder(getRequestUrlWithAdditionalSegment("skills") + "/" + id, getClient(), null);
    }
    public IWebAccountCollectionRequestBuilder webAccounts() {
        return new WebAccountCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("webAccounts"), getClient(), null);
    }

    public IWebAccountRequestBuilder webAccounts(final String id) {
        return new WebAccountRequestBuilder(getRequestUrlWithAdditionalSegment("webAccounts") + "/" + id, getClient(), null);
    }
    public IPersonWebsiteCollectionRequestBuilder websites() {
        return new PersonWebsiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("websites"), getClient(), null);
    }

    public IPersonWebsiteRequestBuilder websites(final String id) {
        return new PersonWebsiteRequestBuilder(getRequestUrlWithAdditionalSegment("websites") + "/" + id, getClient(), null);
    }
}
