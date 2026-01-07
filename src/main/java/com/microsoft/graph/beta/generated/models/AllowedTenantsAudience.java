package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllowedTenantsAudience extends SignInAudienceRestrictionsBase implements Parsable {
    /**
     * Instantiates a new {@link AllowedTenantsAudience} and sets the default values.
     */
    public AllowedTenantsAudience() {
        super();
        this.setOdataType("#microsoft.graph.allowedTenantsAudience");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AllowedTenantsAudience}
     */
    @jakarta.annotation.Nonnull
    public static AllowedTenantsAudience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllowedTenantsAudience();
    }
    /**
     * Gets the allowedTenantIds property value. The list of Entra tenant IDs where the application can be used as either a client application or a resource application (API). Must contain at least one value. The tenant ID where the application is registered may be included, but is not required (see isHomeTenantAllowed). Required.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedTenantIds() {
        return this.backingStore.get("allowedTenantIds");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedTenantIds", (n) -> { this.setAllowedTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isHomeTenantAllowed", (n) -> { this.setIsHomeTenantAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHomeTenantAllowed property value. Whether the tenant where the application is registered is allowed. Currently, only true is supported. Default is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHomeTenantAllowed() {
        return this.backingStore.get("isHomeTenantAllowed");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedTenantIds", this.getAllowedTenantIds());
        writer.writeBooleanValue("isHomeTenantAllowed", this.getIsHomeTenantAllowed());
    }
    /**
     * Sets the allowedTenantIds property value. The list of Entra tenant IDs where the application can be used as either a client application or a resource application (API). Must contain at least one value. The tenant ID where the application is registered may be included, but is not required (see isHomeTenantAllowed). Required.
     * @param value Value to set for the allowedTenantIds property.
     */
    public void setAllowedTenantIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedTenantIds", value);
    }
    /**
     * Sets the isHomeTenantAllowed property value. Whether the tenant where the application is registered is allowed. Currently, only true is supported. Default is true.
     * @param value Value to set for the isHomeTenantAllowed property.
     */
    public void setIsHomeTenantAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHomeTenantAllowed", value);
    }
}
