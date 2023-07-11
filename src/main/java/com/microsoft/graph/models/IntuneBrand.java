package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
 */
public class IntuneBrand implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Collection of blocked actions on the company portal as per platform and device ownership types.
     */
    private java.util.List<CompanyPortalBlockedAction> companyPortalBlockedActions;
    /**
     * Email address of the person/organization responsible for IT support.
     */
    private String contactITEmailAddress;
    /**
     * Name of the person/organization responsible for IT support.
     */
    private String contactITName;
    /**
     * Text comments regarding the person/organization responsible for IT support.
     */
    private String contactITNotes;
    /**
     * Phone number of the person/organization responsible for IT support.
     */
    private String contactITPhoneNumber;
    /**
     * The custom privacy message used to explain what the organization can see and do on managed devices.
     */
    private String customCanSeePrivacyMessage;
    /**
     * The custom privacy message used to explain what the organization cant see or do on managed devices.
     */
    private String customCantSeePrivacyMessage;
    /**
     * The custom privacy message used to explain what the organization cant see or do on managed devices.
     */
    private String customPrivacyMessage;
    /**
     * Logo image displayed in Company Portal apps which have a dark background behind the logo.
     */
    private MimeContent darkBackgroundLogo;
    /**
     * Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     */
    private Boolean disableClientTelemetry;
    /**
     * Boolean that indicates if Device Category Selection will be shown in Company Portal
     */
    private Boolean disableDeviceCategorySelection;
    /**
     * Company/organization name that is displayed to end users.
     */
    private String displayName;
    /**
     * Options available for enrollment flow customization
     */
    private EnrollmentAvailabilityOptions enrollmentAvailability;
    /**
     * Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     */
    private Boolean isFactoryResetDisabled;
    /**
     * Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     */
    private Boolean isRemoveDeviceDisabled;
    /**
     * Customized image displayed in Company Portal app landing page
     */
    private MimeContent landingPageCustomizedImage;
    /**
     * Logo image displayed in Company Portal apps which have a light background behind the logo.
     */
    private MimeContent lightBackgroundLogo;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Display name of the company/organizations IT helpdesk site.
     */
    private String onlineSupportSiteName;
    /**
     * URL to the company/organizations IT helpdesk site.
     */
    private String onlineSupportSiteUrl;
    /**
     * URL to the company/organizations privacy policy.
     */
    private String privacyUrl;
    /**
     * List of scope tags assigned to the default branding profile
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
     * Boolean that indicates if ConfigurationManagerApps will be shown in Company Portal
     */
    private Boolean showConfigurationManagerApps;
    /**
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     */
    private Boolean showDisplayNameNextToLogo;
    /**
     * Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     */
    private Boolean showLogo;
    /**
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     */
    private Boolean showNameNextToLogo;
    /**
     * Boolean that indicates if Office WebApps will be shown in Company Portal
     */
    private Boolean showOfficeWebApps;
    /**
     * Primary theme color used in the Company Portal applications and web portal.
     */
    private RgbColor themeColor;
    /**
     * Instantiates a new intuneBrand and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
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
     * Gets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITEmailAddress() {
        return this.contactITEmailAddress;
    }
    /**
     * Gets the contactITName property value. Name of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITName() {
        return this.contactITName;
    }
    /**
     * Gets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITNotes() {
        return this.contactITNotes;
    }
    /**
     * Gets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContactITPhoneNumber() {
        return this.contactITPhoneNumber;
    }
    /**
     * Gets the customCanSeePrivacyMessage property value. The custom privacy message used to explain what the organization can see and do on managed devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCanSeePrivacyMessage() {
        return this.customCanSeePrivacyMessage;
    }
    /**
     * Gets the customCantSeePrivacyMessage property value. The custom privacy message used to explain what the organization cant see or do on managed devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomCantSeePrivacyMessage() {
        return this.customCantSeePrivacyMessage;
    }
    /**
     * Gets the customPrivacyMessage property value. The custom privacy message used to explain what the organization cant see or do on managed devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomPrivacyMessage() {
        return this.customPrivacyMessage;
    }
    /**
     * Gets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getDarkBackgroundLogo() {
        return this.darkBackgroundLogo;
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
     * Gets the displayName property value. Company/organization name that is displayed to end users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enrollmentAvailability property value. Options available for enrollment flow customization
     * @return a enrollmentAvailabilityOptions
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(30);
        deserializerMap.put("companyPortalBlockedActions", (n) -> { this.setCompanyPortalBlockedActions(n.getCollectionOfObjectValues(CompanyPortalBlockedAction::createFromDiscriminatorValue)); });
        deserializerMap.put("contactITEmailAddress", (n) -> { this.setContactITEmailAddress(n.getStringValue()); });
        deserializerMap.put("contactITName", (n) -> { this.setContactITName(n.getStringValue()); });
        deserializerMap.put("contactITNotes", (n) -> { this.setContactITNotes(n.getStringValue()); });
        deserializerMap.put("contactITPhoneNumber", (n) -> { this.setContactITPhoneNumber(n.getStringValue()); });
        deserializerMap.put("customCanSeePrivacyMessage", (n) -> { this.setCustomCanSeePrivacyMessage(n.getStringValue()); });
        deserializerMap.put("customCantSeePrivacyMessage", (n) -> { this.setCustomCantSeePrivacyMessage(n.getStringValue()); });
        deserializerMap.put("customPrivacyMessage", (n) -> { this.setCustomPrivacyMessage(n.getStringValue()); });
        deserializerMap.put("darkBackgroundLogo", (n) -> { this.setDarkBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("disableClientTelemetry", (n) -> { this.setDisableClientTelemetry(n.getBooleanValue()); });
        deserializerMap.put("disableDeviceCategorySelection", (n) -> { this.setDisableDeviceCategorySelection(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrollmentAvailability", (n) -> { this.setEnrollmentAvailability(n.getEnumValue(EnrollmentAvailabilityOptions.class)); });
        deserializerMap.put("isFactoryResetDisabled", (n) -> { this.setIsFactoryResetDisabled(n.getBooleanValue()); });
        deserializerMap.put("isRemoveDeviceDisabled", (n) -> { this.setIsRemoveDeviceDisabled(n.getBooleanValue()); });
        deserializerMap.put("landingPageCustomizedImage", (n) -> { this.setLandingPageCustomizedImage(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lightBackgroundLogo", (n) -> { this.setLightBackgroundLogo(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteName", (n) -> { this.setOnlineSupportSiteName(n.getStringValue()); });
        deserializerMap.put("onlineSupportSiteUrl", (n) -> { this.setOnlineSupportSiteUrl(n.getStringValue()); });
        deserializerMap.put("privacyUrl", (n) -> { this.setPrivacyUrl(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sendDeviceOwnershipChangePushNotification", (n) -> { this.setSendDeviceOwnershipChangePushNotification(n.getBooleanValue()); });
        deserializerMap.put("showAzureADEnterpriseApps", (n) -> { this.setShowAzureADEnterpriseApps(n.getBooleanValue()); });
        deserializerMap.put("showConfigurationManagerApps", (n) -> { this.setShowConfigurationManagerApps(n.getBooleanValue()); });
        deserializerMap.put("showDisplayNameNextToLogo", (n) -> { this.setShowDisplayNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("showLogo", (n) -> { this.setShowLogo(n.getBooleanValue()); });
        deserializerMap.put("showNameNextToLogo", (n) -> { this.setShowNameNextToLogo(n.getBooleanValue()); });
        deserializerMap.put("showOfficeWebApps", (n) -> { this.setShowOfficeWebApps(n.getBooleanValue()); });
        deserializerMap.put("themeColor", (n) -> { this.setThemeColor(n.getObjectValue(RgbColor::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the landingPageCustomizedImage property value. Customized image displayed in Company Portal app landing page
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLandingPageCustomizedImage() {
        return this.landingPageCustomizedImage;
    }
    /**
     * Gets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLightBackgroundLogo() {
        return this.lightBackgroundLogo;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteName() {
        return this.onlineSupportSiteName;
    }
    /**
     * Gets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineSupportSiteUrl() {
        return this.onlineSupportSiteUrl;
    }
    /**
     * Gets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyUrl() {
        return this.privacyUrl;
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tags assigned to the default branding profile
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
     * Gets the showConfigurationManagerApps property value. Boolean that indicates if ConfigurationManagerApps will be shown in Company Portal
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowConfigurationManagerApps() {
        return this.showConfigurationManagerApps;
    }
    /**
     * Gets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowDisplayNameNextToLogo() {
        return this.showDisplayNameNextToLogo;
    }
    /**
     * Gets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLogo() {
        return this.showLogo;
    }
    /**
     * Gets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowNameNextToLogo() {
        return this.showNameNextToLogo;
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
     * Gets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @return a rgbColor
     */
    @javax.annotation.Nullable
    public RgbColor getThemeColor() {
        return this.themeColor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeBooleanValue("disableDeviceCategorySelection", this.getDisableDeviceCategorySelection());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("enrollmentAvailability", this.getEnrollmentAvailability());
        writer.writeBooleanValue("isFactoryResetDisabled", this.getIsFactoryResetDisabled());
        writer.writeBooleanValue("isRemoveDeviceDisabled", this.getIsRemoveDeviceDisabled());
        writer.writeObjectValue("landingPageCustomizedImage", this.getLandingPageCustomizedImage());
        writer.writeObjectValue("lightBackgroundLogo", this.getLightBackgroundLogo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("onlineSupportSiteName", this.getOnlineSupportSiteName());
        writer.writeStringValue("onlineSupportSiteUrl", this.getOnlineSupportSiteUrl());
        writer.writeStringValue("privacyUrl", this.getPrivacyUrl());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("sendDeviceOwnershipChangePushNotification", this.getSendDeviceOwnershipChangePushNotification());
        writer.writeBooleanValue("showAzureADEnterpriseApps", this.getShowAzureADEnterpriseApps());
        writer.writeBooleanValue("showConfigurationManagerApps", this.getShowConfigurationManagerApps());
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
     * Sets the contactITEmailAddress property value. Email address of the person/organization responsible for IT support.
     * @param value Value to set for the contactITEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITEmailAddress(@javax.annotation.Nullable final String value) {
        this.contactITEmailAddress = value;
    }
    /**
     * Sets the contactITName property value. Name of the person/organization responsible for IT support.
     * @param value Value to set for the contactITName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITName(@javax.annotation.Nullable final String value) {
        this.contactITName = value;
    }
    /**
     * Sets the contactITNotes property value. Text comments regarding the person/organization responsible for IT support.
     * @param value Value to set for the contactITNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITNotes(@javax.annotation.Nullable final String value) {
        this.contactITNotes = value;
    }
    /**
     * Sets the contactITPhoneNumber property value. Phone number of the person/organization responsible for IT support.
     * @param value Value to set for the contactITPhoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContactITPhoneNumber(@javax.annotation.Nullable final String value) {
        this.contactITPhoneNumber = value;
    }
    /**
     * Sets the customCanSeePrivacyMessage property value. The custom privacy message used to explain what the organization can see and do on managed devices.
     * @param value Value to set for the customCanSeePrivacyMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCanSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this.customCanSeePrivacyMessage = value;
    }
    /**
     * Sets the customCantSeePrivacyMessage property value. The custom privacy message used to explain what the organization cant see or do on managed devices.
     * @param value Value to set for the customCantSeePrivacyMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomCantSeePrivacyMessage(@javax.annotation.Nullable final String value) {
        this.customCantSeePrivacyMessage = value;
    }
    /**
     * Sets the customPrivacyMessage property value. The custom privacy message used to explain what the organization cant see or do on managed devices.
     * @param value Value to set for the customPrivacyMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomPrivacyMessage(@javax.annotation.Nullable final String value) {
        this.customPrivacyMessage = value;
    }
    /**
     * Sets the darkBackgroundLogo property value. Logo image displayed in Company Portal apps which have a dark background behind the logo.
     * @param value Value to set for the darkBackgroundLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDarkBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this.darkBackgroundLogo = value;
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
     * Sets the displayName property value. Company/organization name that is displayed to end users.
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
     * Sets the landingPageCustomizedImage property value. Customized image displayed in Company Portal app landing page
     * @param value Value to set for the landingPageCustomizedImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLandingPageCustomizedImage(@javax.annotation.Nullable final MimeContent value) {
        this.landingPageCustomizedImage = value;
    }
    /**
     * Sets the lightBackgroundLogo property value. Logo image displayed in Company Portal apps which have a light background behind the logo.
     * @param value Value to set for the lightBackgroundLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLightBackgroundLogo(@javax.annotation.Nullable final MimeContent value) {
        this.lightBackgroundLogo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the onlineSupportSiteName property value. Display name of the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineSupportSiteName(@javax.annotation.Nullable final String value) {
        this.onlineSupportSiteName = value;
    }
    /**
     * Sets the onlineSupportSiteUrl property value. URL to the company/organizations IT helpdesk site.
     * @param value Value to set for the onlineSupportSiteUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineSupportSiteUrl(@javax.annotation.Nullable final String value) {
        this.onlineSupportSiteUrl = value;
    }
    /**
     * Sets the privacyUrl property value. URL to the company/organizations privacy policy.
     * @param value Value to set for the privacyUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyUrl(@javax.annotation.Nullable final String value) {
        this.privacyUrl = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tags assigned to the default branding profile
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
     * Sets the showConfigurationManagerApps property value. Boolean that indicates if ConfigurationManagerApps will be shown in Company Portal
     * @param value Value to set for the showConfigurationManagerApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowConfigurationManagerApps(@javax.annotation.Nullable final Boolean value) {
        this.showConfigurationManagerApps = value;
    }
    /**
     * Sets the showDisplayNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showDisplayNameNextToLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowDisplayNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this.showDisplayNameNextToLogo = value;
    }
    /**
     * Sets the showLogo property value. Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     * @param value Value to set for the showLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowLogo(@javax.annotation.Nullable final Boolean value) {
        this.showLogo = value;
    }
    /**
     * Sets the showNameNextToLogo property value. Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     * @param value Value to set for the showNameNextToLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowNameNextToLogo(@javax.annotation.Nullable final Boolean value) {
        this.showNameNextToLogo = value;
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
     * Sets the themeColor property value. Primary theme color used in the Company Portal applications and web portal.
     * @param value Value to set for the themeColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThemeColor(@javax.annotation.Nullable final RgbColor value) {
        this.themeColor = value;
    }
}
