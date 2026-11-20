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
public class PlanCapability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlanCapability} and sets the default values.
     */
    public PlanCapability() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlanCapability}
     */
    @jakarta.annotation.Nonnull
    public static PlanCapability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlanCapability();
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
     * Gets the calendar property value. Indicates whether calendar features are enabled for the plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCalendar() {
        return this.backingStore.get("calendar");
    }
    /**
     * Gets the customFields property value. Indicates whether custom fields are enabled for the plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCustomFields() {
        return this.backingStore.get("customFields");
    }
    /**
     * Gets the extensions property value. Indicates whether custom extension fields are enabled for the plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getBooleanValue()); });
        deserializerMap.put("customFields", (n) -> { this.setCustomFields(n.getBooleanValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getBooleanValue()); });
        deserializerMap.put("goals", (n) -> { this.setGoals(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("undo", (n) -> { this.setUndo(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the goals property value. Indicates whether goals are enabled for the plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGoals() {
        return this.backingStore.get("goals");
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
     * Gets the undo property value. Indicates whether undo is enabled for the plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUndo() {
        return this.backingStore.get("undo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("calendar", this.getCalendar());
        writer.writeBooleanValue("customFields", this.getCustomFields());
        writer.writeBooleanValue("extensions", this.getExtensions());
        writer.writeBooleanValue("goals", this.getGoals());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("undo", this.getUndo());
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
     * Sets the calendar property value. Indicates whether calendar features are enabled for the plan.
     * @param value Value to set for the calendar property.
     */
    public void setCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("calendar", value);
    }
    /**
     * Sets the customFields property value. Indicates whether custom fields are enabled for the plan.
     * @param value Value to set for the customFields property.
     */
    public void setCustomFields(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("customFields", value);
    }
    /**
     * Sets the extensions property value. Indicates whether custom extension fields are enabled for the plan.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the goals property value. Indicates whether goals are enabled for the plan.
     * @param value Value to set for the goals property.
     */
    public void setGoals(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("goals", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the undo property value. Indicates whether undo is enabled for the plan.
     * @param value Value to set for the undo property.
     */
    public void setUndo(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("undo", value);
    }
}
