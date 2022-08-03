package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ActivateDeviceEsimActionResult extends DeviceActionResult implements Parsable {
    /** Carrier Url to activate the device eSIM */
    private String _carrierUrl;
    /**
     * Instantiates a new ActivateDeviceEsimActionResult and sets the default values.
     * @return a void
     */
    public ActivateDeviceEsimActionResult() {
        super();
        this.setOdataType("#microsoft.graph.activateDeviceEsimActionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActivateDeviceEsimActionResult
     */
    @javax.annotation.Nonnull
    public static ActivateDeviceEsimActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateDeviceEsimActionResult();
    }
    /**
     * Gets the carrierUrl property value. Carrier Url to activate the device eSIM
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCarrierUrl() {
        return this._carrierUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ActivateDeviceEsimActionResult currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("carrierUrl", (n) -> { currentObject.setCarrierUrl(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("carrierUrl", this.getCarrierUrl());
    }
    /**
     * Sets the carrierUrl property value. Carrier Url to activate the device eSIM
     * @param value Value to set for the carrierUrl property.
     * @return a void
     */
    public void setCarrierUrl(@javax.annotation.Nullable final String value) {
        this._carrierUrl = value;
    }
}
