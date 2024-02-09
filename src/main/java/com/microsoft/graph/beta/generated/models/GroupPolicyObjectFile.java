package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * The Group Policy Object file uploaded by admin.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyObjectFile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyObjectFile} and sets the default values.
     */
    public GroupPolicyObjectFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyObjectFile}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyObjectFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyObjectFile();
    }
    /**
     * Gets the content property value. The Group Policy Object file content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdDateTime property value. The date and time at which the GroupPolicy was first uploaded.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupPolicyObjectId", (n) -> { this.setGroupPolicyObjectId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ouDistinguishedName", (n) -> { this.setOuDistinguishedName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getGroupPolicyObjectId() {
        return this.backingStore.get("groupPolicyObjectId");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time at which the GroupPolicyObjectFile was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the ouDistinguishedName property value. The distinguished name of the OU.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOuDistinguishedName() {
        return this.backingStore.get("ouDistinguishedName");
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeUUIDValue("groupPolicyObjectId", this.getGroupPolicyObjectId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("ouDistinguishedName", this.getOuDistinguishedName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the content property value. The Group Policy Object file content.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time at which the GroupPolicy was first uploaded.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @param value Value to set for the groupPolicyObjectId property.
     */
    public void setGroupPolicyObjectId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("groupPolicyObjectId", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time at which the GroupPolicyObjectFile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the ouDistinguishedName property value. The distinguished name of the OU.
     * @param value Value to set for the ouDistinguishedName property.
     */
    public void setOuDistinguishedName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ouDistinguishedName", value);
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
}
