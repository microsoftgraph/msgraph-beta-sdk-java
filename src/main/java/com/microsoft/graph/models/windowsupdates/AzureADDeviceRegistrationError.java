package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureADDeviceRegistrationError extends UpdatableAssetError implements Parsable {
    /**
     * Instantiates a new AzureADDeviceRegistrationError and sets the default values.
     */
    public AzureADDeviceRegistrationError() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.azureADDeviceRegistrationError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureADDeviceRegistrationError
     */
    @jakarta.annotation.Nonnull
    public static AzureADDeviceRegistrationError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADDeviceRegistrationError();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("reason", (n) -> { this.setReason(n.getEnumValue(AzureADDeviceRegistrationErrorReason::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a AzureADDeviceRegistrationErrorReason
     */
    @jakarta.annotation.Nullable
    public AzureADDeviceRegistrationErrorReason getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("reason", this.getReason());
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final AzureADDeviceRegistrationErrorReason value) {
        this.backingStore.set("reason", value);
    }
}
