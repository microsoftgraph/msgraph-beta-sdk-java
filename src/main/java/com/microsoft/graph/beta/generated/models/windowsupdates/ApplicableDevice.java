package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicableDevice extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApplicableDevice} and sets the default values.
     */
    public ApplicableDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicableDevice}
     */
    @jakarta.annotation.Nonnull
    public static ApplicableDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicableDevice();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRecommended", (n) -> { this.setIsRecommended(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRecommended property value. Indicates whether the catalog entry is recommended for the device. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecommended() {
        return this.backingStore.get("isRecommended");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the isRecommended property value. Indicates whether the catalog entry is recommended for the device. Read-only.
     * @param value Value to set for the isRecommended property.
     */
    public void setIsRecommended(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRecommended", value);
    }
}
