package microsoft.graph.users.item.manageddevices.item.activatedeviceesim;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the activateDeviceEsim method. */
public class ActivateDeviceEsimPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The carrierUrl property */
    private String _carrierUrl;
    /**
     * Instantiates a new activateDeviceEsimPostRequestBody and sets the default values.
     * @return a void
     */
    public ActivateDeviceEsimPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activateDeviceEsimPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ActivateDeviceEsimPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateDeviceEsimPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the carrierUrl property value. The carrierUrl property
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
        final ActivateDeviceEsimPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
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
        writer.writeStringValue("carrierUrl", this.getCarrierUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the carrierUrl property value. The carrierUrl property
     * @param value Value to set for the carrierUrl property.
     * @return a void
     */
    public void setCarrierUrl(@javax.annotation.Nullable final String value) {
        this._carrierUrl = value;
    }
}
