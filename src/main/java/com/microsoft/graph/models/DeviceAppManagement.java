package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Singleton entity that acts as a container for all device app management functionality.
 */
public class DeviceAppManagement extends Entity implements Parsable {
    /**
     * Android managed app policies.
     */
    private java.util.List<AndroidManagedAppProtection> androidManagedAppProtections;
    /**
     * Default managed app policies.
     */
    private java.util.List<DefaultManagedAppProtection> defaultManagedAppProtections;
    /**
     * Device app management tasks.
     */
    private java.util.List<DeviceAppManagementTask> deviceAppManagementTasks;
    /**
     * The Windows Enterprise Code Signing Certificate.
     */
    private java.util.List<EnterpriseCodeSigningCertificate> enterpriseCodeSigningCertificates;
    /**
     * The IOS Lob App Provisioning Configurations.
     */
    private java.util.List<IosLobAppProvisioningConfiguration> iosLobAppProvisioningConfigurations;
    /**
     * iOS managed app policies.
     */
    private java.util.List<IosManagedAppProtection> iosManagedAppProtections;
    /**
     * Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     */
    private Boolean isEnabledForMicrosoftStoreForBusiness;
    /**
     * Managed app policies.
     */
    private java.util.List<ManagedAppPolicy> managedAppPolicies;
    /**
     * The managed app registrations.
     */
    private java.util.List<ManagedAppRegistration> managedAppRegistrations;
    /**
     * The managed app statuses.
     */
    private java.util.List<ManagedAppStatus> managedAppStatuses;
    /**
     * The mobile eBook categories.
     */
    private java.util.List<ManagedEBookCategory> managedEBookCategories;
    /**
     * The Managed eBook.
     */
    private java.util.List<ManagedEBook> managedEBooks;
    /**
     * Windows information protection for apps running on devices which are MDM enrolled.
     */
    private java.util.List<MdmWindowsInformationProtectionPolicy> mdmWindowsInformationProtectionPolicies;
    /**
     * The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     */
    private String microsoftStoreForBusinessLanguage;
    /**
     * The last time an application sync from the Microsoft Store for Business was completed.
     */
    private OffsetDateTime microsoftStoreForBusinessLastCompletedApplicationSyncTime;
    /**
     * The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     */
    private OffsetDateTime microsoftStoreForBusinessLastSuccessfulSyncDateTime;
    /**
     * Portal to which admin syncs available Microsoft Store for Business apps. This is available in the Intune Admin Console.
     */
    private MicrosoftStoreForBusinessPortalSelectionOptions microsoftStoreForBusinessPortalSelection;
    /**
     * The mobile app categories.
     */
    private java.util.List<MobileAppCategory> mobileAppCategories;
    /**
     * The Managed Device Mobile Application Configurations.
     */
    private java.util.List<ManagedDeviceMobileAppConfiguration> mobileAppConfigurations;
    /**
     * The mobile apps.
     */
    private java.util.List<MobileApp> mobileApps;
    /**
     * The PolicySet of Policies and Applications
     */
    private java.util.List<PolicySet> policySets;
    /**
     * The WinPhone Symantec Code Signing Certificate.
     */
    private SymantecCodeSigningCertificate symantecCodeSigningCertificate;
    /**
     * Targeted managed app configurations.
     */
    private java.util.List<TargetedManagedAppConfiguration> targetedManagedAppConfigurations;
    /**
     * List of Vpp tokens for this organization.
     */
    private java.util.List<VppToken> vppTokens;
    /**
     * The collection of Windows Defender Application Control Supplemental Policies.
     */
    private java.util.List<WindowsDefenderApplicationControlSupplementalPolicy> wdacSupplementalPolicies;
    /**
     * Windows information protection device registrations that are not MDM enrolled.
     */
    private java.util.List<WindowsInformationProtectionDeviceRegistration> windowsInformationProtectionDeviceRegistrations;
    /**
     * Windows information protection for apps running on devices which are not MDM enrolled.
     */
    private java.util.List<WindowsInformationProtectionPolicy> windowsInformationProtectionPolicies;
    /**
     * Windows information protection wipe actions.
     */
    private java.util.List<WindowsInformationProtectionWipeAction> windowsInformationProtectionWipeActions;
    /**
     * Windows managed app policies.
     */
    private java.util.List<WindowsManagedAppProtection> windowsManagedAppProtections;
    /**
     * Windows management app.
     */
    private WindowsManagementApp windowsManagementApp;
    /**
     * Instantiates a new deviceAppManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceAppManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAppManagement
     */
    @javax.annotation.Nonnull
    public static DeviceAppManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAppManagement();
    }
    /**
     * Gets the androidManagedAppProtections property value. Android managed app policies.
     * @return a androidManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidManagedAppProtection> getAndroidManagedAppProtections() {
        return this.androidManagedAppProtections;
    }
    /**
     * Gets the defaultManagedAppProtections property value. Default managed app policies.
     * @return a defaultManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<DefaultManagedAppProtection> getDefaultManagedAppProtections() {
        return this.defaultManagedAppProtections;
    }
    /**
     * Gets the deviceAppManagementTasks property value. Device app management tasks.
     * @return a deviceAppManagementTask
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAppManagementTask> getDeviceAppManagementTasks() {
        return this.deviceAppManagementTasks;
    }
    /**
     * Gets the enterpriseCodeSigningCertificates property value. The Windows Enterprise Code Signing Certificate.
     * @return a enterpriseCodeSigningCertificate
     */
    @javax.annotation.Nullable
    public java.util.List<EnterpriseCodeSigningCertificate> getEnterpriseCodeSigningCertificates() {
        return this.enterpriseCodeSigningCertificates;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("microsoftStoreForBusinessPortalSelection", (n) -> { this.setMicrosoftStoreForBusinessPortalSelection(n.getEnumValue(MicrosoftStoreForBusinessPortalSelectionOptions.class)); });
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
     * @return a iosLobAppProvisioningConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<IosLobAppProvisioningConfiguration> getIosLobAppProvisioningConfigurations() {
        return this.iosLobAppProvisioningConfigurations;
    }
    /**
     * Gets the iosManagedAppProtections property value. iOS managed app policies.
     * @return a iosManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<IosManagedAppProtection> getIosManagedAppProtections() {
        return this.iosManagedAppProtections;
    }
    /**
     * Gets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabledForMicrosoftStoreForBusiness() {
        return this.isEnabledForMicrosoftStoreForBusiness;
    }
    /**
     * Gets the managedAppPolicies property value. Managed app policies.
     * @return a managedAppPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getManagedAppPolicies() {
        return this.managedAppPolicies;
    }
    /**
     * Gets the managedAppRegistrations property value. The managed app registrations.
     * @return a managedAppRegistration
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppRegistration> getManagedAppRegistrations() {
        return this.managedAppRegistrations;
    }
    /**
     * Gets the managedAppStatuses property value. The managed app statuses.
     * @return a managedAppStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppStatus> getManagedAppStatuses() {
        return this.managedAppStatuses;
    }
    /**
     * Gets the managedEBookCategories property value. The mobile eBook categories.
     * @return a managedEBookCategory
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedEBookCategory> getManagedEBookCategories() {
        return this.managedEBookCategories;
    }
    /**
     * Gets the managedEBooks property value. The Managed eBook.
     * @return a managedEBook
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedEBook> getManagedEBooks() {
        return this.managedEBooks;
    }
    /**
     * Gets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @return a mdmWindowsInformationProtectionPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<MdmWindowsInformationProtectionPolicy> getMdmWindowsInformationProtectionPolicies() {
        return this.mdmWindowsInformationProtectionPolicies;
    }
    /**
     * Gets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftStoreForBusinessLanguage() {
        return this.microsoftStoreForBusinessLanguage;
    }
    /**
     * Gets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastCompletedApplicationSyncTime() {
        return this.microsoftStoreForBusinessLastCompletedApplicationSyncTime;
    }
    /**
     * Gets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMicrosoftStoreForBusinessLastSuccessfulSyncDateTime() {
        return this.microsoftStoreForBusinessLastSuccessfulSyncDateTime;
    }
    /**
     * Gets the microsoftStoreForBusinessPortalSelection property value. Portal to which admin syncs available Microsoft Store for Business apps. This is available in the Intune Admin Console.
     * @return a microsoftStoreForBusinessPortalSelectionOptions
     */
    @javax.annotation.Nullable
    public MicrosoftStoreForBusinessPortalSelectionOptions getMicrosoftStoreForBusinessPortalSelection() {
        return this.microsoftStoreForBusinessPortalSelection;
    }
    /**
     * Gets the mobileAppCategories property value. The mobile app categories.
     * @return a mobileAppCategory
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppCategory> getMobileAppCategories() {
        return this.mobileAppCategories;
    }
    /**
     * Gets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @return a managedDeviceMobileAppConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfiguration> getMobileAppConfigurations() {
        return this.mobileAppConfigurations;
    }
    /**
     * Gets the mobileApps property value. The mobile apps.
     * @return a mobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<MobileApp> getMobileApps() {
        return this.mobileApps;
    }
    /**
     * Gets the policySets property value. The PolicySet of Policies and Applications
     * @return a policySet
     */
    @javax.annotation.Nullable
    public java.util.List<PolicySet> getPolicySets() {
        return this.policySets;
    }
    /**
     * Gets the symantecCodeSigningCertificate property value. The WinPhone Symantec Code Signing Certificate.
     * @return a symantecCodeSigningCertificate
     */
    @javax.annotation.Nullable
    public SymantecCodeSigningCertificate getSymantecCodeSigningCertificate() {
        return this.symantecCodeSigningCertificate;
    }
    /**
     * Gets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @return a targetedManagedAppConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppConfiguration> getTargetedManagedAppConfigurations() {
        return this.targetedManagedAppConfigurations;
    }
    /**
     * Gets the vppTokens property value. List of Vpp tokens for this organization.
     * @return a vppToken
     */
    @javax.annotation.Nullable
    public java.util.List<VppToken> getVppTokens() {
        return this.vppTokens;
    }
    /**
     * Gets the wdacSupplementalPolicies property value. The collection of Windows Defender Application Control Supplemental Policies.
     * @return a windowsDefenderApplicationControlSupplementalPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDefenderApplicationControlSupplementalPolicy> getWdacSupplementalPolicies() {
        return this.wdacSupplementalPolicies;
    }
    /**
     * Gets the windowsInformationProtectionDeviceRegistrations property value. Windows information protection device registrations that are not MDM enrolled.
     * @return a windowsInformationProtectionDeviceRegistration
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionDeviceRegistration> getWindowsInformationProtectionDeviceRegistrations() {
        return this.windowsInformationProtectionDeviceRegistrations;
    }
    /**
     * Gets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @return a windowsInformationProtectionPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionPolicy> getWindowsInformationProtectionPolicies() {
        return this.windowsInformationProtectionPolicies;
    }
    /**
     * Gets the windowsInformationProtectionWipeActions property value. Windows information protection wipe actions.
     * @return a windowsInformationProtectionWipeAction
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionWipeAction> getWindowsInformationProtectionWipeActions() {
        return this.windowsInformationProtectionWipeActions;
    }
    /**
     * Gets the windowsManagedAppProtections property value. Windows managed app policies.
     * @return a windowsManagedAppProtection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsManagedAppProtection> getWindowsManagedAppProtections() {
        return this.windowsManagedAppProtections;
    }
    /**
     * Gets the windowsManagementApp property value. Windows management app.
     * @return a windowsManagementApp
     */
    @javax.annotation.Nullable
    public WindowsManagementApp getWindowsManagementApp() {
        return this.windowsManagementApp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeEnumValue("microsoftStoreForBusinessPortalSelection", this.getMicrosoftStoreForBusinessPortalSelection());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidManagedAppProtections(@javax.annotation.Nullable final java.util.List<AndroidManagedAppProtection> value) {
        this.androidManagedAppProtections = value;
    }
    /**
     * Sets the defaultManagedAppProtections property value. Default managed app policies.
     * @param value Value to set for the defaultManagedAppProtections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultManagedAppProtections(@javax.annotation.Nullable final java.util.List<DefaultManagedAppProtection> value) {
        this.defaultManagedAppProtections = value;
    }
    /**
     * Sets the deviceAppManagementTasks property value. Device app management tasks.
     * @param value Value to set for the deviceAppManagementTasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceAppManagementTasks(@javax.annotation.Nullable final java.util.List<DeviceAppManagementTask> value) {
        this.deviceAppManagementTasks = value;
    }
    /**
     * Sets the enterpriseCodeSigningCertificates property value. The Windows Enterprise Code Signing Certificate.
     * @param value Value to set for the enterpriseCodeSigningCertificates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCodeSigningCertificates(@javax.annotation.Nullable final java.util.List<EnterpriseCodeSigningCertificate> value) {
        this.enterpriseCodeSigningCertificates = value;
    }
    /**
     * Sets the iosLobAppProvisioningConfigurations property value. The IOS Lob App Provisioning Configurations.
     * @param value Value to set for the iosLobAppProvisioningConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosLobAppProvisioningConfigurations(@javax.annotation.Nullable final java.util.List<IosLobAppProvisioningConfiguration> value) {
        this.iosLobAppProvisioningConfigurations = value;
    }
    /**
     * Sets the iosManagedAppProtections property value. iOS managed app policies.
     * @param value Value to set for the iosManagedAppProtections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosManagedAppProtections(@javax.annotation.Nullable final java.util.List<IosManagedAppProtection> value) {
        this.iosManagedAppProtections = value;
    }
    /**
     * Sets the isEnabledForMicrosoftStoreForBusiness property value. Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     * @param value Value to set for the isEnabledForMicrosoftStoreForBusiness property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabledForMicrosoftStoreForBusiness(@javax.annotation.Nullable final Boolean value) {
        this.isEnabledForMicrosoftStoreForBusiness = value;
    }
    /**
     * Sets the managedAppPolicies property value. Managed app policies.
     * @param value Value to set for the managedAppPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppPolicies(@javax.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.managedAppPolicies = value;
    }
    /**
     * Sets the managedAppRegistrations property value. The managed app registrations.
     * @param value Value to set for the managedAppRegistrations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppRegistrations(@javax.annotation.Nullable final java.util.List<ManagedAppRegistration> value) {
        this.managedAppRegistrations = value;
    }
    /**
     * Sets the managedAppStatuses property value. The managed app statuses.
     * @param value Value to set for the managedAppStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedAppStatuses(@javax.annotation.Nullable final java.util.List<ManagedAppStatus> value) {
        this.managedAppStatuses = value;
    }
    /**
     * Sets the managedEBookCategories property value. The mobile eBook categories.
     * @param value Value to set for the managedEBookCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedEBookCategories(@javax.annotation.Nullable final java.util.List<ManagedEBookCategory> value) {
        this.managedEBookCategories = value;
    }
    /**
     * Sets the managedEBooks property value. The Managed eBook.
     * @param value Value to set for the managedEBooks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedEBooks(@javax.annotation.Nullable final java.util.List<ManagedEBook> value) {
        this.managedEBooks = value;
    }
    /**
     * Sets the mdmWindowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are MDM enrolled.
     * @param value Value to set for the mdmWindowsInformationProtectionPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmWindowsInformationProtectionPolicies(@javax.annotation.Nullable final java.util.List<MdmWindowsInformationProtectionPolicy> value) {
        this.mdmWindowsInformationProtectionPolicies = value;
    }
    /**
     * Sets the microsoftStoreForBusinessLanguage property value. The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -<country/regioncode2>, where  is a lowercase two-letter code derived from ISO 639-1 and <country/regioncode2> is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     * @param value Value to set for the microsoftStoreForBusinessLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessLanguage(@javax.annotation.Nullable final String value) {
        this.microsoftStoreForBusinessLanguage = value;
    }
    /**
     * Sets the microsoftStoreForBusinessLastCompletedApplicationSyncTime property value. The last time an application sync from the Microsoft Store for Business was completed.
     * @param value Value to set for the microsoftStoreForBusinessLastCompletedApplicationSyncTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessLastCompletedApplicationSyncTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.microsoftStoreForBusinessLastCompletedApplicationSyncTime = value;
    }
    /**
     * Sets the microsoftStoreForBusinessLastSuccessfulSyncDateTime property value. The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     * @param value Value to set for the microsoftStoreForBusinessLastSuccessfulSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.microsoftStoreForBusinessLastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the microsoftStoreForBusinessPortalSelection property value. Portal to which admin syncs available Microsoft Store for Business apps. This is available in the Intune Admin Console.
     * @param value Value to set for the microsoftStoreForBusinessPortalSelection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftStoreForBusinessPortalSelection(@javax.annotation.Nullable final MicrosoftStoreForBusinessPortalSelectionOptions value) {
        this.microsoftStoreForBusinessPortalSelection = value;
    }
    /**
     * Sets the mobileAppCategories property value. The mobile app categories.
     * @param value Value to set for the mobileAppCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppCategories(@javax.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this.mobileAppCategories = value;
    }
    /**
     * Sets the mobileAppConfigurations property value. The Managed Device Mobile Application Configurations.
     * @param value Value to set for the mobileAppConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppConfigurations(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfiguration> value) {
        this.mobileAppConfigurations = value;
    }
    /**
     * Sets the mobileApps property value. The mobile apps.
     * @param value Value to set for the mobileApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileApps(@javax.annotation.Nullable final java.util.List<MobileApp> value) {
        this.mobileApps = value;
    }
    /**
     * Sets the policySets property value. The PolicySet of Policies and Applications
     * @param value Value to set for the policySets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicySets(@javax.annotation.Nullable final java.util.List<PolicySet> value) {
        this.policySets = value;
    }
    /**
     * Sets the symantecCodeSigningCertificate property value. The WinPhone Symantec Code Signing Certificate.
     * @param value Value to set for the symantecCodeSigningCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSymantecCodeSigningCertificate(@javax.annotation.Nullable final SymantecCodeSigningCertificate value) {
        this.symantecCodeSigningCertificate = value;
    }
    /**
     * Sets the targetedManagedAppConfigurations property value. Targeted managed app configurations.
     * @param value Value to set for the targetedManagedAppConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedManagedAppConfigurations(@javax.annotation.Nullable final java.util.List<TargetedManagedAppConfiguration> value) {
        this.targetedManagedAppConfigurations = value;
    }
    /**
     * Sets the vppTokens property value. List of Vpp tokens for this organization.
     * @param value Value to set for the vppTokens property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVppTokens(@javax.annotation.Nullable final java.util.List<VppToken> value) {
        this.vppTokens = value;
    }
    /**
     * Sets the wdacSupplementalPolicies property value. The collection of Windows Defender Application Control Supplemental Policies.
     * @param value Value to set for the wdacSupplementalPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWdacSupplementalPolicies(@javax.annotation.Nullable final java.util.List<WindowsDefenderApplicationControlSupplementalPolicy> value) {
        this.wdacSupplementalPolicies = value;
    }
    /**
     * Sets the windowsInformationProtectionDeviceRegistrations property value. Windows information protection device registrations that are not MDM enrolled.
     * @param value Value to set for the windowsInformationProtectionDeviceRegistrations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionDeviceRegistrations(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionDeviceRegistration> value) {
        this.windowsInformationProtectionDeviceRegistrations = value;
    }
    /**
     * Sets the windowsInformationProtectionPolicies property value. Windows information protection for apps running on devices which are not MDM enrolled.
     * @param value Value to set for the windowsInformationProtectionPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionPolicies(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionPolicy> value) {
        this.windowsInformationProtectionPolicies = value;
    }
    /**
     * Sets the windowsInformationProtectionWipeActions property value. Windows information protection wipe actions.
     * @param value Value to set for the windowsInformationProtectionWipeActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsInformationProtectionWipeActions(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionWipeAction> value) {
        this.windowsInformationProtectionWipeActions = value;
    }
    /**
     * Sets the windowsManagedAppProtections property value. Windows managed app policies.
     * @param value Value to set for the windowsManagedAppProtections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsManagedAppProtections(@javax.annotation.Nullable final java.util.List<WindowsManagedAppProtection> value) {
        this.windowsManagedAppProtections = value;
    }
    /**
     * Sets the windowsManagementApp property value. Windows management app.
     * @param value Value to set for the windowsManagementApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsManagementApp(@javax.annotation.Nullable final WindowsManagementApp value) {
        this.windowsManagementApp = value;
    }
}
