package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecommendLabelAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new {@link RecommendLabelAction} and sets the default values.
     */
    public RecommendLabelAction() {
        super();
        this.setOdataType("#microsoft.graph.security.recommendLabelAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecommendLabelAction}
     */
    @jakarta.annotation.Nonnull
    public static RecommendLabelAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendLabelAction();
    }
    /**
     * Gets the actions property value. Actions to take if the label is accepted by the user.
     * @return a {@link java.util.List<InformationProtectionAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InformationProtectionAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a {@link ActionSource}
     */
    @jakarta.annotation.Nullable
    public ActionSource getActionSource() {
        return this.backingStore.get("actionSource");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(InformationProtectionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("actionSource", (n) -> { this.setActionSource(n.getEnumValue(ActionSource::forValue)); });
        deserializerMap.put("responsibleSensitiveTypeIds", (n) -> { this.setResponsibleSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sensitivityLabelId", (n) -> { this.setSensitivityLabelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the responsibleSensitiveTypeIds property value. The sensitive information type GUIDs that caused the recommendation to be given.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResponsibleSensitiveTypeIds() {
        return this.backingStore.get("responsibleSensitiveTypeIds");
    }
    /**
     * Gets the sensitivityLabelId property value. The sensitivityLabelId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensitivityLabelId() {
        return this.backingStore.get("sensitivityLabelId");
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
     * Sets the responsibleSensitiveTypeIds property value. The sensitive information type GUIDs that caused the recommendation to be given.
     * @param value Value to set for the responsibleSensitiveTypeIds property.
     */
    public void setResponsibleSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("responsibleSensitiveTypeIds", value);
    }
    /**
     * Sets the sensitivityLabelId property value. The sensitivityLabelId property
     * @param value Value to set for the sensitivityLabelId property.
     */
    public void setSensitivityLabelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensitivityLabelId", value);
    }
}
