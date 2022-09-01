package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureADDeviceRegistrationError extends UpdatableAssetError implements Parsable {
    /** The reason property */
    private AzureADDeviceRegistrationErrorReason _reason;
    /**
     * Instantiates a new AzureADDeviceRegistrationError and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static AzureADDeviceRegistrationError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADDeviceRegistrationError();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AzureADDeviceRegistrationError currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("reason", (n) -> { currentObject.setReason(n.getEnumValue(AzureADDeviceRegistrationErrorReason.class)); });
        }};
    }
    /**
     * Gets the reason property value. The reason property
     * @return a azureADDeviceRegistrationErrorReason
     */
    @javax.annotation.Nullable
    public AzureADDeviceRegistrationErrorReason getReason() {
        return this._reason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("reason", this.getReason());
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final AzureADDeviceRegistrationErrorReason value) {
        this._reason = value;
    }
}
