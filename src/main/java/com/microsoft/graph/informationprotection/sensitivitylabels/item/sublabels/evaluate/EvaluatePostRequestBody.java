package com.microsoft.graph.informationprotection.sensitivitylabels.item.sublabels.evaluate;

import com.microsoft.graph.models.CurrentLabel;
import com.microsoft.graph.models.DiscoveredSensitiveType;
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
    private BackingStore BackingStore;
    /**
     * Instantiates a new EvaluatePostRequestBody and sets the default values.
     */
    public EvaluatePostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EvaluatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EvaluatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluatePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the currentLabel property value. The currentLabel property
     * @return a CurrentLabel
     */
    @jakarta.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this.BackingStore.get("currentLabel");
    }
    /**
     * Gets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @return a java.util.List<DiscoveredSensitiveType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredSensitiveType> getDiscoveredSensitiveTypes() {
        return this.BackingStore.get("discoveredSensitiveTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("currentLabel", (n) -> { this.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("discoveredSensitiveTypes", (n) -> { this.setDiscoveredSensitiveTypes(n.getCollectionOfObjectValues(DiscoveredSensitiveType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("currentLabel", this.getCurrentLabel());
        writer.writeCollectionOfObjectValues("discoveredSensitiveTypes", this.getDiscoveredSensitiveTypes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     */
    public void setCurrentLabel(@jakarta.annotation.Nullable final CurrentLabel value) {
        this.BackingStore.set("currentLabel", value);
    }
    /**
     * Sets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @param value Value to set for the discoveredSensitiveTypes property.
     */
    public void setDiscoveredSensitiveTypes(@jakarta.annotation.Nullable final java.util.List<DiscoveredSensitiveType> value) {
        this.BackingStore.set("discoveredSensitiveTypes", value);
    }
}
