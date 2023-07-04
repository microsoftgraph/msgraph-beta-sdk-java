package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity contains data which is used in customizing the tenant level appearance of the Company Portal applications as well as the end user web portal.
 */
public class IntuneBrandingProfile extends Entity implements Parsable {
    /**
     * The list of group assignments for the branding profile
     */
    private java.util.List<IntuneBrandingProfileAssignment> assignments;
    /**
     * Collection of blocked actions on the company portal as per platform and device ownership types.
     */
    private java.util.List<CompanyPortalBlockedAction> companyPortalBlockedActions;
    /**
     * E-mail address of the person/organization responsible for IT support
     */
    private String contactITEmailAddress;
    /**
     * Name of the person/organization responsible for IT support
     */
    private String contactITName;
    /**
     * Text comments regarding the person/organization responsible for IT support
     */
    private String contactITNotes;
    /**
     * Phone number of the person/organization responsible for IT support
     */
    private String contactITPhoneNumber;
    /**
     * Time when the BrandingProfile was created
     */
    private OffsetDateTime createdDateTime;
    /**
     * Text comments regarding what the admin has access to on the device
     */
    private String customCanSeePrivacyMessage;
    /**
     * Text comments regarding what the admin doesn't have access to on the device
     */
    private String customCantSeePrivacyMessage;
    /**
     * Text comments regarding what the admin doesn't have access to on the device
     */
    private String customPrivacyMessage;
    /**
     * Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     */
    private Boolean disableClientTelemetry;
    /**
     * Boolean that indicates if Device Category Selection will be shown in Company Portal
     */
    private Boolean disableDeviceCategorySelection;
    /**
     * Company/organization name that is displayed to end users
     */
    private String displayName;
    /**
     * Options available for enrollment flow customization
     */
    private EnrollmentAvailabilityOptions enrollmentAvailability;
    /**
     * Boolean that represents whether the profile is used as default or not
     */
    private Boolean isDefaultProfile;
    /**
     * Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     */
    private Boolean isFactoryResetDisabled;
    /**
     * Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     */
    private Boolean isRemoveDeviceDisabled;
    /**
     * Customized image displayed in Company Portal apps landing page
     */
    private MimeContent landingPageCustomizedImage;
    /**
     * Time when the BrandingProfile was last modified
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Logo image displayed in Company Portal apps which have a light background behind the logo
     */
    private MimeContent lightBackgroundLogo;
    /**
     * Display name of the company/organizations IT helpdesk site
     */
    private String onlineSupportSiteName;
    /**
     * URL to the company/organizations IT helpdesk site
     */
    private String onlineSupportSiteUrl;
    /**
     * URL to the company/organizations privacy policy
     */
    private String privacyUrl;
    /**
     * Description of the profile
     */
    private String profileDescription;
    /**
     * Name of the profile
     */
    private String profileName;
    /**
     * List of scope tags assigned to the branding profile
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     */
    private Boolean sendDeviceOwnershipChangePushNotification;
    /**
     * Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     */
    private Boolean showAzureADEnterpriseApps;
    /**
     * Boolean that indicates if Configuration Manager Apps will be shown in Company Portal
     */
    private Boolean showConfigurationManagerApps;
    /**
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     */
    private Boolean showDisplayNameNextToLogo;
    /**
     * Boolean that represents whether the administrator-supplied logo images are shown or not
     */
    private Boolean showLogo;
    /**
     * Boolean that indicates if Office WebApps will be shown in Company Portal
     */
    private Boolean showOfficeWebApps;
    /**
     * Primary theme color used in the Company Portal applications and web portal
     */
    private RgbColor themeColor;
    /**
     * Logo image displayed in Company Portal apps which have a theme color background behind the logo
     */
    private MimeContent themeColorLogo;
    /**
     * Instantiates a new intuneBrandingProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IntuneBrandingProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a intuneBrandingProfile
     */
    @javax.annotation.Nonnull
    public static IntuneBrandingProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntuneBrandingProfile();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the branding profile
     * @return a intuneBrandingProfileAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<IntuneBrandingProfileAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the companyPortalBlockedActions property value. Collection of blocked actions on the company portal as per platform and device ownership types.
     * @return a companyPortalBlockedAction
     */
    @javax.annotation.Nullable
    public java.util.List<CompanyPortalBlockedAction> getCompanyPortalBlockedActions() {
        return this.companyPortalBlockedActions;
    }
    /**
     * Gets the contactITEmailAddress property value. E-mail address of the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITEmailAddress() {
        return this.contactITEmailAddress;
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITName() {
        return this.contactITName;
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITNotes() {
        return this.contactITNotes;
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this.contactITPhoneNumber;
    }
    /**
     * Gets the createdDateTime property value. Time when the BrandingProfile was created
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customCanSeePrivacyMessage property value. Text comments regarding what the admin has access to on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCanSeePrivacyMessage() {
        return this.customCanSeePrivacyMessage;
    }
    /**
     * Gets the customCantSeePrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCantSeePrivacyMessage() {
        return this.customCantSeePrivacyMessage;
    }
    /**
     * Gets the customPrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyMessage() {
        return this.customPrivacyMessage;
    }
    /**
     * Gets the disableClientTelemetry property value. Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableClientTelemetry() {
        return this.disableClientTelemetry;
    }
    /**
     * Gets the disableDeviceCategorySelection property value. Boolean that indicates if Device Category Selection will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableDeviceCategorySelection() {
        return this.disableDeviceCategorySelection;
    }
    /**
     * Gets the displayName property value. Company/organization name that is displayed to end users
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @return a EnrollmentAvailabilityOptions
     */
    @javax.annotation.Nullable
    public EnrollmentAvailabilityOptions getEnrollmentAvailability() {
        return this.enrollmentAvailability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(IntuneBrandingProfileAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("companyPortalBlockedActions", (n) -> { this.setCompanyPortalBlockedActions(n.getCollectionOfObjectValues(CompanyPortalBlockedAction::createFromDiscriminatorValue)); });
        deserializerMap.put("contactITEmailAddress", (n) -> { this.setContactITEmailAddress(n.getStringValue()); });
        deserializerMap.put("contactITName", (n) -> { this.setContactITName(n.getStringValue()); });
        deserializerMap.put("contactITNotes", (n) -> { this.setContactITNotes(n.getStringValue()); });
        deserializerMap.put("contactITPhoneNumber", (n) -> { this.setContactITPhoneNumber(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customCanSeePrivacyMessage", (n) -> { this.setCustomCanSeePrivacyMessage(n.getStringValue()); });
        deserializerMap.put("customCantSeePrivacyMessage", (n) -> { this.setCustomCantSeePrivacyMessage(n.getStringValue()); });
        deserializerMap.put("customPrivacyMessage", (n) -> { this.setCustomPrivacyMessage(n.getStringValue()); });
        deserializerMap.put("disableClientTelemetry", (n) -> { this.setDisableClientTelemetry(n.getBooleanValue()); });
        deserializerMap.put("disableDeviceCategorySelection", (n) -> { this.setDisableDeviceCategorySelection(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrollmentAvailability", (n) -> { this.setEnrollmentAvailability(n.getEnumValue(EnrollmentAvailabilityOptions.class)); });
        deserializerMap.put("isDefaultProfile", (n) -> { this.setIsDefaultProfile(n.getBooleanValue()); });
        deserializerMap.put("isFactoryResetDisabled", (n) -> { this.setIsFactoryResetDisabled(n.getBooleanValue()); });
        deserializerMap.put("isRemoveDeviceDisabled", (n) -> { this.setIsRemoveDeviceDisabled(n.getBooleanValue()); });
        deserializerMap.put("landingPageCustomizedImage", (n) -> { this.setLandingPageCustomizedImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lightBackgroundLogo", (n) -> { this.setLightBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineSupportSiteName", (n) -> { this.setOnlineSupportSiteName(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteUrl", (n) -> { this.setOnlineSupportSiteUrl(n.getStringValue()); });
        deserializerMap.put("privacyUrl", (n) -> { this.setPrivacyUrl(n.getStringValue()); });
        deserializerMap.put("profileDescription", (n) -> { this.setProfileDescription(n.getStringValue()); });
        deserializerMap.put("profileName", (n) -> { this.setProfileName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sendDeviceOwnershipChangePushNotification", (n) -> { this.setSendDeviceOwnershipChangePushNotification(n.getBooleanValue()); });
        deserializerMap.put("showAzureADEnterpriseApps", (n) -> { this.setShowAzureADEnterpriseApps(n.getBooleanValue()); });
        deserializerMap.put("showConfigurationManagerApps", (n) -> { this.setShowConfigurationManagerApps(n.getBooleanValue()); });
        deserializerMap.put("showDisplayNameNextToLogo", (n) -> { this.setShowDisplayNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("showLogo", (n) -> { this.setShowLogo(n.getBooleanValue()); });
        deserializerMap.put("showOfficeWebApps", (n) -> { this.setShowOfficeWebApps(n.getBooleanValue()); });
        deserializerMap.put("themeColor", (n) -> { this.setThemeColor(n.getObjectValue(RgbColor::createFromDiscriminatorValue)); });
        deserializerMap.put("themeColorLogo", (n) -> { this.setThemeColorLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultProfile property value. Boolean that represents whether the profile is used as default or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultProfile() {
        return this.isDefaultProfile;
    }
    /**
     * Gets the isFactoryResetDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFactoryResetDisabled() {
        return this.isFactoryResetDisabled;
    }
    /**
     * Gets the isRemoveDeviceDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRemoveDeviceDisabled() {
        return this.isRemoveDeviceDisabled;
    }
    /**
     * Gets the landingPageCustomizedImage property value. Customized image displayed in Company Portal apps landing page
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLandingPageCustomizedImage() {
        return this.landingPageCustomizedImage;
    }
    /**
     * Gets the lastModifiedDateTime property value. Time when the BrandingProfile was last modified
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this.lightBackgroundLogo;
    }
    /**
     * Gets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this.onlineSupportSiteName;
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organizations privacy policy
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyUrl() {
        return this.privacyUrl;
    }
    /**
     * Gets the profileDescription property value. Description of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileDescription() {
        return this.profileDescription;
    }
    /**
     * Gets the profileName property value. Name of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileName() {
        return this.profileName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tags assigned to the branding profile
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the sendDeviceOwnershipChangePushNotification property value. Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendDeviceOwnershipChangePushNotification() {
        return this.sendDeviceOwnershipChangePushNotification;
    }
    /**
     * Gets the showAzureADEnterpriseApps property value. Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowAzureADEnterpriseApps() {
        return this.showAzureADEnterpriseApps;
    }
    /**
     * Gets the showConfigurationManagerApps property value. Boolean that indicates if Configuration Manager Apps will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowConfigurationManagerApps() {
        return this.showConfigurationManagerApps;
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this.showDisplayNameNextToLogo;
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLogo() {
        return this.showLogo;
    }
    /**
     * Gets the showOfficeWebApps property value. Boolean that indicates if Office WebApps will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowOfficeWebApps() {
        return this.showOfficeWebApps;
    }
    /**
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal
     * @return a rgbColor
     */
    @javax.annotation.Nullable
    public RgbColor getThemeColor() {
        return this.themeColor;
    }
    /**
     * Gets the themeColorLogo property value. Logo image displayed in Company Portal apps which have a theme color background behind the logo
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getThemeColorLogo() {
        return this.themeColorLogo;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("companyPortalBlockedActions", this.getCompanyPortalBlockedActions());
        writer.writeStringValue("contactITEmailAddress", this.getContactITEmailAddress());
        writer.writeStringValue("contactITName", this.getContactITName());
        writer.writeStringValue("contactITNotes", this.getContactITNotes());
        writer.writeStringValue("contactITPhoneNumber", this.getContactITPhoneNumber());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("customCanSeePrivacyMessage", this.getCustomCanSeePrivacyMessage());
        writer.writeStringValue("customCantSeePrivacyMessage", this.getCustomCantSeePrivacyMessage());
        writer.writeStringValue("customPrivacyMessage", this.getCustomPrivacyMessage());
        writer.writeBooleanValue("disableClientTelemetry", this.getDisableClientTelemetry());
        writer.writeBooleanValue("disableDeviceCategorySelection", this.getDisableDeviceCategorySelection());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("enrollmentAvailability", this.getEnrollmentAvailability());
        writer.writeBooleanValue("isDefaultProfile", this.getIsDefaultProfile());
        writer.writeBooleanValue("isFactoryResetDisabled", this.getIsFactoryResetDisabled());
        writer.writeBooleanValue("isRemoveDeviceDisabled", this.getIsRemoveDeviceDisabled());
        writer.writeObjectValue("landingPageCustomizedImage", this.getLandingPageCustomizedImage());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("lightBackgroundLogo", this.getLightBackgroundLogo());
        writer.writeStringValue("onlineSupportSiteName", this.getOnlineSupportSiteName());
        writer.writeStringValue("onlineSupportSiteUrl", this.getOnlineSupportSiteUrl());
        writer.writeStringValue("privacyUrl", this.getPrivacyUrl());
        writer.writeStringValue("profileDescription", this.getProfileDescription());
        writer.writeStringValue("profileName", this.getProfileName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("sendDeviceOwnershipChangePushNotification", this.getSendDeviceOwnershipChangePushNotification());
        writer.writeBooleanValue("showAzureADEnterpriseApps", this.getShowAzureADEnterpriseApps());
        writer.writeBooleanValue("showConfigurationManagerApps", this.getShowConfigurationManagerApps());
        writer.writeBooleanValue("showDisplayNameNextToLogo", this.getShowDisplayNameNextToLogo());
        writer.writeBooleanValue("showLogo", this.getShowLogo());
        writer.writeBooleanValue("showOfficeWebApps", this.getShowOfficeWebApps());
        writer.writeObjectValue("themeColor", this.getThemeColor());
        writer.writeObjectValue("themeColorLogo", this.getThemeColorLogo());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the branding profile
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<IntuneBrandingProfileAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the companyPortalBlockedActions property value. Collection of blocked actions on the company portal as per platform and device ownership types.
     * @param value Value to set for the companyPortalBlockedActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyPortalBlockedActions(@javax.annotation.Nullable final java.util.List<CompanyPortalBlockedAction> value) {
        this.companyPortalBlockedActions = value;
    }
    /**
     * Sets the contactITEmailAddress property value. E-mail address of the person/organization responsible for IT support
     * @param value Value to set for the contactITEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITEmailAddress(@javax.annotation.Nullable final String value) {
        this.contactITEmailAddress = value;
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support
     * @param value Value to set for the contactITName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITName(@javax.annotation.Nullable final String value) {
        this.contactITName = value;
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support
     * @param value Value to set for the contactITNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITNotes(@javax.annotation.Nullable final String value) {
        this.contactITNotes = value;
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support
     * @param value Value to set for the contactITPhoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITPhoneNumber(@javax.annotation.Nullable final String value) {
        this.contactITPhoneNumber = value;
    }
    /**
     * Sets the createdDateTime property value. Time when the BrandingProfile was created
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customCanSeePrivacyMessage property value. Text comments regarding what the admin has access to on the device
     * @param value Value to set for the customCanSeePrivacyMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCanSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this.customCanSeePrivacyMessage = value;
    }
    /**
     * Sets the customCantSeePrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @param value Value to set for the customCantSeePrivacyMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCantSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this.customCantSeePrivacyMessage = value;
    }
    /**
     * Sets the customPrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @param value Value to set for the customPrivacyMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomPrivacyMessage(@javax.annotation.Nullable final String value) {
        this.customPrivacyMessage = value;
    }
    /**
     * Sets the disableClientTelemetry property value. Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     * @param value Value to set for the disableClientTelemetry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableClientTelemetry(@javax.annotation.Nullable final Boolean value) {
        this.disableClientTelemetry = value;
    }
    /**
     * Sets the disableDeviceCategorySelection property value. Boolean that indicates if Device Category Selection will be shown in Company Portal
     * @param value Value to set for the disableDeviceCategorySelection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableDeviceCategorySelection(@javax.annotation.Nullable final Boolean value) {
        this.disableDeviceCategorySelection = value;
    }
    /**
     * Sets the displayName property value. Company/organization name that is displayed to end users
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @param value Value to set for the enrollmentAvailability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentAvailability(@javax.annotation.Nullable final EnrollmentAvailabilityOptions value) {
        this.enrollmentAvailability = value;
    }
    /**
     * Sets the isDefaultProfile property value. Boolean that represents whether the profile is used as default or not
     * @param value Value to set for the isDefaultProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultProfile(@javax.annotation.Nullable final Boolean value) {
        this.isDefaultProfile = value;
    }
    /**
     * Sets the isFactoryResetDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     * @param value Value to set for the isFactoryResetDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFactoryResetDisabled(@javax.annotation.Nullable final Boolean value) {
        this.isFactoryResetDisabled = value;
    }
    /**
     * Sets the isRemoveDeviceDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     * @param value Value to set for the isRemoveDeviceDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRemoveDeviceDisabled(@javax.annotation.Nullable final Boolean value) {
        this.isRemoveDeviceDisabled = value;
    }
    /**
     * Sets the landingPageCustomizedImage property value. Customized image displayed in Company Portal apps landing page
     * @param value Value to set for the landingPageCustomizedImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLandingPageCustomizedImage(@javax.annotation.Nullable final MimeContent value) {
        this.landingPageCustomizedImage = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Time when the BrandingProfile was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo
     * @param value Value to set for the lightBackgroundLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLightBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this.lightBackgroundLogo = value;
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site
     * @param value Value to set for the onlineSupportSiteName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineSupportSiteName(@javax.annotation.Nullable final String value) {
        this.onlineSupportSiteName = value;
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site
     * @param value Value to set for the onlineSupportSiteUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineSupportSiteUrl(@javax.annotation.Nullable final String value) {
        this.onlineSupportSiteUrl = value;
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organizations privacy policy
     * @param value Value to set for the privacyUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyUrl(@javax.annotation.Nullable final String value) {
        this.privacyUrl = value;
    }
    /**
     * Sets the profileDescription property value. Description of the profile
     * @param value Value to set for the profileDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileDescription(@javax.annotation.Nullable final String value) {
        this.profileDescription = value;
    }
    /**
     * Sets the profileName property value. Name of the profile
     * @param value Value to set for the profileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileName(@javax.annotation.Nullable final String value) {
        this.profileName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tags assigned to the branding profile
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the sendDeviceOwnershipChangePushNotification property value. Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     * @param value Value to set for the sendDeviceOwnershipChangePushNotification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSendDeviceOwnershipChangePushNotification(@javax.annotation.Nullable final Boolean value) {
        this.sendDeviceOwnershipChangePushNotification = value;
    }
    /**
     * Sets the showAzureADEnterpriseApps property value. Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     * @param value Value to set for the showAzureADEnterpriseApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowAzureADEnterpriseApps(@javax.annotation.Nullable final Boolean value) {
        this.showAzureADEnterpriseApps = value;
    }
    /**
     * Sets the showConfigurationManagerApps property value. Boolean that indicates if Configuration Manager Apps will be shown in Company Portal
     * @param value Value to set for the showConfigurationManagerApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowConfigurationManagerApps(@javax.annotation.Nullable final Boolean value) {
        this.showConfigurationManagerApps = value;
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     * @param value Value to set for the showDisplayNameNextToLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowDisplayNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this.showDisplayNameNextToLogo = value;
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not
     * @param value Value to set for the showLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowLogo(@javax.annotation.Nullable final Boolean value) {
        this.showLogo = value;
    }
    /**
     * Sets the showOfficeWebApps property value. Boolean that indicates if Office WebApps will be shown in Company Portal
     * @param value Value to set for the showOfficeWebApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowOfficeWebApps(@javax.annotation.Nullable final Boolean value) {
        this.showOfficeWebApps = value;
    }
    /**
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal
     * @param value Value to set for the themeColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThemeColor(@javax.annotation.Nullable final RgbColor value) {
        this.themeColor = value;
    }
    /**
     * Sets the themeColorLogo property value. Logo image displayed in Company Portal apps which have a theme color background behind the logo
     * @param value Value to set for the themeColorLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThemeColorLogo(@javax.annotation.Nullable final MimeContent value) {
        this.themeColorLogo = value;
    }
}
