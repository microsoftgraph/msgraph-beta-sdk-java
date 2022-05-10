package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StatusBase implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Possible values are: success, warning, failure, skipped, unknownFutureValue. */
    private ProvisioningResult _status;
    /**
     * Instantiates a new statusBase and sets the default values.
     * @return a void
     */
    public StatusBase() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a statusBase
     */
    @javax.annotation.Nonnull
    public static StatusBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StatusBase();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final StatusBase currentObject = this;
        return new HashMap<>(1) {{
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ProvisioningResult.class)); });
        }};
    }
    /**
     * Gets the status property value. Possible values are: success, warning, failure, skipped, unknownFutureValue.
     * @return a provisioningResult
     */
    @javax.annotation.Nullable
    public ProvisioningResult getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the status property value. Possible values are: success, warning, failure, skipped, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ProvisioningResult value) {
        this._status = value;
    }
}
