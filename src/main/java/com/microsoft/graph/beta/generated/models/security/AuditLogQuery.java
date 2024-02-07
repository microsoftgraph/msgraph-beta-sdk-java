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
     * Gets the administrativeUnitIdFilters property value. The administrative units tagged to an audit log record.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdministrativeUnitIdFilters() {
        return this.backingStore.get("administrativeUnitIdFilters");
    }
    /**
     * Gets the displayName property value. The display name of the saved audit log query.
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
        deserializerMap.put("recordTypeFilters", (n) -> { this.setRecordTypeFilters(n.getCollectionOfEnumValues(AuditLogRecordType::forValue)); });
        deserializerMap.put("serviceFilters", (n) -> { this.setServiceFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AuditLogQueryStatus::forValue)); });
        deserializerMap.put("userPrincipalNameFilters", (n) -> { this.setUserPrincipalNameFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filterEndDateTime property value. The end date of the date range in the query.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFilterEndDateTime() {
        return this.backingStore.get("filterEndDateTime");
    }
    /**
     * Gets the filterStartDateTime property value. The start date of the date range in the query.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFilterStartDateTime() {
        return this.backingStore.get("filterStartDateTime");
    }
    /**
     * Gets the ipAddressFilters property value. The IP address of the device that was used when the activity was logged.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpAddressFilters() {
        return this.backingStore.get("ipAddressFilters");
    }
    /**
     * Gets the keywordFilter property value. Free text field to search non-indexed properties of the audit log.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKeywordFilter() {
        return this.backingStore.get("keywordFilter");
    }
    /**
     * Gets the objectIdFilters property value. For SharePoint and OneDrive for Business activity, the full path name of the file or folder accessed by the user. For Exchange admin audit logging, the name of the object that was modified by the cmdlet.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getObjectIdFilters() {
        return this.backingStore.get("objectIdFilters");
    }
    /**
     * Gets the operationFilters property value. The name of the user or admin activity. For a description of the most common operations/activities, see Search the audit log in the Office 365 Protection Center.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOperationFilters() {
        return this.backingStore.get("operationFilters");
    }
    /**
     * Gets the records property value. An individual audit log record.
     * @return a java.util.List<AuditLogRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditLogRecord> getRecords() {
        return this.backingStore.get("records");
    }
    /**
     * Gets the recordTypeFilters property value. The recordTypeFilters property
     * @return a java.util.List<AuditLogRecordType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditLogRecordType> getRecordTypeFilters() {
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
     * Gets the status property value. Describes the current status of the query. The possible values are: notStarted, running, succeeded, failed, cancelled, unknownFutureValue.
     * @return a AuditLogQueryStatus
     */
    @jakarta.annotation.Nullable
    public AuditLogQueryStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userPrincipalNameFilters property value. The UPN (user principal name) of the user who performed the action (specified in the operation property) that resulted in the record being logged; for example, myname@mydomain_name.
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
     * Sets the administrativeUnitIdFilters property value. The administrative units tagged to an audit log record.
     * @param value Value to set for the administrativeUnitIdFilters property.
     */
    public void setAdministrativeUnitIdFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("administrativeUnitIdFilters", value);
    }
    /**
     * Sets the displayName property value. The display name of the saved audit log query.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the filterEndDateTime property value. The end date of the date range in the query.
     * @param value Value to set for the filterEndDateTime property.
     */
    public void setFilterEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("filterEndDateTime", value);
    }
    /**
     * Sets the filterStartDateTime property value. The start date of the date range in the query.
     * @param value Value to set for the filterStartDateTime property.
     */
    public void setFilterStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("filterStartDateTime", value);
    }
    /**
     * Sets the ipAddressFilters property value. The IP address of the device that was used when the activity was logged.
     * @param value Value to set for the ipAddressFilters property.
     */
    public void setIpAddressFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ipAddressFilters", value);
    }
    /**
     * Sets the keywordFilter property value. Free text field to search non-indexed properties of the audit log.
     * @param value Value to set for the keywordFilter property.
     */
    public void setKeywordFilter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keywordFilter", value);
    }
    /**
     * Sets the objectIdFilters property value. For SharePoint and OneDrive for Business activity, the full path name of the file or folder accessed by the user. For Exchange admin audit logging, the name of the object that was modified by the cmdlet.
     * @param value Value to set for the objectIdFilters property.
     */
    public void setObjectIdFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("objectIdFilters", value);
    }
    /**
     * Sets the operationFilters property value. The name of the user or admin activity. For a description of the most common operations/activities, see Search the audit log in the Office 365 Protection Center.
     * @param value Value to set for the operationFilters property.
     */
    public void setOperationFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("operationFilters", value);
    }
    /**
     * Sets the records property value. An individual audit log record.
     * @param value Value to set for the records property.
     */
    public void setRecords(@jakarta.annotation.Nullable final java.util.List<AuditLogRecord> value) {
        this.backingStore.set("records", value);
    }
    /**
     * Sets the recordTypeFilters property value. The recordTypeFilters property
     * @param value Value to set for the recordTypeFilters property.
     */
    public void setRecordTypeFilters(@jakarta.annotation.Nullable final java.util.List<AuditLogRecordType> value) {
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
     * Sets the status property value. Describes the current status of the query. The possible values are: notStarted, running, succeeded, failed, cancelled, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AuditLogQueryStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userPrincipalNameFilters property value. The UPN (user principal name) of the user who performed the action (specified in the operation property) that resulted in the record being logged; for example, myname@mydomain_name.
     * @param value Value to set for the userPrincipalNameFilters property.
     */
    public void setUserPrincipalNameFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("userPrincipalNameFilters", value);
    }
}
