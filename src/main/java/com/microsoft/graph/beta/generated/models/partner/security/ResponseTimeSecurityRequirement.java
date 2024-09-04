package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResponseTimeSecurityRequirement extends SecurityRequirement implements Parsable {
    /**
     * Instantiates a new {@link ResponseTimeSecurityRequirement} and sets the default values.
     */
    public ResponseTimeSecurityRequirement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResponseTimeSecurityRequirement}
     */
    @jakarta.annotation.Nonnull
    public static ResponseTimeSecurityRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResponseTimeSecurityRequirement();
    }
    /**
     * Gets the averageResponseTimeInHours property value. The average response time for alerts from the past 30 days.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getAverageResponseTimeInHours() {
        return this.backingStore.get("averageResponseTimeInHours");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageResponseTimeInHours", (n) -> { this.setAverageResponseTimeInHours(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeFloatValue("averageResponseTimeInHours", this.getAverageResponseTimeInHours());
    }
    /**
     * Sets the averageResponseTimeInHours property value. The average response time for alerts from the past 30 days.
     * @param value Value to set for the averageResponseTimeInHours property.
     */
    public void setAverageResponseTimeInHours(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("averageResponseTimeInHours", value);
    }
}
