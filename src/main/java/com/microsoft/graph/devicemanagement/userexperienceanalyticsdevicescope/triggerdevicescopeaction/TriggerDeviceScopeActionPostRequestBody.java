package com.microsoft.graph.devicemanagement.userexperienceanalyticsdevicescope.triggerdevicescopeaction;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TriggerDeviceScopeActionPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     */
    private String actionName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceScopeId property
     */
    private String deviceScopeId;
    /**
     * Instantiates a new triggerDeviceScopeActionPostRequestBody and sets the default values.
     */
    public TriggerDeviceScopeActionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a triggerDeviceScopeActionPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TriggerDeviceScopeActionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerDeviceScopeActionPostRequestBody();
    }
    /**
     * Gets the actionName property value. Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActionName() {
        return this.actionName;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceScopeId property value. The deviceScopeId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceScopeId() {
        return this.deviceScopeId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("deviceScopeId", (n) -> { this.setDeviceScopeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeStringValue("deviceScopeId", this.getDeviceScopeId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @param value Value to set for the actionName property.
     */
    public void setActionName(@jakarta.annotation.Nullable final String value) {
        this.actionName = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceScopeId property value. The deviceScopeId property
     * @param value Value to set for the deviceScopeId property.
     */
    public void setDeviceScopeId(@jakarta.annotation.Nullable final String value) {
        this.deviceScopeId = value;
    }
}
