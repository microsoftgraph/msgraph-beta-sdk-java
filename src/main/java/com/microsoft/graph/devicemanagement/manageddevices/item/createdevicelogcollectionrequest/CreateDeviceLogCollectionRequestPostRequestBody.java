package com.microsoft.graph.devicemanagement.manageddevices.item.createdevicelogcollectionrequest;

import com.microsoft.graph.models.DeviceLogCollectionRequest;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CreateDeviceLogCollectionRequestPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The templateType property
     */
    private DeviceLogCollectionRequest templateType;
    /**
     * Instantiates a new createDeviceLogCollectionRequestPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("templateType", (n) -> { this.setTemplateType(n.getObjectValue(DeviceLogCollectionRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the templateType property value. The templateType property
     * @return a deviceLogCollectionRequest
     */
    @javax.annotation.Nullable
    public DeviceLogCollectionRequest getTemplateType() {
        return this.templateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the templateType property value. The templateType property
     * @param value Value to set for the templateType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateType(@javax.annotation.Nullable final DeviceLogCollectionRequest value) {
        this.templateType = value;
    }
}
