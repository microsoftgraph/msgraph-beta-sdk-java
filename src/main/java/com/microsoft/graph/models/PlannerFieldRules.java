package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerFieldRules implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default rules that apply if no override matches to the current data.
     */
    private java.util.List<String> defaultRules;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Overrides that specify different rules for specific data associated with the field.
     */
    private java.util.List<PlannerRuleOverride> overrides;
    /**
     * Instantiates a new plannerFieldRules and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerFieldRules() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerFieldRules
     */
    @javax.annotation.Nonnull
    public static PlannerFieldRules createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerFieldRules();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the defaultRules property value. The default rules that apply if no override matches to the current data.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefaultRules() {
        return this.defaultRules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("defaultRules", (n) -> { this.setDefaultRules(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("overrides", (n) -> { this.setOverrides(n.getCollectionOfObjectValues(PlannerRuleOverride::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the overrides property value. Overrides that specify different rules for specific data associated with the field.
     * @return a plannerRuleOverride
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerRuleOverride> getOverrides() {
        return this.overrides;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("defaultRules", this.getDefaultRules());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("overrides", this.getOverrides());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultRules property value. The default rules that apply if no override matches to the current data.
     * @param value Value to set for the defaultRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultRules(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defaultRules = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the overrides property value. Overrides that specify different rules for specific data associated with the field.
     * @param value Value to set for the overrides property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOverrides(@javax.annotation.Nullable final java.util.List<PlannerRuleOverride> value) {
        this.overrides = value;
    }
}
