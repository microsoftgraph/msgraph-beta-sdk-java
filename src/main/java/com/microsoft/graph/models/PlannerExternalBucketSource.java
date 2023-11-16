package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerExternalBucketSource extends PlannerBucketCreation implements Parsable {
    /**
     * Instantiates a new PlannerExternalBucketSource and sets the default values.
     */
    public PlannerExternalBucketSource() {
        super();
        this.setOdataType("#microsoft.graph.plannerExternalBucketSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerExternalBucketSource
     */
    @jakarta.annotation.Nonnull
    public static PlannerExternalBucketSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerExternalBucketSource();
    }
    /**
     * Gets the contextScenarioId property value. Nullable. An identifier for the scenario associated with this external source. This should be in reverse DNS format. For example, Contoso company owned application for customer support would have a value like 'com.constoso.customerSupport'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContextScenarioId() {
        return this.BackingStore.get("contextScenarioId");
    }
    /**
     * Gets the externalContextId property value. Nullable. The ID of the external entity's containing entity or context.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalContextId() {
        return this.BackingStore.get("externalContextId");
    }
    /**
     * Gets the externalObjectId property value. Nullable. The ID of the entity that an external service associates with a bucket.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalObjectId() {
        return this.BackingStore.get("externalObjectId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contextScenarioId", (n) -> { this.setContextScenarioId(n.getStringValue()); });
        deserializerMap.put("externalContextId", (n) -> { this.setExternalContextId(n.getStringValue()); });
        deserializerMap.put("externalObjectId", (n) -> { this.setExternalObjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contextScenarioId", this.getContextScenarioId());
        writer.writeStringValue("externalContextId", this.getExternalContextId());
        writer.writeStringValue("externalObjectId", this.getExternalObjectId());
    }
    /**
     * Sets the contextScenarioId property value. Nullable. An identifier for the scenario associated with this external source. This should be in reverse DNS format. For example, Contoso company owned application for customer support would have a value like 'com.constoso.customerSupport'.
     * @param value Value to set for the contextScenarioId property.
     */
    public void setContextScenarioId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contextScenarioId", value);
    }
    /**
     * Sets the externalContextId property value. Nullable. The ID of the external entity's containing entity or context.
     * @param value Value to set for the externalContextId property.
     */
    public void setExternalContextId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("externalContextId", value);
    }
    /**
     * Sets the externalObjectId property value. Nullable. The ID of the entity that an external service associates with a bucket.
     * @param value Value to set for the externalObjectId property.
     */
    public void setExternalObjectId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("externalObjectId", value);
    }
}
