package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PositionDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new PositionDetail and sets the default values.
     */
    public PositionDetail() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PositionDetail
     */
    @jakarta.annotation.Nonnull
    public static PositionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PositionDetail();
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
     * Gets the company property value. Detail about the company or employer.
     * @return a CompanyDetail
     */
    @jakarta.annotation.Nullable
    public CompanyDetail getCompany() {
        return this.BackingStore.get("company");
    }
    /**
     * Gets the description property value. Description of the position in question.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the endMonthYear property value. When the position ended.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndMonthYear() {
        return this.BackingStore.get("endMonthYear");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("company", (n) -> { this.setCompany(n.getObjectValue(CompanyDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("endMonthYear", (n) -> { this.setEndMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("layer", (n) -> { this.setLayer(n.getIntegerValue()); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("startMonthYear", (n) -> { this.setStartMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobTitle property value. The title held when in that position.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.BackingStore.get("jobTitle");
    }
    /**
     * Gets the layer property value. The place where the employee is within the organizational hierarchy.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLayer() {
        return this.BackingStore.get("layer");
    }
    /**
     * Gets the level property value. The employees experience or management level.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLevel() {
        return this.BackingStore.get("level");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the role property value. The role the position entailed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.BackingStore.get("role");
    }
    /**
     * Gets the startMonthYear property value. The start month and year of the position.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartMonthYear() {
        return this.BackingStore.get("startMonthYear");
    }
    /**
     * Gets the summary property value. summary of the position.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.BackingStore.get("summary");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("company", this.getCompany());
        writer.writeStringValue("description", this.getDescription());
        writer.writeLocalDateValue("endMonthYear", this.getEndMonthYear());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeIntegerValue("layer", this.getLayer());
        writer.writeStringValue("level", this.getLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("role", this.getRole());
        writer.writeLocalDateValue("startMonthYear", this.getStartMonthYear());
        writer.writeStringValue("summary", this.getSummary());
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
     * Sets the company property value. Detail about the company or employer.
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final CompanyDetail value) {
        this.BackingStore.set("company", value);
    }
    /**
     * Sets the description property value. Description of the position in question.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the endMonthYear property value. When the position ended.
     * @param value Value to set for the endMonthYear property.
     */
    public void setEndMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("endMonthYear", value);
    }
    /**
     * Sets the jobTitle property value. The title held when in that position.
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("jobTitle", value);
    }
    /**
     * Sets the layer property value. The place where the employee is within the organizational hierarchy.
     * @param value Value to set for the layer property.
     */
    public void setLayer(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("layer", value);
    }
    /**
     * Sets the level property value. The employees experience or management level.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("level", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the role property value. The role the position entailed.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("role", value);
    }
    /**
     * Sets the startMonthYear property value. The start month and year of the position.
     * @param value Value to set for the startMonthYear property.
     */
    public void setStartMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("startMonthYear", value);
    }
    /**
     * Sets the summary property value. summary of the position.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("summary", value);
    }
}
