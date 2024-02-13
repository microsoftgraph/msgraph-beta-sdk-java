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
public class LabelingOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LabelingOptions} and sets the default values.
     */
    public LabelingOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LabelingOptions}
     */
    @jakarta.annotation.Nonnull
    public static LabelingOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelingOptions();
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
     * Gets the assignmentMethod property value. The assignmentMethod property
     * @return a {@link AssignmentMethod}
     */
    @jakarta.annotation.Nullable
    public AssignmentMethod getAssignmentMethod() {
        return this.backingStore.get("assignmentMethod");
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
     * Gets the downgradeJustification property value. The downgrade justification object that indicates if downgrade was justified and, if so, the reason.
     * @return a {@link DowngradeJustification}
     */
    @jakarta.annotation.Nullable
    public DowngradeJustification getDowngradeJustification() {
        return this.backingStore.get("downgradeJustification");
    }
    /**
     * Gets the extendedProperties property value. Extended properties will be parsed and returned in the standard Microsoft Purview Information Protection labeled metadata format as part of the label information.
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getExtendedProperties() {
        return this.backingStore.get("extendedProperties");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assignmentMethod", (n) -> { this.setAssignmentMethod(n.getEnumValue(AssignmentMethod::forValue)); });
        deserializerMap.put("downgradeJustification", (n) -> { this.setDowngradeJustification(n.getObjectValue(DowngradeJustification::createFromDiscriminatorValue)); });
        deserializerMap.put("extendedProperties", (n) -> { this.setExtendedProperties(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("labelId", (n) -> { this.setLabelId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labelId property value. The GUID of the label that should be applied to the information.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabelId() {
        return this.backingStore.get("labelId");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeObjectValue("downgradeJustification", this.getDowngradeJustification());
        writer.writeCollectionOfObjectValues("extendedProperties", this.getExtendedProperties());
        writer.writeStringValue("labelId", this.getLabelId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the assignmentMethod property value. The assignmentMethod property
     * @param value Value to set for the assignmentMethod property.
     */
    public void setAssignmentMethod(@jakarta.annotation.Nullable final AssignmentMethod value) {
        this.backingStore.set("assignmentMethod", value);
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
     * Sets the downgradeJustification property value. The downgrade justification object that indicates if downgrade was justified and, if so, the reason.
     * @param value Value to set for the downgradeJustification property.
     */
    public void setDowngradeJustification(@jakarta.annotation.Nullable final DowngradeJustification value) {
        this.backingStore.set("downgradeJustification", value);
    }
    /**
     * Sets the extendedProperties property value. Extended properties will be parsed and returned in the standard Microsoft Purview Information Protection labeled metadata format as part of the label information.
     * @param value Value to set for the extendedProperties property.
     */
    public void setExtendedProperties(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("extendedProperties", value);
    }
    /**
     * Sets the labelId property value. The GUID of the label that should be applied to the information.
     * @param value Value to set for the labelId property.
     */
    public void setLabelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("labelId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
