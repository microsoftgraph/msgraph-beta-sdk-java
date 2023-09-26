package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplyLabelAction extends InformationProtectionAction implements Parsable {
    /**
     * The collection of actions that should be implemented by the caller.
     */
    private java.util.List<InformationProtectionAction> actions;
    /**
     * The actionSource property
     */
    private ActionSource actionSource;
    /**
     * If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     */
    private java.util.List<String> responsibleSensitiveTypeIds;
    /**
     * The sensitivityLabelId property
     */
    private String sensitivityLabelId;
    /**
     * Instantiates a new ApplyLabelAction and sets the default values.
     */
    public ApplyLabelAction() {
        super();
        this.setOdataType("#microsoft.graph.security.applyLabelAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplyLabelAction
     */
    @jakarta.annotation.Nonnull
    public static ApplyLabelAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyLabelAction();
    }
    /**
     * Gets the actions property value. The collection of actions that should be implemented by the caller.
     * @return a java.util.List<InformationProtectionAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<InformationProtectionAction> getActions() {
        return this.actions;
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a ActionSource
     */
    @jakarta.annotation.Nullable
    public ActionSource getActionSource() {
        return this.actionSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(InformationProtectionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("actionSource", (n) -> { this.setActionSource(n.getEnumValue(ActionSource.class)); });
        deserializerMap.put("responsibleSensitiveTypeIds", (n) -> { this.setResponsibleSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivityLabelId", (n) -> { this.setSensitivityLabelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the responsibleSensitiveTypeIds property value. If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResponsibleSensitiveTypeIds() {
        return this.responsibleSensitiveTypeIds;
    }
    /**
     * Gets the sensitivityLabelId property value. The sensitivityLabelId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSensitivityLabelId() {
        return this.sensitivityLabelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeEnumValue("actionSource", this.getActionSource());
        writer.writeCollectionOfPrimitiveValues("responsibleSensitiveTypeIds", this.getResponsibleSensitiveTypeIds());
        writer.writeStringValue("sensitivityLabelId", this.getSensitivityLabelId());
    }
    /**
     * Sets the actions property value. The collection of actions that should be implemented by the caller.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<InformationProtectionAction> value) {
        this.actions = value;
    }
    /**
     * Sets the actionSource property value. The actionSource property
     * @param value Value to set for the actionSource property.
     */
    public void setActionSource(@jakarta.annotation.Nullable final ActionSource value) {
        this.actionSource = value;
    }
    /**
     * Sets the responsibleSensitiveTypeIds property value. If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     * @param value Value to set for the responsibleSensitiveTypeIds property.
     */
    public void setResponsibleSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.responsibleSensitiveTypeIds = value;
    }
    /**
     * Sets the sensitivityLabelId property value. The sensitivityLabelId property
     * @param value Value to set for the sensitivityLabelId property.
     */
    public void setSensitivityLabelId(@jakarta.annotation.Nullable final String value) {
        this.sensitivityLabelId = value;
    }
}
