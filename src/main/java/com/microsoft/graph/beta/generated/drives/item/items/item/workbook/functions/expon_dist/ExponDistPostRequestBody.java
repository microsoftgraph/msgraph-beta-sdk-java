package com.microsoft.graph.beta.drives.item.items.item.workbook.functions.expon_dist;

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
public class ExponDistPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExponDistPostRequestBody} and sets the default values.
     */
    public ExponDistPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExponDistPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ExponDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExponDistPostRequestBody();
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
     * Gets the cumulative property value. The cumulative property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCumulative() {
        return this.backingStore.get("cumulative");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("lambda", (n) -> { this.setLambda(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lambda property value. The lambda property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getLambda() {
        return this.backingStore.get("lambda");
    }
    /**
     * Gets the x property value. The x property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getX() {
        return this.backingStore.get("x");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("lambda", this.getLambda());
        writer.writeObjectValue("x", this.getX());
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
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     */
    public void setCumulative(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("cumulative", value);
    }
    /**
     * Sets the lambda property value. The lambda property
     * @param value Value to set for the lambda property.
     */
    public void setLambda(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("lambda", value);
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("x", value);
    }
}
