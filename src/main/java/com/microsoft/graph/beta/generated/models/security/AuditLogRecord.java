package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditLogRecord extends Entity implements Parsable {
    /**
     * Instantiates a new AuditLogRecord and sets the default values.
     */
    public AuditLogRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditLogRecord
     */
    @jakarta.annotation.Nonnull
    public static AuditLogRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLogRecord();
    }
    /**
     * Gets the administrativeUnits property value. The administrativeUnits property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdministrativeUnits() {
        return this.backingStore.get("administrativeUnits");
    }
    /**
     * Gets the auditData property value. The auditData property
     * @return a AuditData
     */
    @jakarta.annotation.Nullable
    public AuditData getAuditData() {
        return this.backingStore.get("auditData");
    }
    /**
     * Gets the auditLogRecordType property value. The auditLogRecordType property
     * @return a AuditLogRecordAuditLogRecordType
     */
    @jakarta.annotation.Nullable
    public AuditLogRecordAuditLogRecordType getAuditLogRecordType() {
        return this.backingStore.get("auditLogRecordType");
    }
    /**
     * Gets the clientIp property value. The clientIp property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientIp() {
        return this.backingStore.get("clientIp");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnits", (n) -> { this.setAdministrativeUnits(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("auditData", (n) -> { this.setAuditData(n.getObjectValue(AuditData::createFromDiscriminatorValue)); });
        deserializerMap.put("auditLogRecordType", (n) -> { this.setAuditLogRecordType(n.getEnumValue(AuditLogRecordAuditLogRecordType::forValue)); });
        deserializerMap.put("clientIp", (n) -> { this.setClientIp(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getStringValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(AuditLogRecordUserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The objectId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObjectId() {
        return this.backingStore.get("objectId");
    }
    /**
     * Gets the operation property value. The operation property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperation() {
        return this.backingStore.get("operation");
    }
    /**
     * Gets the organizationId property value. The organizationId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.backingStore.get("organizationId");
    }
    /**
     * Gets the service property value. The service property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.backingStore.get("service");
    }
    /**
     * Gets the userId property value. The userId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a AuditLogRecordUserType
     */
    @jakarta.annotation.Nullable
    public AuditLogRecordUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("administrativeUnits", this.getAdministrativeUnits());
        writer.writeObjectValue("auditData", this.getAuditData());
        writer.writeEnumValue("auditLogRecordType", this.getAuditLogRecordType());
        writer.writeStringValue("clientIp", this.getClientIp());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("operation", this.getOperation());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeStringValue("service", this.getService());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the administrativeUnits property value. The administrativeUnits property
     * @param value Value to set for the administrativeUnits property.
     */
    public void setAdministrativeUnits(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("administrativeUnits", value);
    }
    /**
     * Sets the auditData property value. The auditData property
     * @param value Value to set for the auditData property.
     */
    public void setAuditData(@jakarta.annotation.Nullable final AuditData value) {
        this.backingStore.set("auditData", value);
    }
    /**
     * Sets the auditLogRecordType property value. The auditLogRecordType property
     * @param value Value to set for the auditLogRecordType property.
     */
    public void setAuditLogRecordType(@jakarta.annotation.Nullable final AuditLogRecordAuditLogRecordType value) {
        this.backingStore.set("auditLogRecordType", value);
    }
    /**
     * Sets the clientIp property value. The clientIp property
     * @param value Value to set for the clientIp property.
     */
    public void setClientIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientIp", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the objectId property value. The objectId property
     * @param value Value to set for the objectId property.
     */
    public void setObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectId", value);
    }
    /**
     * Sets the operation property value. The operation property
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operation", value);
    }
    /**
     * Sets the organizationId property value. The organizationId property
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationId", value);
    }
    /**
     * Sets the service property value. The service property
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("service", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final AuditLogRecordUserType value) {
        this.backingStore.set("userType", value);
    }
}
