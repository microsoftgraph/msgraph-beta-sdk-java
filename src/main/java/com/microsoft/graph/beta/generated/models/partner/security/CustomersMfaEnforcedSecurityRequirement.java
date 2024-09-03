package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomersMfaEnforcedSecurityRequirement extends SecurityRequirement implements Parsable {
    /**
     * Instantiates a new {@link CustomersMfaEnforcedSecurityRequirement} and sets the default values.
     */
    public CustomersMfaEnforcedSecurityRequirement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomersMfaEnforcedSecurityRequirement}
     */
    @jakarta.annotation.Nonnull
    public static CustomersMfaEnforcedSecurityRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomersMfaEnforcedSecurityRequirement();
    }
    /**
     * Gets the compliantTenantCount property value. The number of customer tenants that are compliant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCompliantTenantCount() {
        return this.backingStore.get("compliantTenantCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantTenantCount", (n) -> { this.setCompliantTenantCount(n.getLongValue()); });
        deserializerMap.put("totalTenantCount", (n) -> { this.setTotalTenantCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalTenantCount property value. The total number of customer tenants associated with this partner
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalTenantCount() {
        return this.backingStore.get("totalTenantCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("compliantTenantCount", this.getCompliantTenantCount());
        writer.writeLongValue("totalTenantCount", this.getTotalTenantCount());
    }
    /**
     * Sets the compliantTenantCount property value. The number of customer tenants that are compliant.
     * @param value Value to set for the compliantTenantCount property.
     */
    public void setCompliantTenantCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("compliantTenantCount", value);
    }
    /**
     * Sets the totalTenantCount property value. The total number of customer tenants associated with this partner
     * @param value Value to set for the totalTenantCount property.
     */
    public void setTotalTenantCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalTenantCount", value);
    }
}
