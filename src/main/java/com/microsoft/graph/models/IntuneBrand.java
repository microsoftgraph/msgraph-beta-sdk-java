package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal. */
public class IntuneBrand implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Collection of blocked actions on the company portal as per platform and device ownership types. */
    private java.util.List<CompanyPortalBlockedAction> _companyPortalBlockedActions;
    /** Email address of the person/organization responsible for IT support. */
    private String _contactITEmailAddress;
    /** Name of the person/organization responsible for IT support. */
    private String _contactITName;
    /** Text comments regarding the person/organization responsible for IT support. */
    private String _contactITNotes;
    /** Phone number of the person/organization responsible for IT support. */
    private String _contactITPhoneNumber;
    /** The custom privacy message used to explain what the organization can see and do on managed devices. */
    private String _customCanSeePrivacyMessage;
    /** The custom privacy message used to explain what the organization can’t see or do on managed devices. */
    private String _customCantSeePrivacyMessage;
    /** The custom privacy message used to explain what the organization can’t see or do on managed devices. */
    private String _customPrivacyMessage;
    /** Logo image displayed in Company Portal apps which have a dark background behind the logo. */
    private MimeContent _darkBackgroundLogo;
    /** Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user. */
    private Boolean _disableClientTelemetry;
    /** Company/organization name that is displayed to end users. */
    private String _displayName;
    /** Options available for enrollment flow customization */
    private EnrollmentAvailabilityOptions _enrollmentAvailability;
    /** Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices. */
    private Boolean _isFactoryResetDisabled;
    /** Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices. */
    private Boolean _isRemoveDeviceDisabled;
    /** Customized image displayed in Company Portal app landing page */
    private MimeContent _landingPageCustomizedImage;
    /** Logo image displayed in Company Portal apps which have a light background behind the logo. */
    private MimeContent _lightBackgroundLogo;
    /** Display name of the company/organization’s IT helpdesk site. */
    private String _onlineSupportSiteName;
    /** URL to the company/organization’s IT helpdesk site. */
    private String _onlineSupportSiteUrl;
    /** URL to the company/organization’s privacy policy. */
    private String _privacyUrl;
    /** List of scope tags assigned to the default branding profile */
    private java.util.List<String> _roleScopeTagIds;
    /** Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate */
    private Boolean _sendDeviceOwnershipChangePushNotification;
    /** Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal */
    private Boolean _showAzureADEnterpriseApps;
    /** Boolean that represents whether the administrator-supplied display name will be shown next to the logo image. */
    private Boolean _showDisplayNameNextToLogo;
    /** Boolean that represents whether the administrator-supplied logo images are shown or not shown. */
    private Boolean _showLogo;
    /** Boolean that represents whether the administrator-supplied display name will be shown next to the logo image. */
    private Boolean _showNameNextToLogo;
    /** Boolean that indicates if Office WebApps will be shown in Company Portal */
    private Boolean _showOfficeWebApps;
    /** Primary theme color used in the Company Portal applications and web portal. */
    private RgbColor _themeColor;
    /**
     * Instantiates a new intuneBrand and sets the default values.
     * @return a void
     */
    public IntuneBrand() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a intuneBrand
     */
    @javax.annotation.Nonnull
    public static IntuneBrand createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntuneBrand();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
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
     * Gets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITEmailAddress() {
        return this._contactITEmailAddress;
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITName() {
        return this._contactITName;
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITNotes() {
        return this._contactITNotes;
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this._contactITPhoneNumber;
    }
    /**
     * Gets the customCanSeePrivacyMessage property value. The custom privacy message used to explain what the organization can see and do on managed devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCanSeePrivacyMessage() {
        return this._customCanSeePrivacyMessage;
    }
    /**
     * Gets the customCantSeePrivacyMessage property value. The custom privacy message used to explain what the organization can’t see or do on managed devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCantSeePrivacyMessage() {
        return this._customCantSeePrivacyMessage;
    }
    /**
     * Gets the customPrivacyMessage property value. The custom privacy message used to explain what the organization can’t see or do on managed devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyMessage() {
        return this._customPrivacyMessage;
    }
    /**
     * Gets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getDarkBackgroundLogo() {
        return this._darkBackgroundLogo;
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
     * Gets the displayName property value. Company/organization name that is displayed to end users.
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
        final IntuneBrand currentObject = this;
        return new HashMap<>(27) {{
            this.put("companyPortalBlockedActions", (n) -> { currentObject.setCompanyPortalBlockedActions(n.getCollectionOfObjectValues(CompanyPortalBlockedAction::createFromDiscriminatorValue)); });
            this.put("contactITEmailAddress", (n) -> { currentObject.setContactITEmailAddress(n.getStringValue()); });
            this.put("contactITName", (n) -> { currentObject.setContactITName(n.getStringValue()); });
            this.put("contactITNotes", (n) -> { currentObject.setContactITNotes(n.getStringValue()); });
            this.put("contactITPhoneNumber", (n) -> { currentObject.setContactITPhoneNumber(n.getStringValue()); });
            this.put("customCanSeePrivacyMessage", (n) -> { currentObject.setCustomCanSeePrivacyMessage(n.getStringValue()); });
            this.put("customCantSeePrivacyMessage", (n) -> { currentObject.setCustomCantSeePrivacyMessage(n.getStringValue()); });
            this.put("customPrivacyMessage", (n) -> { currentObject.setCustomPrivacyMessage(n.getStringValue()); });
            this.put("darkBackgroundLogo", (n) -> { currentObject.setDarkBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("disableClientTelemetry", (n) -> { currentObject.setDisableClientTelemetry(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enrollmentAvailability", (n) -> { currentObject.setEnrollmentAvailability(n.getEnumValue(EnrollmentAvailabilityOptions.class)); });
            this.put("isFactoryResetDisabled", (n) -> { currentObject.setIsFactoryResetDisabled(n.getBooleanValue()); });
            this.put("isRemoveDeviceDisabled", (n) -> { currentObject.setIsRemoveDeviceDisabled(n.getBooleanValue()); });
            this.put("landingPageCustomizedImage", (n) -> { currentObject.setLandingPageCustomizedImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("lightBackgroundLogo", (n) -> { currentObject.setLightBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
            this.put("onlineSupportSiteName", (n) -> { currentObject.setOnlineSupportSiteName(n.getStringValue()); });
            this.put("onlineSupportSiteUrl", (n) -> { currentObject.setOnlineSupportSiteUrl(n.getStringValue()); });
            this.put("privacyUrl", (n) -> { currentObject.setPrivacyUrl(n.getStringValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sendDeviceOwnershipChangePushNotification", (n) -> { currentObject.setSendDeviceOwnershipChangePushNotification(n.getBooleanValue()); });
            this.put("showAzureADEnterpriseApps", (n) -> { currentObject.setShowAzureADEnterpriseApps(n.getBooleanValue()); });
            this.put("showDisplayNameNextToLogo", (n) -> { currentObject.setShowDisplayNameNextToLogo(n.getBooleanValue()); });
            this.put("showLogo", (n) -> { currentObject.setShowLogo(n.getBooleanValue()); });
            this.put("showNameNextToLogo", (n) -> { currentObject.setShowNameNextToLogo(n.getBooleanValue()); });
            this.put("showOfficeWebApps", (n) -> { currentObject.setShowOfficeWebApps(n.getBooleanValue()); });
            this.put("themeColor", (n) -> { currentObject.setThemeColor(n.getObjectValue(RgbColor::createFromDiscriminatorValue)); });
        }};
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
     * Gets the landingPageCustomizedImage property value. Customized image displayed in Company Portal app landing page
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLandingPageCustomizedImage() {
        return this._landingPageCustomizedImage;
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this._lightBackgroundLogo;
    }
    /**
     * Gets the onlineSupportSiteName property value. Display name of the company/organization’s IT helpdesk site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this._onlineSupportSiteName;
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organization’s IT helpdesk site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this._onlineSupportSiteUrl;
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organization’s privacy policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyUrl() {
        return this._privacyUrl;
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tags assigned to the default branding profile
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
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this._showDisplayNameNextToLogo;
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLogo() {
        return this._showLogo;
    }
    /**
     * Gets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowNameNextToLogo() {
        return this._showNameNextToLogo;
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
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @return a rgbColor
     */
    @javax.annotation.Nullable
    public RgbColor getThemeColor() {
        return this._themeColor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("companyPortalBlockedActions", this.getCompanyPortalBlockedActions());
        writer.writeStringValue("contactITEmailAddress", this.getContactITEmailAddress());
        writer.writeStringValue("contactITName", this.getContactITName());
        writer.writeStringValue("contactITNotes", this.getContactITNotes());
        writer.writeStringValue("contactITPhoneNumber", this.getContactITPhoneNumber());
        writer.writeStringValue("customCanSeePrivacyMessage", this.getCustomCanSeePrivacyMessage());
        writer.writeStringValue("customCantSeePrivacyMessage", this.getCustomCantSeePrivacyMessage());
        writer.writeStringValue("customPrivacyMessage", this.getCustomPrivacyMessage());
        writer.writeObjectValue("darkBackgroundLogo", this.getDarkBackgroundLogo());
        writer.writeBooleanValue("disableClientTelemetry", this.getDisableClientTelemetry());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("enrollmentAvailability", this.getEnrollmentAvailability());
        writer.writeBooleanValue("isFactoryResetDisabled", this.getIsFactoryResetDisabled());
        writer.writeBooleanValue("isRemoveDeviceDisabled", this.getIsRemoveDeviceDisabled());
        writer.writeObjectValue("landingPageCustomizedImage", this.getLandingPageCustomizedImage());
        writer.writeObjectValue("lightBackgroundLogo", this.getLightBackgroundLogo());
        writer.writeStringValue("onlineSupportSiteName", this.getOnlineSupportSiteName());
        writer.writeStringValue("onlineSupportSiteUrl", this.getOnlineSupportSiteUrl());
        writer.writeStringValue("privacyUrl", this.getPrivacyUrl());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("sendDeviceOwnershipChangePushNotification", this.getSendDeviceOwnershipChangePushNotification());
        writer.writeBooleanValue("showAzureADEnterpriseApps", this.getShowAzureADEnterpriseApps());
        writer.writeBooleanValue("showDisplayNameNextToLogo", this.getShowDisplayNameNextToLogo());
        writer.writeBooleanValue("showLogo", this.getShowLogo());
        writer.writeBooleanValue("showNameNextToLogo", this.getShowNameNextToLogo());
        writer.writeBooleanValue("showOfficeWebApps", this.getShowOfficeWebApps());
        writer.writeObjectValue("themeColor", this.getThemeColor());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
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
     * Sets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @param value Value to set for the contactITEmailAddress property.
     * @return a void
     */
    public void setContactITEmailAddress(@javax.annotation.Nullable final String value) {
        this._contactITEmailAddress = value;
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support.
     * @param value Value to set for the contactITName property.
     * @return a void
     */
    public void setContactITName(@javax.annotation.Nullable final String value) {
        this._contactITName = value;
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @param value Value to set for the contactITNotes property.
     * @return a void
     */
    public void setContactITNotes(@javax.annotation.Nullable final String value) {
        this._contactITNotes = value;
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @param value Value to set for the contactITPhoneNumber property.
     * @return a void
     */
    public void setContactITPhoneNumber(@javax.annotation.Nullable final String value) {
        this._contactITPhoneNumber = value;
    }
    /**
     * Sets the customCanSeePrivacyMessage property value. The custom privacy message used to explain what the organization can see and do on managed devices.
     * @param value Value to set for the customCanSeePrivacyMessage property.
     * @return a void
     */
    public void setCustomCanSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this._customCanSeePrivacyMessage = value;
    }
    /**
     * Sets the customCantSeePrivacyMessage property value. The custom privacy message used to explain what the organization can’t see or do on managed devices.
     * @param value Value to set for the customCantSeePrivacyMessage property.
     * @return a void
     */
    public void setCustomCantSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this._customCantSeePrivacyMessage = value;
    }
    /**
     * Sets the customPrivacyMessage property value. The custom privacy message used to explain what the organization can’t see or do on managed devices.
     * @param value Value to set for the customPrivacyMessage property.
     * @return a void
     */
    public void setCustomPrivacyMessage(@javax.annotation.Nullable final String value) {
        this._customPrivacyMessage = value;
    }
    /**
     * Sets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @param value Value to set for the darkBackgroundLogo property.
     * @return a void
     */
    public void setDarkBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this._darkBackgroundLogo = value;
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
     * Sets the displayName property value. Company/organization name that is displayed to end users.
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
     * Sets the landingPageCustomizedImage property value. Customized image displayed in Company Portal app landing page
     * @param value Value to set for the landingPageCustomizedImage property.
     * @return a void
     */
    public void setLandingPageCustomizedImage(@javax.annotation.Nullable final MimeContent value) {
        this._landingPageCustomizedImage = value;
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @param value Value to set for the lightBackgroundLogo property.
     * @return a void
     */
    public void setLightBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this._lightBackgroundLogo = value;
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organization’s IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteName property.
     * @return a void
     */
    public void setOnlineSupportSiteName(@javax.annotation.Nullable final String value) {
        this._onlineSupportSiteName = value;
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organization’s IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteUrl property.
     * @return a void
     */
    public void setOnlineSupportSiteUrl(@javax.annotation.Nullable final String value) {
        this._onlineSupportSiteUrl = value;
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organization’s privacy policy.
     * @param value Value to set for the privacyUrl property.
     * @return a void
     */
    public void setPrivacyUrl(@javax.annotation.Nullable final String value) {
        this._privacyUrl = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tags assigned to the default branding profile
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
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showDisplayNameNextToLogo property.
     * @return a void
     */
    public void setShowDisplayNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this._showDisplayNameNextToLogo = value;
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @param value Value to set for the showLogo property.
     * @return a void
     */
    public void setShowLogo(@javax.annotation.Nullable final Boolean value) {
        this._showLogo = value;
    }
    /**
     * Sets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showNameNextToLogo property.
     * @return a void
     */
    public void setShowNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this._showNameNextToLogo = value;
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
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @param value Value to set for the themeColor property.
     * @return a void
     */
    public void setThemeColor(@javax.annotation.Nullable final RgbColor value) {
        this._themeColor = value;
    }
}
