package com.microsoft.graph.beta.models;

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
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PositionDetail} and sets the default values.
     */
    public PositionDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PositionDetail}
     */
    @jakarta.annotation.Nonnull
    public static PositionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PositionDetail();
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
     * Gets the company property value. Information about the company or employer.
     * @return a {@link CompanyDetail}
     */
    @jakarta.annotation.Nullable
    public CompanyDetail getCompany() {
        return this.backingStore.get("company");
    }
    /**
     * Gets the description property value. A description for the position in question.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the endMonthYear property value. The date when the position ended.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndMonthYear() {
        return this.backingStore.get("endMonthYear");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("company", (n) -> { this.setCompany(n.getObjectValue(CompanyDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("endMonthYear", (n) -> { this.setEndMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("layer", (n) -> { this.setLayer(n.getIntegerValue()); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("secondaryJobTitle", (n) -> { this.setSecondaryJobTitle(n.getStringValue()); });
        deserializerMap.put("secondaryRole", (n) -> { this.setSecondaryRole(n.getStringValue()); });
        deserializerMap.put("startMonthYear", (n) -> { this.setStartMonthYear(n.getLocalDateValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobTitle property value. The title of the position.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.backingStore.get("jobTitle");
    }
    /**
     * Gets the layer property value. The place where the employee is within the organizational hierarchy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLayer() {
        return this.backingStore.get("layer");
    }
    /**
     * Gets the level property value. The employees experience or management level.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLevel() {
        return this.backingStore.get("level");
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
     * Gets the role property value. The role the position entailed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the secondaryJobTitle property value. An optional job title for the position.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryJobTitle() {
        return this.backingStore.get("secondaryJobTitle");
    }
    /**
     * Gets the secondaryRole property value. An optional role for the position entailed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryRole() {
        return this.backingStore.get("secondaryRole");
    }
    /**
     * Gets the startMonthYear property value. The start date of the position.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartMonthYear() {
        return this.backingStore.get("startMonthYear");
    }
    /**
     * Gets the summary property value. The summary of the position.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.backingStore.get("summary");
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
        writer.writeStringValue("secondaryJobTitle", this.getSecondaryJobTitle());
        writer.writeStringValue("secondaryRole", this.getSecondaryRole());
        writer.writeLocalDateValue("startMonthYear", this.getStartMonthYear());
        writer.writeStringValue("summary", this.getSummary());
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
     * Sets the company property value. Information about the company or employer.
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final CompanyDetail value) {
        this.backingStore.set("company", value);
    }
    /**
     * Sets the description property value. A description for the position in question.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the endMonthYear property value. The date when the position ended.
     * @param value Value to set for the endMonthYear property.
     */
    public void setEndMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("endMonthYear", value);
    }
    /**
     * Sets the jobTitle property value. The title of the position.
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobTitle", value);
    }
    /**
     * Sets the layer property value. The place where the employee is within the organizational hierarchy.
     * @param value Value to set for the layer property.
     */
    public void setLayer(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("layer", value);
    }
    /**
     * Sets the level property value. The employees experience or management level.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("level", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the role property value. The role the position entailed.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the secondaryJobTitle property value. An optional job title for the position.
     * @param value Value to set for the secondaryJobTitle property.
     */
    public void setSecondaryJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secondaryJobTitle", value);
    }
    /**
     * Sets the secondaryRole property value. An optional role for the position entailed.
     * @param value Value to set for the secondaryRole property.
     */
    public void setSecondaryRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secondaryRole", value);
    }
    /**
     * Sets the startMonthYear property value. The start date of the position.
     * @param value Value to set for the startMonthYear property.
     */
    public void setStartMonthYear(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("startMonthYear", value);
    }
    /**
     * Sets the summary property value. The summary of the position.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("summary", value);
    }
}
