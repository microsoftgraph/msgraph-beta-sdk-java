package com.microsoft.graph.beta.devicemanagement.getassignmentfiltersstatusdetails;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAssignmentFiltersStatusDetailsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new GetAssignmentFiltersStatusDetailsPostRequestBody and sets the default values.
     */
    public GetAssignmentFiltersStatusDetailsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GetAssignmentFiltersStatusDetailsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetAssignmentFiltersStatusDetailsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAssignmentFiltersStatusDetailsPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the assignmentFilterIds property value. The assignmentFilterIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssignmentFilterIds() {
        return this.backingStore.get("assignmentFilterIds");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("assignmentFilterIds", (n) -> { this.setAssignmentFilterIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("payloadId", (n) -> { this.setPayloadId(n.getStringValue()); });
        deserializerMap.put("skip", (n) -> { this.setSkip(n.getIntegerValue()); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getIntegerValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceId property value. The managedDeviceId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the payloadId property value. The payloadId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadId() {
        return this.backingStore.get("payloadId");
    }
    /**
     * Gets the skip property value. The skip property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSkip() {
        return this.backingStore.get("skip");
    }
    /**
     * Gets the top property value. The top property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTop() {
        return this.backingStore.get("top");
    }
    /**
     * Gets the userId property value. The userId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("assignmentFilterIds", this.getAssignmentFilterIds());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeIntegerValue("skip", this.getSkip());
        writer.writeIntegerValue("top", this.getTop());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the assignmentFilterIds property value. The assignmentFilterIds property
     * @param value Value to set for the assignmentFilterIds property.
     */
    public void setAssignmentFilterIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("assignmentFilterIds", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the managedDeviceId property value. The managedDeviceId property
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the payloadId property value. The payloadId property
     * @param value Value to set for the payloadId property.
     */
    public void setPayloadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadId", value);
    }
    /**
     * Sets the skip property value. The skip property
     * @param value Value to set for the skip property.
     */
    public void setSkip(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("skip", value);
    }
    /**
     * Sets the top property value. The top property
     * @param value Value to set for the top property.
     */
    public void setTop(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("top", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
