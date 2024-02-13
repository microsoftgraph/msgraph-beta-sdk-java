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
public class PasswordSingleSignOnField implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PasswordSingleSignOnField} and sets the default values.
     */
    public PasswordSingleSignOnField() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasswordSingleSignOnField}
     */
    @jakarta.annotation.Nonnull
    public static PasswordSingleSignOnField createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordSingleSignOnField();
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
     * Gets the customizedLabel property value. Title/label override for customization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomizedLabel() {
        return this.backingStore.get("customizedLabel");
    }
    /**
     * Gets the defaultLabel property value. Label that would be used if no customizedLabel is provided. Read only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultLabel() {
        return this.backingStore.get("defaultLabel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("customizedLabel", (n) -> { this.setCustomizedLabel(n.getStringValue()); });
        deserializerMap.put("defaultLabel", (n) -> { this.setDefaultLabel(n.getStringValue()); });
        deserializerMap.put("fieldId", (n) -> { this.setFieldId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fieldId property value. Id used to identity the field type. This is an internal ID and possible values are param1, param2, paramuserName, parampassword.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFieldId() {
        return this.backingStore.get("fieldId");
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
     * Gets the type property value. Type of the credential. The values can be text, password.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customizedLabel", this.getCustomizedLabel());
        writer.writeStringValue("defaultLabel", this.getDefaultLabel());
        writer.writeStringValue("fieldId", this.getFieldId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("type", this.getType());
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
     * Sets the customizedLabel property value. Title/label override for customization.
     * @param value Value to set for the customizedLabel property.
     */
    public void setCustomizedLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customizedLabel", value);
    }
    /**
     * Sets the defaultLabel property value. Label that would be used if no customizedLabel is provided. Read only.
     * @param value Value to set for the defaultLabel property.
     */
    public void setDefaultLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultLabel", value);
    }
    /**
     * Sets the fieldId property value. Id used to identity the field type. This is an internal ID and possible values are param1, param2, paramuserName, parampassword.
     * @param value Value to set for the fieldId property.
     */
    public void setFieldId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fieldId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the type property value. Type of the credential. The values can be text, password.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}
