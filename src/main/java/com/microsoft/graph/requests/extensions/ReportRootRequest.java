// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.ApplicationSignInSummary;
import com.microsoft.graph.models.extensions.AzureADFeatureUsage;
import com.microsoft.graph.models.extensions.AzureADLicenseUsage;
import com.microsoft.graph.models.extensions.AzureADUserFeatureUsage;
import com.microsoft.graph.models.extensions.CredentialUsageSummary;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationCount;
import com.microsoft.graph.models.extensions.RelyingPartyDetailedSummary;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.models.extensions.EmailActivitySummary;
import com.microsoft.graph.models.extensions.EmailActivityUserDetail;
import com.microsoft.graph.models.extensions.EmailAppUsageAppsUserCounts;
import com.microsoft.graph.models.extensions.EmailAppUsageUserCounts;
import com.microsoft.graph.models.extensions.EmailAppUsageUserDetail;
import com.microsoft.graph.models.extensions.EmailAppUsageVersionsUserCounts;
import com.microsoft.graph.models.extensions.MailboxUsageDetail;
import com.microsoft.graph.models.extensions.MailboxUsageMailboxCounts;
import com.microsoft.graph.models.extensions.MailboxUsageQuotaStatusMailboxCounts;
import com.microsoft.graph.models.extensions.MailboxUsageStorage;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;
import com.microsoft.graph.models.extensions.Office365ActivationsUserCounts;
import com.microsoft.graph.models.extensions.Office365ActivationsUserDetail;
import com.microsoft.graph.models.extensions.Office365ActiveUserCounts;
import com.microsoft.graph.models.extensions.Office365ActiveUserDetail;
import com.microsoft.graph.models.extensions.Office365GroupsActivityCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityDetail;
import com.microsoft.graph.models.extensions.Office365GroupsActivityFileCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityGroupCounts;
import com.microsoft.graph.models.extensions.Office365GroupsActivityStorage;
import com.microsoft.graph.models.extensions.Office365ServicesUserCounts;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import com.microsoft.graph.models.extensions.OneDriveActivityUserDetail;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountCounts;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;
import com.microsoft.graph.models.extensions.OneDriveUsageFileCounts;
import com.microsoft.graph.models.extensions.SiteUsageStorage;
import com.microsoft.graph.models.extensions.SharePointActivityPages;
import com.microsoft.graph.models.extensions.SharePointActivityUserCounts;
import com.microsoft.graph.models.extensions.SharePointActivityUserDetail;
import com.microsoft.graph.models.extensions.SharePointSiteUsageDetail;
import com.microsoft.graph.models.extensions.SharePointSiteUsageFileCounts;
import com.microsoft.graph.models.extensions.SharePointSiteUsagePages;
import com.microsoft.graph.models.extensions.SharePointSiteUsageSiteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityUserDetail;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityUserCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityMinuteCounts;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.TeamsUserActivityCounts;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserCounts;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserDetail;
import com.microsoft.graph.models.extensions.YammerActivitySummary;
import com.microsoft.graph.models.extensions.YammerActivityUserDetail;
import com.microsoft.graph.models.extensions.YammerDeviceUsageDistributionUserCounts;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserCounts;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserDetail;
import com.microsoft.graph.models.extensions.YammerGroupsActivityCounts;
import com.microsoft.graph.models.extensions.YammerGroupsActivityDetail;
import com.microsoft.graph.models.extensions.YammerGroupsActivityGroupCounts;
import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import com.microsoft.graph.models.extensions.GroupPrintUsageSummary;
import com.microsoft.graph.models.extensions.OverallPrintUsageSummary;
import com.microsoft.graph.models.extensions.PrinterUsageSummary;
import com.microsoft.graph.models.extensions.PrintUsageSummary;
import com.microsoft.graph.models.extensions.UserPrintUsageSummary;
import com.microsoft.graph.requests.extensions.IApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodsRootRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodsRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageByUserRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUsageByUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request.
 */
public class ReportRootRequest extends BaseRequest implements IReportRootRequest {
	
    /**
     * The request for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRoot.class);
    }

    /**
     * Gets the ReportRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ReportRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ReportRoot from the service
     *
     * @return the ReportRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ReportRoot> callback) {
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
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ReportRoot sourceReportRoot, final ICallback<? super ReportRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceReportRoot);
    }

    /**
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @return the updated ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot patch(final ReportRoot sourceReportRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ReportRoot newReportRoot, final ICallback<? super ReportRoot> callback) {
        send(HttpMethod.POST, callback, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot post(final ReportRoot newReportRoot) throws ClientException {
        return send(HttpMethod.POST, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ReportRoot newReportRoot, final ICallback<? super ReportRoot> callback) {
        send(HttpMethod.PUT, callback, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the object to create/update
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot put(final ReportRoot newReportRoot) throws ClientException {
        return send(HttpMethod.PUT, newReportRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IReportRootRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ReportRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IReportRootRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ReportRootRequest)this;
     }

}

