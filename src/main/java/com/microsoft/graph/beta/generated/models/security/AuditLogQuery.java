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
public class AuditLogQuery extends Entity implements Parsable {
    /**
     * Instantiates a new AuditLogQuery and sets the default values.
     */
    public AuditLogQuery() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditLogQuery
     */
    @jakarta.annotation.Nonnull
    public static AuditLogQuery createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLogQuery();
    }
    /**
     * Gets the administrativeUnitIdFilters property value. The administrativeUnitIdFilters property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdministrativeUnitIdFilters() {
        return this.backingStore.get("administrativeUnitIdFilters");
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("administrativeUnitIdFilters", (n) -> { this.setAdministrativeUnitIdFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("filterEndDateTime", (n) -> { this.setFilterEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("filterStartDateTime", (n) -> { this.setFilterStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ipAddressFilters", (n) -> { this.setIpAddressFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("keywordFilter", (n) -> { this.setKeywordFilter(n.getStringValue()); });
        deserializerMap.put("objectIdFilters", (n) -> { this.setObjectIdFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("operationFilters", (n) -> { this.setOperationFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("records", (n) -> { this.setRecords(n.getCollectionOfObjectValues(AuditLogRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("recordTypeFilters", (n) -> { this.setRecordTypeFilters(n.getCollectionOfEnumValues(AuditLogQueryRecordTypeFilters::forValue)); });
        deserializerMap.put("serviceFilters", (n) -> { this.setServiceFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AuditLogQueryStatus::forValue)); });
        deserializerMap.put("userPrincipalNameFilters", (n) -> { this.setUserPrincipalNameFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filterEndDateTime property value. The filterEndDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFilterEndDateTime() {
        return this.backingStore.get("filterEndDateTime");
    }
    /**
     * Gets the filterStartDateTime property value. The filterStartDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFilterStartDateTime() {
        return this.backingStore.get("filterStartDateTime");
    }
    /**
     * Gets the ipAddressFilters property value. The ipAddressFilters property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpAddressFilters() {
        return this.backingStore.get("ipAddressFilters");
    }
    /**
     * Gets the keywordFilter property value. The keywordFilter property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKeywordFilter() {
        return this.backingStore.get("keywordFilter");
    }
    /**
     * Gets the objectIdFilters property value. The objectIdFilters property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getObjectIdFilters() {
        return this.backingStore.get("objectIdFilters");
    }
    /**
     * Gets the operationFilters property value. The operationFilters property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOperationFilters() {
        return this.backingStore.get("operationFilters");
    }
    /**
     * Gets the records property value. The records property
     * @return a java.util.List<AuditLogRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditLogRecord> getRecords() {
        return this.backingStore.get("records");
    }
    /**
     * Gets the recordTypeFilters property value. The recordTypeFilters property
     * @return a java.util.List<AuditLogQueryRecordTypeFilters>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditLogQueryRecordTypeFilters> getRecordTypeFilters() {
        return this.backingStore.get("recordTypeFilters");
    }
    /**
     * Gets the serviceFilters property value. The serviceFilters property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getServiceFilters() {
        return this.backingStore.get("serviceFilters");
    }
    /**
     * Gets the status property value. The status property
     * @return a AuditLogQueryStatus
     */
    @jakarta.annotation.Nullable
    public AuditLogQueryStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userPrincipalNameFilters property value. The userPrincipalNameFilters property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserPrincipalNameFilters() {
        return this.backingStore.get("userPrincipalNameFilters");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("administrativeUnitIdFilters", this.getAdministrativeUnitIdFilters());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("filterEndDateTime", this.getFilterEndDateTime());
        writer.writeOffsetDateTimeValue("filterStartDateTime", this.getFilterStartDateTime());
        writer.writeCollectionOfPrimitiveValues("ipAddressFilters", this.getIpAddressFilters());
        writer.writeStringValue("keywordFilter", this.getKeywordFilter());
        writer.writeCollectionOfPrimitiveValues("objectIdFilters", this.getObjectIdFilters());
        writer.writeCollectionOfPrimitiveValues("operationFilters", this.getOperationFilters());
        writer.writeCollectionOfObjectValues("records", this.getRecords());
        writer.writeCollectionOfEnumValues("recordTypeFilters", this.getRecordTypeFilters());
        writer.writeCollectionOfPrimitiveValues("serviceFilters", this.getServiceFilters());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("userPrincipalNameFilters", this.getUserPrincipalNameFilters());
    }
    /**
     * Sets the administrativeUnitIdFilters property value. The administrativeUnitIdFilters property
     * @param value Value to set for the administrativeUnitIdFilters property.
     */
    public void setAdministrativeUnitIdFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("administrativeUnitIdFilters", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the filterEndDateTime property value. The filterEndDateTime property
     * @param value Value to set for the filterEndDateTime property.
     */
    public void setFilterEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("filterEndDateTime", value);
    }
    /**
     * Sets the filterStartDateTime property value. The filterStartDateTime property
     * @param value Value to set for the filterStartDateTime property.
     */
    public void setFilterStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("filterStartDateTime", value);
    }
    /**
     * Sets the ipAddressFilters property value. The ipAddressFilters property
     * @param value Value to set for the ipAddressFilters property.
     */
    public void setIpAddressFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ipAddressFilters", value);
    }
    /**
     * Sets the keywordFilter property value. The keywordFilter property
     * @param value Value to set for the keywordFilter property.
     */
    public void setKeywordFilter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keywordFilter", value);
    }
    /**
     * Sets the objectIdFilters property value. The objectIdFilters property
     * @param value Value to set for the objectIdFilters property.
     */
    public void setObjectIdFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("objectIdFilters", value);
    }
    /**
     * Sets the operationFilters property value. The operationFilters property
     * @param value Value to set for the operationFilters property.
     */
    public void setOperationFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("operationFilters", value);
    }
    /**
     * Sets the records property value. The records property
     * @param value Value to set for the records property.
     */
    public void setRecords(@jakarta.annotation.Nullable final java.util.List<AuditLogRecord> value) {
        this.backingStore.set("records", value);
    }
    /**
     * Sets the recordTypeFilters property value. The recordTypeFilters property
     * @param value Value to set for the recordTypeFilters property.
     */
    public void setRecordTypeFilters(@jakarta.annotation.Nullable final java.util.List<AuditLogQueryRecordTypeFilters> value) {
        this.backingStore.set("recordTypeFilters", value);
    }
    /**
     * Sets the serviceFilters property value. The serviceFilters property
     * @param value Value to set for the serviceFilters property.
     */
    public void setServiceFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("serviceFilters", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AuditLogQueryStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userPrincipalNameFilters property value. The userPrincipalNameFilters property
     * @param value Value to set for the userPrincipalNameFilters property.
     */
    public void setUserPrincipalNameFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("userPrincipalNameFilters", value);
    }
}
