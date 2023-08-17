package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class ApplyLabelAction extends InformationProtectionAction implements Parsable {
    /**
     * The collection of specific actions that should be taken by the consuming application to label the document. See  informationProtectionAction for the full list.
     */
    private java.util.List<InformationProtectionAction> actions;
    /**
     * The actionSource property
     */
    private ActionSource actionSource;
    /**
     * Object that describes the details of the label to apply.
     */
    private LabelDetails label;
    /**
     * If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     */
    private java.util.List<UUID> responsibleSensitiveTypeIds;
    /**
     * Instantiates a new applyLabelAction and sets the default values.
     */
    public ApplyLabelAction() {
        super();
        this.setOdataType("#microsoft.graph.applyLabelAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyLabelAction
     */
    @jakarta.annotation.Nonnull
    public static ApplyLabelAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyLabelAction();
    }
    /**
     * Gets the actions property value. The collection of specific actions that should be taken by the consuming application to label the document. See  informationProtectionAction for the full list.
     * @return a informationProtectionAction
     */
    @jakarta.annotation.Nullable
    public java.util.List<InformationProtectionAction> getActions() {
        return this.actions;
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a actionSource
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
        deserializerMap.put("label", (n) -> { this.setLabel(n.getObjectValue(LabelDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("responsibleSensitiveTypeIds", (n) -> { this.setResponsibleSensitiveTypeIds(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Object that describes the details of the label to apply.
     * @return a labelDetails
     */
    @jakarta.annotation.Nullable
    public LabelDetails getLabel() {
        return this.label;
    }
    /**
     * Gets the responsibleSensitiveTypeIds property value. If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getResponsibleSensitiveTypeIds() {
        return this.responsibleSensitiveTypeIds;
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
        writer.writeObjectValue("label", this.getLabel());
        writer.writeCollectionOfPrimitiveValues("responsibleSensitiveTypeIds", this.getResponsibleSensitiveTypeIds());
    }
    /**
     * Sets the actions property value. The collection of specific actions that should be taken by the consuming application to label the document. See  informationProtectionAction for the full list.
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
     * Sets the label property value. Object that describes the details of the label to apply.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final LabelDetails value) {
        this.label = value;
    }
    /**
     * Sets the responsibleSensitiveTypeIds property value. If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     * @param value Value to set for the responsibleSensitiveTypeIds property.
     */
    public void setResponsibleSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.responsibleSensitiveTypeIds = value;
    }
}
