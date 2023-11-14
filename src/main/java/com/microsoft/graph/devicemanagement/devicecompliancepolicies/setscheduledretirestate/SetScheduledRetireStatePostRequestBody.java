package com.microsoft.graph.devicemanagement.devicecompliancepolicies.setscheduledretirestate;

import com.microsoft.graph.models.ScheduledRetireState;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetScheduledRetireStatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The managedDeviceIds property
     */
    private java.util.List<String> managedDeviceIds;
    /**
     * The scopedToAllDevices property
     */
    private Boolean scopedToAllDevices;
    /**
     * Cancel or confirm scheduled retire 
     */
    private ScheduledRetireState state;
    /**
     * Instantiates a new SetScheduledRetireStatePostRequestBody and sets the default values.
     */
    public SetScheduledRetireStatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SetScheduledRetireStatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SetScheduledRetireStatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetScheduledRetireStatePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("managedDeviceIds", (n) -> { this.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("scopedToAllDevices", (n) -> { this.setScopedToAllDevices(n.getBooleanValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ScheduledRetireState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceIds property value. The managedDeviceIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getManagedDeviceIds() {
        return this.managedDeviceIds;
    }
    /**
     * Gets the scopedToAllDevices property value. The scopedToAllDevices property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScopedToAllDevices() {
        return this.scopedToAllDevices;
    }
    /**
     * Gets the state property value. Cancel or confirm scheduled retire 
     * @return a ScheduledRetireState
     */
    @jakarta.annotation.Nullable
    public ScheduledRetireState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeBooleanValue("scopedToAllDevices", this.getScopedToAllDevices());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     */
    public void setManagedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.managedDeviceIds = value;
    }
    /**
     * Sets the scopedToAllDevices property value. The scopedToAllDevices property
     * @param value Value to set for the scopedToAllDevices property.
     */
    public void setScopedToAllDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.scopedToAllDevices = value;
    }
    /**
     * Sets the state property value. Cancel or confirm scheduled retire 
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ScheduledRetireState value) {
        this.state = value;
    }
}
