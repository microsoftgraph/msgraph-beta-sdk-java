package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IntuneBrandingProfile extends Entity implements Parsable {
    /** The list of group assignments for the branding profile */
    private java.util.List<IntuneBrandingProfileAssignment> _assignments;
    /** Collection of blocked actions on the company portal as per platform and device ownership types. */
    private java.util.List<CompanyPortalBlockedAction> _companyPortalBlockedActions;
    /** E-mail address of the person/organization responsible for IT support */
    private String _contactITEmailAddress;
    /** Name of the person/organization responsible for IT support */
    private String _contactITName;
    /** Text comments regarding the person/organization responsible for IT support */
    private String _contactITNotes;
    /** Phone number of the person/organization responsible for IT support */
    private String _contactITPhoneNumber;
    /** Time when the BrandingProfile was created */
    private OffsetDateTime _createdDateTime;
    /** Text comments regarding what the admin has access to on the device */
    private String _customCanSeePrivacyMessage;
    /** Text comments regarding what the admin doesn't have access to on the device */
    private String _customCantSeePrivacyMessage;
    /** Text comments regarding what the admin doesn't have access to on the device */
    private String _customPrivacyMessage;
    /** Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user. */
    private Boolean _disableClientTelemetry;
    /** Company/organization name that is displayed to end users */
    private String _displayName;
    /** Options available for enrollment flow customization */
    private EnrollmentAvailabilityOptions _enrollmentAvailability;
    /** Boolean that represents whether the profile is used as default or not */
    private Boolean _isDefaultProfile;
    /** Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices. */
    private Boolean _isFactoryResetDisabled;
    /** Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices. */
    private Boolean _isRemoveDeviceDisabled;
    /** Customized image displayed in Company Portal apps landing page */
    private MimeContent _landingPageCustomizedImage;
    /** Time when the BrandingProfile was last modified */
    private OffsetDateTime _lastModifiedDateTime;
    /** Logo image displayed in Company Portal apps which have a light background behind the logo */
    private MimeContent _lightBackgroundLogo;
    /** Display name of the company/organization’s IT helpdesk site */
    private String _onlineSupportSiteName;
    /** URL to the company/organization’s IT helpdesk site */
    private String _onlineSupportSiteUrl;
    /** URL to the company/organization’s privacy policy */
    private String _privacyUrl;
    /** Description of the profile */
    private String _profileDescription;
    /** Name of the profile */
    private String _profileName;
    /** List of scope tags assigned to the branding profile */
    private java.util.List<String> _roleScopeTagIds;
    /** Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate */
    private Boolean _sendDeviceOwnershipChangePushNotification;
    /** Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal */
    private Boolean _showAzureADEnterpriseApps;
    /** Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not */
    private Boolean _showDisplayNameNextToLogo;
    /** Boolean that represents whether the administrator-supplied logo images are shown or not */
    private Boolean _showLogo;
    /** Boolean that indicates if Office WebApps will be shown in Company Portal */
    private Boolean _showOfficeWebApps;
    /** Primary theme color used in the Company Portal applications and web portal */
    private RgbColor _themeColor;
    /** Logo image displayed in Company Portal apps which have a theme color background behind the logo */
    private MimeContent _themeColorLogo;
    /**
     * Instantiates a new IntuneBrandingProfile and sets the default values.
     * @return a void
     */
    public IntuneBrandingProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IntuneBrandingProfile
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
        return this._assignments;
    }
    /**
     * Gets the companyPortalBlockedActions property value. Collection of blocked actions on the company portal as per platform and device ownership types.
     * @return a companyPortalBlockedAction
     */
    @javax.annotation.Nullable
    public java.util.List<CompanyPortalBlockedAction> getCompanyPortalBlockedActions() {
        return this._companyPortalBlockedActions;
    }
    /**
     * Gets the contactITEmailAddress property value. E-mail address of the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITEmailAddress() {
        return this._contactITEmailAddress;
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITName() {
        return this._contactITName;
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITNotes() {
        return this._contactITNotes;
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this._contactITPhoneNumber;
    }
    /**
     * Gets the createdDateTime property value. Time when the BrandingProfile was created
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the customCanSeePrivacyMessage property value. Text comments regarding what the admin has access to on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCanSeePrivacyMessage() {
        return this._customCanSeePrivacyMessage;
    }
    /**
     * Gets the customCantSeePrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCantSeePrivacyMessage() {
        return this._customCantSeePrivacyMessage;
    }
    /**
     * Gets the customPrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyMessage() {
        return this._customPrivacyMessage;
    }
    /**
     * Gets the disableClientTelemetry property value. Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableClientTelemetry() {
        return this._disableClientTelemetry;
    }
    /**
     * Gets the displayName property value. Company/organization name that is displayed to end users
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @return a enrollmentAvailabilityOptions
     */
    @javax.annotation.Nullable
    public EnrollmentAvailabilityOptions getEnrollmentAvailability() {
        return this._enrollmentAvailability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IntuneBrandingProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(IntuneBrandingProfileAssignment::createFromDiscriminatorValue)); });
            this.put("companyPortalBlockedActions", (n) -> { currentObject.setCompanyPortalBlockedActions(n.getCollectionOfObjectValues(CompanyPortalBlockedAction::createFromDiscriminatorValue)); });
            this.put("contactITEmailAddress", (n) -> { currentObject.setContactITEmailAddress(n.getStringValue()); });
            this.put("contactITName", (n) -> { currentObject.setContactITName(n.getStringValue()); });
            this.put("contactITNotes", (n) -> { currentObject.setContactITNotes(n.getStringValue()); });
            this.put("contactITPhoneNumber", (n) -> { currentObject.setContactITPhoneNumber(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("customCanSeePrivacyMessage", (n) -> { currentObject.setCustomCanSeePrivacyMessage(n.getStringValue()); });
            this.put("customCantSeePrivacyMessage", (n) -> { currentObject.setCustomCantSeePrivacyMessage(n.getStringValue()); });
            this.put("customPrivacyMessage", (n) -> { currentObject.setCustomPrivacyMessage(n.getStringValue()); });
            this.put("disableClientTelemetry", (n) -> { currentObject.setDisableClientTelemetry(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enrollmentAvailability", (n) -> { currentObject.setEnrollmentAvailability(n.getEnumValue(EnrollmentAvailabilityOptions.class)); });
            this.put("isDefaultProfile", (n) -> { currentObject.setIsDefaultProfile(n.getBooleanValue()); });
            this.put("isFactoryResetDisabled", (n) -> { currentObject.setIsFactoryResetDisabled(n.getBooleanValue()); });
            this.put("isRemoveDeviceDisabled", (n) -> { currentObject.setIsRemoveDeviceDisabled(n.getBooleanValue()); });
            this.put("landingPageCustomizedImage", (n) -> { currentObject.setLandingPageCustomizedImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lightBackgroundLogo", (n) -> { currentObject.setLightBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("onlineSupportSiteName", (n) -> { currentObject.setOnlineSupportSiteName(n.getStringValue()); });
            this.put("onlineSupportSiteUrl", (n) -> { currentObject.setOnlineSupportSiteUrl(n.getStringValue()); });
            this.put("privacyUrl", (n) -> { currentObject.setPrivacyUrl(n.getStringValue()); });
            this.put("profileDescription", (n) -> { currentObject.setProfileDescription(n.getStringValue()); });
            this.put("profileName", (n) -> { currentObject.setProfileName(n.getStringValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sendDeviceOwnershipChangePushNotification", (n) -> { currentObject.setSendDeviceOwnershipChangePushNotification(n.getBooleanValue()); });
            this.put("showAzureADEnterpriseApps", (n) -> { currentObject.setShowAzureADEnterpriseApps(n.getBooleanValue()); });
            this.put("showDisplayNameNextToLogo", (n) -> { currentObject.setShowDisplayNameNextToLogo(n.getBooleanValue()); });
            this.put("showLogo", (n) -> { currentObject.setShowLogo(n.getBooleanValue()); });
            this.put("showOfficeWebApps", (n) -> { currentObject.setShowOfficeWebApps(n.getBooleanValue()); });
            this.put("themeColor", (n) -> { currentObject.setThemeColor(n.getObjectValue(RgbColor::createFromDiscriminatorValue)); });
            this.put("themeColorLogo", (n) -> { currentObject.setThemeColorLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isDefaultProfile property value. Boolean that represents whether the profile is used as default or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultProfile() {
        return this._isDefaultProfile;
    }
    /**
     * Gets the isFactoryResetDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFactoryResetDisabled() {
        return this._isFactoryResetDisabled;
    }
    /**
     * Gets the isRemoveDeviceDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRemoveDeviceDisabled() {
        return this._isRemoveDeviceDisabled;
    }
    /**
     * Gets the landingPageCustomizedImage property value. Customized image displayed in Company Portal apps landing page
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLandingPageCustomizedImage() {
        return this._landingPageCustomizedImage;
    }
    /**
     * Gets the lastModifiedDateTime property value. Time when the BrandingProfile was last modified
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this._lightBackgroundLogo;
    }
    /**
     * Gets the onlineSupportSiteName property value. Display name of the company/organization’s IT helpdesk site
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this._onlineSupportSiteName;
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organization’s IT helpdesk site
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this._onlineSupportSiteUrl;
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organization’s privacy policy
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyUrl() {
        return this._privacyUrl;
    }
    /**
     * Gets the profileDescription property value. Description of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileDescription() {
        return this._profileDescription;
    }
    /**
     * Gets the profileName property value. Name of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileName() {
        return this._profileName;
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tags assigned to the branding profile
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the sendDeviceOwnershipChangePushNotification property value. Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendDeviceOwnershipChangePushNotification() {
        return this._sendDeviceOwnershipChangePushNotification;
    }
    /**
     * Gets the showAzureADEnterpriseApps property value. Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowAzureADEnterpriseApps() {
        return this._showAzureADEnterpriseApps;
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this._showDisplayNameNextToLogo;
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLogo() {
        return this._showLogo;
    }
    /**
     * Gets the showOfficeWebApps property value. Boolean that indicates if Office WebApps will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowOfficeWebApps() {
        return this._showOfficeWebApps;
    }
    /**
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal
     * @return a rgbColor
     */
    @javax.annotation.Nullable
    public RgbColor getThemeColor() {
        return this._themeColor;
    }
    /**
     * Gets the themeColorLogo property value. Logo image displayed in Company Portal apps which have a theme color background behind the logo
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getThemeColorLogo() {
        return this._themeColorLogo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAssignments(@javax.annotation.Nullable final java.util.List<IntuneBrandingProfileAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the companyPortalBlockedActions property value. Collection of blocked actions on the company portal as per platform and device ownership types.
     * @param value Value to set for the companyPortalBlockedActions property.
     * @return a void
     */
    public void setCompanyPortalBlockedActions(@javax.annotation.Nullable final java.util.List<CompanyPortalBlockedAction> value) {
        this._companyPortalBlockedActions = value;
    }
    /**
     * Sets the contactITEmailAddress property value. E-mail address of the person/organization responsible for IT support
     * @param value Value to set for the contactITEmailAddress property.
     * @return a void
     */
    public void setContactITEmailAddress(@javax.annotation.Nullable final String value) {
        this._contactITEmailAddress = value;
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support
     * @param value Value to set for the contactITName property.
     * @return a void
     */
    public void setContactITName(@javax.annotation.Nullable final String value) {
        this._contactITName = value;
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support
     * @param value Value to set for the contactITNotes property.
     * @return a void
     */
    public void setContactITNotes(@javax.annotation.Nullable final String value) {
        this._contactITNotes = value;
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support
     * @param value Value to set for the contactITPhoneNumber property.
     * @return a void
     */
    public void setContactITPhoneNumber(@javax.annotation.Nullable final String value) {
        this._contactITPhoneNumber = value;
    }
    /**
     * Sets the createdDateTime property value. Time when the BrandingProfile was created
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the customCanSeePrivacyMessage property value. Text comments regarding what the admin has access to on the device
     * @param value Value to set for the customCanSeePrivacyMessage property.
     * @return a void
     */
    public void setCustomCanSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this._customCanSeePrivacyMessage = value;
    }
    /**
     * Sets the customCantSeePrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @param value Value to set for the customCantSeePrivacyMessage property.
     * @return a void
     */
    public void setCustomCantSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this._customCantSeePrivacyMessage = value;
    }
    /**
     * Sets the customPrivacyMessage property value. Text comments regarding what the admin doesn't have access to on the device
     * @param value Value to set for the customPrivacyMessage property.
     * @return a void
     */
    public void setCustomPrivacyMessage(@javax.annotation.Nullable final String value) {
        this._customPrivacyMessage = value;
    }
    /**
     * Sets the disableClientTelemetry property value. Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     * @param value Value to set for the disableClientTelemetry property.
     * @return a void
     */
    public void setDisableClientTelemetry(@javax.annotation.Nullable final Boolean value) {
        this._disableClientTelemetry = value;
    }
    /**
     * Sets the displayName property value. Company/organization name that is displayed to end users
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @param value Value to set for the enrollmentAvailability property.
     * @return a void
     */
    public void setEnrollmentAvailability(@javax.annotation.Nullable final EnrollmentAvailabilityOptions value) {
        this._enrollmentAvailability = value;
    }
    /**
     * Sets the isDefaultProfile property value. Boolean that represents whether the profile is used as default or not
     * @param value Value to set for the isDefaultProfile property.
     * @return a void
     */
    public void setIsDefaultProfile(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultProfile = value;
    }
    /**
     * Sets the isFactoryResetDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     * @param value Value to set for the isFactoryResetDisabled property.
     * @return a void
     */
    public void setIsFactoryResetDisabled(@javax.annotation.Nullable final Boolean value) {
        this._isFactoryResetDisabled = value;
    }
    /**
     * Sets the isRemoveDeviceDisabled property value. Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     * @param value Value to set for the isRemoveDeviceDisabled property.
     * @return a void
     */
    public void setIsRemoveDeviceDisabled(@javax.annotation.Nullable final Boolean value) {
        this._isRemoveDeviceDisabled = value;
    }
    /**
     * Sets the landingPageCustomizedImage property value. Customized image displayed in Company Portal apps landing page
     * @param value Value to set for the landingPageCustomizedImage property.
     * @return a void
     */
    public void setLandingPageCustomizedImage(@javax.annotation.Nullable final MimeContent value) {
        this._landingPageCustomizedImage = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Time when the BrandingProfile was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo
     * @param value Value to set for the lightBackgroundLogo property.
     * @return a void
     */
    public void setLightBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this._lightBackgroundLogo = value;
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organization’s IT helpdesk site
     * @param value Value to set for the onlineSupportSiteName property.
     * @return a void
     */
    public void setOnlineSupportSiteName(@javax.annotation.Nullable final String value) {
        this._onlineSupportSiteName = value;
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organization’s IT helpdesk site
     * @param value Value to set for the onlineSupportSiteUrl property.
     * @return a void
     */
    public void setOnlineSupportSiteUrl(@javax.annotation.Nullable final String value) {
        this._onlineSupportSiteUrl = value;
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organization’s privacy policy
     * @param value Value to set for the privacyUrl property.
     * @return a void
     */
    public void setPrivacyUrl(@javax.annotation.Nullable final String value) {
        this._privacyUrl = value;
    }
    /**
     * Sets the profileDescription property value. Description of the profile
     * @param value Value to set for the profileDescription property.
     * @return a void
     */
    public void setProfileDescription(@javax.annotation.Nullable final String value) {
        this._profileDescription = value;
    }
    /**
     * Sets the profileName property value. Name of the profile
     * @param value Value to set for the profileName property.
     * @return a void
     */
    public void setProfileName(@javax.annotation.Nullable final String value) {
        this._profileName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tags assigned to the branding profile
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the sendDeviceOwnershipChangePushNotification property value. Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     * @param value Value to set for the sendDeviceOwnershipChangePushNotification property.
     * @return a void
     */
    public void setSendDeviceOwnershipChangePushNotification(@javax.annotation.Nullable final Boolean value) {
        this._sendDeviceOwnershipChangePushNotification = value;
    }
    /**
     * Sets the showAzureADEnterpriseApps property value. Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     * @param value Value to set for the showAzureADEnterpriseApps property.
     * @return a void
     */
    public void setShowAzureADEnterpriseApps(@javax.annotation.Nullable final Boolean value) {
        this._showAzureADEnterpriseApps = value;
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     * @param value Value to set for the showDisplayNameNextToLogo property.
     * @return a void
     */
    public void setShowDisplayNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this._showDisplayNameNextToLogo = value;
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not
     * @param value Value to set for the showLogo property.
     * @return a void
     */
    public void setShowLogo(@javax.annotation.Nullable final Boolean value) {
        this._showLogo = value;
    }
    /**
     * Sets the showOfficeWebApps property value. Boolean that indicates if Office WebApps will be shown in Company Portal
     * @param value Value to set for the showOfficeWebApps property.
     * @return a void
     */
    public void setShowOfficeWebApps(@javax.annotation.Nullable final Boolean value) {
        this._showOfficeWebApps = value;
    }
    /**
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal
     * @param value Value to set for the themeColor property.
     * @return a void
     */
    public void setThemeColor(@javax.annotation.Nullable final RgbColor value) {
        this._themeColor = value;
    }
    /**
     * Sets the themeColorLogo property value. Logo image displayed in Company Portal apps which have a theme color background behind the logo
     * @param value Value to set for the themeColorLogo property.
     * @return a void
     */
    public void setThemeColorLogo(@javax.annotation.Nullable final MimeContent value) {
        this._themeColorLogo = value;
    }
}
