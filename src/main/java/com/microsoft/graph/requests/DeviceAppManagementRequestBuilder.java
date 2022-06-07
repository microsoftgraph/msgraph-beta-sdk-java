// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAppManagement;
import com.microsoft.graph.requests.ManagedEBookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedEBookCategoryRequestBuilder;
import com.microsoft.graph.requests.EnterpriseCodeSigningCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.EnterpriseCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.IosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.IosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.MobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.MobileAppRequestBuilder;
import com.microsoft.graph.requests.MobileLobAppRequestBuilder;
import com.microsoft.graph.requests.ManagedMobileLobAppRequestBuilder;
import com.microsoft.graph.requests.SymantecCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.ManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedEBookRequestBuilder;
import com.microsoft.graph.requests.PolicySetCollectionRequestBuilder;
import com.microsoft.graph.requests.PolicySetRequestBuilder;
import com.microsoft.graph.requests.SideLoadingKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.SideLoadingKeyRequestBuilder;
import com.microsoft.graph.requests.VppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.VppTokenRequestBuilder;
import com.microsoft.graph.requests.WindowsManagementAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.DefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.DefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.IosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.IosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.ManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.MdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.MdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.TargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.TargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionWipeActionRequestBuilder;
import com.microsoft.graph.requests.WindowsManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAppManagementTaskRequestBuilder;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Request Builder.
 */
public class DeviceAppManagementRequestBuilder extends BaseRequestBuilder<DeviceAppManagement> {

