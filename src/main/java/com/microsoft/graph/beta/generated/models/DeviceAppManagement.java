package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Singleton entity that acts as a container for all device app management functionality.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAppManagement extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceAppManagement and sets the default values.
     */
    public DeviceAppManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceAppManagement
     */
    @jakarta.annotation.Nonnull
    public static DeviceAppManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAppManagement();
    }
    /**
     * Gets the androidManagedAppProtections property value. Android managed app policies.
     * @return a java.util.List<AndroidManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidManagedAppProtection> getAndroidManagedAppProtections() {
        return this.backingStore.get("androidManagedAppProtections");
    }
    /**
     * Gets the defaultManagedAppProtections property value. Default managed app policies.
     * @return a java.util.List<DefaultManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DefaultManagedAppProtection> getDefaultManagedAppProtections() {
        return this.backingStore.get("defaultManagedAppProtections");
    }
    /**
     * Gets the deviceAppManagementTasks property value. Device app management tasks.
     * @return a java.util.List<DeviceAppManagementTask>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAppManagementTask> getDeviceAppManagementTasks() {
        return this.backingStore.get("deviceAppManagementTasks");
    }
    /**
     * Gets the enterpriseCodeSigningCertificates property value. The Windows Enterprise Code Signing Certificate.
     * @return a java.util.List<EnterpriseCodeSigningCertificate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnterpriseCodeSigningCertificate> getEnterpriseCodeSigningCertificates() {
        return this.backingStore.get("enterpriseCodeSigningCertificates");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidManagedAppProtections", (n) -> { this.setAndroidManagedAppProtections(n.getCollectionOfObjectValues(AndroidManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultManagedAppProtections", (n) -> { this.setDefaultManagedAppProtections(n.getCollectionOfObjectValues(DefaultManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceAppManagementTasks", (n) -> { this.setDeviceAppManagementTasks(n.getCollectionOfObjectValues(DeviceAppManagementTask::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseCodeSigningCertificates", (n) -> { this.setEnterpriseCodeSigningCertificates(n.getCollectionOfObjectValues(EnterpriseCodeSigningCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("iosLobAppProvisioningConfigurations", (n) -> { this.setIosLobAppProvisioningConfigurations(n.getCollectionOfObjectValues(IosLobAppProvisioningConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("iosManagedAppProtections", (n) -> { this.setIosManagedAppProtections(n.getCollectionOfObjectValues(IosManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabledForMicrosoftStoreForBusiness", (n) -> { this.setIsEnabledForMicrosoftStoreForBusiness(n.getBooleanValue()); });
        deserializerMap.put("managedAppPolicies", (n) -> { this.setManagedAppPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("managedAppRegistrations", (n) -> { this.setManagedAppRegistrations(n.getCollectionOfObjectValues(ManagedAppRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("managedAppStatuses", (n) -> { this.setManagedAppStatuses(n.getCollectionOfObjectValues(ManagedAppStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("managedEBookCategories", (n) -> { this.setManagedEBookCategories(n.getCollectionOfObjectValues(ManagedEBookCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("managedEBooks", (n) -> { this.setManagedEBooks(n.getCollectionOfObjectValues(ManagedEBook::createFromDiscriminatorValue)); });
        deserializerMap.put("mdmWindowsInformationProtectionPolicies", (n) -> { this.setMdmWindowsInformationProtectionPolicies(n.getCollectionOfObjectValues(MdmWindowsInformationProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftStoreForBusinessLanguage", (n) -> { this.setMicrosoftStoreForBusinessLanguage(n.getStringValue()); });
        deserializerMap.put("microsoftStoreForBusinessLastCompletedApplicationSyncTime", (n) -> { this.setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("microsoftStoreForBusinessLastSuccessfulSyncDateTime", (n) -> { this.setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("microsoftStoreForBusinessPortalSelection", (n) -> { this.setMicrosoftStoreForBusinessPortalSelection(n.getEnumSetValue(MicrosoftStoreForBusinessPortalSelectionOptions::forValue)); });
        deserializerMap.put("mobileAppCategories", (n) -> { this.setMobileAppCategories(n.getCollectionOfObjectValues(MobileAppCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppConfigurations", (n) -> { this.setMobileAppConfigurations(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileApps", (n) -> { this.setMobileApps(n.getCollectionOfObjectValues(MobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("policySets", (n) -> { this.setPolicySets(n.getCollectionOfObjectValues(PolicySet::createFromDiscriminatorValue)); });
        deserializerMap.put("symantecCodeSigningCertificate", (n) -> { this.setSymantecCodeSigningCertificate(n.getObjectValue(SymantecCodeSigningCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("targetedManagedAppConfigurations", (n) -> { this.setTargetedManagedAppConfigurations(n.getCollectionOfObjectValues(TargetedManagedAppConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("vppTokens", (n) -> { this.setVppTokens(n.getCollectionOfObjectValues(VppToken::createFromDiscriminatorValue)); });
        deserializerMap.put("wdacSupplementalPolicies", (n) -> { this.setWdacSupplementalPolicies(n.getCollectionOfObjectValues(WindowsDefenderApplicationControlSupplementalPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionDeviceRegistrations", (n) -> { this.setWindowsInformationProtectionDeviceRegistrations(n.getCollectionOfObjectValues(WindowsInformationProtectionDeviceRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionPolicies", (n) -> { this.setWindowsInformationProtectionPolicies(n.getCollectionOfObjectValues(WindowsInformationProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionWipeActions", (n) -> { this.setWindowsInformationProtectionWipeActions(n.getCollectionOfObjectValues(WindowsInformationProtectionWipeAction::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsManagedAppProtections", (n) -> { this.setWindowsManagedAppProtections(n.getCollectionOfObjectValues(WindowsManagedAppProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsManagementApp", (n) -> { this.setWindowsManagementApp(n.getObjectValue(WindowsManagementApp::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iosLobAppProvisioningConfigurations property value. The IOS Lob App Provisioning Configurations.
     * @return a java.util.List<IosLobAppProvisioningConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosLobAppProvisioningConfiguration> getIosLobAppProvisioningConfigurations() {
        return this.backingStore.get("iosLobAppProvisioningConfigurations");
    }
    /**
     * Gets the iosManagedAppProtections property value. iOS managed app policies.
     * @return a java.util.List<IosManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosManagedAppProtection> getIosManagedAppProtections() {
        return this.backingStore.get("iosManagedAppProtections");
    }
    /**
     * Gets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabledForMicrosoftStoreForBusiness() {
        return this.backingStore.get("isEnabledForMicrosoftStoreForBusiness");
    }
    /**
     * Gets the managedAppPolicies property value. Managed app policies.
     * @return a java.util.List<ManagedAppPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getManagedAppPolicies() {
        return this.backingStore.get("managedAppPolicies");
    }
    /**
     * Gets the managedAppRegistrations property value. The managed app registrations.
     * @return a java.util.List<ManagedAppRegistration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppRegistration> getManagedAppRegistrations() {
        return this.backingStore.get("managedAppRegistrations");
    }
    /**
     * Gets the managedAppStatuses property value. The managed app statuses.
     * @return a java.util.List<ManagedAppStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAppStatus> getManagedAppStatuses() {
        return this.backingStore.get("managedAppStatuses");
    }
    /**
     * Gets the managedEBookCategories property value. The mobile eBook categories.
     * @return a java.util.List<ManagedEBookCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedEBookCategory> getManagedEBookCategories() {
        return this.backingStore.get("managedEBookCategories");
    }
    /**
     * Gets the managedEBooks property value. The Managed eBook.
     * @return a java.util.List<ManagedEBook>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedEBook> getManagedEBooks() {
        return this.backingStore.get("managedEBooks");
    }
    /**
     * Gets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @return a java.util.List<MdmWindowsInformationProtectionPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MdmWindowsInformationProtectionPolicy> getMdmWindowsInformationProtectionPolicies() {
        return this.backingStore.get("mdmWindowsInformationProtectionPolicies");
    }
    /**
     * Gets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftStoreForBusinessLanguage() {
        return this.backingStore.get("microsoftStoreForBusinessLanguage");
    }
    /**
     * Gets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastCompletedApplicationSyncTime() {
        return this.backingStore.get("microsoftStoreForBusinessLastCompletedApplicationSyncTime");
    }
    /**
     * Gets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastSuccessfulSyncDateTime() {
        return this.backingStore.get("microsoftStoreForBusinessLastSuccessfulSyncDateTime");
    }
    /**
     * Gets the microsoftStoreForBusinessPortalSelection property value. Portal to which admin syncs available Microsoft Store for Business apps. This is available in the Intune Admin Console.
     * @return a EnumSet<MicrosoftStoreForBusinessPortalSelectionOptions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<MicrosoftStoreForBusinessPortalSelectionOptions> getMicrosoftStoreForBusinessPortalSelection() {
        return this.backingStore.get("microsoftStoreForBusinessPortalSelection");
    }
    /**
     * Gets the mobileAppCategories property value. The mobile app categories.
     * @return a java.util.List<MobileAppCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppCategory> getMobileAppCategories() {
        return this.backingStore.get("mobileAppCategories");
    }
    /**
     * Gets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @return a java.util.List<ManagedDeviceMobileAppConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfiguration> getMobileAppConfigurations() {
        return this.backingStore.get("mobileAppConfigurations");
    }
    /**
     * Gets the mobileApps property value. The mobile apps.
     * @return a java.util.List<MobileApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileApp> getMobileApps() {
        return this.backingStore.get("mobileApps");
    }
    /**
     * Gets the policySets property value. The PolicySet of Policies and Applications
     * @return a java.util.List<PolicySet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySet> getPolicySets() {
        return this.backingStore.get("policySets");
    }
    /**
     * Gets the symantecCodeSigningCertificate property value. The WinPhone Symantec Code Signing Certificate.
     * @return a SymantecCodeSigningCertificate
     */
    @jakarta.annotation.Nullable
    public SymantecCodeSigningCertificate getSymantecCodeSigningCertificate() {
        return this.backingStore.get("symantecCodeSigningCertificate");
    }
    /**
     * Gets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @return a java.util.List<TargetedManagedAppConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppConfiguration> getTargetedManagedAppConfigurations() {
        return this.backingStore.get("targetedManagedAppConfigurations");
    }
    /**
     * Gets the vppTokens property value. List of Vpp tokens for this organization.
     * @return a java.util.List<VppToken>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VppToken> getVppTokens() {
        return this.backingStore.get("vppTokens");
    }
    /**
     * Gets the wdacSupplementalPolicies property value. The collection of Windows Defender Application Control Supplemental Policies.
     * @return a java.util.List<WindowsDefenderApplicationControlSupplementalPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicy> getWdacSupplementalPolicies() {
        return this.backingStore.get("wdacSupplementalPolicies");
    }
    /**
     * Gets the windowsInformationProtectionDeviceRegistrations property value. Windows information protection device registrations that are not MDM enrolled.
     * @return a java.util.List<WindowsInformationProtectionDeviceRegistration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionDeviceRegistration> getWindowsInformationProtectionDeviceRegistrations() {
        return this.backingStore.get("windowsInformationProtectionDeviceRegistrations");
    }
    /**
     * Gets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @return a java.util.List<WindowsInformationProtectionPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionPolicy> getWindowsInformationProtectionPolicies() {
        return this.backingStore.get("windowsInformationProtectionPolicies");
    }
    /**
     * Gets the windowsInformationProtectionWipeActions property value. Windows information protection wipe actions.
     * @return a java.util.List<WindowsInformationProtectionWipeAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionWipeAction> getWindowsInformationProtectionWipeActions() {
        return this.backingStore.get("windowsInformationProtectionWipeActions");
    }
    /**
     * Gets the windowsManagedAppProtections property value. Windows managed app policies.
     * @return a java.util.List<WindowsManagedAppProtection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsManagedAppProtection> getWindowsManagedAppProtections() {
        return this.backingStore.get("windowsManagedAppProtections");
    }
    /**
     * Gets the windowsManagementApp property value. Windows management app.
     * @return a WindowsManagementApp
     */
    @jakarta.annotation.Nullable
    public WindowsManagementApp getWindowsManagementApp() {
        return this.backingStore.get("windowsManagementApp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("androidManagedAppProtections", this.getAndroidManagedAppProtections());
        writer.writeCollectionOfObjectValues("defaultManagedAppProtections", this.getDefaultManagedAppProtections());
        writer.writeCollectionOfObjectValues("deviceAppManagementTasks", this.getDeviceAppManagementTasks());
        writer.writeCollectionOfObjectValues("enterpriseCodeSigningCertificates", this.getEnterpriseCodeSigningCertificates());
        writer.writeCollectionOfObjectValues("iosLobAppProvisioningConfigurations", this.getIosLobAppProvisioningConfigurations());
        writer.writeCollectionOfObjectValues("iosManagedAppProtections", this.getIosManagedAppProtections());
        writer.writeBooleanValue("isEnabledForMicrosoftStoreForBusiness", this.getIsEnabledForMicrosoftStoreForBusiness());
        writer.writeCollectionOfObjectValues("managedAppPolicies", this.getManagedAppPolicies());
        writer.writeCollectionOfObjectValues("managedAppRegistrations", this.getManagedAppRegistrations());
        writer.writeCollectionOfObjectValues("managedAppStatuses", this.getManagedAppStatuses());
        writer.writeCollectionOfObjectValues("managedEBookCategories", this.getManagedEBookCategories());
        writer.writeCollectionOfObjectValues("managedEBooks", this.getManagedEBooks());
        writer.writeCollectionOfObjectValues("mdmWindowsInformationProtectionPolicies", this.getMdmWindowsInformationProtectionPolicies());
        writer.writeStringValue("microsoftStoreForBusinessLanguage", this.getMicrosoftStoreForBusinessLanguage());
        writer.writeOffsetDateTimeValue("microsoftStoreForBusinessLastCompletedApplicationSyncTime", this.getMicrosoftStoreForBusinessLastCompletedApplicationSyncTime());
        writer.writeOffsetDateTimeValue("microsoftStoreForBusinessLastSuccessfulSyncDateTime", this.getMicrosoftStoreForBusinessLastSuccessfulSyncDateTime());
        writer.writeEnumSetValue("microsoftStoreForBusinessPortalSelection", this.getMicrosoftStoreForBusinessPortalSelection());
        writer.writeCollectionOfObjectValues("mobileAppCategories", this.getMobileAppCategories());
        writer.writeCollectionOfObjectValues("mobileAppConfigurations", this.getMobileAppConfigurations());
        writer.writeCollectionOfObjectValues("mobileApps", this.getMobileApps());
        writer.writeCollectionOfObjectValues("policySets", this.getPolicySets());
        writer.writeObjectValue("symantecCodeSigningCertificate", this.getSymantecCodeSigningCertificate());
        writer.writeCollectionOfObjectValues("targetedManagedAppConfigurations", this.getTargetedManagedAppConfigurations());
        writer.writeCollectionOfObjectValues("vppTokens", this.getVppTokens());
        writer.writeCollectionOfObjectValues("wdacSupplementalPolicies", this.getWdacSupplementalPolicies());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionDeviceRegistrations", this.getWindowsInformationProtectionDeviceRegistrations());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionPolicies", this.getWindowsInformationProtectionPolicies());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionWipeActions", this.getWindowsInformationProtectionWipeActions());
        writer.writeCollectionOfObjectValues("windowsManagedAppProtections", this.getWindowsManagedAppProtections());
        writer.writeObjectValue("windowsManagementApp", this.getWindowsManagementApp());
    }
    /**
     * Sets the androidManagedAppProtections property value. Android managed app policies.
     * @param value Value to set for the androidManagedAppProtections property.
     */
    public void setAndroidManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<AndroidManagedAppProtection> value) {
        this.backingStore.set("androidManagedAppProtections", value);
    }
    /**
     * Sets the defaultManagedAppProtections property value. Default managed app policies.
     * @param value Value to set for the defaultManagedAppProtections property.
     */
    public void setDefaultManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<DefaultManagedAppProtection> value) {
        this.backingStore.set("defaultManagedAppProtections", value);
    }
    /**
     * Sets the deviceAppManagementTasks property value. Device app management tasks.
     * @param value Value to set for the deviceAppManagementTasks property.
     */
    public void setDeviceAppManagementTasks(@jakarta.annotation.Nullable final java.util.List<DeviceAppManagementTask> value) {
        this.backingStore.set("deviceAppManagementTasks", value);
    }
    /**
     * Sets the enterpriseCodeSigningCertificates property value. The Windows Enterprise Code Signing Certificate.
     * @param value Value to set for the enterpriseCodeSigningCertificates property.
     */
    public void setEnterpriseCodeSigningCertificates(@jakarta.annotation.Nullable final java.util.List<EnterpriseCodeSigningCertificate> value) {
        this.backingStore.set("enterpriseCodeSigningCertificates", value);
    }
    /**
     * Sets the iosLobAppProvisioningConfigurations property value. The IOS Lob App Provisioning Configurations.
     * @param value Value to set for the iosLobAppProvisioningConfigurations property.
     */
    public void setIosLobAppProvisioningConfigurations(@jakarta.annotation.Nullable final java.util.List<IosLobAppProvisioningConfiguration> value) {
        this.backingStore.set("iosLobAppProvisioningConfigurations", value);
    }
    /**
     * Sets the iosManagedAppProtections property value. iOS managed app policies.
     * @param value Value to set for the iosManagedAppProtections property.
     */
    public void setIosManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<IosManagedAppProtection> value) {
        this.backingStore.set("iosManagedAppProtections", value);
    }
    /**
     * Sets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @param value Value to set for the isEnabledForMicrosoftStoreForBusiness property.
     */
    public void setIsEnabledForMicrosoftStoreForBusiness(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabledForMicrosoftStoreForBusiness", value);
    }
    /**
     * Sets the managedAppPolicies property value. Managed app policies.
     * @param value Value to set for the managedAppPolicies property.
     */
    public void setManagedAppPolicies(@jakarta.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.backingStore.set("managedAppPolicies", value);
    }
    /**
     * Sets the managedAppRegistrations property value. The managed app registrations.
     * @param value Value to set for the managedAppRegistrations property.
     */
    public void setManagedAppRegistrations(@jakarta.annotation.Nullable final java.util.List<ManagedAppRegistration> value) {
        this.backingStore.set("managedAppRegistrations", value);
    }
    /**
     * Sets the managedAppStatuses property value. The managed app statuses.
     * @param value Value to set for the managedAppStatuses property.
     */
    public void setManagedAppStatuses(@jakarta.annotation.Nullable final java.util.List<ManagedAppStatus> value) {
        this.backingStore.set("managedAppStatuses", value);
    }
    /**
     * Sets the managedEBookCategories property value. The mobile eBook categories.
     * @param value Value to set for the managedEBookCategories property.
     */
    public void setManagedEBookCategories(@jakarta.annotation.Nullable final java.util.List<ManagedEBookCategory> value) {
        this.backingStore.set("managedEBookCategories", value);
    }
    /**
     * Sets the managedEBooks property value. The Managed eBook.
     * @param value Value to set for the managedEBooks property.
     */
    public void setManagedEBooks(@jakarta.annotation.Nullable final java.util.List<ManagedEBook> value) {
        this.backingStore.set("managedEBooks", value);
    }
    /**
     * Sets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @param value Value to set for the mdmWindowsInformationProtectionPolicies property.
     */
    public void setMdmWindowsInformationProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<MdmWindowsInformationProtectionPolicy> value) {
        this.backingStore.set("mdmWindowsInformationProtectionPolicies", value);
    }
    /**
     * Sets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @param value Value to set for the microsoftStoreForBusinessLanguage property.
     */
    public void setMicrosoftStoreForBusinessLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("microsoftStoreForBusinessLanguage", value);
    }
    /**
     * Sets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @param value Value to set for the microsoftStoreForBusinessLastCompletedApplicationSyncTime property.
     */
    public void setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("microsoftStoreForBusinessLastCompletedApplicationSyncTime", value);
    }
    /**
     * Sets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @param value Value to set for the microsoftStoreForBusinessLastSuccessfulSyncDateTime property.
     */
    public void setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("microsoftStoreForBusinessLastSuccessfulSyncDateTime", value);
    }
    /**
     * Sets the microsoftStoreForBusinessPortalSelection property value. Portal to which admin syncs available Microsoft Store for Business apps. This is available in the Intune Admin Console.
     * @param value Value to set for the microsoftStoreForBusinessPortalSelection property.
     */
    public void setMicrosoftStoreForBusinessPortalSelection(@jakarta.annotation.Nullable final EnumSet<MicrosoftStoreForBusinessPortalSelectionOptions> value) {
        this.backingStore.set("microsoftStoreForBusinessPortalSelection", value);
    }
    /**
     * Sets the mobileAppCategories property value. The mobile app categories.
     * @param value Value to set for the mobileAppCategories property.
     */
    public void setMobileAppCategories(@jakarta.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this.backingStore.set("mobileAppCategories", value);
    }
    /**
     * Sets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @param value Value to set for the mobileAppConfigurations property.
     */
    public void setMobileAppConfigurations(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfiguration> value) {
        this.backingStore.set("mobileAppConfigurations", value);
    }
    /**
     * Sets the mobileApps property value. The mobile apps.
     * @param value Value to set for the mobileApps property.
     */
    public void setMobileApps(@jakarta.annotation.Nullable final java.util.List<MobileApp> value) {
        this.backingStore.set("mobileApps", value);
    }
    /**
     * Sets the policySets property value. The PolicySet of Policies and Applications
     * @param value Value to set for the policySets property.
     */
    public void setPolicySets(@jakarta.annotation.Nullable final java.util.List<PolicySet> value) {
        this.backingStore.set("policySets", value);
    }
    /**
     * Sets the symantecCodeSigningCertificate property value. The WinPhone Symantec Code Signing Certificate.
     * @param value Value to set for the symantecCodeSigningCertificate property.
     */
    public void setSymantecCodeSigningCertificate(@jakarta.annotation.Nullable final SymantecCodeSigningCertificate value) {
        this.backingStore.set("symantecCodeSigningCertificate", value);
    }
    /**
     * Sets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @param value Value to set for the targetedManagedAppConfigurations property.
     */
    public void setTargetedManagedAppConfigurations(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppConfiguration> value) {
        this.backingStore.set("targetedManagedAppConfigurations", value);
    }
    /**
     * Sets the vppTokens property value. List of Vpp tokens for this organization.
     * @param value Value to set for the vppTokens property.
     */
    public void setVppTokens(@jakarta.annotation.Nullable final java.util.List<VppToken> value) {
        this.backingStore.set("vppTokens", value);
    }
    /**
     * Sets the wdacSupplementalPolicies property value. The collection of Windows Defender Application Control Supplemental Policies.
     * @param value Value to set for the wdacSupplementalPolicies property.
     */
    public void setWdacSupplementalPolicies(@jakarta.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicy> value) {
        this.backingStore.set("wdacSupplementalPolicies", value);
    }
    /**
     * Sets the windowsInformationProtectionDeviceRegistrations property value. Windows information protection device registrations that are not MDM enrolled.
     * @param value Value to set for the windowsInformationProtectionDeviceRegistrations property.
     */
    public void setWindowsInformationProtectionDeviceRegistrations(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionDeviceRegistration> value) {
        this.backingStore.set("windowsInformationProtectionDeviceRegistrations", value);
    }
    /**
     * Sets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @param value Value to set for the windowsInformationProtectionPolicies property.
     */
    public void setWindowsInformationProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionPolicy> value) {
        this.backingStore.set("windowsInformationProtectionPolicies", value);
    }
    /**
     * Sets the windowsInformationProtectionWipeActions property value. Windows information protection wipe actions.
     * @param value Value to set for the windowsInformationProtectionWipeActions property.
     */
    public void setWindowsInformationProtectionWipeActions(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionWipeAction> value) {
        this.backingStore.set("windowsInformationProtectionWipeActions", value);
    }
    /**
     * Sets the windowsManagedAppProtections property value. Windows managed app policies.
     * @param value Value to set for the windowsManagedAppProtections property.
     */
    public void setWindowsManagedAppProtections(@jakarta.annotation.Nullable final java.util.List<WindowsManagedAppProtection> value) {
        this.backingStore.set("windowsManagedAppProtections", value);
    }
    /**
     * Sets the windowsManagementApp property value. Windows management app.
     * @param value Value to set for the windowsManagementApp property.
     */
    public void setWindowsManagementApp(@jakarta.annotation.Nullable final WindowsManagementApp value) {
        this.backingStore.set("windowsManagementApp", value);
    }
}
