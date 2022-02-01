// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagedTenant;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.AuditEventRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcConnectionCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcConnectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcDeviceCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcDeviceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcOverviewCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CloudPcOverviewRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ConditionalAccessPolicyCoverageCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ConditionalAccessPolicyCoverageRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryRequestBuilder;
import com.microsoft.graph.managedtenants.requests.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceTrendCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagedDeviceComplianceTrendRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionTenantDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementActionTenantDeploymentStatusRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementIntentRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionObjectCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionObjectRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantGroupCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantGroupRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantCustomizedInformationCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantCustomizedInformationRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantDetailedInformationCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantDetailedInformationRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantTagCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.TenantTagRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsDeviceMalwareStateCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsDeviceMalwareStateRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsProtectionStateCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.WindowsProtectionStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Tenant Request.
 */
public class ManagedTenantRequest extends BaseRequest<ManagedTenant> {
	
    /**
     * The request for the ManagedTenant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedTenantRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedTenant.class);
    }

    /**
     * Gets the ManagedTenant from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedTenant from the service
     *
     * @return the ManagedTenant from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedTenant get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedTenant delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedTenant with a source
     *
     * @param sourceManagedTenant the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> patchAsync(@Nonnull final ManagedTenant sourceManagedTenant) {
        return sendAsync(HttpMethod.PATCH, sourceManagedTenant);
    }

    /**
     * Patches this ManagedTenant with a source
     *
     * @param sourceManagedTenant the source object with updates
     * @return the updated ManagedTenant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedTenant patch(@Nonnull final ManagedTenant sourceManagedTenant) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedTenant);
    }

    /**
     * Creates a ManagedTenant with a new object
     *
     * @param newManagedTenant the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> postAsync(@Nonnull final ManagedTenant newManagedTenant) {
        return sendAsync(HttpMethod.POST, newManagedTenant);
    }

    /**
     * Creates a ManagedTenant with a new object
     *
     * @param newManagedTenant the new object to create
     * @return the created ManagedTenant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedTenant post(@Nonnull final ManagedTenant newManagedTenant) throws ClientException {
        return send(HttpMethod.POST, newManagedTenant);
    }

    /**
     * Creates a ManagedTenant with a new object
     *
     * @param newManagedTenant the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedTenant> putAsync(@Nonnull final ManagedTenant newManagedTenant) {
        return sendAsync(HttpMethod.PUT, newManagedTenant);
    }

    /**
     * Creates a ManagedTenant with a new object
     *
     * @param newManagedTenant the object to create/update
     * @return the created ManagedTenant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedTenant put(@Nonnull final ManagedTenant newManagedTenant) throws ClientException {
        return send(HttpMethod.PUT, newManagedTenant);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedTenantRequest select(@Nonnull final String value) {
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
     public ManagedTenantRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

