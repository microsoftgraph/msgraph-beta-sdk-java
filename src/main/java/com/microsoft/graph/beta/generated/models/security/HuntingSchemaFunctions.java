package com.microsoft.graph.beta.models.security;

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
public class HuntingSchemaFunctions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link HuntingSchemaFunctions} and sets the default values.
     */
    public HuntingSchemaFunctions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HuntingSchemaFunctions}
     */
    @jakarta.annotation.Nonnull
    public static HuntingSchemaFunctions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HuntingSchemaFunctions();
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
     * Gets the builtInFunctions property value. The builtInFunctions property
     * @return a {@link java.util.List<HuntingSchemaBuiltInFunction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HuntingSchemaBuiltInFunction> getBuiltInFunctions() {
        return this.backingStore.get("builtInFunctions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("builtInFunctions", (n) -> { this.setBuiltInFunctions(n.getCollectionOfObjectValues(HuntingSchemaBuiltInFunction::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("savedFunctions", (n) -> { this.setSavedFunctions(n.getCollectionOfObjectValues(HuntingSchemaSavedFunction::createFromDiscriminatorValue)); });
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
     * Gets the savedFunctions property value. The savedFunctions property
     * @return a {@link java.util.List<HuntingSchemaSavedFunction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HuntingSchemaSavedFunction> getSavedFunctions() {
        return this.backingStore.get("savedFunctions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("builtInFunctions", this.getBuiltInFunctions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("savedFunctions", this.getSavedFunctions());
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
     * Sets the builtInFunctions property value. The builtInFunctions property
     * @param value Value to set for the builtInFunctions property.
     */
    public void setBuiltInFunctions(@jakarta.annotation.Nullable final java.util.List<HuntingSchemaBuiltInFunction> value) {
        this.backingStore.set("builtInFunctions", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the savedFunctions property value. The savedFunctions property
     * @param value Value to set for the savedFunctions property.
     */
    public void setSavedFunctions(@jakarta.annotation.Nullable final java.util.List<HuntingSchemaSavedFunction> value) {
        this.backingStore.set("savedFunctions", value);
    }
}
