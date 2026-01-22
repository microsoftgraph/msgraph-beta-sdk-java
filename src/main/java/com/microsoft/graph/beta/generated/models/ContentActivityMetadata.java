package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentActivityMetadata extends ProcessContentMetadataBase implements Parsable {
    /**
     * Instantiates a new {@link ContentActivityMetadata} and sets the default values.
     */
    public ContentActivityMetadata() {
        super();
        this.setOdataType("#microsoft.graph.contentActivityMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentActivityMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ContentActivityMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentActivityMetadata();
    }
    /**
     * Gets the enforcementResultStatus property value. The enforcementResultStatus property
     * @return a {@link EnforcementResultStatus}
     */
    @jakarta.annotation.Nullable
    public EnforcementResultStatus getEnforcementResultStatus() {
        return this.backingStore.get("enforcementResultStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enforcementResultStatus", (n) -> { this.setEnforcementResultStatus(n.getEnumValue(EnforcementResultStatus::forValue)); });
        deserializerMap.put("recordType", (n) -> { this.setRecordType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recordType property value. The recordType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecordType() {
        return this.backingStore.get("recordType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("enforcementResultStatus", this.getEnforcementResultStatus());
        writer.writeStringValue("recordType", this.getRecordType());
    }
    /**
     * Sets the enforcementResultStatus property value. The enforcementResultStatus property
     * @param value Value to set for the enforcementResultStatus property.
     */
    public void setEnforcementResultStatus(@jakarta.annotation.Nullable final EnforcementResultStatus value) {
        this.backingStore.set("enforcementResultStatus", value);
    }
    /**
     * Sets the recordType property value. The recordType property
     * @param value Value to set for the recordType property.
     */
    public void setRecordType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recordType", value);
    }
}
