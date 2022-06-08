package microsoft.graph.devicemanagement.comanageddevices.item.createdevicelogcollectionrequest;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceLogCollectionRequest;
/** Provides operations to call the createDeviceLogCollectionRequest method. */
public class CreateDeviceLogCollectionRequestPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The templateType property */
    private DeviceLogCollectionRequest _templateType;
    /**
     * Instantiates a new createDeviceLogCollectionRequestPostRequestBody and sets the default values.
     * @return a void
     */
    public CreateDeviceLogCollectionRequestPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createDeviceLogCollectionRequestPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateDeviceLogCollectionRequestPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateDeviceLogCollectionRequestPostRequestBody();
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
        final CreateDeviceLogCollectionRequestPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("templateType", (n) -> { currentObject.setTemplateType(n.getObjectValue(DeviceLogCollectionRequest::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the templateType property value. The templateType property
     * @return a deviceLogCollectionRequest
     */
    @javax.annotation.Nullable
    public DeviceLogCollectionRequest getTemplateType() {
        return this._templateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("templateType", this.getTemplateType());
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
     * Sets the templateType property value. The templateType property
     * @param value Value to set for the templateType property.
     * @return a void
     */
    public void setTemplateType(@javax.annotation.Nullable final DeviceLogCollectionRequest value) {
        this._templateType = value;
    }
}
