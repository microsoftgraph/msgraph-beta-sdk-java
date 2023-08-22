package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResellerDelegatedAdminRelationship extends DelegatedAdminRelationship implements Parsable {
    /**
     * The indirectProviderTenantId property
     */
    private String indirectProviderTenantId;
    /**
     * The isPartnerConsentPending property
     */
    private Boolean isPartnerConsentPending;
    /**
     * Instantiates a new resellerDelegatedAdminRelationship and sets the default values.
     */
    public ResellerDelegatedAdminRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resellerDelegatedAdminRelationship
     */
    @jakarta.annotation.Nonnull
    public static ResellerDelegatedAdminRelationship createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResellerDelegatedAdminRelationship();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("indirectProviderTenantId", (n) -> { this.setIndirectProviderTenantId(n.getStringValue()); });
        deserializerMap.put("isPartnerConsentPending", (n) -> { this.setIsPartnerConsentPending(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the indirectProviderTenantId property value. The indirectProviderTenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIndirectProviderTenantId() {
        return this.indirectProviderTenantId;
    }
    /**
     * Gets the isPartnerConsentPending property value. The isPartnerConsentPending property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPartnerConsentPending() {
        return this.isPartnerConsentPending;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("indirectProviderTenantId", this.getIndirectProviderTenantId());
        writer.writeBooleanValue("isPartnerConsentPending", this.getIsPartnerConsentPending());
    }
    /**
     * Sets the indirectProviderTenantId property value. The indirectProviderTenantId property
     * @param value Value to set for the indirectProviderTenantId property.
     */
    public void setIndirectProviderTenantId(@jakarta.annotation.Nullable final String value) {
        this.indirectProviderTenantId = value;
    }
    /**
     * Sets the isPartnerConsentPending property value. The isPartnerConsentPending property
     * @param value Value to set for the isPartnerConsentPending property.
     */
    public void setIsPartnerConsentPending(@jakarta.annotation.Nullable final Boolean value) {
        this.isPartnerConsentPending = value;
    }
}
