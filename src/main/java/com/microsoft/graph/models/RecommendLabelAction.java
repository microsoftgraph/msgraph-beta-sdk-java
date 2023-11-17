package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecommendLabelAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new RecommendLabelAction and sets the default values.
     */
    public RecommendLabelAction() {
        super();
        this.setOdataType("#microsoft.graph.recommendLabelAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecommendLabelAction
     */
    @jakarta.annotation.Nonnull
    public static RecommendLabelAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendLabelAction();
    }
    /**
     * Gets the actions property value. Actions to take if the label is accepted by the user.
     * @return a java.util.List<InformationProtectionAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<InformationProtectionAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a ActionSource
     */
    @jakarta.annotation.Nullable
    public ActionSource getActionSource() {
        return this.backingStore.get("actionSource");
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
     * Gets the label property value. The label that is being recommended.
     * @return a LabelDetails
     */
    @jakarta.annotation.Nullable
    public LabelDetails getLabel() {
        return this.backingStore.get("label");
    }
    /**
     * Gets the responsibleSensitiveTypeIds property value. The sensitive information type GUIDs that caused the recommendation to be given.
     * @return a java.util.List<UUID>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getResponsibleSensitiveTypeIds() {
        return this.backingStore.get("responsibleSensitiveTypeIds");
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
     * Sets the actions property value. Actions to take if the label is accepted by the user.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<InformationProtectionAction> value) {
        this.backingStore.set("actions", value);
    }
    /**
     * Sets the actionSource property value. The actionSource property
     * @param value Value to set for the actionSource property.
     */
    public void setActionSource(@jakarta.annotation.Nullable final ActionSource value) {
        this.backingStore.set("actionSource", value);
    }
    /**
     * Sets the label property value. The label that is being recommended.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final LabelDetails value) {
        this.backingStore.set("label", value);
    }
    /**
     * Sets the responsibleSensitiveTypeIds property value. The sensitive information type GUIDs that caused the recommendation to be given.
     * @param value Value to set for the responsibleSensitiveTypeIds property.
     */
    public void setResponsibleSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.backingStore.set("responsibleSensitiveTypeIds", value);
    }
}
