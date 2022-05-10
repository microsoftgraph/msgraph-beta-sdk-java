package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomExtensionClientConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The max duration in milliseconds that Azure AD will wait for a response from the logic app before it shuts down the connection. The valid range is between 200 and 2000 milliseconds. Default duration is 1000. */
    private Integer _timeoutInMilliseconds;
    /**
     * Instantiates a new customExtensionClientConfiguration and sets the default values.
     * @return a void
     */
    public CustomExtensionClientConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customExtensionClientConfiguration
     */
    @javax.annotation.Nonnull
    public static CustomExtensionClientConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionClientConfiguration();
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
        final CustomExtensionClientConfiguration currentObject = this;
        return new HashMap<>(1) {{
            this.put("timeoutInMilliseconds", (n) -> { currentObject.setTimeoutInMilliseconds(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the timeoutInMilliseconds property value. The max duration in milliseconds that Azure AD will wait for a response from the logic app before it shuts down the connection. The valid range is between 200 and 2000 milliseconds. Default duration is 1000.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTimeoutInMilliseconds() {
        return this._timeoutInMilliseconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("timeoutInMilliseconds", this.getTimeoutInMilliseconds());
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
     * Sets the timeoutInMilliseconds property value. The max duration in milliseconds that Azure AD will wait for a response from the logic app before it shuts down the connection. The valid range is between 200 and 2000 milliseconds. Default duration is 1000.
     * @param value Value to set for the timeoutInMilliseconds property.
     * @return a void
     */
    public void setTimeoutInMilliseconds(@javax.annotation.Nullable final Integer value) {
        this._timeoutInMilliseconds = value;
    }
}
