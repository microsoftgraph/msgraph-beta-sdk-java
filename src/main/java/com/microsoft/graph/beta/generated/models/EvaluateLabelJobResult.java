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
public class EvaluateLabelJobResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EvaluateLabelJobResult} and sets the default values.
     */
    public EvaluateLabelJobResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluateLabelJobResult}
     */
    @jakarta.annotation.Nonnull
    public static EvaluateLabelJobResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateLabelJobResult();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("responsiblePolicy", (n) -> { this.setResponsiblePolicy(n.getObjectValue(ResponsiblePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("responsibleSensitiveTypes", (n) -> { this.setResponsibleSensitiveTypes(n.getCollectionOfObjectValues(ResponsibleSensitiveType::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityLabel", (n) -> { this.setSensitivityLabel(n.getObjectValue(MatchingLabel::createFromDiscriminatorValue)); });
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
     * Gets the responsiblePolicy property value. The responsiblePolicy property
     * @return a {@link ResponsiblePolicy}
     */
    @jakarta.annotation.Nullable
    public ResponsiblePolicy getResponsiblePolicy() {
        return this.backingStore.get("responsiblePolicy");
    }
    /**
     * Gets the responsibleSensitiveTypes property value. The responsibleSensitiveTypes property
     * @return a {@link java.util.List<ResponsibleSensitiveType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResponsibleSensitiveType> getResponsibleSensitiveTypes() {
        return this.backingStore.get("responsibleSensitiveTypes");
    }
    /**
     * Gets the sensitivityLabel property value. The sensitivityLabel property
     * @return a {@link MatchingLabel}
     */
    @jakarta.annotation.Nullable
    public MatchingLabel getSensitivityLabel() {
        return this.backingStore.get("sensitivityLabel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("responsiblePolicy", this.getResponsiblePolicy());
        writer.writeCollectionOfObjectValues("responsibleSensitiveTypes", this.getResponsibleSensitiveTypes());
        writer.writeObjectValue("sensitivityLabel", this.getSensitivityLabel());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the responsiblePolicy property value. The responsiblePolicy property
     * @param value Value to set for the responsiblePolicy property.
     */
    public void setResponsiblePolicy(@jakarta.annotation.Nullable final ResponsiblePolicy value) {
        this.backingStore.set("responsiblePolicy", value);
    }
    /**
     * Sets the responsibleSensitiveTypes property value. The responsibleSensitiveTypes property
     * @param value Value to set for the responsibleSensitiveTypes property.
     */
    public void setResponsibleSensitiveTypes(@jakarta.annotation.Nullable final java.util.List<ResponsibleSensitiveType> value) {
        this.backingStore.set("responsibleSensitiveTypes", value);
    }
    /**
     * Sets the sensitivityLabel property value. The sensitivityLabel property
     * @param value Value to set for the sensitivityLabel property.
     */
    public void setSensitivityLabel(@jakarta.annotation.Nullable final MatchingLabel value) {
        this.backingStore.set("sensitivityLabel", value);
    }
}
