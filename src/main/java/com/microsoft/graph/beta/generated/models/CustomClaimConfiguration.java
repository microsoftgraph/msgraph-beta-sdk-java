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
public class CustomClaimConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CustomClaimConfiguration} and sets the default values.
     */
    public CustomClaimConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomClaimConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CustomClaimConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomClaimConfiguration();
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
     * Gets the attribute property value. The attribute property
     * @return a {@link CustomClaimAttributeBase}
     */
    @jakarta.annotation.Nullable
    public CustomClaimAttributeBase getAttribute() {
        return this.backingStore.get("attribute");
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
     * Gets the condition property value. The condition property
     * @return a {@link CustomClaimConditionBase}
     */
    @jakarta.annotation.Nullable
    public CustomClaimConditionBase getCondition() {
        return this.backingStore.get("condition");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("attribute", (n) -> { this.setAttribute(n.getObjectValue(CustomClaimAttributeBase::createFromDiscriminatorValue)); });
        deserializerMap.put("condition", (n) -> { this.setCondition(n.getObjectValue(CustomClaimConditionBase::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("transformations", (n) -> { this.setTransformations(n.getCollectionOfObjectValues(CustomClaimTransformation::createFromDiscriminatorValue)); });
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
     * Gets the transformations property value. The transformations property
     * @return a {@link java.util.List<CustomClaimTransformation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomClaimTransformation> getTransformations() {
        return this.backingStore.get("transformations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attribute", this.getAttribute());
        writer.writeObjectValue("condition", this.getCondition());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("transformations", this.getTransformations());
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
     * Sets the attribute property value. The attribute property
     * @param value Value to set for the attribute property.
     */
    public void setAttribute(@jakarta.annotation.Nullable final CustomClaimAttributeBase value) {
        this.backingStore.set("attribute", value);
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
     * Sets the condition property value. The condition property
     * @param value Value to set for the condition property.
     */
    public void setCondition(@jakarta.annotation.Nullable final CustomClaimConditionBase value) {
        this.backingStore.set("condition", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the transformations property value. The transformations property
     * @param value Value to set for the transformations property.
     */
    public void setTransformations(@jakarta.annotation.Nullable final java.util.List<CustomClaimTransformation> value) {
        this.backingStore.set("transformations", value);
    }
}
