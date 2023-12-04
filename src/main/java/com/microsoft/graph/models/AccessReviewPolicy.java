package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new AccessReviewPolicy and sets the default values.
     */
    public AccessReviewPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewPolicy
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewPolicy();
    }
    /**
     * Gets the description property value. Description for this policy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for this policy. Read-only.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isGroupOwnerManagementEnabled", (n) -> { this.setIsGroupOwnerManagementEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isGroupOwnerManagementEnabled property value. If true, group owners can create and manage access reviews on groups they own.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsGroupOwnerManagementEnabled() {
        return this.backingStore.get("isGroupOwnerManagementEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isGroupOwnerManagementEnabled", this.getIsGroupOwnerManagementEnabled());
    }
    /**
     * Sets the description property value. Description for this policy. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for this policy. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isGroupOwnerManagementEnabled property value. If true, group owners can create and manage access reviews on groups they own.
     * @param value Value to set for the isGroupOwnerManagementEnabled property.
     */
    public void setIsGroupOwnerManagementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isGroupOwnerManagementEnabled", value);
    }
}
