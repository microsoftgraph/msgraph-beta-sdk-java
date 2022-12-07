package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTaskRoleBasedRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The defaultRule property */
    private String _defaultRule;
    /** The OdataType property */
    private String _odataType;
    /** The propertyRule property */
    private PlannerTaskPropertyRule _propertyRule;
    /** The role property */
    private PlannerTaskConfigurationRoleBase _role;
    /**
     * Instantiates a new plannerTaskRoleBasedRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerTaskRoleBasedRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTaskRoleBasedRule
     */
    @javax.annotation.Nonnull
    public static PlannerTaskRoleBasedRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskRoleBasedRule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the defaultRule property value. The defaultRule property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultRule() {
        return this._defaultRule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("defaultRule", (n) -> { this.setDefaultRule(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("propertyRule", (n) -> { this.setPropertyRule(n.getObjectValue(PlannerTaskPropertyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(PlannerTaskConfigurationRoleBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the propertyRule property value. The propertyRule property
     * @return a plannerTaskPropertyRule
     */
    @javax.annotation.Nullable
    public PlannerTaskPropertyRule getPropertyRule() {
        return this._propertyRule;
    }
    /**
     * Gets the role property value. The role property
     * @return a plannerTaskConfigurationRoleBase
     */
    @javax.annotation.Nullable
    public PlannerTaskConfigurationRoleBase getRole() {
        return this._role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultRule", this.getDefaultRule());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("propertyRule", this.getPropertyRule());
        writer.writeObjectValue("role", this.getRole());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the defaultRule property value. The defaultRule property
     * @param value Value to set for the defaultRule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultRule(@javax.annotation.Nullable final String value) {
        this._defaultRule = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the propertyRule property value. The propertyRule property
     * @param value Value to set for the propertyRule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropertyRule(@javax.annotation.Nullable final PlannerTaskPropertyRule value) {
        this._propertyRule = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final PlannerTaskConfigurationRoleBase value) {
        this._role = value;
    }
}
