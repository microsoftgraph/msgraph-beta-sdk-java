package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntuneBrandingProfile extends Entity implements Parsable {
    /**
     * Instantiates a new IntuneBrandingProfile and sets the default values.
     */
    public IntuneBrandingProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IntuneBrandingProfile
     */
    @jakarta.annotation.Nonnull
    public static IntuneBrandingProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntuneBrandingProfile();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the branding profile
     * @return a java.util.List<IntuneBrandingProfileAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntuneBrandingProfileAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the companyPortalBlockedActions property value. Collection of blocked actions on the company portal as per platform and device ownership types.
     * @return a java.util.List<CompanyPortalBlockedAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompanyPortalBlockedAction> getCompanyPortalBlockedActions() {
        return this.backingStore.get("companyPortalBlockedActions");
    }
    /**
     * Gets the contactITEmailAddress property value. E-mail address of the person/organization responsible for IT support
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITEmailAddress() {
        return this.backingStore.get("contactITEmailAddress");
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITName() {
        return this.backingStore.get("contactITName");
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITNotes() {
        return this.backingStore.get("contactITNotes");
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this.backingStore.get("contactITPhoneNumber");
    }
    /**
     * Gets the createdDateTime property value. Time when the BrandingProfile was created
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customCanSeePrivacyMessage property value. Text comments regarding what the admin has access to on the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomCanSeePrivacyMessage() {
        return this.backingStore.get("customCanSeePrivacyMessage");
    }
    /**
     * Gets the customCantSeePrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomCantSeePrivacyMessage() {
        return this.backingStore.get("customCantSeePrivacyMessage");
    }
    /**
     * Gets the customPrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomPrivacyMessage() {
        return this.backingStore.get("customPrivacyMessage");
    }
    /**
     * Gets the disableClientTelemetry property value. Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableClientTelemetry() {
        return this.backingStore.get("disableClientTelemetry");
    }
    /**
     * Gets the disableDeviceCategorySelection property value. Boolean that indicates if Device Category Selection will be shown in Company Portal
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableDeviceCategorySelection() {
        return this.backingStore.get("disableDeviceCategorySelection");
    }
    /**
     * Gets the displayName property value. Company/organization name that is displayed to end users
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @return a EnrollmentAvailabilityOptions
     */
    @jakarta.annotation.Nullable
    public EnrollmentAvailabilityOptions getEnrollmentAvailability() {
        return this.backingStore.get("enrollmentAvailability");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("enrollmentAvailability", (n) -> { this.setEnrollmentAvailability(n.getEnumValue(EnrollmentAvailabilityOptions::forValue)); });
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultProfile() {
        return this.backingStore.get("isDefaultProfile");
    }
    /**
     * Gets the isFactoryResetDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFactoryResetDisabled() {
        return this.backingStore.get("isFactoryResetDisabled");
    }
    /**
     * Gets the isRemoveDeviceDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRemoveDeviceDisabled() {
        return this.backingStore.get("isRemoveDeviceDisabled");
    }
    /**
     * Gets the landingPageCustomizedImage property value. Customized image displayed in Company Portal apps landing page
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLandingPageCustomizedImage() {
        return this.backingStore.get("landingPageCustomizedImage");
    }
    /**
     * Gets the lastModifiedDateTime property value. Time when the BrandingProfile was last modified
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this.backingStore.get("lightBackgroundLogo");
    }
    /**
     * Gets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this.backingStore.get("onlineSupportSiteName");
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this.backingStore.get("onlineSupportSiteUrl");
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organizations privacy policy
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivacyUrl() {
        return this.backingStore.get("privacyUrl");
    }
    /**
     * Gets the profileDescription property value. Description of the profile
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProfileDescription() {
        return this.backingStore.get("profileDescription");
    }
    /**
     * Gets the profileName property value. Name of the profile
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProfileName() {
        return this.backingStore.get("profileName");
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tags assigned to the branding profile
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the sendDeviceOwnershipChangePushNotification property value. Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSendDeviceOwnershipChangePushNotification() {
        return this.backingStore.get("sendDeviceOwnershipChangePushNotification");
    }
    /**
     * Gets the showAzureADEnterpriseApps property value. Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowAzureADEnterpriseApps() {
        return this.backingStore.get("showAzureADEnterpriseApps");
    }
    /**
     * Gets the showConfigurationManagerApps property value. Boolean that indicates if Configuration Manager Apps will be shown in Company Portal
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowConfigurationManagerApps() {
        return this.backingStore.get("showConfigurationManagerApps");
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this.backingStore.get("showDisplayNameNextToLogo");
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowLogo() {
        return this.backingStore.get("showLogo");
    }
    /**
     * Gets the showOfficeWebApps property value. Boolean that indicates if Office WebApps will be shown in Company Portal
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowOfficeWebApps() {
        return this.backingStore.get("showOfficeWebApps");
    }
    /**
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal
     * @return a RgbColor
     */
    @jakarta.annotation.Nullable
    public RgbColor getThemeColor() {
        return this.backingStore.get("themeColor");
    }
    /**
     * Gets the themeColorLogo property value. Logo image displayed in Company Portal apps which have a theme color background behind the logo
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getThemeColorLogo() {
        return this.backingStore.get("themeColorLogo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<IntuneBrandingProfileAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the companyPortalBlockedActions property value. Collection of blocked actions on the company portal as per platform and device ownership types.
     * @param value Value to set for the companyPortalBlockedActions property.
     */
    public void setCompanyPortalBlockedActions(@jakarta.annotation.Nullable final java.util.List<CompanyPortalBlockedAction> value) {
        this.backingStore.set("companyPortalBlockedActions", value);
    }
    /**
     * Sets the contactITEmailAddress property value. E-mail address of the person/organization responsible for IT support
     * @param value Value to set for the contactITEmailAddress property.
     */
    public void setContactITEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contactITEmailAddress", value);
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support
     * @param value Value to set for the contactITName property.
     */
    public void setContactITName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contactITName", value);
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support
     * @param value Value to set for the contactITNotes property.
     */
    public void setContactITNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contactITNotes", value);
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support
     * @param value Value to set for the contactITPhoneNumber property.
     */
    public void setContactITPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contactITPhoneNumber", value);
    }
    /**
     * Sets the createdDateTime property value. Time when the BrandingProfile was created
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customCanSeePrivacyMessage property value. Text comments regarding what the admin has access to on the device
     * @param value Value to set for the customCanSeePrivacyMessage property.
     */
    public void setCustomCanSeePrivacyMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customCanSeePrivacyMessage", value);
    }
    /**
     * Sets the customCantSeePrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @param value Value to set for the customCantSeePrivacyMessage property.
     */
    public void setCustomCantSeePrivacyMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customCantSeePrivacyMessage", value);
    }
    /**
     * Sets the customPrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @param value Value to set for the customPrivacyMessage property.
     */
    public void setCustomPrivacyMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customPrivacyMessage", value);
    }
    /**
     * Sets the disableClientTelemetry property value. Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     * @param value Value to set for the disableClientTelemetry property.
     */
    public void setDisableClientTelemetry(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableClientTelemetry", value);
    }
    /**
     * Sets the disableDeviceCategorySelection property value. Boolean that indicates if Device Category Selection will be shown in Company Portal
     * @param value Value to set for the disableDeviceCategorySelection property.
     */
    public void setDisableDeviceCategorySelection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableDeviceCategorySelection", value);
    }
    /**
     * Sets the displayName property value. Company/organization name that is displayed to end users
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @param value Value to set for the enrollmentAvailability property.
     */
    public void setEnrollmentAvailability(@jakarta.annotation.Nullable final EnrollmentAvailabilityOptions value) {
        this.backingStore.set("enrollmentAvailability", value);
    }
    /**
     * Sets the isDefaultProfile property value. Boolean that represents whether the profile is used as default or not
     * @param value Value to set for the isDefaultProfile property.
     */
    public void setIsDefaultProfile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultProfile", value);
    }
    /**
     * Sets the isFactoryResetDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     * @param value Value to set for the isFactoryResetDisabled property.
     */
    public void setIsFactoryResetDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFactoryResetDisabled", value);
    }
    /**
     * Sets the isRemoveDeviceDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     * @param value Value to set for the isRemoveDeviceDisabled property.
     */
    public void setIsRemoveDeviceDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRemoveDeviceDisabled", value);
    }
    /**
     * Sets the landingPageCustomizedImage property value. Customized image displayed in Company Portal apps landing page
     * @param value Value to set for the landingPageCustomizedImage property.
     */
    public void setLandingPageCustomizedImage(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("landingPageCustomizedImage", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Time when the BrandingProfile was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo
     * @param value Value to set for the lightBackgroundLogo property.
     */
    public void setLightBackgroundLogo(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("lightBackgroundLogo", value);
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site
     * @param value Value to set for the onlineSupportSiteName property.
     */
    public void setOnlineSupportSiteName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onlineSupportSiteName", value);
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site
     * @param value Value to set for the onlineSupportSiteUrl property.
     */
    public void setOnlineSupportSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onlineSupportSiteUrl", value);
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organizations privacy policy
     * @param value Value to set for the privacyUrl property.
     */
    public void setPrivacyUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privacyUrl", value);
    }
    /**
     * Sets the profileDescription property value. Description of the profile
     * @param value Value to set for the profileDescription property.
     */
    public void setProfileDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileDescription", value);
    }
    /**
     * Sets the profileName property value. Name of the profile
     * @param value Value to set for the profileName property.
     */
    public void setProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileName", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tags assigned to the branding profile
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the sendDeviceOwnershipChangePushNotification property value. Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     * @param value Value to set for the sendDeviceOwnershipChangePushNotification property.
     */
    public void setSendDeviceOwnershipChangePushNotification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sendDeviceOwnershipChangePushNotification", value);
    }
    /**
     * Sets the showAzureADEnterpriseApps property value. Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     * @param value Value to set for the showAzureADEnterpriseApps property.
     */
    public void setShowAzureADEnterpriseApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showAzureADEnterpriseApps", value);
    }
    /**
     * Sets the showConfigurationManagerApps property value. Boolean that indicates if Configuration Manager Apps will be shown in Company Portal
     * @param value Value to set for the showConfigurationManagerApps property.
     */
    public void setShowConfigurationManagerApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showConfigurationManagerApps", value);
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     * @param value Value to set for the showDisplayNameNextToLogo property.
     */
    public void setShowDisplayNameNextToLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showDisplayNameNextToLogo", value);
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not
     * @param value Value to set for the showLogo property.
     */
    public void setShowLogo(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showLogo", value);
    }
    /**
     * Sets the showOfficeWebApps property value. Boolean that indicates if Office WebApps will be shown in Company Portal
     * @param value Value to set for the showOfficeWebApps property.
     */
    public void setShowOfficeWebApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showOfficeWebApps", value);
    }
    /**
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal
     * @param value Value to set for the themeColor property.
     */
    public void setThemeColor(@jakarta.annotation.Nullable final RgbColor value) {
        this.backingStore.set("themeColor", value);
    }
    /**
     * Sets the themeColorLogo property value. Logo image displayed in Company Portal apps which have a theme color background behind the logo
     * @param value Value to set for the themeColorLogo property.
     */
    public void setThemeColorLogo(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("themeColorLogo", value);
    }
}
