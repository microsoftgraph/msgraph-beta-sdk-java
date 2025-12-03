package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointIdentityMapping extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointIdentityMapping} and sets the default values.
     */
    public SharePointIdentityMapping() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointIdentityMapping}
     */
    @jakarta.annotation.Nonnull
    public static SharePointIdentityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.sharePointGroupIdentityMapping": return new SharePointGroupIdentityMapping();
                case "#microsoft.graph.sharePointUserIdentityMapping": return new SharePointUserIdentityMapping();
            }
        }
        return new SharePointIdentityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sourceOrganizationId", (n) -> { this.setSourceOrganizationId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sourceOrganizationId property value. The unique identifier of the source organization in the migration.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getSourceOrganizationId() {
        return this.backingStore.get("sourceOrganizationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("sourceOrganizationId", this.getSourceOrganizationId());
    }
    /**
     * Sets the sourceOrganizationId property value. The unique identifier of the source organization in the migration.
     * @param value Value to set for the sourceOrganizationId property.
     */
    public void setSourceOrganizationId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("sourceOrganizationId", value);
    }
}
