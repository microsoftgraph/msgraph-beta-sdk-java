package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantCustomizedInformation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantCustomizedInformation} and sets the default values.
     */
    public TenantCustomizedInformation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantCustomizedInformation}
     */
    @jakarta.annotation.Nonnull
    public static TenantCustomizedInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantCustomizedInformation();
    }
    /**
     * Gets the businessRelationship property value. Describes the relationship between the Managed Services Provider and the managed tenant; for example, Managed, Co-managed, Licensing. The maximum length is 250 characters. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessRelationship() {
        return this.backingStore.get("businessRelationship");
    }
    /**
     * Gets the complianceRequirements property value. Contains the compliance requirements for the customer tenant; for example, HIPPA, NIST, CMMC. The maximum length is 250 characters per compliance requirement. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getComplianceRequirements() {
        return this.backingStore.get("complianceRequirements");
    }
    /**
     * Gets the contacts property value. The collection of contacts for the managed tenant. Optional.
     * @return a {@link java.util.List<TenantContactInformation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantContactInformation> getContacts() {
        return this.backingStore.get("contacts");
    }
    /**
     * Gets the displayName property value. The display name for the managed tenant. Required. Read-only.
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
        deserializerMap.put("businessRelationship", (n) -> { this.setBusinessRelationship(n.getStringValue()); });
        deserializerMap.put("complianceRequirements", (n) -> { this.setComplianceRequirements(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contacts", (n) -> { this.setContacts(n.getCollectionOfObjectValues(TenantContactInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("managedServicesPlans", (n) -> { this.setManagedServicesPlans(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("noteLastModifiedDateTime", (n) -> { this.setNoteLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("partnerRelationshipManagerUserIds", (n) -> { this.setPartnerRelationshipManagerUserIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedServicesPlans property value. This is the Managed Services Plans for the customer tenant that the Managed Services Provider manages. The maximum length is 250 characters per managed service plan. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getManagedServicesPlans() {
        return this.backingStore.get("managedServicesPlans");
    }
    /**
     * Gets the note property value. A field for the Managed Services Provider technician to input custom text to share notes between technicians within the Managed Service Providers. The maximum length is 5000 characters. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNote() {
        return this.backingStore.get("note");
    }
    /**
     * Gets the noteLastModifiedDateTime property value. The date on which the note field of this entity was last modified. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNoteLastModifiedDateTime() {
        return this.backingStore.get("noteLastModifiedDateTime");
    }
    /**
     * Gets the partnerRelationshipManagerUserIds property value. The list of Entra user IDs for users in the Managed Services Provider that manage the relationship with the managed tenant. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPartnerRelationshipManagerUserIds() {
        return this.backingStore.get("partnerRelationshipManagerUserIds");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the website property value. The website for the managed tenant. Required.
     * @return a {@link String}
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
        writer.writeStringValue("businessRelationship", this.getBusinessRelationship());
        writer.writeCollectionOfPrimitiveValues("complianceRequirements", this.getComplianceRequirements());
        writer.writeCollectionOfObjectValues("contacts", this.getContacts());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("managedServicesPlans", this.getManagedServicesPlans());
        writer.writeStringValue("note", this.getNote());
        writer.writeOffsetDateTimeValue("noteLastModifiedDateTime", this.getNoteLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("partnerRelationshipManagerUserIds", this.getPartnerRelationshipManagerUserIds());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("website", this.getWebsite());
    }
    /**
     * Sets the businessRelationship property value. Describes the relationship between the Managed Services Provider and the managed tenant; for example, Managed, Co-managed, Licensing. The maximum length is 250 characters. Optional.
     * @param value Value to set for the businessRelationship property.
     */
    public void setBusinessRelationship(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("businessRelationship", value);
    }
    /**
     * Sets the complianceRequirements property value. Contains the compliance requirements for the customer tenant; for example, HIPPA, NIST, CMMC. The maximum length is 250 characters per compliance requirement. Optional.
     * @param value Value to set for the complianceRequirements property.
     */
    public void setComplianceRequirements(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("complianceRequirements", value);
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
     * Sets the managedServicesPlans property value. This is the Managed Services Plans for the customer tenant that the Managed Services Provider manages. The maximum length is 250 characters per managed service plan. Optional.
     * @param value Value to set for the managedServicesPlans property.
     */
    public void setManagedServicesPlans(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("managedServicesPlans", value);
    }
    /**
     * Sets the note property value. A field for the Managed Services Provider technician to input custom text to share notes between technicians within the Managed Service Providers. The maximum length is 5000 characters. Optional.
     * @param value Value to set for the note property.
     */
    public void setNote(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("note", value);
    }
    /**
     * Sets the noteLastModifiedDateTime property value. The date on which the note field of this entity was last modified. Optional.
     * @param value Value to set for the noteLastModifiedDateTime property.
     */
    public void setNoteLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("noteLastModifiedDateTime", value);
    }
    /**
     * Sets the partnerRelationshipManagerUserIds property value. The list of Entra user IDs for users in the Managed Services Provider that manage the relationship with the managed tenant. Optional.
     * @param value Value to set for the partnerRelationshipManagerUserIds property.
     */
    public void setPartnerRelationshipManagerUserIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("partnerRelationshipManagerUserIds", value);
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
