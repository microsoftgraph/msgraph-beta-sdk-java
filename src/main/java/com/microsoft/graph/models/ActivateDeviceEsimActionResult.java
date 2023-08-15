package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Activate device eSIM action result
 */
public class ActivateDeviceEsimActionResult extends DeviceActionResult implements Parsable {
    /**
     * Carrier Url to activate the device eSIM
     */
    private String carrierUrl;
    /**
     * Instantiates a new activateDeviceEsimActionResult and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ActivateDeviceEsimActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activateDeviceEsimActionResult
     */
    @jakarta.annotation.Nonnull
    public static ActivateDeviceEsimActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateDeviceEsimActionResult();
    }
    /**
     * Gets the carrierUrl property value. Carrier Url to activate the device eSIM
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCarrierUrl() {
        return this.carrierUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("carrierUrl", (n) -> { this.setCarrierUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("carrierUrl", this.getCarrierUrl());
    }
    /**
     * Sets the carrierUrl property value. Carrier Url to activate the device eSIM
     * @param value Value to set for the carrierUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCarrierUrl(@jakarta.annotation.Nullable final String value) {
        this.carrierUrl = value;
    }
}
