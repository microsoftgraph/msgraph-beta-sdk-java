package com.microsoft.graph.beta.models.security;

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
public class HuntingSchemaSavedFunction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link HuntingSchemaSavedFunction} and sets the default values.
     */
    public HuntingSchemaSavedFunction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HuntingSchemaSavedFunction}
     */
    @jakarta.annotation.Nonnull
    public static HuntingSchemaSavedFunction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HuntingSchemaSavedFunction();
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
     * Gets the createdBy property value. Identity of the user who created the function.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the description property value. Description of the function purpose and usage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("huntingFunctionId", (n) -> { this.setHuntingFunctionId(n.getLongValue()); });
        deserializerMap.put("inputParameters", (n) -> { this.setInputParameters(n.getCollectionOfObjectValues(HuntingSchemaFunctionParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outputColumns", (n) -> { this.setOutputColumns(n.getCollectionOfObjectValues(HuntingSchemaTableColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the huntingFunctionId property value. Unique identifier for the function. Required.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getHuntingFunctionId() {
        return this.backingStore.get("huntingFunctionId");
    }
    /**
     * Gets the inputParameters property value. Collection of input parameters accepted by the function.
     * @return a {@link java.util.List<HuntingSchemaFunctionParameter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HuntingSchemaFunctionParameter> getInputParameters() {
        return this.backingStore.get("inputParameters");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the function.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the function was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the name property value. Name of the function. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the outputColumns property value. Collection of columns returned by the function.
     * @return a {@link java.util.List<HuntingSchemaTableColumn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HuntingSchemaTableColumn> getOutputColumns() {
        return this.backingStore.get("outputColumns");
    }
    /**
     * Gets the path property value. Folder path where the function is saved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.backingStore.get("path");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("inputParameters", this.getInputParameters());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("outputColumns", this.getOutputColumns());
        writer.writeStringValue("path", this.getPath());
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
     * Sets the createdBy property value. Identity of the user who created the function.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the description property value. Description of the function purpose and usage.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the huntingFunctionId property value. Unique identifier for the function. Required.
     * @param value Value to set for the huntingFunctionId property.
     */
    public void setHuntingFunctionId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("huntingFunctionId", value);
    }
    /**
     * Sets the inputParameters property value. Collection of input parameters accepted by the function.
     * @param value Value to set for the inputParameters property.
     */
    public void setInputParameters(@jakarta.annotation.Nullable final java.util.List<HuntingSchemaFunctionParameter> value) {
        this.backingStore.set("inputParameters", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the function.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the function was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the name property value. Name of the function. Required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the outputColumns property value. Collection of columns returned by the function.
     * @param value Value to set for the outputColumns property.
     */
    public void setOutputColumns(@jakarta.annotation.Nullable final java.util.List<HuntingSchemaTableColumn> value) {
        this.backingStore.set("outputColumns", value);
    }
    /**
     * Sets the path property value. Folder path where the function is saved.
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("path", value);
    }
}
