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
public class PolicyEvaluationErrorDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PolicyEvaluationErrorDetail} and sets the default values.
     */
    public PolicyEvaluationErrorDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyEvaluationErrorDetail}
     */
    @jakarta.annotation.Nonnull
    public static PolicyEvaluationErrorDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyEvaluationErrorDetail();
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
     * Gets the applicabilityEvaluationError property value. The applicabilityEvaluationError property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicabilityEvaluationError() {
        return this.backingStore.get("applicabilityEvaluationError");
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
     * Gets the effectEvaluationError property value. The effectEvaluationError property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEffectEvaluationError() {
        return this.backingStore.get("effectEvaluationError");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("applicabilityEvaluationError", (n) -> { this.setApplicabilityEvaluationError(n.getStringValue()); });
        deserializerMap.put("effectEvaluationError", (n) -> { this.setEffectEvaluationError(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyLoadingError", (n) -> { this.setPolicyLoadingError(n.getStringValue()); });
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
     * Gets the policyLoadingError property value. The policyLoadingError property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyLoadingError() {
        return this.backingStore.get("policyLoadingError");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicabilityEvaluationError", this.getApplicabilityEvaluationError());
        writer.writeStringValue("effectEvaluationError", this.getEffectEvaluationError());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyLoadingError", this.getPolicyLoadingError());
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
     * Sets the applicabilityEvaluationError property value. The applicabilityEvaluationError property
     * @param value Value to set for the applicabilityEvaluationError property.
     */
    public void setApplicabilityEvaluationError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicabilityEvaluationError", value);
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
     * Sets the effectEvaluationError property value. The effectEvaluationError property
     * @param value Value to set for the effectEvaluationError property.
     */
    public void setEffectEvaluationError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("effectEvaluationError", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyLoadingError property value. The policyLoadingError property
     * @param value Value to set for the policyLoadingError property.
     */
    public void setPolicyLoadingError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyLoadingError", value);
    }
}
