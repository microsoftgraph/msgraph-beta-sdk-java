package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedDevice extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedDevice} and sets the default values.
     */
    public RelatedDevice() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedDevice}
     */
    @jakarta.annotation.Nonnull
    public static RelatedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedDevice();
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
}
