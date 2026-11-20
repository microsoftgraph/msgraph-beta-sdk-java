package com.microsoft.graph.beta.admin.resourcepolicy.evaluateassignedpolicies;

import com.microsoft.graph.beta.models.RequestHttpMethod;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluateAssignedPoliciesPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EvaluateAssignedPoliciesPostRequestBody} and sets the default values.
     */
    public EvaluateAssignedPoliciesPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
        this.setIncludeNormalizedRequestInput(false);
        this.setIsResultDetailed(false);
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluateAssignedPoliciesPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static EvaluateAssignedPoliciesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateAssignedPoliciesPostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("httpMethod", (n) -> { this.setHttpMethod(n.getEnumValue(RequestHttpMethod::forValue)); });
        deserializerMap.put("includeNormalizedRequestInput", (n) -> { this.setIncludeNormalizedRequestInput(n.getBooleanValue()); });
        deserializerMap.put("isResultDetailed", (n) -> { this.setIsResultDetailed(n.getBooleanValue()); });
        deserializerMap.put("resourceBody", (n) -> { this.setResourceBody(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceUri", (n) -> { this.setResourceUri(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
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
     * Gets the includeNormalizedRequestInput property value. The includeNormalizedRequestInput property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIncludeNormalizedRequestInput() {
        return this.backingStore.get("includeNormalizedRequestInput");
    }
    /**
     * Gets the isResultDetailed property value. The isResultDetailed property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsResultDetailed() {
        return this.backingStore.get("isResultDetailed");
    }
    /**
     * Gets the resourceBody property value. The resourceBody property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getResourceBody() {
        return this.backingStore.get("resourceBody");
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
     * Gets the scope property value. The scope property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("httpMethod", this.getHttpMethod());
        writer.writeBooleanValue("includeNormalizedRequestInput", this.getIncludeNormalizedRequestInput());
        writer.writeBooleanValue("isResultDetailed", this.getIsResultDetailed());
        writer.writeObjectValue("resourceBody", this.getResourceBody());
        writer.writeStringValue("resourceUri", this.getResourceUri());
        writer.writeStringValue("scope", this.getScope());
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
     * Sets the httpMethod property value. The httpMethod property
     * @param value Value to set for the httpMethod property.
     */
    public void setHttpMethod(@jakarta.annotation.Nullable final RequestHttpMethod value) {
        this.backingStore.set("httpMethod", value);
    }
    /**
     * Sets the includeNormalizedRequestInput property value. The includeNormalizedRequestInput property
     * @param value Value to set for the includeNormalizedRequestInput property.
     */
    public void setIncludeNormalizedRequestInput(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("includeNormalizedRequestInput", value);
    }
    /**
     * Sets the isResultDetailed property value. The isResultDetailed property
     * @param value Value to set for the isResultDetailed property.
     */
    public void setIsResultDetailed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isResultDetailed", value);
    }
    /**
     * Sets the resourceBody property value. The resourceBody property
     * @param value Value to set for the resourceBody property.
     */
    public void setResourceBody(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("resourceBody", value);
    }
    /**
     * Sets the resourceUri property value. The resourceUri property
     * @param value Value to set for the resourceUri property.
     */
    public void setResourceUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceUri", value);
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
}
