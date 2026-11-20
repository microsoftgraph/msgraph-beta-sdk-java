package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreationInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CreationInfo} and sets the default values.
     */
    public CreationInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreationInfo}
     */
    @jakarta.annotation.Nonnull
    public static CreationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreationInfo();
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
     * Gets the createdBy property value. Identity of the user (or application) that created the entity.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the externalId property value. Identifier of the entity in an external system, if it originated outside Planner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * Gets the externalUrl property value. URL of the entity in the external system, if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalUrl() {
        return this.backingStore.get("externalUrl");
    }
    /**
     * Gets the externalVersion property value. Version of the entity in the external system, if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalVersion() {
        return this.backingStore.get("externalVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("externalVersion", (n) -> { this.setExternalVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scenarioId", (n) -> { this.setScenarioId(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
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
     * Gets the scenarioId property value. Identifier of the scenario or workflow that created the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScenarioId() {
        return this.backingStore.get("scenarioId");
    }
    /**
     * Gets the scope property value. Scope the entity was created in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("externalVersion", this.getExternalVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("scenarioId", this.getScenarioId());
        writer.writeStringValue("scope", this.getScope());
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
     * Sets the createdBy property value. Identity of the user (or application) that created the entity.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time the entity was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the externalId property value. Identifier of the entity in an external system, if it originated outside Planner.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the externalUrl property value. URL of the entity in the external system, if applicable.
     * @param value Value to set for the externalUrl property.
     */
    public void setExternalUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalUrl", value);
    }
    /**
     * Sets the externalVersion property value. Version of the entity in the external system, if applicable.
     * @param value Value to set for the externalVersion property.
     */
    public void setExternalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the scenarioId property value. Identifier of the scenario or workflow that created the entity.
     * @param value Value to set for the scenarioId property.
     */
    public void setScenarioId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scenarioId", value);
    }
    /**
     * Sets the scope property value. Scope the entity was created in.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
}
