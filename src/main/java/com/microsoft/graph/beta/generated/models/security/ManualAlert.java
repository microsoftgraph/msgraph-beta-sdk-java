package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManualAlert extends Alert implements Parsable {
    /**
     * Instantiates a new {@link ManualAlert} and sets the default values.
     */
    public ManualAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManualAlert}
     */
    @jakarta.annotation.Nonnull
    public static ManualAlert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManualAlert();
    }
    /**
     * Gets the entityDefinitions property value. The entities associated with the alert. Each item specifies a security entity (such as a user, device, or IP address), its identifier, and its role in the alert context.
     * @return a {@link java.util.List<EntityDefinitionInput>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EntityDefinitionInput> getEntityDefinitions() {
        return this.backingStore.get("entityDefinitions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("entityDefinitions", (n) -> { this.setEntityDefinitions(n.getCollectionOfObjectValues(EntityDefinitionInput::createFromDiscriminatorValue)); });
        deserializerMap.put("isExcludedFromCorrelation", (n) -> { this.setIsExcludedFromCorrelation(n.getBooleanValue()); });
        deserializerMap.put("linkToIncident", (n) -> { this.setLinkToIncident(n.getLongValue()); });
        deserializerMap.put("sentinelWorkspace", (n) -> { this.setSentinelWorkspace(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isExcludedFromCorrelation property value. When true, excludes the alert from automatic correlation. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExcludedFromCorrelation() {
        return this.backingStore.get("isExcludedFromCorrelation");
    }
    /**
     * Gets the linkToIncident property value. ID of an existing incident to link to. If not provided, a new incident is created automatically.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLinkToIncident() {
        return this.backingStore.get("linkToIncident");
    }
    /**
     * Gets the sentinelWorkspace property value. Sentinel workspace identifier for workspace routing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSentinelWorkspace() {
        return this.backingStore.get("sentinelWorkspace");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("entityDefinitions", this.getEntityDefinitions());
        writer.writeBooleanValue("isExcludedFromCorrelation", this.getIsExcludedFromCorrelation());
        writer.writeLongValue("linkToIncident", this.getLinkToIncident());
        writer.writeStringValue("sentinelWorkspace", this.getSentinelWorkspace());
    }
    /**
     * Sets the entityDefinitions property value. The entities associated with the alert. Each item specifies a security entity (such as a user, device, or IP address), its identifier, and its role in the alert context.
     * @param value Value to set for the entityDefinitions property.
     */
    public void setEntityDefinitions(@jakarta.annotation.Nullable final java.util.List<EntityDefinitionInput> value) {
        this.backingStore.set("entityDefinitions", value);
    }
    /**
     * Sets the isExcludedFromCorrelation property value. When true, excludes the alert from automatic correlation. Default is false.
     * @param value Value to set for the isExcludedFromCorrelation property.
     */
    public void setIsExcludedFromCorrelation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExcludedFromCorrelation", value);
    }
    /**
     * Sets the linkToIncident property value. ID of an existing incident to link to. If not provided, a new incident is created automatically.
     * @param value Value to set for the linkToIncident property.
     */
    public void setLinkToIncident(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("linkToIncident", value);
    }
    /**
     * Sets the sentinelWorkspace property value. Sentinel workspace identifier for workspace routing.
     * @param value Value to set for the sentinelWorkspace property.
     */
    public void setSentinelWorkspace(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sentinelWorkspace", value);
    }
}
