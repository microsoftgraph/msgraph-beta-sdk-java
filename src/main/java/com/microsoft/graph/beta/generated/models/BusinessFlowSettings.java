package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessFlowSettings extends AccessReviewSettings implements Parsable {
    /**
     * Instantiates a new {@link BusinessFlowSettings} and sets the default values.
     */
    public BusinessFlowSettings() {
        super();
        this.setOdataType("#microsoft.graph.businessFlowSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessFlowSettings}
     */
    @jakarta.annotation.Nonnull
    public static BusinessFlowSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessFlowSettings();
    }
    /**
     * Gets the durationInDays property value. The durationInDays property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.backingStore.get("durationInDays");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
    }
    /**
     * Sets the durationInDays property value. The durationInDays property
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("durationInDays", value);
    }
}
