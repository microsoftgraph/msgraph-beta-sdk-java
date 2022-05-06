package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcStatusDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Any additional information about the Cloud PC status.  */
    private java.util.List<KeyValuePair> _additionalInformation;
    /** The code associated with the Cloud PC status.  */
    private String _code;
    /** The status message.  */
    private String _message;
    /**
     * Instantiates a new cloudPcStatusDetails and sets the default values.
     * @return a void
     */
    public CloudPcStatusDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcStatusDetails
     */
    @javax.annotation.Nonnull
    public static CloudPcStatusDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcStatusDetails();
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
     * Gets the additionalInformation property value. Any additional information about the Cloud PC status.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getAdditionalInformation() {
        return this._additionalInformation;
    }
    /**
     * Gets the code property value. The code associated with the Cloud PC status.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcStatusDetails currentObject = this;
        return new HashMap<>(3) {{
            this.put("additionalInformation", (n) -> { currentObject.setAdditionalInformation(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
        }};
    }
    /**
     * Gets the message property value. The status message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additionalInformation", this.getAdditionalInformation());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("message", this.getMessage());
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
     * Sets the additionalInformation property value. Any additional information about the Cloud PC status.
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    public void setAdditionalInformation(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._additionalInformation = value;
    }
    /**
     * Sets the code property value. The code associated with the Cloud PC status.
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the message property value. The status message.
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
}
