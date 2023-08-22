package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskRoleBasedRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Default rule that applies when a property or action-specific rule is not provided. Possible values are: Allow, Block
     */
    private String defaultRule;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Rules for specific properties and actions.
     */
    private PlannerTaskPropertyRule propertyRule;
    /**
     * The role these rules apply to.
     */
    private PlannerTaskConfigurationRoleBase role;
    /**
     * Instantiates a new plannerTaskRoleBasedRule and sets the default values.
     */
    public PlannerTaskRoleBasedRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTaskRoleBasedRule
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskRoleBasedRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskRoleBasedRule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the defaultRule property value. Default rule that applies when a property or action-specific rule is not provided. Possible values are: Allow, Block
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultRule() {
        return this.defaultRule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
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
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the propertyRule property value. Rules for specific properties and actions.
     * @return a plannerTaskPropertyRule
     */
    @jakarta.annotation.Nullable
    public PlannerTaskPropertyRule getPropertyRule() {
        return this.propertyRule;
    }
    /**
     * Gets the role property value. The role these rules apply to.
     * @return a plannerTaskConfigurationRoleBase
     */
    @jakarta.annotation.Nullable
    public PlannerTaskConfigurationRoleBase getRole() {
        return this.role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultRule", this.getDefaultRule());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("propertyRule", this.getPropertyRule());
        writer.writeObjectValue("role", this.getRole());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultRule property value. Default rule that applies when a property or action-specific rule is not provided. Possible values are: Allow, Block
     * @param value Value to set for the defaultRule property.
     */
    public void setDefaultRule(@jakarta.annotation.Nullable final String value) {
        this.defaultRule = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the propertyRule property value. Rules for specific properties and actions.
     * @param value Value to set for the propertyRule property.
     */
    public void setPropertyRule(@jakarta.annotation.Nullable final PlannerTaskPropertyRule value) {
        this.propertyRule = value;
    }
    /**
     * Sets the role property value. The role these rules apply to.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final PlannerTaskConfigurationRoleBase value) {
        this.role = value;
    }
}
