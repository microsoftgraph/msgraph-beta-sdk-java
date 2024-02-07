package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new AwsPolicy and sets the default values.
     */
    public AwsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsPolicy
     */
    @jakarta.annotation.Nonnull
    public static AwsPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsPolicy();
    }
    /**
     * Gets the awsPolicyType property value. The awsPolicyType property
     * @return a AwsPolicyType
     */
    @jakarta.annotation.Nullable
    public AwsPolicyType getAwsPolicyType() {
        return this.backingStore.get("awsPolicyType");
    }
    /**
     * Gets the displayName property value. The display name for the AWS policy. Read-only. Supports $filter and (eq,contains).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. The base64 encoded identifier for the AWS policy as defined by AWS. Read-only. Alternate key. Supports $filter and eq.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("awsPolicyType", (n) -> { this.setAwsPolicyType(n.getEnumValue(AwsPolicyType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("awsPolicyType", this.getAwsPolicyType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
    }
    /**
     * Sets the awsPolicyType property value. The awsPolicyType property
     * @param value Value to set for the awsPolicyType property.
     */
    public void setAwsPolicyType(@jakarta.annotation.Nullable final AwsPolicyType value) {
        this.backingStore.set("awsPolicyType", value);
    }
    /**
     * Sets the displayName property value. The display name for the AWS policy. Read-only. Supports $filter and (eq,contains).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. The base64 encoded identifier for the AWS policy as defined by AWS. Read-only. Alternate key. Supports $filter and eq.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
}
