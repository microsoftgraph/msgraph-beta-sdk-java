package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class RecommendLabelAction extends InformationProtectionAction implements Parsable {
    /** Actions to take if the label is accepted by the user. */
    private java.util.List<InformationProtectionAction> actions;
    /** The actionSource property */
    private ActionSource actionSource;
    /** The label that is being recommended. */
    private LabelDetails label;
    /** The sensitive information type GUIDs that caused the recommendation to be given. */
    private java.util.List<UUID> responsibleSensitiveTypeIds;
    /**
     * Instantiates a new RecommendLabelAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecommendLabelAction() {
        super();
        this.setOdataType("#microsoft.graph.recommendLabelAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecommendLabelAction
     */
    @javax.annotation.Nonnull
    public static RecommendLabelAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendLabelAction();
    }
    /**
     * Gets the actions property value. Actions to take if the label is accepted by the user.
     * @return a informationProtectionAction
     */
    @javax.annotation.Nullable
    public java.util.List<InformationProtectionAction> getActions() {
        return this.actions;
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a actionSource
     */
    @javax.annotation.Nullable
    public ActionSource getActionSource() {
        return this.actionSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(InformationProtectionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("actionSource", (n) -> { this.setActionSource(n.getEnumValue(ActionSource.class)); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getObjectValue(LabelDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("responsibleSensitiveTypeIds", (n) -> { this.setResponsibleSensitiveTypeIds(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. The label that is being recommended.
     * @return a labelDetails
     */
    @javax.annotation.Nullable
    public LabelDetails getLabel() {
        return this.label;
    }
    /**
     * Gets the responsibleSensitiveTypeIds property value. The sensitive information type GUIDs that caused the recommendation to be given.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public java.util.List<UUID> getResponsibleSensitiveTypeIds() {
        return this.responsibleSensitiveTypeIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeEnumValue("actionSource", this.getActionSource());
        writer.writeObjectValue("label", this.getLabel());
        writer.writeCollectionOfPrimitiveValues("responsibleSensitiveTypeIds", this.getResponsibleSensitiveTypeIds());
    }
    /**
     * Sets the actions property value. Actions to take if the label is accepted by the user.
     * @param value Value to set for the actions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActions(@javax.annotation.Nullable final java.util.List<InformationProtectionAction> value) {
        this.actions = value;
    }
    /**
     * Sets the actionSource property value. The actionSource property
     * @param value Value to set for the actionSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionSource(@javax.annotation.Nullable final ActionSource value) {
        this.actionSource = value;
    }
    /**
     * Sets the label property value. The label that is being recommended.
     * @param value Value to set for the label property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabel(@javax.annotation.Nullable final LabelDetails value) {
        this.label = value;
    }
    /**
     * Sets the responsibleSensitiveTypeIds property value. The sensitive information type GUIDs that caused the recommendation to be given.
     * @param value Value to set for the responsibleSensitiveTypeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponsibleSensitiveTypeIds(@javax.annotation.Nullable final java.util.List<UUID> value) {
        this.responsibleSensitiveTypeIds = value;
    }
}
