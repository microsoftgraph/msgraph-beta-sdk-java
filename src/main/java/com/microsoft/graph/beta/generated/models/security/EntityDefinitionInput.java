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
public class EntityDefinitionInput implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EntityDefinitionInput} and sets the default values.
     */
    public EntityDefinitionInput() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EntityDefinitionInput}
     */
    @jakarta.annotation.Nonnull
    public static EntityDefinitionInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntityDefinitionInput();
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
     * Gets the entityIdentifier property value. The type of identifier used for the entity. The supported identifiers depend on the entityType. See supported entity identifiers. Key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEntityIdentifier() {
        return this.backingStore.get("entityIdentifier");
    }
    /**
     * Gets the entityType property value. The entityType property
     * @return a {@link ManualAlertEntityType}
     */
    @jakarta.annotation.Nullable
    public ManualAlertEntityType getEntityType() {
        return this.backingStore.get("entityType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("entityIdentifier", (n) -> { this.setEntityIdentifier(n.getStringValue()); });
        deserializerMap.put("entityType", (n) -> { this.setEntityType(n.getEnumValue(ManualAlertEntityType::forValue)); });
        deserializerMap.put("identifierValue", (n) -> { this.setIdentifierValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(EntityDefinitionInputRole::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifierValue property value. The actual identifier value for the entity (for example, john@contoso.com for a user, or 192.168.1.1 for an IP address). Maximum 1000 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifierValue() {
        return this.backingStore.get("identifierValue");
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
     * Gets the role property value. The role property
     * @return a {@link EntityDefinitionInputRole}
     */
    @jakarta.annotation.Nullable
    public EntityDefinitionInputRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("entityIdentifier", this.getEntityIdentifier());
        writer.writeEnumValue("entityType", this.getEntityType());
        writer.writeStringValue("identifierValue", this.getIdentifierValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("role", this.getRole());
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
     * Sets the entityIdentifier property value. The type of identifier used for the entity. The supported identifiers depend on the entityType. See supported entity identifiers. Key.
     * @param value Value to set for the entityIdentifier property.
     */
    public void setEntityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("entityIdentifier", value);
    }
    /**
     * Sets the entityType property value. The entityType property
     * @param value Value to set for the entityType property.
     */
    public void setEntityType(@jakarta.annotation.Nullable final ManualAlertEntityType value) {
        this.backingStore.set("entityType", value);
    }
    /**
     * Sets the identifierValue property value. The actual identifier value for the entity (for example, john@contoso.com for a user, or 192.168.1.1 for an IP address). Maximum 1000 characters.
     * @param value Value to set for the identifierValue property.
     */
    public void setIdentifierValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifierValue", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final EntityDefinitionInputRole value) {
        this.backingStore.set("role", value);
    }
}
