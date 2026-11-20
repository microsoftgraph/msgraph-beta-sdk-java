package com.microsoft.graph.beta.models;

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
public class CredentialProvenance implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CredentialProvenance} and sets the default values.
     */
    public CredentialProvenance() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CredentialProvenance}
     */
    @jakarta.annotation.Nonnull
    public static CredentialProvenance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialProvenance();
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
     * Gets the assertedBy property value. Identifies the actor that established the provenance. This property is computed by the service.
     * @return a {@link ProvenanceAssertedBy}
     */
    @jakarta.annotation.Nullable
    public ProvenanceAssertedBy getAssertedBy() {
        return this.backingStore.get("assertedBy");
    }
    /**
     * Gets the assertions property value. The assertions that support the credential&apos;s provenance classification.
     * @return a {@link java.util.List<ProvenanceAssertion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvenanceAssertion> getAssertions() {
        return this.backingStore.get("assertions");
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
     * Gets the chainStatus property value. The current integrity status of the credential&apos;s chain of trust.
     * @return a {@link ProvenanceChainStatus}
     */
    @jakarta.annotation.Nullable
    public ProvenanceChainStatus getChainStatus() {
        return this.backingStore.get("chainStatus");
    }
    /**
     * Gets the classification property value. The classification property
     * @return a {@link ProvenanceClassification}
     */
    @jakarta.annotation.Nullable
    public ProvenanceClassification getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assertedBy", (n) -> { this.setAssertedBy(n.getObjectValue(ProvenanceAssertedBy::createFromDiscriminatorValue)); });
        deserializerMap.put("assertions", (n) -> { this.setAssertions(n.getCollectionOfObjectValues(ProvenanceAssertion::createFromDiscriminatorValue)); });
        deserializerMap.put("chainStatus", (n) -> { this.setChainStatus(n.getObjectValue(ProvenanceChainStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(ProvenanceClassification::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("assertions", this.getAssertions());
        writer.writeObjectValue("chainStatus", this.getChainStatus());
        writer.writeEnumValue("classification", this.getClassification());
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
     * Sets the assertedBy property value. Identifies the actor that established the provenance. This property is computed by the service.
     * @param value Value to set for the assertedBy property.
     */
    public void setAssertedBy(@jakarta.annotation.Nullable final ProvenanceAssertedBy value) {
        this.backingStore.set("assertedBy", value);
    }
    /**
     * Sets the assertions property value. The assertions that support the credential&apos;s provenance classification.
     * @param value Value to set for the assertions property.
     */
    public void setAssertions(@jakarta.annotation.Nullable final java.util.List<ProvenanceAssertion> value) {
        this.backingStore.set("assertions", value);
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
     * Sets the chainStatus property value. The current integrity status of the credential&apos;s chain of trust.
     * @param value Value to set for the chainStatus property.
     */
    public void setChainStatus(@jakarta.annotation.Nullable final ProvenanceChainStatus value) {
        this.backingStore.set("chainStatus", value);
    }
    /**
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final ProvenanceClassification value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