    /**
     * The request builder for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceAppManagementRequest instance
     */
    @Nonnull
    public DeviceAppManagementRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceAppManagementRequest instance
     */
    @Nonnull
    public DeviceAppManagementRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DeviceAppManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagedEBookCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedEBookCategoryCollectionRequestBuilder managedEBookCategories() {
        return new ManagedEBookCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBookCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedEBookCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedEBookCategoryRequestBuilder managedEBookCategories(@Nonnull final String id) {
        return new ManagedEBookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBookCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EnterpriseCodeSigningCertificate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EnterpriseCodeSigningCertificateCollectionRequestBuilder enterpriseCodeSigningCertificates() {
        return new EnterpriseCodeSigningCertificateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("enterpriseCodeSigningCertificates"), getClient(), null);
    }

    /**
     * Gets a request builder for the EnterpriseCodeSigningCertificate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EnterpriseCodeSigningCertificateRequestBuilder enterpriseCodeSigningCertificates(@Nonnull final String id) {
        return new EnterpriseCodeSigningCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("enterpriseCodeSigningCertificates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IosLobAppProvisioningConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IosLobAppProvisioningConfigurationCollectionRequestBuilder iosLobAppProvisioningConfigurations() {
        return new IosLobAppProvisioningConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosLobAppProvisioningConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the IosLobAppProvisioningConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IosLobAppProvisioningConfigurationRequestBuilder iosLobAppProvisioningConfigurations(@Nonnull final String id) {
        return new IosLobAppProvisioningConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("iosLobAppProvisioningConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppCategoryCollectionRequestBuilder mobileAppCategories() {
        return new MobileAppCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppCategoryRequestBuilder mobileAppCategories(@Nonnull final String id) {
        return new MobileAppCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppCategories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceMobileAppConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationCollectionRequestBuilder mobileAppConfigurations() {
        return new ManagedDeviceMobileAppConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceMobileAppConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationRequestBuilder mobileAppConfigurations(@Nonnull final String id) {
        return new ManagedDeviceMobileAppConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppCollectionRequestBuilder mobileApps() {
        return new MobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppRequestBuilder mobileApps(@Nonnull final String id) {
        return new MobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileLobApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileLobAppCollectionRequestBuilder mobileAppsAsMobileLobApp() {
        return new MobileLobAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/microsoft.graph.mobileLobApp", getClient(), null);
    }

    /**
     * Gets a request builder for the MobileLobApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileLobAppRequestBuilder mobileAppsAsMobileLobApp(@Nonnull final String id) {
        return new MobileLobAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id + "/microsoft.graph.mobileLobApp", getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedMobileLobApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedMobileLobAppCollectionRequestBuilder mobileAppsAsManagedMobileLobApp() {
        return new ManagedMobileLobAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/microsoft.graph.managedMobileLobApp", getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedMobileLobApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedMobileLobAppRequestBuilder mobileAppsAsManagedMobileLobApp(@Nonnull final String id) {
        return new ManagedMobileLobAppRequestBuilder(getRequestUrlWithAdditionalSegment("mobileApps") + "/" + id + "/microsoft.graph.managedMobileLobApp", getClient(), null);
    }

    /**
     * Gets the request builder for SymantecCodeSigningCertificate
     *
     * @return the SymantecCodeSigningCertificateRequestBuilder instance
     */
    @Nonnull
    public SymantecCodeSigningCertificateRequestBuilder symantecCodeSigningCertificate() {
        return new SymantecCodeSigningCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("symantecCodeSigningCertificate"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedEBook collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedEBookCollectionRequestBuilder managedEBooks() {
        return new ManagedEBookCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBooks"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedEBook item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedEBookRequestBuilder managedEBooks(@Nonnull final String id) {
        return new ManagedEBookRequestBuilder(getRequestUrlWithAdditionalSegment("managedEBooks") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PolicySet collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PolicySetCollectionRequestBuilder policySets() {
        return new PolicySetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("policySets"), getClient(), null);
    }

    /**
     * Gets a request builder for the PolicySet item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PolicySetRequestBuilder policySets(@Nonnull final String id) {
        return new PolicySetRequestBuilder(getRequestUrlWithAdditionalSegment("policySets") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SideLoadingKey collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SideLoadingKeyCollectionRequestBuilder sideLoadingKeys() {
        return new SideLoadingKeyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sideLoadingKeys"), getClient(), null);
    }

    /**
     * Gets a request builder for the SideLoadingKey item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SideLoadingKeyRequestBuilder sideLoadingKeys(@Nonnull final String id) {
        return new SideLoadingKeyRequestBuilder(getRequestUrlWithAdditionalSegment("sideLoadingKeys") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the VppToken collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public VppTokenCollectionRequestBuilder vppTokens() {
        return new VppTokenCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("vppTokens"), getClient(), null);
    }

    /**
     * Gets a request builder for the VppToken item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public VppTokenRequestBuilder vppTokens(@Nonnull final String id) {
        return new VppTokenRequestBuilder(getRequestUrlWithAdditionalSegment("vppTokens") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsManagementApp
     *
     * @return the WindowsManagementAppWithReferenceRequestBuilder instance
     */
    @Nonnull
    public WindowsManagementAppWithReferenceRequestBuilder windowsManagementApp() {
        return new WindowsManagementAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("windowsManagementApp"), getClient(), null);
    }
    /**
     *  Gets a request builder for the AndroidManagedAppProtection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AndroidManagedAppProtectionCollectionRequestBuilder androidManagedAppProtections() {
        return new AndroidManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedAppProtections"), getClient(), null);
    }

    /**
     * Gets a request builder for the AndroidManagedAppProtection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AndroidManagedAppProtectionRequestBuilder androidManagedAppProtections(@Nonnull final String id) {
        return new AndroidManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedAppProtections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DefaultManagedAppProtection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DefaultManagedAppProtectionCollectionRequestBuilder defaultManagedAppProtections() {
        return new DefaultManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("defaultManagedAppProtections"), getClient(), null);
    }

    /**
     * Gets a request builder for the DefaultManagedAppProtection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DefaultManagedAppProtectionRequestBuilder defaultManagedAppProtections(@Nonnull final String id) {
        return new DefaultManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("defaultManagedAppProtections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IosManagedAppProtection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IosManagedAppProtectionCollectionRequestBuilder iosManagedAppProtections() {
        return new IosManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosManagedAppProtections"), getClient(), null);
    }

    /**
     * Gets a request builder for the IosManagedAppProtection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IosManagedAppProtectionRequestBuilder iosManagedAppProtections(@Nonnull final String id) {
        return new IosManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosManagedAppProtections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppPolicyCollectionRequestBuilder managedAppPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppPolicyRequestBuilder managedAppPolicies(@Nonnull final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppRegistration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppRegistrationCollectionRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppRegistration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppRegistrationRequestBuilder managedAppRegistrations(@Nonnull final String id) {
        return new ManagedAppRegistrationRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppStatusCollectionRequestBuilder managedAppStatuses() {
        return new ManagedAppStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppStatusRequestBuilder managedAppStatuses(@Nonnull final String id) {
        return new ManagedAppStatusRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppStatuses") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MdmWindowsInformationProtectionPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MdmWindowsInformationProtectionPolicyCollectionRequestBuilder mdmWindowsInformationProtectionPolicies() {
        return new MdmWindowsInformationProtectionPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mdmWindowsInformationProtectionPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the MdmWindowsInformationProtectionPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MdmWindowsInformationProtectionPolicyRequestBuilder mdmWindowsInformationProtectionPolicies(@Nonnull final String id) {
        return new MdmWindowsInformationProtectionPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("mdmWindowsInformationProtectionPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TargetedManagedAppConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TargetedManagedAppConfigurationCollectionRequestBuilder targetedManagedAppConfigurations() {
        return new TargetedManagedAppConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("targetedManagedAppConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the TargetedManagedAppConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TargetedManagedAppConfigurationRequestBuilder targetedManagedAppConfigurations(@Nonnull final String id) {
        return new TargetedManagedAppConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("targetedManagedAppConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionDeviceRegistration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionDeviceRegistration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionDeviceRegistrationRequestBuilder windowsInformationProtectionDeviceRegistrations(@Nonnull final String id) {
        return new WindowsInformationProtectionDeviceRegistrationRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionPolicyCollectionRequestBuilder windowsInformationProtectionPolicies() {
        return new WindowsInformationProtectionPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionPolicyRequestBuilder windowsInformationProtectionPolicies(@Nonnull final String id) {
        return new WindowsInformationProtectionPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionWipeAction collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionWipeActionCollectionRequestBuilder windowsInformationProtectionWipeActions() {
        return new WindowsInformationProtectionWipeActionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionWipeActions"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionWipeAction item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionWipeActionRequestBuilder windowsInformationProtectionWipeActions(@Nonnull final String id) {
        return new WindowsInformationProtectionWipeActionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionWipeActions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsManagedAppProtection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsManagedAppProtectionCollectionRequestBuilder windowsManagedAppProtections() {
        return new WindowsManagedAppProtectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsManagedAppProtections"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsManagedAppProtection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsManagedAppProtectionRequestBuilder windowsManagedAppProtections(@Nonnull final String id) {
        return new WindowsManagedAppProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsManagedAppProtections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceAppManagementTask collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceAppManagementTaskCollectionRequestBuilder deviceAppManagementTasks() {
        return new DeviceAppManagementTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceAppManagementTasks"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceAppManagementTask item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceAppManagementTaskRequestBuilder deviceAppManagementTasks(@Nonnull final String id) {
        return new DeviceAppManagementTaskRequestBuilder(getRequestUrlWithAdditionalSegment("deviceAppManagementTasks") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsDefenderApplicationControlSupplementalPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder wdacSupplementalPolicies() {
        return new WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("wdacSupplementalPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsDefenderApplicationControlSupplementalPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder wdacSupplementalPolicies(@Nonnull final String id) {
        return new WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("wdacSupplementalPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Syncs Intune account with Microsoft Store For Business
     * @return the request builder
     */
    @Nonnull
    public DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps() {
        return new DeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncMicrosoftStoreForBusinessApps"), getClient(), null);
    }
}
