package com.microsoft.graph.beta.identity.conditionalaccess.evaluate;

import com.microsoft.graph.beta.models.ConditionalAccessContext;
import com.microsoft.graph.beta.models.ConditionalAccessWhatIfConditions;
import com.microsoft.graph.beta.models.ConditionalAccessWhatIfSubject;
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
public class EvaluatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EvaluatePostRequestBody} and sets the default values.
     */
    public EvaluatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static EvaluatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePostRequestBody();
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
     * Gets the appliedPoliciesOnly property value. The appliedPoliciesOnly property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppliedPoliciesOnly() {
        return this.backingStore.get("appliedPoliciesOnly");
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
     * Gets the conditionalAccessContext property value. The conditionalAccessContext property
     * @return a {@link ConditionalAccessContext}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessContext getConditionalAccessContext() {
        return this.backingStore.get("conditionalAccessContext");
    }
    /**
     * Gets the conditionalAccessWhatIfConditions property value. The conditionalAccessWhatIfConditions property
     * @return a {@link ConditionalAccessWhatIfConditions}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessWhatIfConditions getConditionalAccessWhatIfConditions() {
        return this.backingStore.get("conditionalAccessWhatIfConditions");
    }
    /**
     * Gets the conditionalAccessWhatIfSubject property value. The conditionalAccessWhatIfSubject property
     * @return a {@link ConditionalAccessWhatIfSubject}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessWhatIfSubject getConditionalAccessWhatIfSubject() {
        return this.backingStore.get("conditionalAccessWhatIfSubject");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appliedPoliciesOnly", (n) -> { this.setAppliedPoliciesOnly(n.getBooleanValue()); });
        deserializerMap.put("conditionalAccessContext", (n) -> { this.setConditionalAccessContext(n.getObjectValue(ConditionalAccessContext::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessWhatIfConditions", (n) -> { this.setConditionalAccessWhatIfConditions(n.getObjectValue(ConditionalAccessWhatIfConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessWhatIfSubject", (n) -> { this.setConditionalAccessWhatIfSubject(n.getObjectValue(ConditionalAccessWhatIfSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("appliedPoliciesOnly", this.getAppliedPoliciesOnly());
        writer.writeObjectValue("conditionalAccessContext", this.getConditionalAccessContext());
        writer.writeObjectValue("conditionalAccessWhatIfConditions", this.getConditionalAccessWhatIfConditions());
        writer.writeObjectValue("conditionalAccessWhatIfSubject", this.getConditionalAccessWhatIfSubject());
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
     * Sets the appliedPoliciesOnly property value. The appliedPoliciesOnly property
     * @param value Value to set for the appliedPoliciesOnly property.
     */
    public void setAppliedPoliciesOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appliedPoliciesOnly", value);
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
     * Sets the conditionalAccessContext property value. The conditionalAccessContext property
     * @param value Value to set for the conditionalAccessContext property.
     */
    public void setConditionalAccessContext(@jakarta.annotation.Nullable final ConditionalAccessContext value) {
        this.backingStore.set("conditionalAccessContext", value);
    }
    /**
     * Sets the conditionalAccessWhatIfConditions property value. The conditionalAccessWhatIfConditions property
     * @param value Value to set for the conditionalAccessWhatIfConditions property.
     */
    public void setConditionalAccessWhatIfConditions(@jakarta.annotation.Nullable final ConditionalAccessWhatIfConditions value) {
        this.backingStore.set("conditionalAccessWhatIfConditions", value);
    }
    /**
     * Sets the conditionalAccessWhatIfSubject property value. The conditionalAccessWhatIfSubject property
     * @param value Value to set for the conditionalAccessWhatIfSubject property.
     */
    public void setConditionalAccessWhatIfSubject(@jakarta.annotation.Nullable final ConditionalAccessWhatIfSubject value) {
        this.backingStore.set("conditionalAccessWhatIfSubject", value);
    }
}
