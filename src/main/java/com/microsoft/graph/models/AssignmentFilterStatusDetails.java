package com.microsoft.graph.models;

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
/**
 * Represent status details for device and payload and all associated applied filters.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentFilterStatusDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AssignmentFilterStatusDetails and sets the default values.
     */
    public AssignmentFilterStatusDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignmentFilterStatusDetails
     */
    @jakarta.annotation.Nonnull
    public static AssignmentFilterStatusDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterStatusDetails();
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
     * Gets the deviceProperties property value. Device properties used for filter evaluation during device check-in time.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getDeviceProperties() {
        return this.backingStore.get("deviceProperties");
    }
    /**
     * Gets the evalutionSummaries property value. Evaluation result summaries for each filter associated to device and payload
     * @return a java.util.List<AssignmentFilterEvaluationSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentFilterEvaluationSummary> getEvalutionSummaries() {
        return this.backingStore.get("evalutionSummaries");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("deviceProperties", (n) -> { this.setDeviceProperties(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("evalutionSummaries", (n) -> { this.setEvalutionSummaries(n.getCollectionOfObjectValues(AssignmentFilterEvaluationSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("payloadId", (n) -> { this.setPayloadId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceId property value. Unique identifier for the device object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the payloadId property value. Unique identifier for payload object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadId() {
        return this.backingStore.get("payloadId");
    }
    /**
     * Gets the userId property value. Unique identifier for UserId object. Can be null
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
        writer.writeCollectionOfObjectValues("deviceProperties", this.getDeviceProperties());
        writer.writeCollectionOfObjectValues("evalutionSummaries", this.getEvalutionSummaries());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("payloadId", this.getPayloadId());
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
     * Sets the deviceProperties property value. Device properties used for filter evaluation during device check-in time.
     * @param value Value to set for the deviceProperties property.
     */
    public void setDeviceProperties(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("deviceProperties", value);
    }
    /**
     * Sets the evalutionSummaries property value. Evaluation result summaries for each filter associated to device and payload
     * @param value Value to set for the evalutionSummaries property.
     */
    public void setEvalutionSummaries(@jakarta.annotation.Nullable final java.util.List<AssignmentFilterEvaluationSummary> value) {
        this.backingStore.set("evalutionSummaries", value);
    }
    /**
     * Sets the managedDeviceId property value. Unique identifier for the device object.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the payloadId property value. Unique identifier for payload object.
     * @param value Value to set for the payloadId property.
     */
    public void setPayloadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadId", value);
    }
    /**
     * Sets the userId property value. Unique identifier for UserId object. Can be null
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
