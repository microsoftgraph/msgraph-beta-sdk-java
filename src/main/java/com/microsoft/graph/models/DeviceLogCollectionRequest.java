package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Log Collection request entity.  */
public class DeviceLogCollectionRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The unique identifier  */
    private String _id;
    /** The template type that is sent with the collection request. Possible values are: predefined.  */
    private DeviceLogCollectionTemplateType _templateType;
    /**
     * Instantiates a new deviceLogCollectionRequest and sets the default values.
     * @return a void
     */
    public DeviceLogCollectionRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceLogCollectionRequest
     */
    @javax.annotation.Nonnull
    public static DeviceLogCollectionRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLogCollectionRequest();
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
        final DeviceLogCollectionRequest currentObject = this;
        return new HashMap<>(2) {{
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("templateType", (n) -> { currentObject.setTemplateType(n.getEnumValue(DeviceLogCollectionTemplateType.class)); });
        }};
    }
    /**
     * Gets the id property value. The unique identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the templateType property value. The template type that is sent with the collection request. Possible values are: predefined.
     * @return a deviceLogCollectionTemplateType
     */
    @javax.annotation.Nullable
    public DeviceLogCollectionTemplateType getTemplateType() {
        return this._templateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("templateType", this.getTemplateType());
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
     * Sets the id property value. The unique identifier
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the templateType property value. The template type that is sent with the collection request. Possible values are: predefined.
     * @param value Value to set for the templateType property.
     * @return a void
     */
    public void setTemplateType(@javax.annotation.Nullable final DeviceLogCollectionTemplateType value) {
        this._templateType = value;
    }
}
