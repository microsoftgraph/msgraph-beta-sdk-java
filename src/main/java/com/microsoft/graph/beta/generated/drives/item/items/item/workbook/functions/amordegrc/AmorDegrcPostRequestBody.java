package com.microsoft.graph.beta.drives.item.items.item.workbook.functions.amordegrc;

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
public class AmorDegrcPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AmorDegrcPostRequestBody} and sets the default values.
     */
    public AmorDegrcPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AmorDegrcPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static AmorDegrcPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AmorDegrcPostRequestBody();
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
     * Gets the basis property value. The basis property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBasis() {
        return this.backingStore.get("basis");
    }
    /**
     * Gets the cost property value. The cost property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCost() {
        return this.backingStore.get("cost");
    }
    /**
     * Gets the datePurchased property value. The datePurchased property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDatePurchased() {
        return this.backingStore.get("datePurchased");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("cost", (n) -> { this.setCost(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("datePurchased", (n) -> { this.setDatePurchased(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("firstPeriod", (n) -> { this.setFirstPeriod(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("salvage", (n) -> { this.setSalvage(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstPeriod property value. The firstPeriod property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getFirstPeriod() {
        return this.backingStore.get("firstPeriod");
    }
    /**
     * Gets the period property value. The period property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPeriod() {
        return this.backingStore.get("period");
    }
    /**
     * Gets the rate property value. The rate property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getRate() {
        return this.backingStore.get("rate");
    }
    /**
     * Gets the salvage property value. The salvage property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSalvage() {
        return this.backingStore.get("salvage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("cost", this.getCost());
        writer.writeObjectValue("datePurchased", this.getDatePurchased());
        writer.writeObjectValue("firstPeriod", this.getFirstPeriod());
        writer.writeObjectValue("period", this.getPeriod());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("salvage", this.getSalvage());
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
     * Sets the basis property value. The basis property
     * @param value Value to set for the basis property.
     */
    public void setBasis(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("basis", value);
    }
    /**
     * Sets the cost property value. The cost property
     * @param value Value to set for the cost property.
     */
    public void setCost(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("cost", value);
    }
    /**
     * Sets the datePurchased property value. The datePurchased property
     * @param value Value to set for the datePurchased property.
     */
    public void setDatePurchased(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("datePurchased", value);
    }
    /**
     * Sets the firstPeriod property value. The firstPeriod property
     * @param value Value to set for the firstPeriod property.
     */
    public void setFirstPeriod(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("firstPeriod", value);
    }
    /**
     * Sets the period property value. The period property
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("period", value);
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("rate", value);
    }
    /**
     * Sets the salvage property value. The salvage property
     * @param value Value to set for the salvage property.
     */
    public void setSalvage(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("salvage", value);
    }
}
