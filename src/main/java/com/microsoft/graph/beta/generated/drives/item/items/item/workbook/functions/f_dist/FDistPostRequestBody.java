package com.microsoft.graph.beta.drives.item.items.item.workbook.functions.f_dist;

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
public class FDistPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FDistPostRequestBody} and sets the default values.
     */
    public FDistPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FDistPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static FDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FDistPostRequestBody();
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
     * Gets the degFreedom1 property value. The degFreedom1 property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDegFreedom1() {
        return this.backingStore.get("degFreedom1");
    }
    /**
     * Gets the degFreedom2 property value. The degFreedom2 property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDegFreedom2() {
        return this.backingStore.get("degFreedom2");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("degFreedom1", (n) -> { this.setDegFreedom1(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("degFreedom2", (n) -> { this.setDegFreedom2(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("degFreedom1", this.getDegFreedom1());
        writer.writeObjectValue("degFreedom2", this.getDegFreedom2());
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
     * Sets the degFreedom1 property value. The degFreedom1 property
     * @param value Value to set for the degFreedom1 property.
     */
    public void setDegFreedom1(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("degFreedom1", value);
    }
    /**
     * Sets the degFreedom2 property value. The degFreedom2 property
     * @param value Value to set for the degFreedom2 property.
     */
    public void setDegFreedom2(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("degFreedom2", value);
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("x", value);
    }
}
