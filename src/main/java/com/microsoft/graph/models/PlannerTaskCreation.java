package com.microsoft.graph.models;

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
public class PlannerTaskCreation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PlannerTaskCreation and sets the default values.
     */
    public PlannerTaskCreation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTaskCreation
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskCreation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.plannerExternalTaskSource": return new PlannerExternalTaskSource();
                case "#microsoft.graph.plannerTeamsPublicationInfo": return new PlannerTeamsPublicationInfo();
            }
        }
        return new PlannerTaskCreation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the creationSourceKind property value. Specifies what kind of creation source the task is created with. The possible values are: external, publication and unknownFutureValue.
     * @return a PlannerCreationSourceKind
     */
    @jakarta.annotation.Nullable
    public PlannerCreationSourceKind getCreationSourceKind() {
        return this.backingStore.get("creationSourceKind");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("creationSourceKind", (n) -> { this.setCreationSourceKind(n.getEnumValue(PlannerCreationSourceKind.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("teamsPublicationInfo", (n) -> { this.setTeamsPublicationInfo(n.getObjectValue(PlannerTeamsPublicationInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the teamsPublicationInfo property value. Information about the publication process that created this task. This field is deprecated and clients should move to using the new inheritance model.
     * @return a PlannerTeamsPublicationInfo
     */
    @jakarta.annotation.Nullable
    public PlannerTeamsPublicationInfo getTeamsPublicationInfo() {
        return this.backingStore.get("teamsPublicationInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("creationSourceKind", this.getCreationSourceKind());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("teamsPublicationInfo", this.getTeamsPublicationInfo());
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
     * Sets the creationSourceKind property value. Specifies what kind of creation source the task is created with. The possible values are: external, publication and unknownFutureValue.
     * @param value Value to set for the creationSourceKind property.
     */
    public void setCreationSourceKind(@jakarta.annotation.Nullable final PlannerCreationSourceKind value) {
        this.backingStore.set("creationSourceKind", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the teamsPublicationInfo property value. Information about the publication process that created this task. This field is deprecated and clients should move to using the new inheritance model.
     * @param value Value to set for the teamsPublicationInfo property.
     */
    public void setTeamsPublicationInfo(@jakarta.annotation.Nullable final PlannerTeamsPublicationInfo value) {
        this.backingStore.set("teamsPublicationInfo", value);
    }
}
