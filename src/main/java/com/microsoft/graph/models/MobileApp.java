package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An abstract class containing the base properties for Intune mobile apps. Note: Listing mobile apps with `$expand=assignments` has been deprecated. Instead get the list of apps without the `$expand` query on `assignments`. Then, perform the expansion on individual applications.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileApp extends Entity implements Parsable {
    /**
     * Instantiates a new MobileApp and sets the default values.
     */
    public MobileApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileApp
     */
    @jakarta.annotation.Nonnull
    public static MobileApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
                case "#microsoft.graph.macOSMicrosoftDefenderApp": return new MacOSMicrosoftDefenderApp();
                case "#microsoft.graph.macOSMicrosoftEdgeApp": return new MacOSMicrosoftEdgeApp();
                case "#microsoft.graph.macOSOfficeSuiteApp": return new MacOSOfficeSuiteApp();
                case "#microsoft.graph.macOSPkgApp": return new MacOSPkgApp();
                case "#microsoft.graph.macOsVppApp": return new MacOsVppApp();
                case "#microsoft.graph.macOSWebClip": return new MacOSWebClip();
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
     * @return a java.util.List<MobileAppAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the categories property value. The list of categories for this app.
     * @return a java.util.List<MobileAppCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppCategory> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the createdDateTime property value. The date and time the app was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the dependentAppCount property value. The total number of dependencies the child app has.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDependentAppCount() {
        return this.backingStore.get("dependentAppCount");
    }
    /**
     * Gets the description property value. The description of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the developer property value. The developer of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeveloper() {
        return this.backingStore.get("developer");
    }
    /**
     * Gets the displayName property value. The admin provided or imported title of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(MobileAppAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(MobileAppCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dependentAppCount", (n) -> { this.setDependentAppCount(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("developer", (n) -> { this.setDeveloper(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationUrl", (n) -> { this.setInformationUrl(n.getStringValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("isFeatured", (n) -> { this.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("largeIcon", (n) -> { this.setLargeIcon(n.getObjectValue(MimeContent::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("privacyInformationUrl", (n) -> { this.setPrivacyInformationUrl(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("publishingState", (n) -> { this.setPublishingState(n.getEnumValue(MobileAppPublishingState.class)); });
        deserializerMap.put("relationships", (n) -> { this.setRelationships(n.getCollectionOfObjectValues(MobileAppRelationship::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supersededAppCount", (n) -> { this.setSupersededAppCount(n.getIntegerValue()); });
        deserializerMap.put("supersedingAppCount", (n) -> { this.setSupersedingAppCount(n.getIntegerValue()); });
        deserializerMap.put("uploadState", (n) -> { this.setUploadState(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the informationUrl property value. The more information Url.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInformationUrl() {
        return this.backingStore.get("informationUrl");
    }
    /**
     * Gets the isAssigned property value. The value indicating whether the app is assigned to at least one group.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.backingStore.get("isAssigned");
    }
    /**
     * Gets the isFeatured property value. The value indicating whether the app is marked as featured by the admin.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFeatured() {
        return this.backingStore.get("isFeatured");
    }
    /**
     * Gets the largeIcon property value. The large icon, to be displayed in the app details and used for upload of the icon.
     * @return a MimeContent
     */
    @jakarta.annotation.Nullable
    public MimeContent getLargeIcon() {
        return this.backingStore.get("largeIcon");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the app was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the notes property value. Notes for the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the owner property value. The owner of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the privacyInformationUrl property value. The privacy statement Url.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivacyInformationUrl() {
        return this.backingStore.get("privacyInformationUrl");
    }
    /**
     * Gets the publisher property value. The publisher of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the publishingState property value. Indicates the publishing state of an app.
     * @return a MobileAppPublishingState
     */
    @jakarta.annotation.Nullable
    public MobileAppPublishingState getPublishingState() {
        return this.backingStore.get("publishingState");
    }
    /**
     * Gets the relationships property value. List of relationships for this mobile app.
     * @return a java.util.List<MobileAppRelationship>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppRelationship> getRelationships() {
        return this.backingStore.get("relationships");
    }
    /**
     * Gets the roleScopeTagIds property value. List of scope tag ids for this mobile app.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the supersededAppCount property value. The total number of apps this app is directly or indirectly superseded by.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSupersededAppCount() {
        return this.backingStore.get("supersededAppCount");
    }
    /**
     * Gets the supersedingAppCount property value. The total number of apps this app directly or indirectly supersedes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSupersedingAppCount() {
        return this.backingStore.get("supersedingAppCount");
    }
    /**
     * Gets the uploadState property value. The upload state.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUploadState() {
        return this.backingStore.get("uploadState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("dependentAppCount", this.getDependentAppCount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("developer", this.getDeveloper());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("informationUrl", this.getInformationUrl());
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
    }
    /**
     * Sets the assignments property value. The list of group assignments for this mobile app.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<MobileAppAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the categories property value. The list of categories for this app.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<MobileAppCategory> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the app was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the dependentAppCount property value. The total number of dependencies the child app has.
     * @param value Value to set for the dependentAppCount property.
     */
    public void setDependentAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dependentAppCount", value);
    }
    /**
     * Sets the description property value. The description of the app.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the developer property value. The developer of the app.
     * @param value Value to set for the developer property.
     */
    public void setDeveloper(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("developer", value);
    }
    /**
     * Sets the displayName property value. The admin provided or imported title of the app.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the informationUrl property value. The more information Url.
     * @param value Value to set for the informationUrl property.
     */
    public void setInformationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("informationUrl", value);
    }
    /**
     * Sets the isAssigned property value. The value indicating whether the app is assigned to at least one group.
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssigned", value);
    }
    /**
     * Sets the isFeatured property value. The value indicating whether the app is marked as featured by the admin.
     * @param value Value to set for the isFeatured property.
     */
    public void setIsFeatured(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFeatured", value);
    }
    /**
     * Sets the largeIcon property value. The large icon, to be displayed in the app details and used for upload of the icon.
     * @param value Value to set for the largeIcon property.
     */
    public void setLargeIcon(@jakarta.annotation.Nullable final MimeContent value) {
        this.backingStore.set("largeIcon", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the app was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the notes property value. Notes for the app.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the owner property value. The owner of the app.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the privacyInformationUrl property value. The privacy statement Url.
     * @param value Value to set for the privacyInformationUrl property.
     */
    public void setPrivacyInformationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privacyInformationUrl", value);
    }
    /**
     * Sets the publisher property value. The publisher of the app.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the publishingState property value. Indicates the publishing state of an app.
     * @param value Value to set for the publishingState property.
     */
    public void setPublishingState(@jakarta.annotation.Nullable final MobileAppPublishingState value) {
        this.backingStore.set("publishingState", value);
    }
    /**
     * Sets the relationships property value. List of relationships for this mobile app.
     * @param value Value to set for the relationships property.
     */
    public void setRelationships(@jakarta.annotation.Nullable final java.util.List<MobileAppRelationship> value) {
        this.backingStore.set("relationships", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of scope tag ids for this mobile app.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the supersededAppCount property value. The total number of apps this app is directly or indirectly superseded by.
     * @param value Value to set for the supersededAppCount property.
     */
    public void setSupersededAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("supersededAppCount", value);
    }
    /**
     * Sets the supersedingAppCount property value. The total number of apps this app directly or indirectly supersedes.
     * @param value Value to set for the supersedingAppCount property.
     */
    public void setSupersedingAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("supersedingAppCount", value);
    }
    /**
     * Sets the uploadState property value. The upload state.
     * @param value Value to set for the uploadState property.
     */
    public void setUploadState(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("uploadState", value);
    }
}
