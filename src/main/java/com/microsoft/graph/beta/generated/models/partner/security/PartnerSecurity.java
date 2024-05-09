package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PartnerSecurity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PartnerSecurity} and sets the default values.
     */
    public PartnerSecurity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PartnerSecurity}
     */
    @jakarta.annotation.Nonnull
    public static PartnerSecurity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PartnerSecurity();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("securityAlerts", (n) -> { this.setSecurityAlerts(n.getCollectionOfObjectValues(PartnerSecurityAlert::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the securityAlerts property value. The securityAlerts property
     * @return a {@link java.util.List<PartnerSecurityAlert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PartnerSecurityAlert> getSecurityAlerts() {
        return this.backingStore.get("securityAlerts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("securityAlerts", this.getSecurityAlerts());
    }
    /**
     * Sets the securityAlerts property value. The securityAlerts property
     * @param value Value to set for the securityAlerts property.
     */
    public void setSecurityAlerts(@jakarta.annotation.Nullable final java.util.List<PartnerSecurityAlert> value) {
        this.backingStore.set("securityAlerts", value);
    }
}
