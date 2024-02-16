package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantGroup extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantGroup} and sets the default values.
     */
    public TenantGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantGroup}
     */
    @jakarta.annotation.Nonnull
    public static TenantGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantGroup();
    }
    /**
     * Gets the allTenantsIncluded property value. A flag indicating whether all managed tenant are included in the tenant group. Required. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllTenantsIncluded() {
        return this.backingStore.get("allTenantsIncluded");
    }
    /**
     * Gets the displayName property value. The display name for the tenant group. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allTenantsIncluded", (n) -> { this.setAllTenantsIncluded(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("managementActions", (n) -> { this.setManagementActions(n.getCollectionOfObjectValues(ManagementActionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("managementIntents", (n) -> { this.setManagementIntents(n.getCollectionOfObjectValues(ManagementIntentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantIds", (n) -> { this.setTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the managementActions property value. The collection of management action associated with the tenant group. Optional. Read-only.
     * @return a {@link java.util.List<ManagementActionInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementActionInfo> getManagementActions() {
        return this.backingStore.get("managementActions");
    }
    /**
     * Gets the managementIntents property value. The collection of management intents associated with the tenant group. Optional. Read-only.
     * @return a {@link java.util.List<ManagementIntentInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementIntentInfo> getManagementIntents() {
        return this.backingStore.get("managementIntents");
    }
    /**
     * Gets the tenantIds property value. The collection of managed tenant identifiers include in the tenant group. Optional. Read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTenantIds() {
        return this.backingStore.get("tenantIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allTenantsIncluded", this.getAllTenantsIncluded());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("managementActions", this.getManagementActions());
        writer.writeCollectionOfObjectValues("managementIntents", this.getManagementIntents());
        writer.writeCollectionOfPrimitiveValues("tenantIds", this.getTenantIds());
    }
    /**
     * Sets the allTenantsIncluded property value. A flag indicating whether all managed tenant are included in the tenant group. Required. Read-only.
     * @param value Value to set for the allTenantsIncluded property.
     */
    public void setAllTenantsIncluded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allTenantsIncluded", value);
    }
    /**
     * Sets the displayName property value. The display name for the tenant group. Optional. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the managementActions property value. The collection of management action associated with the tenant group. Optional. Read-only.
     * @param value Value to set for the managementActions property.
     */
    public void setManagementActions(@jakarta.annotation.Nullable final java.util.List<ManagementActionInfo> value) {
        this.backingStore.set("managementActions", value);
    }
    /**
     * Sets the managementIntents property value. The collection of management intents associated with the tenant group. Optional. Read-only.
     * @param value Value to set for the managementIntents property.
     */
    public void setManagementIntents(@jakarta.annotation.Nullable final java.util.List<ManagementIntentInfo> value) {
        this.backingStore.set("managementIntents", value);
    }
    /**
     * Sets the tenantIds property value. The collection of managed tenant identifiers include in the tenant group. Optional. Read-only.
     * @param value Value to set for the tenantIds property.
     */
    public void setTenantIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tenantIds", value);
    }
}
