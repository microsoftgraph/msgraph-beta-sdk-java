package com.microsoft.graph.beta.models;

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
public class CustomExtensionHandlerInstance implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CustomExtensionHandlerInstance} and sets the default values.
     */
    public CustomExtensionHandlerInstance() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomExtensionHandlerInstance}
     */
    @jakarta.annotation.Nonnull
    public static CustomExtensionHandlerInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionHandlerInstance();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the customExtensionId property value. Identifier of the customAccessPackageWorkflowExtension triggered at this instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomExtensionId() {
        return this.backingStore.get("customExtensionId");
    }
    /**
     * Gets the externalCorrelationId property value. The unique run ID for the logic app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalCorrelationId() {
        return this.backingStore.get("externalCorrelationId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("customExtensionId", (n) -> { this.setCustomExtensionId(n.getStringValue()); });
        deserializerMap.put("externalCorrelationId", (n) -> { this.setExternalCorrelationId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(AccessPackageCustomExtensionStage::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AccessPackageCustomExtensionHandlerStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the stage property value. Indicates the stage of the request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @return a {@link AccessPackageCustomExtensionStage}
     */
    @jakarta.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this.backingStore.get("stage");
    }
    /**
     * Gets the status property value. Status of the request to run the access package custom extension workflow that is associated with the logic app. The possible values are: requestSent, requestReceived, unknownFutureValue.
     * @return a {@link AccessPackageCustomExtensionHandlerStatus}
     */
    @jakarta.annotation.Nullable
    public AccessPackageCustomExtensionHandlerStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customExtensionId", this.getCustomExtensionId());
        writer.writeStringValue("externalCorrelationId", this.getExternalCorrelationId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("stage", this.getStage());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the customExtensionId property value. Identifier of the customAccessPackageWorkflowExtension triggered at this instance.
     * @param value Value to set for the customExtensionId property.
     */
    public void setCustomExtensionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customExtensionId", value);
    }
    /**
     * Sets the externalCorrelationId property value. The unique run ID for the logic app.
     * @param value Value to set for the externalCorrelationId property.
     */
    public void setExternalCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalCorrelationId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the stage property value. Indicates the stage of the request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this.backingStore.set("stage", value);
    }
    /**
     * Sets the status property value. Status of the request to run the access package custom extension workflow that is associated with the logic app. The possible values are: requestSent, requestReceived, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AccessPackageCustomExtensionHandlerStatus value) {
        this.backingStore.set("status", value);
    }
}
