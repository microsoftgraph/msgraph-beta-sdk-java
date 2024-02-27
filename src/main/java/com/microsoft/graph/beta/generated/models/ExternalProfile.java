package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalProfile extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link ExternalProfile} and sets the default values.
     */
    public ExternalProfile() {
        super();
        this.setOdataType("#microsoft.graph.externalProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalProfile}
     */
    @jakarta.annotation.Nonnull
    public static ExternalProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalUserProfile": return new ExternalUserProfile();
                case "#microsoft.graph.pendingExternalUserProfile": return new PendingExternalUserProfile();
            }
        }
        return new ExternalProfile();
    }
    /**
     * Gets the address property value. The office address of the external user profile.
     * @return a {@link PhysicalOfficeAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalOfficeAddress getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the companyName property value. The company name of the external user profile. Supports $filter (eq, startswith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.backingStore.get("companyName");
    }
    /**
     * Gets the createdBy property value. The object ID of the user who created the external user profile. Read-only. Not nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time when this external user was created. Not nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the department property value. The department of the external user profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the displayName property value. The display name of the external user profile.
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
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalOfficeAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isDiscoverable", (n) -> { this.setIsDiscoverable(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("supervisorId", (n) -> { this.setSupervisorId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDiscoverable property value. Represents whether the external user profile is discoverable in the directory. When true, this external profile shows up in Teams search.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDiscoverable() {
        return this.backingStore.get("isDiscoverable");
    }
    /**
     * Gets the isEnabled property value. Represents whether the external user profile is enabled in the directory. This property is peer to the accountEnabled property on the user object.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the jobTitle property value. The job title of the external user profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.backingStore.get("jobTitle");
    }
    /**
     * Gets the phoneNumber property value. The phone number of the external user profile. Must be in E164 format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the supervisorId property value. The object ID of the supervisor of the external user profile. Supports $filter (eq, startswith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSupervisorId() {
        return this.backingStore.get("supervisorId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDiscoverable", this.getIsDiscoverable());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("supervisorId", this.getSupervisorId());
    }
    /**
     * Sets the address property value. The office address of the external user profile.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalOfficeAddress value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the companyName property value. The company name of the external user profile. Supports $filter (eq, startswith).
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyName", value);
    }
    /**
     * Sets the createdBy property value. The object ID of the user who created the external user profile. Read-only. Not nullable.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time when this external user was created. Not nullable. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the department property value. The department of the external user profile.
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the displayName property value. The display name of the external user profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isDiscoverable property value. Represents whether the external user profile is discoverable in the directory. When true, this external profile shows up in Teams search.
     * @param value Value to set for the isDiscoverable property.
     */
    public void setIsDiscoverable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDiscoverable", value);
    }
    /**
     * Sets the isEnabled property value. Represents whether the external user profile is enabled in the directory. This property is peer to the accountEnabled property on the user object.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the jobTitle property value. The job title of the external user profile.
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobTitle", value);
    }
    /**
     * Sets the phoneNumber property value. The phone number of the external user profile. Must be in E164 format.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the supervisorId property value. The object ID of the supervisor of the external user profile. Supports $filter (eq, startswith).
     * @param value Value to set for the supervisorId property.
     */
    public void setSupervisorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("supervisorId", value);
    }
}
