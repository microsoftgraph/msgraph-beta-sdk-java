package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceNowConnection extends Entity implements Parsable {
    /** Indicates the method used by Intune to authenticate with ServiceNow. Currently supports only web authentication with ServiceNow using the specified app id. */
    private ServiceNowAuthenticationMethod authenticationMethod;
    /** Date Time when connection properties were created. The value cannot be modified and is automatically populated when the connection properties were entered. */
    private OffsetDateTime createdDateTime;
    /** Indicates the ServiceNow incident API URL that Intune will use the fetch incidents. Saved in the format of /api/now/table/incident */
    private String incidentApiUrl;
    /** Indicates the ServiceNow instance URL that Intune will connect to. Saved in the format of https://<instance>.service-now.com */
    private String instanceUrl;
    /** Date Time when connection properties were last updated. The value cannot be modified and is automatically populated when the connection properties were updated. */
    private OffsetDateTime lastModifiedDateTime;
    /** Date Time when incidents from ServiceNow were last queried */
    private OffsetDateTime lastQueriedDateTime;
    /** Status of ServiceNow Connection */
    private ServiceNowConnectionStatus serviceNowConnectionStatus;
    /**
     * Instantiates a new ServiceNowConnection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceNowConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceNowConnection
     */
    @javax.annotation.Nonnull
    public static ServiceNowConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceNowConnection();
    }
    /**
     * Gets the authenticationMethod property value. Indicates the method used by Intune to authenticate with ServiceNow. Currently supports only web authentication with ServiceNow using the specified app id.
     * @return a serviceNowAuthenticationMethod
     */
    @javax.annotation.Nullable
    public ServiceNowAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the createdDateTime property value. Date Time when connection properties were created. The value cannot be modified and is automatically populated when the connection properties were entered.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getObjectValue(ServiceNowAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("incidentApiUrl", (n) -> { this.setIncidentApiUrl(n.getStringValue()); });
        deserializerMap.put("instanceUrl", (n) -> { this.setInstanceUrl(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastQueriedDateTime", (n) -> { this.setLastQueriedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serviceNowConnectionStatus", (n) -> { this.setServiceNowConnectionStatus(n.getEnumValue(ServiceNowConnectionStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the incidentApiUrl property value. Indicates the ServiceNow incident API URL that Intune will use the fetch incidents. Saved in the format of /api/now/table/incident
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIncidentApiUrl() {
        return this.incidentApiUrl;
    }
    /**
     * Gets the instanceUrl property value. Indicates the ServiceNow instance URL that Intune will connect to. Saved in the format of https://<instance>.service-now.com
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceUrl() {
        return this.instanceUrl;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date Time when connection properties were last updated. The value cannot be modified and is automatically populated when the connection properties were updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the lastQueriedDateTime property value. Date Time when incidents from ServiceNow were last queried
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastQueriedDateTime() {
        return this.lastQueriedDateTime;
    }
    /**
     * Gets the serviceNowConnectionStatus property value. Status of ServiceNow Connection
     * @return a serviceNowConnectionStatus
     */
    @javax.annotation.Nullable
    public ServiceNowConnectionStatus getServiceNowConnectionStatus() {
        return this.serviceNowConnectionStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final ServiceNowAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the createdDateTime property value. Date Time when connection properties were created. The value cannot be modified and is automatically populated when the connection properties were entered.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the incidentApiUrl property value. Indicates the ServiceNow incident API URL that Intune will use the fetch incidents. Saved in the format of /api/now/table/incident
     * @param value Value to set for the incidentApiUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidentApiUrl(@javax.annotation.Nullable final String value) {
        this.incidentApiUrl = value;
    }
    /**
     * Sets the instanceUrl property value. Indicates the ServiceNow instance URL that Intune will connect to. Saved in the format of https://<instance>.service-now.com
     * @param value Value to set for the instanceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstanceUrl(@javax.annotation.Nullable final String value) {
        this.instanceUrl = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date Time when connection properties were last updated. The value cannot be modified and is automatically populated when the connection properties were updated.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the lastQueriedDateTime property value. Date Time when incidents from ServiceNow were last queried
     * @param value Value to set for the lastQueriedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastQueriedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastQueriedDateTime = value;
    }
    /**
     * Sets the serviceNowConnectionStatus property value. Status of ServiceNow Connection
     * @param value Value to set for the serviceNowConnectionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceNowConnectionStatus(@javax.annotation.Nullable final ServiceNowConnectionStatus value) {
        this.serviceNowConnectionStatus = value;
    }
}
