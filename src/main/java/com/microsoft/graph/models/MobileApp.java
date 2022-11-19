package com.microsoft.graph.models;

import com.microsoft.graph.models.AndroidForWorkApp;
import com.microsoft.graph.models.AndroidLobApp;
import com.microsoft.graph.models.AndroidManagedStoreApp;
import com.microsoft.graph.models.AndroidManagedStoreWebApp;
import com.microsoft.graph.models.AndroidStoreApp;
import com.microsoft.graph.models.IosiPadOSWebClip;
import com.microsoft.graph.models.IosLobApp;
import com.microsoft.graph.models.IosStoreApp;
import com.microsoft.graph.models.IosVppApp;
import com.microsoft.graph.models.MacOSDmgApp;
import com.microsoft.graph.models.MacOSLobApp;
import com.microsoft.graph.models.MacOSMdatpApp;
import com.microsoft.graph.models.MacOSMicrosoftDefenderApp;
import com.microsoft.graph.models.MacOSMicrosoftEdgeApp;
import com.microsoft.graph.models.MacOSOfficeSuiteApp;
import com.microsoft.graph.models.MacOsVppApp;
import com.microsoft.graph.models.ManagedAndroidLobApp;
import com.microsoft.graph.models.ManagedAndroidStoreApp;
import com.microsoft.graph.models.ManagedApp;
import com.microsoft.graph.models.ManagedIOSLobApp;
import com.microsoft.graph.models.ManagedIOSStoreApp;
import com.microsoft.graph.models.ManagedMobileLobApp;
import com.microsoft.graph.models.MicrosoftStoreForBusinessApp;
import com.microsoft.graph.models.MobileLobApp;
import com.microsoft.graph.models.OfficeSuiteApp;
import com.microsoft.graph.models.WebApp;
import com.microsoft.graph.models.Win32LobApp;
import com.microsoft.graph.models.WindowsAppX;
import com.microsoft.graph.models.WindowsMicrosoftEdgeApp;
import com.microsoft.graph.models.WindowsMobileMSI;
import com.microsoft.graph.models.WindowsPhone81AppX;
import com.microsoft.graph.models.WindowsPhone81AppXBundle;
import com.microsoft.graph.models.WindowsPhone81StoreApp;
import com.microsoft.graph.models.WindowsPhoneXAP;
import com.microsoft.graph.models.WindowsStoreApp;
import com.microsoft.graph.models.WindowsUniversalAppX;
import com.microsoft.graph.models.WindowsWebApp;
import com.microsoft.graph.models.WinGetApp;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileApp extends Entity implements Parsable {
    /** The list of group assignments for this mobile app. */
    private java.util.List<MobileAppAssignment> _assignments;
    /** The list of categories for this app. */
    private java.util.List<MobileAppCategory> _categories;
    /** The date and time the app was created. */
    private OffsetDateTime _createdDateTime;
    /** The total number of dependencies the child app has. */
    private Integer _dependentAppCount;
    /** The description of the app. */
    private String _description;
    /** The developer of the app. */
    private String _developer;
    /** The list of installation states for this mobile app. */
    private java.util.List<MobileAppInstallStatus> _deviceStatuses;
    /** The admin provided or imported title of the app. */
    private String _displayName;
    /** The more information Url. */
    private String _informationUrl;
    /** Mobile App Install Summary. */
    private MobileAppInstallSummary _installSummary;
    /** The value indicating whether the app is assigned to at least one group. */
    private Boolean _isAssigned;
    /** The value indicating whether the app is marked as featured by the admin. */
    private Boolean _isFeatured;
    /** The large icon, to be displayed in the app details and used for upload of the icon. */
    private MimeContent _largeIcon;
    /** The date and time the app was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Notes for the app. */
    private String _notes;
    /** The owner of the app. */
    private String _owner;
    /** The privacy statement Url. */
    private String _privacyInformationUrl;
    /** The publisher of the app. */
    private String _publisher;
    /** Indicates the publishing state of an app. */
    private MobileAppPublishingState _publishingState;
    /** List of relationships for this mobile app. */
    private java.util.List<MobileAppRelationship> _relationships;
    /** List of scope tag ids for this mobile app. */
    private java.util.List<String> _roleScopeTagIds;
    /** The total number of apps this app is directly or indirectly superseded by. */
    private Integer _supersededAppCount;
    /** The total number of apps this app directly or indirectly supersedes. */
    private Integer _supersedingAppCount;
    /** The upload state. */
    private Integer _uploadState;
    /** The list of installation states for this mobile app. */
    private java.util.List<UserAppInstallStatus> _userStatuses;
    /**
     * Instantiates a new MobileApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileApp() {
        super();
        this.setOdataType("#microsoft.graph.mobileApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileApp
     */
    @javax.annotation.Nonnull
    public static MobileApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidForWorkApp": return new AndroidForWorkApp();
                case "#microsoft.graph.androidLobApp": return new AndroidLobApp();
                case "#microsoft.graph.androidManagedStoreApp": return new AndroidManagedStoreApp();
                case "#microsoft.graph.androidManagedStoreWebApp": return new AndroidManagedStoreWebApp();
                case "#microsoft.graph.androidStoreApp": return new AndroidStoreApp();
                case "#microsoft.graph.iosiPadOSWebClip": return new IosiPadOSWebClip();
                case "#microsoft.graph.iosLobApp": return new IosLobApp();
                case "#microsoft.graph.iosStoreApp": return new IosStoreApp();
                case "#microsoft.graph.iosVppApp": return new IosVppApp();
                case "#microsoft.graph.macOSDmgApp": return new MacOSDmgApp();
                case "#microsoft.graph.macOSLobApp": return new MacOSLobApp();
                case "#microsoft.graph.macOSMdatpApp": return new MacOSMdatpApp();
                case "#microsoft.graph.macOSMicrosoftDefenderApp": return new MacOSMicrosoftDefenderApp();
                case "#microsoft.graph.macOSMicrosoftEdgeApp": return new MacOSMicrosoftEdgeApp();
                case "#microsoft.graph.macOSOfficeSuiteApp": return new MacOSOfficeSuiteApp();
                case "#microsoft.graph.macOsVppApp": return new MacOsVppApp();
                case "#microsoft.graph.managedAndroidLobApp": return new ManagedAndroidLobApp();
                case "#microsoft.graph.managedAndroidStoreApp": return new ManagedAndroidStoreApp();
                case "#microsoft.graph.managedApp": return new ManagedApp();
                case "#microsoft.graph.managedIOSLobApp": return new ManagedIOSLobApp();
                case "#microsoft.graph.managedIOSStoreApp": return new ManagedIOSStoreApp();
                case "#microsoft.graph.managedMobileLobApp": return new ManagedMobileLobApp();
                case "#microsoft.graph.microsoftStoreForBusinessApp": return new MicrosoftStoreForBusinessApp();
                case "#microsoft.graph.mobileLobApp": return new MobileLobApp();
                case "#microsoft.graph.officeSuiteApp": return new OfficeSuiteApp();
                case "#microsoft.graph.webApp": return new WebApp();
                case "#microsoft.graph.win32LobApp": return new Win32LobApp();
                case "#microsoft.graph.windowsAppX": return new WindowsAppX();
                case "#microsoft.graph.windowsMicrosoftEdgeApp": return new WindowsMicrosoftEdgeApp();
                case "#microsoft.graph.windowsMobileMSI": return new WindowsMobileMSI();
                case "#microsoft.graph.windowsPhone81AppX": return new WindowsPhone81AppX();
                case "#microsoft.graph.windowsPhone81AppXBundle": return new WindowsPhone81AppXBundle();
                case "#microsoft.graph.windowsPhone81StoreApp": return new WindowsPhone81StoreApp();
                case "#microsoft.graph.windowsPhoneXAP": return new WindowsPhoneXAP();
                case "#microsoft.graph.windowsStoreApp": return new WindowsStoreApp();
                case "#microsoft.graph.windowsUniversalAppX": return new WindowsUniversalAppX();
                case "#microsoft.graph.windowsWebApp": return new WindowsWebApp();
                case "#microsoft.graph.winGetApp": return new WinGetApp();
            }
        }
        return new MobileApp();
    }
    /**
     * Gets the assignments property value. The list of group assignments for this mobile app.
     * @return a mobileAppAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the categories property value. The list of categories for this app.
     * @return a mobileAppCategory
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppCategory> getCategories() {
        return this._categories;
    }
    /**
     * Gets the createdDateTime property value. The date and time the app was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the dependentAppCount property value. The total number of dependencies the child app has.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDependentAppCount() {
        return this._dependentAppCount;
    }
    /**
     * Gets the description property value. The description of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the developer property value. The developer of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeveloper() {
        return this._developer;
    }
    /**
     * Gets the deviceStatuses property value. The list of installation states for this mobile app.
     * @return a mobileAppInstallStatus
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppInstallStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the displayName property value. The admin provided or imported title of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileApp currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(MobileAppAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfObjectValues(MobileAppCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dependentAppCount", (n) -> { currentObject.setDependentAppCount(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("developer", (n) -> { currentObject.setDeveloper(n.getStringValue()); });
        deserializerMap.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(MobileAppInstallStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationUrl", (n) -> { currentObject.setInformationUrl(n.getStringValue()); });
        deserializerMap.put("installSummary", (n) -> { currentObject.setInstallSummary(n.getObjectValue(MobileAppInstallSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("isFeatured", (n) -> { currentObject.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("largeIcon", (n) -> { currentObject.setLargeIcon(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { currentObject.setOwner(n.getStringValue()); });
        deserializerMap.put("privacyInformationUrl", (n) -> { currentObject.setPrivacyInformationUrl(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
        deserializerMap.put("publishingState", (n) -> { currentObject.setPublishingState(n.getEnumValue(MobileAppPublishingState.class)); });
        deserializerMap.put("relationships", (n) -> { currentObject.setRelationships(n.getCollectionOfObjectValues(MobileAppRelationship::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supersededAppCount", (n) -> { currentObject.setSupersededAppCount(n.getIntegerValue()); });
        deserializerMap.put("supersedingAppCount", (n) -> { currentObject.setSupersedingAppCount(n.getIntegerValue()); });
        deserializerMap.put("uploadState", (n) -> { currentObject.setUploadState(n.getIntegerValue()); });
        deserializerMap.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(UserAppInstallStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationUrl property value. The more information Url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInformationUrl() {
        return this._informationUrl;
    }
    /**
     * Gets the installSummary property value. Mobile App Install Summary.
     * @return a mobileAppInstallSummary
     */
    @javax.annotation.Nullable
    public MobileAppInstallSummary getInstallSummary() {
        return this._installSummary;
    }
    /**
     * Gets the isAssigned property value. The value indicating whether the app is assigned to at least one group.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Gets the isFeatured property value. The value indicating whether the app is marked as featured by the admin.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFeatured() {
        return this._isFeatured;
    }
    /**
     * Gets the largeIcon property value. The large icon, to be displayed in the app details and used for upload of the icon.
     * @return a mimeContent
     */
    @javax.annotation.Nullable
    public MimeContent getLargeIcon() {
        return this._largeIcon;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the app was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the notes property value. Notes for the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the owner property value. The owner of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this._owner;
    }
    /**
     * Gets the privacyInformationUrl property value. The privacy statement Url.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivacyInformationUrl() {
        return this._privacyInformationUrl;
    }
    /**
     * Gets the publisher property value. The publisher of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the publishingState property value. Indicates the publishing state of an app.
     * @return a mobileAppPublishingState
     */
    @javax.annotation.Nullable
    public MobileAppPublishingState getPublishingState() {
        return this._publishingState;
    }
    /**
     * Gets the relationships property value. List of relationships for this mobile app.
     * @return a mobileAppRelationship
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppRelationship> getRelationships() {
        return this._relationships;
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tag ids for this mobile app.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the supersededAppCount property value. The total number of apps this app is directly or indirectly superseded by.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupersededAppCount() {
        return this._supersededAppCount;
    }
    /**
     * Gets the supersedingAppCount property value. The total number of apps this app directly or indirectly supersedes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSupersedingAppCount() {
        return this._supersedingAppCount;
    }
    /**
     * Gets the uploadState property value. The upload state.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUploadState() {
        return this._uploadState;
    }
    /**
     * Gets the userStatuses property value. The list of installation states for this mobile app.
     * @return a userAppInstallStatus
     */
    @javax.annotation.Nullable
    public java.util.List<UserAppInstallStatus> getUserStatuses() {
        return this._userStatuses;
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
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("dependentAppCount", this.getDependentAppCount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("developer", this.getDeveloper());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("informationUrl", this.getInformationUrl());
        writer.writeObjectValue("installSummary", this.getInstallSummary());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeBooleanValue("isFeatured", this.getIsFeatured());
        writer.writeObjectValue("largeIcon", this.getLargeIcon());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("privacyInformationUrl", this.getPrivacyInformationUrl());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeEnumValue("publishingState", this.getPublishingState());
        writer.writeCollectionOfObjectValues("relationships", this.getRelationships());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeIntegerValue("supersededAppCount", this.getSupersededAppCount());
        writer.writeIntegerValue("supersedingAppCount", this.getSupersedingAppCount());
        writer.writeIntegerValue("uploadState", this.getUploadState());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
    }
    /**
     * Sets the assignments property value. The list of group assignments for this mobile app.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<MobileAppAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the categories property value. The list of categories for this app.
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this._categories = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the app was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the dependentAppCount property value. The total number of dependencies the child app has.
     * @param value Value to set for the dependentAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDependentAppCount(@javax.annotation.Nullable final Integer value) {
        this._dependentAppCount = value;
    }
    /**
     * Sets the description property value. The description of the app.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the developer property value. The developer of the app.
     * @param value Value to set for the developer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeveloper(@javax.annotation.Nullable final String value) {
        this._developer = value;
    }
    /**
     * Sets the deviceStatuses property value. The list of installation states for this mobile app.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<MobileAppInstallStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the displayName property value. The admin provided or imported title of the app.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the informationUrl property value. The more information Url.
     * @param value Value to set for the informationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationUrl(@javax.annotation.Nullable final String value) {
        this._informationUrl = value;
    }
    /**
     * Sets the installSummary property value. Mobile App Install Summary.
     * @param value Value to set for the installSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallSummary(@javax.annotation.Nullable final MobileAppInstallSummary value) {
        this._installSummary = value;
    }
    /**
     * Sets the isAssigned property value. The value indicating whether the app is assigned to at least one group.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
    /**
     * Sets the isFeatured property value. The value indicating whether the app is marked as featured by the admin.
     * @param value Value to set for the isFeatured property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFeatured(@javax.annotation.Nullable final Boolean value) {
        this._isFeatured = value;
    }
    /**
     * Sets the largeIcon property value. The large icon, to be displayed in the app details and used for upload of the icon.
     * @param value Value to set for the largeIcon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLargeIcon(@javax.annotation.Nullable final MimeContent value) {
        this._largeIcon = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the app was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the notes property value. Notes for the app.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the owner property value. The owner of the app.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this._owner = value;
    }
    /**
     * Sets the privacyInformationUrl property value. The privacy statement Url.
     * @param value Value to set for the privacyInformationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyInformationUrl(@javax.annotation.Nullable final String value) {
        this._privacyInformationUrl = value;
    }
    /**
     * Sets the publisher property value. The publisher of the app.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the publishingState property value. Indicates the publishing state of an app.
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishingState(@javax.annotation.Nullable final MobileAppPublishingState value) {
        this._publishingState = value;
    }
    /**
     * Sets the relationships property value. List of relationships for this mobile app.
     * @param value Value to set for the relationships property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelationships(@javax.annotation.Nullable final java.util.List<MobileAppRelationship> value) {
        this._relationships = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tag ids for this mobile app.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the supersededAppCount property value. The total number of apps this app is directly or indirectly superseded by.
     * @param value Value to set for the supersededAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupersededAppCount(@javax.annotation.Nullable final Integer value) {
        this._supersededAppCount = value;
    }
    /**
     * Sets the supersedingAppCount property value. The total number of apps this app directly or indirectly supersedes.
     * @param value Value to set for the supersedingAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupersedingAppCount(@javax.annotation.Nullable final Integer value) {
        this._supersedingAppCount = value;
    }
    /**
     * Sets the uploadState property value. The upload state.
     * @param value Value to set for the uploadState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUploadState(@javax.annotation.Nullable final Integer value) {
        this._uploadState = value;
    }
    /**
     * Sets the userStatuses property value. The list of installation states for this mobile app.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<UserAppInstallStatus> value) {
        this._userStatuses = value;
    }
}
