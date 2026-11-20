package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PoliciesEvaluationResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PoliciesEvaluationResult} and sets the default values.
     */
    public PoliciesEvaluationResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PoliciesEvaluationResult}
     */
    @jakarta.annotation.Nonnull
    public static PoliciesEvaluationResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PoliciesEvaluationResult();
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
     * Gets the appliedPoliciesEffects property value. The appliedPoliciesEffects property
     * @return a {@link EnumSet<PolicyEffects>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<PolicyEffects> getAppliedPoliciesEffects() {
        return this.backingStore.get("appliedPoliciesEffects");
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
     * Gets the details property value. The details property
     * @return a {@link java.util.List<PoliciesEvaluationDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PoliciesEvaluationDetail> getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("appliedPoliciesEffects", (n) -> { this.setAppliedPoliciesEffects(n.getEnumSetValue(PolicyEffects::forValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(PoliciesEvaluationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("httpMethod", (n) -> { this.setHttpMethod(n.getEnumValue(RequestHttpMethod::forValue)); });
        deserializerMap.put("isBlocked", (n) -> { this.setIsBlocked(n.getBooleanValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("normalizedRequestInput", (n) -> { this.setNormalizedRequestInput(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceUri", (n) -> { this.setResourceUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the httpMethod property value. The httpMethod property
     * @return a {@link RequestHttpMethod}
     */
    @jakarta.annotation.Nullable
    public RequestHttpMethod getHttpMethod() {
        return this.backingStore.get("httpMethod");
    }
    /**
     * Gets the isBlocked property value. The isBlocked property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBlocked() {
        return this.backingStore.get("isBlocked");
    }
    /**
     * Gets the message property value. The message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.backingStore.get("message");
    }
    /**
     * Gets the normalizedRequestInput property value. The normalizedRequestInput property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getNormalizedRequestInput() {
        return this.backingStore.get("normalizedRequestInput");
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
     * Gets the resourceUri property value. The resourceUri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceUri() {
        return this.backingStore.get("resourceUri");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("appliedPoliciesEffects", this.getAppliedPoliciesEffects());
        writer.writeEnumValue("httpMethod", this.getHttpMethod());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the appliedPoliciesEffects property value. The appliedPoliciesEffects property
     * @param value Value to set for the appliedPoliciesEffects property.
     */
    public void setAppliedPoliciesEffects(@jakarta.annotation.Nullable final EnumSet<PolicyEffects> value) {
        this.backingStore.set("appliedPoliciesEffects", value);
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
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<PoliciesEvaluationDetail> value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the httpMethod property value. The httpMethod property
     * @param value Value to set for the httpMethod property.
     */
    public void setHttpMethod(@jakarta.annotation.Nullable final RequestHttpMethod value) {
        this.backingStore.set("httpMethod", value);
    }
    /**
     * Sets the isBlocked property value. The isBlocked property
     * @param value Value to set for the isBlocked property.
     */
    public void setIsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBlocked", value);
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("message", value);
    }
    /**
     * Sets the normalizedRequestInput property value. The normalizedRequestInput property
     * @param value Value to set for the normalizedRequestInput property.
     */
    public void setNormalizedRequestInput(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("normalizedRequestInput", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resourceUri property value. The resourceUri property
     * @param value Value to set for the resourceUri property.
     */
    public void setResourceUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceUri", value);
    }
}
