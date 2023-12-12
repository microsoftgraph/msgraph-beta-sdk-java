package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ServiceNow properties including the ServiceNow instanceUrl, connection credentials and other metadata.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceNowConnection extends Entity implements Parsable {
    /**
     * Instantiates a new ServiceNowConnection and sets the default values.
     */
    public ServiceNowConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceNowConnection
     */
    @jakarta.annotation.Nonnull
    public static ServiceNowConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceNowConnection();
    }
    /**
     * Gets the authenticationMethod property value. Indicates the method used by Intune to authenticate with ServiceNow. Currently supports only web authentication with ServiceNow using the specified app id.
     * @return a ServiceNowAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public ServiceNowAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the createdDateTime property value. Date Time when connection properties were created. The value cannot be modified and is automatically populated when the connection properties were entered.
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
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getObjectValue(ServiceNowAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("incidentApiUrl", (n) -> { this.setIncidentApiUrl(n.getStringValue()); });
        deserializerMap.put("instanceUrl", (n) -> { this.setInstanceUrl(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastQueriedDateTime", (n) -> { this.setLastQueriedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serviceNowConnectionStatus", (n) -> { this.setServiceNowConnectionStatus(n.getEnumValue(ServiceNowConnectionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incidentApiUrl property value. Indicates the ServiceNow incident API URL that Intune will use the fetch incidents. Saved in the format of /api/now/table/incident
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIncidentApiUrl() {
        return this.backingStore.get("incidentApiUrl");
    }
    /**
     * Gets the instanceUrl property value. Indicates the ServiceNow instance URL that Intune will connect to. Saved in the format of https://<instance>.service-now.com
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstanceUrl() {
        return this.backingStore.get("instanceUrl");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date Time when connection properties were last updated. The value cannot be modified and is automatically populated when the connection properties were updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastQueriedDateTime property value. Date Time when incidents from ServiceNow were last queried
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastQueriedDateTime() {
        return this.backingStore.get("lastQueriedDateTime");
    }
    /**
     * Gets the serviceNowConnectionStatus property value. Status of ServiceNow Connection
     * @return a ServiceNowConnectionStatus
     */
    @jakarta.annotation.Nullable
    public ServiceNowConnectionStatus getServiceNowConnectionStatus() {
        return this.backingStore.get("serviceNowConnectionStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("incidentApiUrl", this.getIncidentApiUrl());
        writer.writeStringValue("instanceUrl", this.getInstanceUrl());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastQueriedDateTime", this.getLastQueriedDateTime());
        writer.writeEnumValue("serviceNowConnectionStatus", this.getServiceNowConnectionStatus());
    }
    /**
     * Sets the authenticationMethod property value. Indicates the method used by Intune to authenticate with ServiceNow. Currently supports only web authentication with ServiceNow using the specified app id.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final ServiceNowAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the createdDateTime property value. Date Time when connection properties were created. The value cannot be modified and is automatically populated when the connection properties were entered.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the incidentApiUrl property value. Indicates the ServiceNow incident API URL that Intune will use the fetch incidents. Saved in the format of /api/now/table/incident
     * @param value Value to set for the incidentApiUrl property.
     */
    public void setIncidentApiUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentApiUrl", value);
    }
    /**
     * Sets the instanceUrl property value. Indicates the ServiceNow instance URL that Intune will connect to. Saved in the format of https://<instance>.service-now.com
     * @param value Value to set for the instanceUrl property.
     */
    public void setInstanceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("instanceUrl", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date Time when connection properties were last updated. The value cannot be modified and is automatically populated when the connection properties were updated.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastQueriedDateTime property value. Date Time when incidents from ServiceNow were last queried
     * @param value Value to set for the lastQueriedDateTime property.
     */
    public void setLastQueriedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastQueriedDateTime", value);
    }
    /**
     * Sets the serviceNowConnectionStatus property value. Status of ServiceNow Connection
     * @param value Value to set for the serviceNowConnectionStatus property.
     */
    public void setServiceNowConnectionStatus(@jakarta.annotation.Nullable final ServiceNowConnectionStatus value) {
        this.backingStore.set("serviceNowConnectionStatus", value);
    }
}
