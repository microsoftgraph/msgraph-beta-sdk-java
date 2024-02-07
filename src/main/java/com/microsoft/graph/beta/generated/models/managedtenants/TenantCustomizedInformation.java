package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantCustomizedInformation extends Entity implements Parsable {
    /**
     * Instantiates a new TenantCustomizedInformation and sets the default values.
     */
    public TenantCustomizedInformation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TenantCustomizedInformation
     */
    @jakarta.annotation.Nonnull
    public static TenantCustomizedInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantCustomizedInformation();
    }
    /**
     * Gets the contacts property value. The collection of contacts for the managed tenant. Optional.
     * @return a java.util.List<TenantContactInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantContactInformation> getContacts() {
        return this.backingStore.get("contacts");
    }
    /**
     * Gets the displayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contacts", (n) -> { this.setContacts(n.getCollectionOfObjectValues(TenantContactInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the website property value. The website for the managed tenant. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.backingStore.get("website");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("contacts", this.getContacts());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("website", this.getWebsite());
    }
    /**
     * Sets the contacts property value. The collection of contacts for the managed tenant. Optional.
     * @param value Value to set for the contacts property.
     */
    public void setContacts(@jakarta.annotation.Nullable final java.util.List<TenantContactInformation> value) {
        this.backingStore.set("contacts", value);
    }
    /**
     * Sets the displayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the website property value. The website for the managed tenant. Required.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("website", value);
    }
}
