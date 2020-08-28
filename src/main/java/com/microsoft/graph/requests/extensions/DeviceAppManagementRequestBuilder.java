// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnterpriseCodeSigningCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnterpriseCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.EnterpriseCodeSigningCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EnterpriseCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetRequestBuilder;
import com.microsoft.graph.requests.extensions.ISideLoadingKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISideLoadingKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.SideLoadingKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SideLoadingKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.VppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VppTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISymantecCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.SymantecCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsManagementAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Request Builder.
 */
public class DeviceAppManagementRequestBuilder extends BaseRequestBuilder implements IDeviceAppManagementRequestBuilder {

    /**
     * The request builder for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceAppManagementRequest instance
     */
    public IDeviceAppManagementRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementRequest instance
     */
    public IDeviceAppManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceAppManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IManagedEBookCollectionRequestBuilder managedEBooks() {
        return new ManagedEBookCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBooks"), getClient(), null);
    }

    public IManagedEBookRequestBuilder managedEBooks(final String id) {
        return new ManagedEBookRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBooks") + "/" + id, getClient(), null);
    }
    public IMobileAppCollectionRequestBuilder mobileApps() {
        return new MobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps"), getClient(), null);
    }

    public IMobileAppRequestBuilder mobileApps(final String id) {
        return new MobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id, getClient(), null);
    }
    public IMobileAppCategoryCollectionRequestBuilder mobileAppCategories() {
        return new MobileAppCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppCategories"), getClient(), null);
    }

    public IMobileAppCategoryRequestBuilder mobileAppCategories(final String id) {
        return new MobileAppCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppCategories") + "/" + id, getClient(), null);
    }
    public IEnterpriseCodeSigningCertificateCollectionRequestBuilder enterpriseCodeSigningCertificates() {
        return new EnterpriseCodeSigningCertificateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("enterpriseCodeSigningCertificates"), getClient(), null);
    }

    public IEnterpriseCodeSigningCertificateRequestBuilder enterpriseCodeSigningCertificates(final String id) {
        return new EnterpriseCodeSigningCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("enterpriseCodeSigningCertificates") + "/" + id, getClient(), null);
    }
    public IIosLobAppProvisioningConfigurationCollectionRequestBuilder iosLobAppProvisioningConfigurations() {
        return new IosLobAppProvisioningConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosLobAppProvisioningConfigurations"), getClient(), null);
    }

    public IIosLobAppProvisioningConfigurationRequestBuilder iosLobAppProvisioningConfigurations(final String id) {
        return new IosLobAppProvisioningConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("iosLobAppProvisioningConfigurations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for SymantecCodeSigningCertificate
     *
     * @return the ISymantecCodeSigningCertificateRequestBuilder instance
     */
    public ISymantecCodeSigningCertificateRequestBuilder symantecCodeSigningCertificate() {
        return new SymantecCodeSigningCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("symantecCodeSigningCertificate"), getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationCollectionRequestBuilder mobileAppConfigurations() {
        return new ManagedDeviceMobileAppConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppConfigurations"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationRequestBuilder mobileAppConfigurations(final String id) {
        return new ManagedDeviceMobileAppConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppConfigurations") + "/" + id, getClient(), null);
    }
    public IManagedEBookCategoryCollectionRequestBuilder managedEBookCategories() {
        return new ManagedEBookCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBookCategories"), getClient(), null);
    }

    public IManagedEBookCategoryRequestBuilder managedEBookCategories(final String id) {
        return new ManagedEBookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBookCategories") + "/" + id, getClient(), null);
    }
    public IPolicySetCollectionRequestBuilder policySets() {
        return new PolicySetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("policySets"), getClient(), null);
    }

    public IPolicySetRequestBuilder policySets(final String id) {
        return new PolicySetRequestBuilder(getRequestUrlWithAdditionalSegment("policySets") + "/" + id, getClient(), null);
    }
    public ISideLoadingKeyCollectionRequestBuilder sideLoadingKeys() {
        return new SideLoadingKeyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sideLoadingKeys"), getClient(), null);
    }

    public ISideLoadingKeyRequestBuilder sideLoadingKeys(final String id) {
        return new SideLoadingKeyRequestBuilder(getRequestUrlWithAdditionalSegment("sideLoadingKeys") + "/" + id, getClient(), null);
    }
    public IVppTokenCollectionRequestBuilder vppTokens() {
        return new VppTokenCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("vppTokens"), getClient(), null);
    }

    public IVppTokenRequestBuilder vppTokens(final String id) {
        return new VppTokenRequestBuilder(getRequestUrlWithAdditionalSegment("vppTokens") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsManagementApp
     *
     * @return the IWindowsManagementAppWithReferenceRequestBuilder instance
     */
    public IWindowsManagementAppWithReferenceRequestBuilder windowsManagementApp() {
        return new WindowsManagementAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("windowsManagementApp"), getClient(), null);
    }
    public IManagedAppPolicyCollectionRequestBuilder managedAppPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppPolicies"), getClient(), null);
    }

    public IManagedAppPolicyRequestBuilder managedAppPolicies(final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppPolicies") + "/" + id, getClient(), null);
    }
    public IIosManagedAppProtectionCollectionRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosManagedAppProtections"), getClient(), null);
    }

    public IIosManagedAppProtectionRequestBuilder iosManagedAppProtections(final String id) {
        return new IosManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosManagedAppProtections") + "/" + id, getClient(), null);
    }
    public IAndroidManagedAppProtectionCollectionRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedAppProtections"), getClient(), null);
    }

    public IAndroidManagedAppProtectionRequestBuilder androidManagedAppProtections(final String id) {
        return new AndroidManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedAppProtections") + "/" + id, getClient(), null);
    }
    public IDefaultManagedAppProtectionCollectionRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("defaultManagedAppProtections"), getClient(), null);
    }

    public IDefaultManagedAppProtectionRequestBuilder defaultManagedAppProtections(final String id) {
        return new DefaultManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("defaultManagedAppProtections") + "/" + id, getClient(), null);
    }
    public ITargetedManagedAppConfigurationCollectionRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("targetedManagedAppConfigurations"), getClient(), null);
    }

    public ITargetedManagedAppConfigurationRequestBuilder targetedManagedAppConfigurations(final String id) {
        return new TargetedManagedAppConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("targetedManagedAppConfigurations") + "/" + id, getClient(), null);
    }
    public IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mdmWindowsInformationProtectionPolicies"), getClient(), null);
    }

    public IMdmWindowsInformationProtectionPolicyRequestBuilder mdmWindowsInformationProtectionPolicies(final String id) {
        return new MdmWindowsInformationProtectionPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("mdmWindowsInformationProtectionPolicies") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionPolicyCollectionRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionPolicies"), getClient(), null);
    }

    public IWindowsInformationProtectionPolicyRequestBuilder windowsInformationProtectionPolicies(final String id) {
        return new WindowsInformationProtectionPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionPolicies") + "/" + id, getClient(), null);
    }
    public IManagedAppRegistrationCollectionRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    public IManagedAppRegistrationRequestBuilder managedAppRegistrations(final String id) {
        return new ManagedAppRegistrationRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    public IManagedAppStatusCollectionRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppStatuses"), getClient(), null);
    }

    public IManagedAppStatusRequestBuilder managedAppStatuses(final String id) {
        return new ManagedAppStatusRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppStatuses") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations"), getClient(), null);
    }

    public IWindowsInformationProtectionDeviceRegistrationRequestBuilder windowsInformationProtectionDeviceRegistrations(final String id) {
        return new WindowsInformationProtectionDeviceRegistrationRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionWipeActionCollectionRequestBuilder windowsInformationProtectionWipeActions() {
        return new WindowsInformationProtectionWipeActionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionWipeActions"), getClient(), null);
    }

    public IWindowsInformationProtectionWipeActionRequestBuilder windowsInformationProtectionWipeActions(final String id) {
        return new WindowsInformationProtectionWipeActionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionWipeActions") + "/" + id, getClient(), null);
    }
    public IDeviceAppManagementTaskCollectionRequestBuilder deviceAppManagementTasks() {
        return new DeviceAppManagementTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceAppManagementTasks"), getClient(), null);
    }

    public IDeviceAppManagementTaskRequestBuilder deviceAppManagementTasks(final String id) {
        return new DeviceAppManagementTaskRequestBuilder(getRequestUrlWithAdditionalSegment("deviceAppManagementTasks") + "/" + id, getClient(), null);
    }
    public IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder wdacSupplementalPolicies() {
        return new WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("wdacSupplementalPolicies"), getClient(), null);
    }

    public IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder wdacSupplementalPolicies(final String id) {
        return new WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("wdacSupplementalPolicies") + "/" + id, getClient(), null);
    }

    public IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncMicrosoftStoreForBusinessApps"), getClient(), null);
    }
}
