package com.microsoft.graph.models;

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
public class EducationIdentityMatchingOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new EducationIdentityMatchingOptions and sets the default values.
     */
    public EducationIdentityMatchingOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationIdentityMatchingOptions
     */
    @jakarta.annotation.Nonnull
    public static EducationIdentityMatchingOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationIdentityMatchingOptions();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the appliesTo property value. The appliesTo property
     * @return a EducationUserRole
     */
    @jakarta.annotation.Nullable
    public EducationUserRole getAppliesTo() {
        return this.backingStore.get("appliesTo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getEnumValue(EducationUserRole.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourcePropertyName", (n) -> { this.setSourcePropertyName(n.getStringValue()); });
        deserializerMap.put("targetDomain", (n) -> { this.setTargetDomain(n.getStringValue()); });
        deserializerMap.put("targetPropertyName", (n) -> { this.setTargetPropertyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the sourcePropertyName property value. The name of the source property, which should be a field name in the source data. This property is case-sensitive.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourcePropertyName() {
        return this.backingStore.get("sourcePropertyName");
    }
    /**
     * Gets the targetDomain property value. The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetDomain() {
        return this.backingStore.get("targetDomain");
    }
    /**
     * Gets the targetPropertyName property value. The name of the target property, which should be a valid property in Microsoft Entra ID. This property is case-sensitive.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetPropertyName() {
        return this.backingStore.get("targetPropertyName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourcePropertyName", this.getSourcePropertyName());
        writer.writeStringValue("targetDomain", this.getTargetDomain());
        writer.writeStringValue("targetPropertyName", this.getTargetPropertyName());
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
     * Sets the appliesTo property value. The appliesTo property
     * @param value Value to set for the appliesTo property.
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final EducationUserRole value) {
        this.backingStore.set("appliesTo", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sourcePropertyName property value. The name of the source property, which should be a field name in the source data. This property is case-sensitive.
     * @param value Value to set for the sourcePropertyName property.
     */
    public void setSourcePropertyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourcePropertyName", value);
    }
    /**
     * Sets the targetDomain property value. The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property.
     * @param value Value to set for the targetDomain property.
     */
    public void setTargetDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetDomain", value);
    }
    /**
     * Sets the targetPropertyName property value. The name of the target property, which should be a valid property in Microsoft Entra ID. This property is case-sensitive.
     * @param value Value to set for the targetPropertyName property.
     */
    public void setTargetPropertyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetPropertyName", value);
    }
}
