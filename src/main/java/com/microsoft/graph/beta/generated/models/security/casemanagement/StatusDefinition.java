package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatusDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link StatusDefinition} and sets the default values.
     */
    public StatusDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StatusDefinition}
     */
    @jakarta.annotation.Nonnull
    public static StatusDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StatusDefinition();
    }
    /**
     * Gets the customStatuses property value. The custom statuses returned inline within this top-level status. These aren&apos;t separately addressable.
     * @return a {@link java.util.List<CustomStatusDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomStatusDefinition> getCustomStatuses() {
        return this.backingStore.get("customStatuses");
    }
    /**
     * Gets the displayName property value. The human-readable label of the status. Supports $filter and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customStatuses", (n) -> { this.setCustomStatuses(n.getCollectionOfObjectValues(CustomStatusDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sortOrder property value. The display order of the status relative to other statuses of the same case type. Supports $filter and $orderby.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.backingStore.get("sortOrder");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customStatuses", this.getCustomStatuses());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("sortOrder", this.getSortOrder());
    }
    /**
     * Sets the customStatuses property value. The custom statuses returned inline within this top-level status. These aren&apos;t separately addressable.
     * @param value Value to set for the customStatuses property.
     */
    public void setCustomStatuses(@jakarta.annotation.Nullable final java.util.List<CustomStatusDefinition> value) {
        this.backingStore.set("customStatuses", value);
    }
    /**
     * Sets the displayName property value. The human-readable label of the status. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the sortOrder property value. The display order of the status relative to other statuses of the same case type. Supports $filter and $orderby.
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sortOrder", value);
    }
}
