package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityContainer} and sets the default values.
     */
    public IdentityContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityContainer}
     */
    @jakarta.annotation.Nonnull
    public static IdentityContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityContainer();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("healthIssues", (n) -> { this.setHealthIssues(n.getCollectionOfObjectValues(HealthIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("identityAccounts", (n) -> { this.setIdentityAccounts(n.getCollectionOfObjectValues(IdentityAccounts::createFromDiscriminatorValue)); });
        deserializerMap.put("sensors", (n) -> { this.setSensors(n.getCollectionOfObjectValues(Sensor::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthIssues property value. Represents potential issues within a customer&apos;s Microsoft Defender for Identity configuration that Microsoft Defender for Identity identified.
     * @return a {@link java.util.List<HealthIssue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HealthIssue> getHealthIssues() {
        return this.backingStore.get("healthIssues");
    }
    /**
     * Gets the identityAccounts property value. The identityAccounts property
     * @return a {@link java.util.List<IdentityAccounts>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityAccounts> getIdentityAccounts() {
        return this.backingStore.get("identityAccounts");
    }
    /**
     * Gets the sensors property value. Represents a customer&apos;s Microsoft Defender for Identity sensors.
     * @return a {@link java.util.List<Sensor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Sensor> getSensors() {
        return this.backingStore.get("sensors");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("healthIssues", this.getHealthIssues());
        writer.writeCollectionOfObjectValues("identityAccounts", this.getIdentityAccounts());
        writer.writeCollectionOfObjectValues("sensors", this.getSensors());
    }
    /**
     * Sets the healthIssues property value. Represents potential issues within a customer&apos;s Microsoft Defender for Identity configuration that Microsoft Defender for Identity identified.
     * @param value Value to set for the healthIssues property.
     */
    public void setHealthIssues(@jakarta.annotation.Nullable final java.util.List<HealthIssue> value) {
        this.backingStore.set("healthIssues", value);
    }
    /**
     * Sets the identityAccounts property value. The identityAccounts property
     * @param value Value to set for the identityAccounts property.
     */
    public void setIdentityAccounts(@jakarta.annotation.Nullable final java.util.List<IdentityAccounts> value) {
        this.backingStore.set("identityAccounts", value);
    }
    /**
     * Sets the sensors property value. Represents a customer&apos;s Microsoft Defender for Identity sensors.
     * @param value Value to set for the sensors property.
     */
    public void setSensors(@jakarta.annotation.Nullable final java.util.List<Sensor> value) {
        this.backingStore.set("sensors", value);
    }
}
