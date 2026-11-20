package com.microsoft.graph.beta.admin.resourcepolicy.evaluatepolicy;

import com.microsoft.graph.beta.models.EnforcementMode;
import com.microsoft.graph.beta.models.FetchResponse;
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
public class EvaluatePolicyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EvaluatePolicyPostRequestBody} and sets the default values.
     */
    public EvaluatePolicyPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
        this.setIncludeNormalizedRequestInput(false);
        this.setIsResultDetailed(false);
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluatePolicyPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static EvaluatePolicyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePolicyPostRequestBody();
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
     * Gets the enforcementMode property value. The enforcementMode property
     * @return a {@link EnforcementMode}
     */
    @jakarta.annotation.Nullable
    public EnforcementMode getEnforcementMode() {
        return this.backingStore.get("enforcementMode");
    }
    /**
     * Gets the fetchResponses property value. The fetchResponses property
     * @return a {@link java.util.List<FetchResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FetchResponse> getFetchResponses() {
        return this.backingStore.get("fetchResponses");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("enforcementMode", (n) -> { this.setEnforcementMode(n.getEnumValue(EnforcementMode::forValue)); });
        deserializerMap.put("fetchResponses", (n) -> { this.setFetchResponses(n.getCollectionOfObjectValues(FetchResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("httpMethod", (n) -> { this.setHttpMethod(n.getEnumValue(RequestHttpMethod::forValue)); });
        deserializerMap.put("includeNormalizedRequestInput", (n) -> { this.setIncludeNormalizedRequestInput(n.getBooleanValue()); });
        deserializerMap.put("isResultDetailed", (n) -> { this.setIsResultDetailed(n.getBooleanValue()); });
        deserializerMap.put("params", (n) -> { this.setParams(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getStringValue()); });
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
     * Gets the params property value. The params property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getParams() {
        return this.backingStore.get("params");
    }
    /**
     * Gets the policy property value. The policy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicy() {
        return this.backingStore.get("policy");
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
        writer.writeEnumValue("enforcementMode", this.getEnforcementMode());
        writer.writeCollectionOfObjectValues("fetchResponses", this.getFetchResponses());
        writer.writeEnumValue("httpMethod", this.getHttpMethod());
        writer.writeBooleanValue("includeNormalizedRequestInput", this.getIncludeNormalizedRequestInput());
        writer.writeBooleanValue("isResultDetailed", this.getIsResultDetailed());
        writer.writeObjectValue("params", this.getParams());
        writer.writeStringValue("policy", this.getPolicy());
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
     * Sets the enforcementMode property value. The enforcementMode property
     * @param value Value to set for the enforcementMode property.
     */
    public void setEnforcementMode(@jakarta.annotation.Nullable final EnforcementMode value) {
        this.backingStore.set("enforcementMode", value);
    }
    /**
     * Sets the fetchResponses property value. The fetchResponses property
     * @param value Value to set for the fetchResponses property.
     */
    public void setFetchResponses(@jakarta.annotation.Nullable final java.util.List<FetchResponse> value) {
        this.backingStore.set("fetchResponses", value);
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
     * Sets the params property value. The params property
     * @param value Value to set for the params property.
     */
    public void setParams(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("params", value);
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policy", value);
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
