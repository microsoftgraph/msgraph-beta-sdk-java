package com.microsoft.graph.beta.models.ediscovery;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.graph.beta.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LegalHold extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LegalHold} and sets the default values.
     */
    public LegalHold() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LegalHold}
     */
    @jakarta.annotation.Nonnull
    public static LegalHold createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LegalHold();
    }
    /**
     * Gets the contentQuery property value. KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentQuery() {
        return this.backingStore.get("contentQuery");
    }
    /**
     * Gets the createdBy property value. The user who created the legal hold.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time the legal hold was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The legal hold description.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the legal hold.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the errors property value. Lists any errors that happened while placing the hold.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getErrors() {
        return this.backingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentQuery", (n) -> { this.setContentQuery(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("siteSources", (n) -> { this.setSiteSources(n.getCollectionOfObjectValues(SiteSource::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LegalHoldStatus::forValue)); });
        deserializerMap.put("unifiedGroupSources", (n) -> { this.setUnifiedGroupSources(n.getCollectionOfObjectValues(UnifiedGroupSource::createFromDiscriminatorValue)); });
        deserializerMap.put("userSources", (n) -> { this.setUserSources(n.getCollectionOfObjectValues(UserSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the hold is enabled and actively holding content.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the lastModifiedBy property value. the user who last modified the legal hold.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the legal hold was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the siteSources property value. Data source entity for SharePoint sites associated with the legal hold.
     * @return a {@link java.util.List<SiteSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteSource> getSiteSources() {
        return this.backingStore.get("siteSources");
    }
    /**
     * Gets the status property value. The status of the legal hold. The possible values are: Pending, Error, Success, UnknownFutureValue.
     * @return a {@link LegalHoldStatus}
     */
    @jakarta.annotation.Nullable
    public LegalHoldStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the unifiedGroupSources property value. The unifiedGroupSources property
     * @return a {@link java.util.List<UnifiedGroupSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedGroupSource> getUnifiedGroupSources() {
        return this.backingStore.get("unifiedGroupSources");
    }
    /**
     * Gets the userSources property value. Data source entity for a the legal hold. This is the container for a mailbox and OneDrive for Business site.
     * @return a {@link java.util.List<UserSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserSource> getUserSources() {
        return this.backingStore.get("userSources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("errors", this.getErrors());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("siteSources", this.getSiteSources());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("unifiedGroupSources", this.getUnifiedGroupSources());
        writer.writeCollectionOfObjectValues("userSources", this.getUserSources());
    }
    /**
     * Sets the contentQuery property value. KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank.
     * @param value Value to set for the contentQuery property.
     */
    public void setContentQuery(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentQuery", value);
    }
    /**
     * Sets the createdBy property value. The user who created the legal hold.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the legal hold was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The legal hold description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the legal hold.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the errors property value. Lists any errors that happened while placing the hold.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("errors", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the hold is enabled and actively holding content.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the lastModifiedBy property value. the user who last modified the legal hold.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the legal hold was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the siteSources property value. Data source entity for SharePoint sites associated with the legal hold.
     * @param value Value to set for the siteSources property.
     */
    public void setSiteSources(@jakarta.annotation.Nullable final java.util.List<SiteSource> value) {
        this.backingStore.set("siteSources", value);
    }
    /**
     * Sets the status property value. The status of the legal hold. The possible values are: Pending, Error, Success, UnknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LegalHoldStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the unifiedGroupSources property value. The unifiedGroupSources property
     * @param value Value to set for the unifiedGroupSources property.
     */
    public void setUnifiedGroupSources(@jakarta.annotation.Nullable final java.util.List<UnifiedGroupSource> value) {
        this.backingStore.set("unifiedGroupSources", value);
    }
    /**
     * Sets the userSources property value. Data source entity for a the legal hold. This is the container for a mailbox and OneDrive for Business site.
     * @param value Value to set for the userSources property.
     */
    public void setUserSources(@jakarta.annotation.Nullable final java.util.List<UserSource> value) {
        this.backingStore.set("userSources", value);
    }
}
